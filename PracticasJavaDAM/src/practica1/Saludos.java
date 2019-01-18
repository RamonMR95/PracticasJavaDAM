package practica1;

/**
 * Saludos.java
 * Ejercicio 2 amarillo
 * Programa simple que muestra varios mensajes en la consola del sistema.
 * Ramon Monino Rubio - 2018.09.19
 */

import java.util.Scanner;

public class Saludos {
	public static void main(String[] args) {
		/*
		 * Creamos un objeto de la clase Scanner para realizar la entrada de datos
		 */
		Scanner teclado = new Scanner(System.in);

		int numOrden; // Variable numerica.
		@SuppressWarnings("unused") // ignorar warning por no uso de string nombre
		String nombre = ""; // Variable de texto.

		// Configura y muestra mensajes de bienvenida.
		numOrden = 1;
		System.out.println("Hola,");
		System.out.print("Soy un modesto ");
		System.out.print("programa de ordenador...\n");
		System.out.println("Bienvenido al Curso.\t" + "Este es el saludo n� " + numOrden);
		numOrden++;
		System.out.println("Bienvenido a Java.\t" + "Este es el saludo n� " + numOrden);
		System.out.println("\nFin programa...");
		teclado.close();
	}
}

// El programa utiliza la clase Scanner para crear un objeto y poder introducir datos por teclado, tenemos una variable
// llamada numOrden que va a guardar nuestras posicion en la cola de acceso, mostramos unos strings y despues del turno del primer
// usuario incrementamos el numero de orden y pasa al usuario numero 2, finalmente se cierra el programa