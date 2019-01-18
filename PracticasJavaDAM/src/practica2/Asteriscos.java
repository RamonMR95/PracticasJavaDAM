package practica2;

import java.util.Scanner;

/**
 * Asteriscos.java 1.2.3 
 * Ejercicio 17 verde 
 * Programa que imprime por pantalla un cuadrado de longitud de lado variable
 * @author Ramon Monino Rubio 
 * 2018.10.13
 */

public class Asteriscos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el tamaño de lado : ");
		int numero = sc.nextInt();

		for (int i = 0; i < numero; i++) {
			System.out.print("*  ");
		}

		System.out.println("\n");

		for (int j = 1; j < numero - 1; j++) {
			System.out.print("* ");
			for (int z = 1; z < numero - 1; z++) {
				System.out.print("   ");
			}
			System.out.println(" *");
			System.out.print("\n");
		}

		for (int i = 0; i < numero; i++) {
			System.out.print("*  ");
		}
		sc.close();
	}

}
