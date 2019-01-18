package practica3;

/**
 * PiramideParametro.java 
 * 1.2.4 Ejercicio 10 verde 
 * Programa que muestra por pantalla una piramide con altura pasada por parametro
 * @author Ramon Monino Rubio 2018.10.13
 */

public class PiramideParametro {
	public static void main(String[] args) {
		piramide(5);

	}

	public static void piramide(int num) {
		String espacio = " ";
		String asterisco = "*";

		for (int i = 0; i < num; i++) {
			for (int numeroEspacios = 0; numeroEspacios <= num - i; numeroEspacios++) {
				System.out.print(espacio);
			}
			for (int numeroAsterisco = 0; numeroAsterisco <= 2 * i; numeroAsterisco++) {
				System.out.print(asterisco);
			}
			System.out.println();

		}
	}

}
