package practica3;

/**
 * FibonacciAssert.java 
 * 1.2.3 Ejercicio 15 violeta
 * Programa que calcula el valor de un termino fibonacci con una funcion y
 * además usa un aserto para numeros negativos
 * @author Ramon Monino Rubio - 2018.10.12
 */

public class FibonacciAssert {
	static int actual;

	public static void main(String[] args) {
		fibonacciA(5);
		visualizar(actual);
		fibonacciA(0);
		visualizar(actual);
		fibonacciA(1);
		visualizar(actual);
		fibonacciA(7);
		visualizar(actual);

	}

	public static int fibonacciA(int val) {

		actual = 0;
		int ultimo = 1;
		int penultimo = 0;

		assert (val >= 0) : "Numero no valido";

		if (val == 0) {
			actual = 0;
		} else if (val == 1) {
			actual = 1;
		} else {
			for (int i = 1; i < val; i++) {
				actual = ultimo + penultimo;
				penultimo = ultimo;
				ultimo = actual;

			}

		}
		return actual;

	}

	public static void visualizar(int valor) {
		System.out.println(actual);
	}

}

/*
 * Para activar los asertos hay que activarlo en run config, y en vm escribir
 * -ea
 */