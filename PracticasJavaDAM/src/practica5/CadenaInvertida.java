package practica5;

import java.util.Scanner;

/**
 * CadenaInvertida.java 
 * Ejercicio 1 naranja 
 * Programa que imprime una cadena al reves
 * @author Ramon Monino Rubio 
 * 2018.11.08
 */

public class CadenaInvertida {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println(invertirTexto(pedirCadena()));
	}

	public static String pedirCadena() {
		System.out.println("Introduce la cadena a invertir :");
		return sc.nextLine();
	}

	public static String invertirTexto(String cadena) {
		StringBuilder cadenaInvertida = new StringBuilder();
		boolean salir = true;

		do {
			for (int i = cadena.length() - 1; i >= 0; i--) {
				cadenaInvertida.append(cadena.charAt(i));

			}
			salir = false;
		} while (salir);

		return cadenaInvertida.toString();
	}

}
