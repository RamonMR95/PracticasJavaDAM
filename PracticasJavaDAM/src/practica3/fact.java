package practica3;

import java.util.Scanner;

/**
 * fact.java 1.2.4 
 * Ejercicio 7 verde 
 * Programa que calcula el factorial de un numero usando la funcion factorial() 
 * Ramon Monino Rubio 2018.10.13
 */
public class fact {

	public static void main(String[] args) {
		System.out.println("Introduce un numero :");
		System.out.println("El factorial del numero es : " + factorial(pedirNumero()));

	}

	public static int factorial(int numero) {
		int resultado = 0;

		assert (numero >= 0) : " No existe factorial de un numero negativo";

		if (numero == 0) {
			resultado = 1;
		} else {
			resultado = numero;
			for (int i = numero - 1; i > 0; i--) {
				resultado *= i;
			}
		}
		return resultado;
	}

	public static int pedirNumero() {
		return new Scanner(System.in).nextInt();
	}
}
