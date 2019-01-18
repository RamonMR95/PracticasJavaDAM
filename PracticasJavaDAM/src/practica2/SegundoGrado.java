package practica2;

import java.util.*;

/**
 * SegundoGrado.java 1.2.3 Ejercicio 19 verde 
 * Programa que calcula ecuación de segundo grado
 * @autor Ramón Moñino Rubio 
 * 2018.10.11
 */

public class SegundoGrado {
	public static void main(String[] args) {
		fEcuacion();

	}

	public static void fEcuacion() {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Introduce a, b y c de tu ecuacion de segundo grado : ");

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		double valorPositivo, valorNegativo;
		double discriminanteSinRaiz = Math.abs(Math.pow(b, 2) - 4 * a * c);
		double discriminante = Math.sqrt(Math.pow(b, 2) - 4 * a * c);

		if (a == 0 && b == 0) {
			System.out.println("Ecuación denegada");
		} else if (a == 0 && b != 0) {
			System.out.println("Solución única : " + -c / b);
		} else {
			if (discriminante > 0) {
				valorPositivo = (-b / 2 * a + discriminante / 2 * a);
				valorNegativo = (-b / 2 * a - discriminante / 2 * a);
				System.out.println("X1 : " + valorPositivo + "\n" + "X2 : " + valorNegativo);
			} else if (discriminante == 0) {
				valorPositivo = (-b / 2 * a + discriminante / 2 * a);
				System.out.println("Solución doble X1 : " + valorPositivo);

			} else {
				double disc = Math.sqrt(discriminanteSinRaiz);
				double x = -b / 2 * a;
				double y = disc / 2 * a;
				System.out.println("X1: " + x + "+" + y + "i");
				System.out.println("X2: " + x + "-" + y + "i");
			}

		}
		sc.close();

	}

}
