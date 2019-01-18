package practica4;

/**
 * BuscaInt.java 
 * 
 * Ejercicio 7 verde Programa que busca un numero en un vector y
 * devuelve la posicion que ocupa en el vector la primera vez que lo encuentra
 * 
 * @author Ramon Monino Rubio 
 * 2018.10.13
 */

public class BuscaInt {
	public static int buscarInt(int[] vec, int num) {
		int pos = -1;
		for (int i = 0; i < vec.length; i++) {
			if (vec[i] == num) {
				pos = i;
				break;
			}
		}
		
		if(pos ==-1) {
			System.out.println("Numero no encontrado");
		}
		return pos;
	}


	public static void main(String[] args) {
		int[] vector = { 1, 2, 3, 4, 9, 5, 4 ,9};
		System.out.println(buscarInt(vector,10));

	}

}
