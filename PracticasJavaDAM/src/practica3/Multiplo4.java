package practica3;
import java.util.Scanner;
/**
 * Multiplo4.java
 * 1.2.4 Ejercicio 4 verde
 * Programa que muestra los multiplos hasta un tope usando mostrarMultiplos2(pedirTope())
 * Ramon Monino Rubio - 2018.10.12
 */

public class Multiplo4 {

	public static void main(String[] args) {
		mostrarMultiplos2(pedirTope());
	}

	public static int pedirTope() {
		Scanner teclado = new Scanner(System.in);
		int top = teclado.nextInt();
		teclado.close();
		return top;

	}

	public static void mostrarMultiplos2(int length) {
		int TOPE = length;
		int mult = 0;
		int cont = 0;

		System.out.println("\t Múltiplos de 2\n");
		while (mult < TOPE) {
			mult = cont * 2;
			System.out.println("\t  " + '#' + (cont + 1) + '\t' + mult);
			++cont;
		}
	}

}
