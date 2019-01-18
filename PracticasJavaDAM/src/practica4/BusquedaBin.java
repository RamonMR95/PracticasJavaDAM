package practica4;
/**
 * BusquedaBin.java
 * Ejercicio 15 verde
 * Programa que busca un numero en un vector con las estrategia de busqueda binaria
 * @author Ramon Monino Rubio
 * 2018.10.13
 */

public class BusquedaBin {
	public static void buscarNumero(int vec[], int valor) {
		int n = vec.length;
		int sup = n - 1;
		int inf = 0;
		int medio = (n + 1) / 2;

		while ((vec[medio] != valor) && (inf < sup)) {
			if (vec[medio] > valor) {
				sup = medio - 1;
			} else {
				inf = medio + 1;
			}
			medio = (inf + sup) / 2;
		}
		if (vec[medio] == valor) {
			System.out.println("Encontrado en la posicion : " + medio);
		} else {
			System.out.println("No existe el valor seleccionado");
		}
	}

	public static void main(String[] args) {
		int vector[] = { 3, 4, 5, 6 };
		buscarNumero(vector, 3);
		System.out.println();
		buscarNumero(vector, 4);
		System.out.println();
		buscarNumero(vector, 5);
		System.out.println();
		buscarNumero(vector, 6);

	}

}
