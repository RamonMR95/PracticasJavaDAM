package practica4;

/**
 * VectoresIgu.java
 * Ejercicio 4 Verde
 * Programa que compara si son iguales dos vectores de enteros
 * @author Ramon Monino Rubio
 * 2018.10.13
 */
public class VectoresIgu {
	public static void vectoresIntIguales(int[] vector1, int[] vector2) {
		boolean valor = false;
		if (vector1.length == vector2.length) {
			for (int i = 0; i < vector1.length; i++) {
				for (int d = 0; d < vector2.length; d++) {
					if (vector1[i] == vector2[d]) {
						valor = true;
					}
				}
			}
		} else {
			valor = false;
		}

		System.out.println(valor);
	}

	public static void main(String[] args) {
		int vector[] = { 1, 2, 3 };
		int vec[] = { 1, 2, 3 };
		vectoresIntIguales(vector, vec);
	}

}
