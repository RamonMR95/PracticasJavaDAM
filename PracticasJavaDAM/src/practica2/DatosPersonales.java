package practica2;
import java.util.Scanner;
/**
 * DatosPersonales.java
 * 1.2.2 Ejercicio 7 verde
 * Programa que pide una serie de datos y los muestra por pantalla
 * @author Ramon Monino Rubio
 * 2018.09.27
 */

public class DatosPersonales {

	public static void main(String[] args) {
		/* Creación de las variables que contendrán los datos */
		String nombreCompleto, calle, ciudad, cp, pais;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre completo, calle, ciudad, cp y pais : ");
		/* Pedimos los datos por teclado */
		nombreCompleto = sc.nextLine();
		calle = sc.nextLine();
		ciudad = sc.nextLine();
		cp = sc.nextLine();
		pais = sc.nextLine();
		
		/* Mostramos los datos por pantalla */
		System.out.println("\nNombre : " + nombreCompleto+ "\nCalle : " + calle + ", Ciudad : " + ciudad + ", CP : " + cp + "\nPais : " + pais);
		
		sc.close();
	}

}
