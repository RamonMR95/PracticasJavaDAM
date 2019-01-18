package practica3;

/**
 * PiramideString.java 
 * 1.2.4 Ejercicio 14 verde 
 * Programa que muestra por pantalla una piramide usando una String
 * @author Ramon Monino Rubio 2018.10.13
 */

public class PiramideString {
	static String texto = "";

	public static void main(String[] args) {
		piramide(5);
		visualizarString(texto);

	}

	public static String piramide(int num) {

		for (int i = 0; i < num; i++) {
			for (int numeroEspacios = 0; numeroEspacios <= num - i; numeroEspacios++) {
				texto += " ";
			}

			for (int numeroAsterisco = 0; numeroAsterisco <= 2 * i; numeroAsterisco++) {
				texto += "*";
			}
			texto += "\n";
		}
		return texto;
	}

	public static void visualizarString(String a) {
		System.out.println(a);
	}

}
