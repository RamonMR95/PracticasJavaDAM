package practica4;

/**
 * Vector.java
 * Ejercicio 1 Naranja
 * Programa que inicializa el tamaño de un vector a 10 y inicializa cada posicion a 7
 * @author Ramon Monino Rubio
 * 2018.10.13
 */

public class Vector {

	public static void main(String[] args) {
		int array[] = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = 7;
		}

		for (int i : array) {
			System.out.println(i);
		}
	}

}
