package practica3;

import java.util.Scanner;

/**
 * CuadradoString.java 
 * 1.2.4 Ejercicio 17 violeta Programa que muestra por
 * pantalla un cuadrado con el tamaño y caracter dados por teclado
 * @author Ramon Monino Rubio 2018.10.12
 */

public class CuadradoString {
	public static void main(String[] args) {
		System.out.println(muestraCuadrado(4, 'B'));
		System.out.println();
		System.out.println(muestraCuadrado(6, 'C'));

	}

	public static String muestraCuadrado(int tam, char caract) {
		StringBuilder resultado = new StringBuilder();

		for (int i = 0; i < tam; i++) {
			resultado.append(caract).append(" ");
		}

		resultado.append("\n");

		for (int j = 1; j < tam - 1; j++) {
			resultado.append(caract).append(" ");
			for (int z = 1; z < tam - 1; z++) {
				resultado.append("  ");

			}
			resultado.append(caract).append(" ");
			resultado.append("\n");
		}

		for (int i = 0; i < tam; i++) {
			resultado.append(caract).append(" ");
		}
		return resultado.toString();
	}

}
