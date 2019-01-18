package practica2;
import java.util.Scanner;
/**
 * MayorTeclado.java 1.2.3 Ejercicio 13 verde
 * Programa que obtiene una cantidad de numeros definida por el usuario y calcula el mayor de ellos
 * @author Ramón Moñino Rubio 
 * 2018.09.27
 */

public class MayorTeclado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mayorNumero = Integer.MIN_VALUE;
		int numeroActual = 0;
		char continuar = 'n';

		do {
			System.out.println("Introduce un numero : ");
			numeroActual = sc.nextInt();

			if (numeroActual > mayorNumero) {
				mayorNumero = numeroActual;
			}
			System.out.println("Quiere introducir más numero ?");
			continuar = sc.next().charAt(0);

		} while (continuar == 's');
		System.out.println("El mayor numero es \n" + mayorNumero);
	}
}
