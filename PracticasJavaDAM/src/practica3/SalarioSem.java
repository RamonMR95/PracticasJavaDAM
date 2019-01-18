/**
 * SalarioSem.java 
 * Ejercicio 5 verde
 * Aplicacion que calcula el salario de un empleado
 * Ramon M R - 2018.09.27
 */
package practica3;

import java.util.Scanner;

public class SalarioSem {
	static Scanner input = new Scanner(System.in);
	static int horas;
	static double horasExtra;

	public static void main(String[] args) {
		System.out.println("Introduce el numero de horas que has trabajado: ");
		bucle();
	}

	public static double calcularSalario(int horas) {
		horas = input.nextInt();
		
		double salario = 0;

		assert (horas > 0) : "El numero de horas no puede ser negativo";

		if (horas <= 35) {
			salario = horas * 15;

		} else if (horas > 35) {
			horasExtra = horas - 35;
			salario = (horas * 15) + (horasExtra * 22);

		}
		return salario;
	}

	public static void bucle() {
		do {
			System.out.println("El salario es de " + calcularSalario(horas) + " con " + horasExtra + " horas extra");
			System.out.println();
			System.out.println("Introduce S para seguir : ");
			System.out.println();
		} while (new Scanner(System.in).next().toUpperCase().equals("S"));
	}

}
