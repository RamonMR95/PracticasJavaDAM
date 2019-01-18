package practica4;

/**
 * Vector2.java
 * Ejercicio 2 Naranja
 * Programa que crea un array de tamaño 20 e inicializa cada posicion del mismo con la posicion que ocupa * 5
 * @author Ramon Monino Rubio
 * 2018.10.13
 */
public class Vector2 {

	public static void main(String[] args) {
		int array[] = new int[20];

		for (int i = 0; i < array.length; i++) {
			array[i] = i * 5;
		}

		for (int i : array) {
			System.out.println(i);
		}

	}

}
