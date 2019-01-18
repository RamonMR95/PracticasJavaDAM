package practica3;

/**
 * RomboString.java 
 * 1.2.4 Ejercicio 14 verde 
 * Programa que devuelve un string con el rombo formateado
 * @author Ramon Monino Rubio 
 * 2018.10.13
 */

public class RomboString {
	static String texto = "";

	public static void main(String[] args) {
		rombo2(5);
		visualizar(texto);

	}

	public static String rombo2(int num) {

		for (int i = 0; i < (num / 2) + 1; i++) {
			for (int numeroEspacios = 0; numeroEspacios <= num - i; numeroEspacios++) {
				texto += " ";
			}
			for (int numeroAsterisco = 0; numeroAsterisco <= 2 * i; numeroAsterisco++) {
				texto += "*";
			}
			texto += "\n";

		}

		for (int i = num / 2 - 1; i >= 0; i--) {
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

	public static void visualizar(String text) {
		System.out.print(text);
	}

}