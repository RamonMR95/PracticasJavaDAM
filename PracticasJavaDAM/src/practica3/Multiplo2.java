package practica3;
import java.util.Scanner;
/**
 * Multiplo2.java
 * 1.2.4 Ejercicio 2 naranja
 * Programa que muestra los multiplos hasta el tope, recibiendolo como parametro
 * Ramon Monino Rubio - 2018.10.12
 */

public class Multiplo2 {
	public static void main(String[] args) {
		mostrarMultiplos1(24);
	}

	public static void mostrarMultiplos1(int length) {
		Scanner teclado = new Scanner(System.in);
		final int TOPE = length;
		int mult = 0;
		int cont = 0;

		System.out.println("\t Múltiplos de 2\n");
		while (mult < TOPE) {
			mult = cont * 2;
			System.out.println("\t  " + '#' + (cont + 1) + '\t' + mult);
			++cont;
		}
		teclado.close();
	}

}
