package practica2;
import java.util.Scanner;
/**
 * Primo.java
 * 1.2.3 Ejercicio 22 violeta
 * Programa que muestra los numeros primos hasta un intervalo
 * @author Ramón Moñino Rubio
 * 2018.10.11
 */

public class Primo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el intervalo de numeros :");
		int intervalo = sc.nextInt();
		int nDivisores = 0;

		for (int i = 2; i <= intervalo; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					nDivisores++;
				}

			}
			if (nDivisores == 2) {
				System.out.println(i);
				nDivisores = 0;
			} else {
				nDivisores = 0;
			}
		}
		sc.close();
	}
}
