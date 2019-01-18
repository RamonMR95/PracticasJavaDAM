package practica2;

import java.util.Scanner;

/**
 * Triangulo.java 
 * 1.2.3 Ejercicio 21 violeta 
 * Programa que obtiene 3 lados de un triagulo y te dice el tipo de este. Controlar repeticion
 * @author Ramón Moñino Rubio 
 * 2018.10.11
 */

public class Triangulo {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		char repetir = 'n';

		do {
			System.out.println("Introduce el valor de los 3 lados del triangulo : ");
			calcularTriangulo();
			System.out.println("Quiere introducir otro triangulo?? s para continuar");
			repetir = sc.next().charAt(0);
		} while (repetir == 's');

	}

	public static void calcularTriangulo() {
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (a > 0 && b > 0 && c > 0) {
			if (a == b && a == c) {
				System.out.println("\nEl triangulo es equilatero!\n ");
			} else if (a == b || a == c || b == c) {
				System.out.println("\nEl triangulo es isosceles!\n ");
			} else {
				System.out.println("\nEl triangulo es escaleno! ");
			}
		} else {
			System.out.println("\nTamaño inválido de los lados : ");
		}

	}

}
