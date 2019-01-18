package practica4;
/**
 * BuscarSubstring.java
 * Ejercicio 10 verde
 * Programa que que recibe dos vectores de enteros, el segundo es una secuencia de valores a buscar en el primer vector. Devuelve el índice donde empieza la primera ocurrencia
 * @author Ramon Monino Rubio
 * 2018.11.10
 */
public class BuscarSubstring {

	public static void main(String[] args) {
		int[] vec = { 4, 3, 1, 4, 2, 5, 8 };
		int[] vec2 = { 2, 5, 8 };
		System.out.println(buscarSecuenciaInt(vec, vec2));

	}

	public static int buscarSecuenciaInt(int[] vector, int[] subcadena) {
		int indice = 0;

		for (int i = 0; i < vector.length; i++) {
			if (vector[i] == subcadena[0]) {
				indice = i;
				for (int j = i; j < subcadena.length; j++) {
					if (vector[i] != subcadena[j]) {
						indice = 0;
						break;
					}
				}

			}
		}

		return indice;
	}

}
