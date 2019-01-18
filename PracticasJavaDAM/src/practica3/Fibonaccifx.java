package practica3;

import java.util.Scanner;

/**
 * Fibonaccifx.java 
 * 1.2.3 Ejercicio 8 verde 
 * Programa que calcula el valor de un termino fibonacci con una funcion 
 * Ramon Monino Rubio - 2018.10.12
 */

public class Fibonaccifx {

	public static void main(String[] args) {
		System.out.println("Introduce un número :");
		int num = pedirNumero();
		System.out.println("Encontramos el numero : " + fibonacci(num));

	}

	public static int fibonacci(int numero) {
		int actual = 0;
		int ultimo = 1;
		int penultimo = 0;

		assert (numero >= 0) : "Error números negativos no permitidos";
		if (numero == 0) {
			actual = 0;
		} else if (numero == 1) {
			actual = 1;
		} else {
			for (int i = 1; i < numero; i++) {
				actual = ultimo + penultimo;
				penultimo = ultimo;
				ultimo = actual;

			}
		}
		return actual;
	}

	public static int pedirNumero() {
		return new Scanner(System.in).nextInt();
	}

}
