package practica4;
/**
 * CompareVecChar.java
 * 2.2.1 Ejercicio 5 verde
 * Programa compara dos vectores, devuelve 0 si son iguales, 1 si el primero es mayor, 2 si el segundo lo es
 * @author Ramon Monino Rubio
 * 2018.09.27
 */

public class CompareVecChar {
	public static int compararVectoresChar(char[] vec1, char[] vec2) {
		int contador = 0;
		int val= 0;
		if (vec1.length == vec2.length) {
			for (int i = 0; i < vec1.length; i++) {
				for (int j = 0; j < vec2.length; j++) {
					if (vec1[i] == vec2[j]) {
						contador++;
					} else {
						contador = 0;
					}
					if (contador == vec1.length) {
						val = 0;
					}
				}
			}
		} else if (vec1.length > vec2.length) {
			val =1;
		} else {
			val = 2;
		}
		return val;
		
	}

	public static void main(String[] args) {
		char[] vec1 = { 'a' };
		char[] vec2 = { 'a', 'b' };
		System.out.println(compararVectoresChar(vec1, vec2));

	}

}
