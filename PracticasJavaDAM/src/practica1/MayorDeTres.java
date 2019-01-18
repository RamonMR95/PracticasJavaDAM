package practica1;

/**
* MayorDeTres.java
* Ejercicio 10 violeta
* Programa que obtiene 3 numeros por teclado y muestra el mayor
* Ramon Monino Rubio - 2018.09.27
*/


import java.util.Scanner;

public class MayorDeTres {

	public static void main(String[] args) {
		/* Definimos 3 numeros enteros */
		int numero1, numero2, numero3;
		/*
		 * Creamos un objeto de la clase Scanner que nos ayudara a realizar la entrada
		 * de datos por teclado
		 */
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce 3 numeros :");

		/* Introducimos los 3 numeros por teclado */
		numero1 = teclado.nextInt();
		numero2 = teclado.nextInt();
		numero3 = teclado.nextInt();

		/*
		 * Estructura condicional para comprobar el mayor de los 3, si un numero es
		 * mayor que los otros dos, entonces sera� el mayor de los 3
		 */
		if ((numero1 == numero2) && (numero1 == numero3)) {
			System.out.println(" Los tres numero son iguales : " + "(" + numero1 + ")");
		} else if ((numero1 > numero2) && (numero1 > numero3)) {
			System.out.println("El numero " + numero1 + " es el mayor");
		} else if ((numero2 > numero1) && (numero2 > numero3)) {
			System.out.println("El numero " + numero2 + " es el mayor");
		} else {
			System.out.println("El numero " + numero3 + " es el mayor");
		}
		/* Cerramos teclado ya que no se va a usar mas */
		teclado.close();

	}
}
