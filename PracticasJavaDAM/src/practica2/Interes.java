package practica2;
import java.util.Scanner;
/**
 * Interes.java
 * 1.2.3 Ejercicio 11 verde
 * Programa que obtiene el capital inicial, numero de años e interes anual por teclado y calcula el capital final
 * @author Ramón Moñino Rubio
 * 2018.09.27
 */

public class Interes {

	public static void main(String[] args) {
		/* Creación de las variables necesarias para el programa */
		double capitalInicial, interesAnual, capitalFinal;
		int numeroAnos;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el capital inicial, numero de años e interes anual : ");
		
		/* Introducimos los datos por teclado */
		capitalInicial = sc.nextDouble();
		numeroAnos = sc.nextInt();
		interesAnual = sc.nextDouble();

		/* Calculamos el capital final */
		capitalFinal = capitalInicial * (Math.pow((1 + interesAnual), numeroAnos));

		/* Mostramos el interes anual y el capital final por pantalla */
		System.out.println("El interes anual es : " + interesAnual);
		System.out.println("El capital final producido es : " + capitalFinal);
		
		/* Cerramos teclado ya que no se va a usar más */
		sc.close();
	}

}
