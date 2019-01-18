package autoevaluacion2;

import java.util.Scanner;

public class MayorMenor2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		int valorEntrada = -1;
		int elMayor = Integer.MIN_VALUE;
		int elMenor = Integer.MAX_VALUE;
		int contadorDatosValidos = 0;

		System.out.println("Teclea números entre 1 y 2147483647");
		System.out.println("-Cero para terminar-");

		do {
			valorEntrada = teclado.nextInt();

			if (valorEntrada == 0 && contadorDatosValidos >1) {
				System.out.println("Esta seguro de que quiere terminar?");
				if (teclado2.nextLine().equals("t")) {
					break;
				}
				continue;

			} else {
				if (valorEntrada > elMayor) {
					elMayor = valorEntrada;
				}
				if (valorEntrada < elMenor) {
					elMenor = valorEntrada;

				}
				contadorDatosValidos++;
			}
		} while (true);

		System.out.println("\nResultados: ");
		System.out.println("\nTotal de números válidos: " + contadorDatosValidos);
		System.out.println("\nEl mayor es: " + elMayor);
		System.out.println("\nEl menor es: " + elMenor);

	}
}
