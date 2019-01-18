package autoevaluacion3;

/**
 * DiagramaBarras.java 
 * Autoevaluacion 3
 * @author Ramon Monino Rubio 2018.11.14
 */

/*
 * En el ejercicio utilizo la clase StringBuilder para usar funciones de la
 * clase como append y obtener un mejor rendimiento en la concatenación de
 * cadenas de caracteres.
 */
public class DiagramaBarras {
	static final int LIMITE_SUPERIOR = 10;
	static final int LIMITE_INFERIOR = -10;
	static final char CARACTER_BASE = '*';
	static final char CARACTER_ESPACIO = ' ';
	static final char SEPARADOR = '|';

	public static void main(String[] args) {
		/*
		 * Array que contiene los datos del ejercicio, explicacion :
		 * https://docs.google.com/document/d/1xnyeCQnFJYB7q5Uhfw4Eqqz3FrFJtbUrqXJUfeNfNxM/edit
		 */
		int[] datos = { 9, -2, 4, -6, -10, 0, 10, -11, 11 };

		visualizarArray(datos);

	}

	public static String generarBarraHorizontal(int dato) {
		StringBuilder resultado = new StringBuilder();
		int numeroEspacios;

		resultado.append(dato).append('\t');

		if (IsDatoValido(dato)) {
			if (dato >= 0) {
				numeroEspacios = Math.abs(LIMITE_INFERIOR);
				resultado.append(generarBloqueCaracteres(numeroEspacios, CARACTER_ESPACIO));
				resultado.append(SEPARADOR);
				resultado.append(generarBloqueCaracteres(dato, CARACTER_BASE));

			} else {
				numeroEspacios = Math.abs(LIMITE_INFERIOR) - Math.abs(dato);
				resultado.append(generarBloqueCaracteres(numeroEspacios, CARACTER_ESPACIO));
				resultado.append(generarBloqueCaracteres(Math.abs(dato), CARACTER_BASE));
				resultado.append(SEPARADOR);
			}

		} else {
			resultado.append("FUERA DE RANGO");
		}
		return resultado.toString();
	}

	public static String generarBloqueCaracteres(int numeroCaracteres, char caracter) {
		StringBuilder caracteres = new StringBuilder();

		for (int i = 0; i < numeroCaracteres; i++) {
			caracteres.append(caracter);
		}
		return caracteres.toString();
	}

	/* Método que comprueba si el num está en el rango de valores permitido */
	public static boolean IsDatoValido(int num) {
		return num >= LIMITE_INFERIOR && num <= LIMITE_SUPERIOR;
	}

	/* Método que mediante un bucle FOR EACH muestra los valores devuelve la función generarBarraHorizontal */
	public static void visualizarArray(int[] vec) {
		for (int dato : vec) {
			System.out.println(generarBarraHorizontal(dato));
		}
	}

}
