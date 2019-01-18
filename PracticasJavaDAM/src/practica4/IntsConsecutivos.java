package practica4;
/**
 * IntsConsecutivos.java
 * Ejercicio 6 verde
 * Programa que devuelve el numero de numeros consecutivos de un vector
 * @author Ramon Monino Rubio
 * 2018.10.13
 */

public class IntsConsecutivos {
	public static int maximoIntConsecutivos(int[] vec) {
		int max = 1;
		int contador = 0;
		int anterior = vec[0];

		for (int i = 1; i < vec.length; i++) {
			int actual = vec[i];

			if (anterior == actual - 1) {
				contador++;
				max = contador;
				anterior = actual;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] vec1 = {3, 5, 3, 4, 5, 5, 4} ;
		System.out.println(maximoIntConsecutivos(vec1));

	}

}
