package practica4;

/**
 * Frecuencia.java
 * Programa que muestra por pantalla la frecuencia de un numero en un array
 * Ramon Monino Rubio- 2018.09.27
 */

public class Frecuencia {
	public static void frecuenciaNumero(int array[], int numero) {
		int frecuencia = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == numero) {
				frecuencia++;
			}

		}
		System.out.println("La frecuencia es : " + frecuencia);

	}

	public static void main(String[] args) {
		int vector[] = { 2, 4, 3, 6, 6, 7 };
		frecuenciaNumero(vector, 6);

	}

}
