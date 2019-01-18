package practica1;

/**
 * ParImpar.java
 * Ejercicio 8 violeta
 * Programa que comprueba si un numero es par o no
 * Ramon Monino Rubio - 2018.09.27
 */

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		/* Definimos el numero */
		int numero;
		/*
		 * Creamos un objeto de la clase Scanner que nos ayudara a realizar la entrada
		 * de datos para nuestro programa
		 */
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce un numero :");
		/* Leemos el numero por teclado */
		numero = teclado.nextInt();

		/*
		 * Para determinar si el numero es par o no, si el modulo de dicho numero es
		 * igual a 0, el numero sera� par
		 */
		if (numero % 2 == 0) {
			System.out.println("El numero " + numero + " es par");
		} else {
			System.out.println("El numero " + numero + " es impar");
		}
		/* Cerramos teclado ya que no se va a usar mas */
		teclado.close();

	}

}

