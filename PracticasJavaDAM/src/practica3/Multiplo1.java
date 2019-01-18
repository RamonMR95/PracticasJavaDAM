package practica3;
import java.util.Scanner;
/**
 * Multiplo1.java
 * 1.2.4 Ejercicio 1 naranja
 * Programa que muestra los multiplos hasta un tope usando mostrarMultiplos1()
 * Ramon Monino Rubio - 2018.10.12
 */

public class Multiplo1 {
	public static void main(String[] args) {
		mostrarMultiplos1();
	}

	public static void mostrarMultiplos1() {

		Scanner teclado = new Scanner(System.in);
		final int TOPE = 16;
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
