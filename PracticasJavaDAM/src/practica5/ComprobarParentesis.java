package practica5;

/**
 * ComprobarParentesis.java Ejercicio 2 verde Programa que comprueba que tenemos
 * el mismo numero de aperturas de parentesis que de clausuras
 * 
 * @author Ramon Monino Rubio 2018.11.09
 */

public class ComprobarParentesis {
	static String cadena = "((HOLA))";

	public static void main(String[] args) {
		System.out.println(parentesisCorrectos());

	}

	public static boolean parentesisCorrectos() {
		System.out.println("Introduce un String con parentesis :");

		int contador = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == '(') {
				contador++;
			}
			if (cadena.charAt(i) == ')') {
				if (contador > 0) {
					contador--;
				}else {
					return false;
				}

			}
		}
		return contador == 0;
	}

}
