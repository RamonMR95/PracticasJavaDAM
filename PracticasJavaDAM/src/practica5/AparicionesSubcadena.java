package practica5;

/**
 * AparicionesSubcadena.java 
 * Ejercicio 3 verde 
 * Programa que muestra el numero de veces que se encuentra una subcadena en una cadena
 * @author Ramon Monino Rubio - 2018.11.09
 */

public class AparicionesSubcadena {
	static String cadena = new String(
			"Estamos viviendo en un submarino amarillo. No tenemos nada que hacer. En el interior del submarino se está muy apretado. Así que estamos leyendo todo el día. Vamos a salir en 5 días");
	static String subcadena = new String("en");

	public static void main(String[] args) {
		System.out.println(obtenerNumeroVecesSubCadena(cadena, subcadena));
	}

	public static int obtenerNumeroVecesSubCadena(String cadena, String subcadena) {
		int contador = 0;

		while (cadena.indexOf(subcadena) > -1) {
			cadena = cadena.substring(cadena.indexOf(subcadena) + subcadena.length(), cadena.length());
			contador++;

		}
		return contador;
	}
}
