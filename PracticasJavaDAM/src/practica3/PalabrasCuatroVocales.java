package practica3;

import java.util.*;
/**
 * PalabrasCuatroVocales.java 
 * 1.2.4 Ejercicio 16
 * Aplicacion añade a una lista palabras con cuatro vocales diferentes y luego las muestra
 * @author Ramon Moñino Rubio
 * 2018.11.14
 */

public class PalabrasCuatroVocales {
	static String cadena = "aeiuasdasd aeiou";
	static Scanner input = new Scanner(cadena);
	static LinkedList<String> lista = new LinkedList<String>();

	public static void main(String[] args) {
		palabrasCuatroVocales(cadena);
		visualizar(lista);
	}

	public static LinkedList<String> palabrasCuatroVocales(String cadena) {
		int nVocalA = 0;
		int nVocalE = 0;
		int nVocalI = 0;
		int nVocalO = 0;
		int nVocalU = 0;
		int nVocales = nVocalA + nVocalE + nVocalI + nVocalO + nVocalU;

		while (input.hasNext()) {
			String palabra = input.next();
			for (int i = 0; i < palabra.length(); i++) {
				char letra = palabra.charAt(i);

				switch (letra) {
				case 'a':
					nVocalA++;
					if (nVocalA == 1) {
						nVocales++;
					}
					break;
				case 'e':
					nVocalE++;
					if (nVocalE == 1) {
						nVocales++;
					}
					break;
				case 'i':
					nVocalI++;
					if (nVocalI == 1) {
						nVocales++;
					}
					break;
				case 'o':
					nVocalO++;
					if (nVocalO == 1) {
						nVocales++;
					}
					break;
				case 'u':
					nVocalU++;
					if (nVocalU == 1) {
						nVocales++;
					}
					break;

				}

			}
			if (nVocales >= 4) {
				lista.add(palabra);
			}
			nVocales = 0;
			nVocalA = 0;
			nVocalE = 0;
			nVocalI = 0;
			nVocalO = 0;
			nVocalU = 0;
		}
		return lista;
	}

	public static void visualizar(LinkedList<String> list) {
		for (String string : list) {
			System.out.println(string);
		}
	}

}
