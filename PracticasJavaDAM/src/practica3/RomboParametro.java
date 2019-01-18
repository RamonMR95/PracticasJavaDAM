package practica3;

/**
 * RomboParametro.java 
 * 1.2.4 Ejercicio 10 verde 
 * Programa que muestra por pantalla una rombo usando una funcion
 * @author Ramon Monino Rubio 2018.10.13
 */

public class RomboParametro {
	public static void main(String[] args) {
		rombo(5);

	}

	public static void rombo(int num) {
		String espacio = " ";
		String asterisco = "*";

		for (int i = 0; i < (num / 2) + 1; i++) {
			for (int numeroEspacios = 0; numeroEspacios <= num - i; numeroEspacios++) {
				System.out.print(espacio);
			}
			for (int numeroAsterisco = 0; numeroAsterisco <= 2 * i; numeroAsterisco++) {
				System.out.print(asterisco);
			}
			System.out.println();

		}

		for (int i = num / 2 - 1; i >= 0; i--) {
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
