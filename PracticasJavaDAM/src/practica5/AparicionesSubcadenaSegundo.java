package practica5;

/**
 * AparicionesSubcadena.java Ejercicio 4 verde Programa que muestra el numero de
 * veces que se encuentra una subcadena en una cadena sin distinguir mayusculas
 * ni minus
 * 
 * @author Ramon Monino Rubio - 2018.11.09
 */

public class AparicionesSubcadenaSegundo {
	static String cadena = new String(
			"Estamos viviendo en un submarino amarillo. No tenemos nada que hacer. En el interior del submarino se está muy apretado. Así que estamos leyendo todo el día. Vamos a salir en 5 días");
	static String[] cadenas = cadena.split("\\.|\\s+");
	static String REGEX = new String("[Ee]n]");

	public static void main(String[] args) {
		System.out.println(obtenerNumeroVecesSubCadena(cadena));
		for (String string : cadenas) {
			System.out.println(string);
		}
	}

	public static int obtenerNumeroVecesSubCadena(String cadena) {
		int contador = 0;
		
		for (String subcadena : cadenas) {
			if(subcadena.matches(REGEX)) {
				contador++;
			}
		}
		
		return contador;
	}
}
