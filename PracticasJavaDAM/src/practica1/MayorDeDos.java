/**
 * MayorDeDos.java
 * Ejercicio 7 violeta
 * Programa que obtiene 2 numeros por teclado y muestra el mayor de los dos
 * Ramon Monino Rubio - 2018.09.27
 */
package practica1;

import java.util.Scanner;

public class MayorDeDos {

	public static void main(String[] args) {
		/* Definimos 2 numero */
		int numero1, numero2;
		/*
		 * Creamos un objeto de la clase Scanner para utilizarlo en la entrada de datos
		 * de nuestro programa
		 */
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca dos numeros :");
		/* Introucimos los dos numeros por teclado */
		numero1 = teclado.nextInt();
		numero2 = teclado.nextInt();

		/*
		 * Si el numero 1 es mayor que el numero 2 lo mostramos por pantalla y viceversa
		 */
		if (numero1 == numero2) {
			System.out.println("El primer numero : " + numero1 + " es igual al segundo numero : " + numero2);
		} else if (numero1 > numero2) {
			System.out.println("El primer numero " + "(" + numero1 + ")" + " es mayor que el segundo " + numero2);
		} else {
			System.out.println(
					"El segundo numero " + "(" + numero2 + ")" + " es mayor que el primero " + "(" + numero1 + ")");
		}
		/* Cerramos teclado ya que no se va a usar mas */
		teclado.close();
	}

}
