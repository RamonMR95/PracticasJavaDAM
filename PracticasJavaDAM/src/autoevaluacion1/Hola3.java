package autoevaluacion1;

/**
 * Hola3.java
 * Programa que calcula el mayor de dos números introducidos por teclado y lo muestra por pantalla
 * Ramón Moñino Rubio - 2018.09.29
 */

import java.util.Scanner;

public class Hola3 {
	public static void main(String argumentos[]) {

		// Creación de un objeto de la clase Scanner para
		// utilizarlo en la entrada de datos de nuestro programa
		// Importamos la libreria java.util.Scanner
		Scanner teclado = new Scanner(System.in);

		int num; // Creación del numero de orden en la cola de acceso al programa

		// Inicializamos el numero a 1
		num = 1;
		System.out.println("Hola, Soy un modesto ");
		System.out.print("programa de ordenador...\n");
		System.out.println("Mi número de orden es el " + num + " por ser el primero.");

		// Pedimos dos números por pantalla y los recogemos con el objeto de la clase
		// Scanner teclado
		System.out.println("Escribe dos números...\n");
		int dato1 = teclado.nextInt();
		int dato2 = teclado.nextInt();

		// Mostramos los dos números por pantalla
		System.out.println("Dato1: " + dato1);
		System.out.println("Dato2: " + dato2);

		// Creamos el String mensaje que contendra el mayor del mayor numero de los dos
		String mensaje = "";

		if (dato1 == dato2) {
			mensaje = "Ninguno de los dos es mayor... ";
		}

		if (dato1 > dato2) {
			mensaje = "El mayor es: " + dato1;
		}

		if (dato2 > dato1) {
			mensaje = "El mayor es: " + dato2;
		}

		System.out.println(mensaje);
		teclado.close();
	}

}
