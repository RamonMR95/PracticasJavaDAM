package practica3;

import java.util.Scanner;

/**
 * ContarCharCadena.java 
 * Ejercicio 19 violeta 
 * Funcion que cuenta los caracteres, lineas y palabras de un String y lo muestra por pantalla
 * @author Ramon Moñino Rubio 
 * 2018.11.17
 */
public class ContarCharCadena {
	static String texto = "Hoy es   lunes\n y mañana \tmartes";
	static StringBuilder resultado = new StringBuilder();
	static int contadorCaracteres = 0;
	static int contadorPalabras = 1;
	static int contadorLineas = 1;

	public static void main(String[] args) {
		System.out.println(contarCaracteresPalabrasLineas(texto));
		System.out.println(interpretarCodigo(resultado, 1));

	}

	public static String interpretarCodigo(StringBuilder resultado, int numero) {
		StringBuilder cadena = new StringBuilder();

		switch (numero) {
		case 1:
			cadena.append(resultado.substring(0, 4));
			break;
		case 2:
			cadena.append(resultado.substring(5, 9));
			break;
		case 3:
			cadena.append(resultado.substring(10, 14));
			break;
		}

		return cadena.toString();
	}

	public static String contarCaracteresPalabrasLineas(String texto) {

		for (int i = 0; i < texto.length(); i++) {

			switch (texto.toLowerCase().charAt(i)) {
			case '\n':
				contadorLineas++;
			case ' ':
			case '\t':
				for (int j = i + 1; j < texto.length(); j++) {
					if (texto.toLowerCase().charAt(j) != '\n' && texto.toLowerCase().charAt(j) != '\t'
							&& texto.toLowerCase().charAt(j) != ' ') {
						contadorPalabras++;
						break;
					}
					break;
				}
				break;
			case 'a':
			case 'b':
			case 'c':
			case 'd':
			case 'e':
			case 'f':
			case 'g':
			case 'h':
			case 'i':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'ñ':
			case 'o':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'u':
			case 'v':
			case 'w':
			case 'x':
			case 'y':
			case 'z':
				contadorCaracteres++;
				break;

			}
		}

		return resultado.append(generarString(contadorCaracteres)).append("-").append(generarString(contadorPalabras))
				.append("-").append(generarString(contadorLineas)).toString();

	}

	public static String generarString(int numero) {
		StringBuilder cad = new StringBuilder();
		int nDigitos = 0;
		int nEspacios;
		int num = numero;

		while (num != 0) {
			num = num / 10;
			nDigitos++;
		}
		nEspacios = 4 - nDigitos;

		for (int i = 0; i < nEspacios; i++) {
			cad.append("0");
		}
		cad.append(numero);

		return cad.toString();
	}

}
