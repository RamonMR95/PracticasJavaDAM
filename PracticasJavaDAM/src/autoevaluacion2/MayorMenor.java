package autoevaluacion2;

import java.util.Scanner;

public class MayorMenor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valorEntrada = -1;
		int elMayor = Integer.MIN_VALUE;
		int elMenor = Integer.MAX_VALUE;
		int contadorDatosValidos = 0;
		String salida = "";

		System.out.println("Teclea números entre 1 y 2147483647");
		System.out.println("-Cero para terminar-");

		while (contadorDatosValidos < 2) {
			valorEntrada = teclado.nextInt();
			if (valorEntrada == 0) {
				System.out.println("Necesita al menos dos números para terminar el programa");
			} else {
				if(valorEntrada<elMenor) {
					elMenor = valorEntrada;
					contadorDatosValidos++;
				}else if(valorEntrada>elMayor) {
					elMayor = valorEntrada;
					contadorDatosValidos++;
				}
			}

		}
		while (!(salida.equals("t"))) {
			valorEntrada = teclado.nextInt();
			if (valorEntrada == 0) {
				System.out.println("Pulsa la tecla T para salir... t");
				salida = teclado.next();
			} else {
				if(valorEntrada<elMenor) {
					elMenor = valorEntrada;
					contadorDatosValidos++;
				}else if(valorEntrada>elMayor) {
					elMayor = valorEntrada;
					contadorDatosValidos++;
				}
			}

		}

		System.out.println("\nResultados: ");
		System.out.println("\nTotal de números válidos: " + contadorDatosValidos);
		System.out.println("\nEl mayor es: " + elMayor);
		System.out.println("\nEl menor es: " + elMenor);
		teclado.close();
	}

}
