package practica5;
/**
 * Pad.java 
 * Ejercicio 6 Verde
 * Escribir tantos caracteres como sean necesarios 
 * para completar el tamaño de una cadena
 * @author Ramon Monino Rubio 
 * 2019.01.17
 */

public class Pad {

	public static void main(String[] args) {
		String cadena = "Introducción";
		System.out.println(padRight(cadena, '*', 20));
	}

	public static String padRight(String cadena, char caracter, int numero) {
		StringBuilder cad = new StringBuilder(cadena);

		for (int i = 0; i < numero - cadena.length(); i++) {
			cad.append(caracter);
		}
		return cad.toString();

	}

}
