package practica1;

/**
 * Nombre1.java
 * Ejercicio 6 violeta
 * Programa que obtiene el nombre y la edad de dos personas y las muestra por pantalla
 * Ramon Monino Rubio - 2018.09.27
 */


import java.util.Scanner;

public class Nombre1 {

	public static void main(String[] args) {
		/*
		 * Creamos un objeto de la clase Scanner para realizar la entrada de datos
		 */
		Scanner teclado = new Scanner(System.in);

		System.out.println("Persona 1. Introduce tu nombre y edad ");
		/* Introducimos el nombre y la edad de la persona 1 */
		String nombre1 = teclado.nextLine();
		int edad1 = teclado.nextInt();

		System.out.println("Persona 2. Introduce tu nombre y edad ");
		/* Introducimos el nombre y la edad de la persona 2 */
		String nombre2 = teclado.next();
		int edad2 = teclado.nextInt();

		/* Mostramos por pantalla los datos */
		System.out.println("Persona 1 : nombre : " + nombre1 + ", edad : " + edad1);
		System.out.println("Persona 2 : nombre : " + nombre2 + ", edad : " + edad2);

		/* Cerramos teclado ya que no se va a usar mas */
		teclado.close();
	}

}
