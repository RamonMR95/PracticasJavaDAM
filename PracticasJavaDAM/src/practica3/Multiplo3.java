package practica3;
import java.util.Scanner;
/**
 * Multiplo3.java
 * 1.2.4 Ejercicio 3 naranja
 * Programa que muestra los multiplos hasta el tope, pedido con una funcion
 * Ramon Monino Rubio - 2018.10.12
 */

public class Multiplo3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String argumentos[]) {
		int TOPE = pedirTope();
		int mult = 0;
		int cont = 0;

		System.out.println("\t Múltiplos de 2\n");
		while (mult < TOPE) {
			mult = cont * 2;
			System.out.println("\t  " + '#' + (cont + 1) + '\t' + mult);
			++cont;
		}
	}

	public static int pedirTope() {
		return new Scanner(System.in).nextInt();
	}
}
