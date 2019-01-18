package practica4;
/**
 * MetBurbuja.java
 * Ejercicio 16 verde
 * Programa que ordena los elementos de un array de ints con el metodo burbuja
 * @author Ramon Monino Rubio
 * 2018.10.13
 */


public class MetBurbuja {
	public static void ordenarBurbuja(int vec[]) {
		int aux;
		int n = vec.length;

		for (int p = 1; p < n - 1; p++) {
			for (int i = 0; i < n - p; i++) {
				if (vec[i] > vec[i + 1]) {
					aux = vec[i];
					vec[i] = vec[i + 1];
					vec[i + 1] = aux;
				}
			}
		}

	}

	public static void visualizarVec(int vec[]) {
		for (int i : vec) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		int vector[] = { 2, 1, 5, 3, 4 };
		ordenarBurbuja(vector);
		visualizarVec(vector);

	}

}
