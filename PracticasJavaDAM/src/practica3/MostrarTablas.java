package practica3;

import java.util.Scanner;

/**
 * MostrarTablas.java 
 * 1.2.4 Ejercicio 6 verde 
 * Programa que muestra por pantalla las tablas de un determinado numero hasta 15
 * @author Ramon Monino Rubio 2018.10.13
 */
public class MostrarTablas {
	public static void main(String[] args) {
		System.out.println("Introduce un numero : ");
		calcularMostrarTabla(pedirNumero());

	}

	public static void calcularMostrarTabla(int num) {
		for (int i = 0; i <= 15; i++) {
			int resultado = num * i;
			System.out.println(num + " * " + i + " = " + resultado);
		}
	}

	public static int pedirNumero() {
		return new Scanner(System.in).nextInt();
	}

}
