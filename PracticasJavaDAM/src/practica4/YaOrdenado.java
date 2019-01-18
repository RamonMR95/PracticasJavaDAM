package practica4;
/**
 * YaOrdenado.java
 * Ejercicio 8 verde 
 * Programa que recibe un vector y devuelve si está ordenador o no con un boolean
 * @author Ramon Monino Rubio 
 * 2018.10.13
 */

public class YaOrdenado {
	public static boolean yaOrdenado(int[] vec) {
		boolean valor = false;
		int actual = 0;
		int anterior = vec[0];

		for (int i = 1; i < vec.length; i++) {
			actual = vec[i];
			if (anterior == actual - 1) {
				valor = true;
				anterior = actual;
			} else {
				valor = false;
			}
		}
		return valor;

	}

	public static void main(String[] args) {
		int[] vector = { 1, 2, 3, 4, 6 };
		System.out.println(yaOrdenado(vector));

	}

}
