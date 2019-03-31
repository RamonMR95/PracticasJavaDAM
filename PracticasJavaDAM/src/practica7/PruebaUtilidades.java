package practica7;

/**
 * Ejercicio 8 y 9 Verde
 * @source PruebaUtilidades.java
 * @author Ramon Monino Rubio - 2019.03.31
 */
class Utilidades {
	// Texto que formará la clave a encriptar
	private String texto;

	/**
	 * Constructor convencional de la clase Utilidades
	 * @param texto - Texto que forma la clave
	 */
	public Utilidades(String texto) {
		this.texto = texto;
	}

	/**
	 * Metodo que encripta una cadena de texto
	 * @return clave encriptada
	 */
	public String encriptar() {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < texto.length(); i++) {
			sb.append((char) (texto.charAt(i) + 2));
		}
		return this.texto = sb.toString();
	}

	/**
	 * Metodo que desencripta la clave encriptada
	 * @return clave desencriptada
	 */
	public String desencriptar() {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < texto.length(); i++) {
			sb.append((char) (texto.charAt(i) - 2));
		}
		return this.texto = sb.toString();

	}
}

public class PruebaUtilidades {

	public static void main(String[] args) {
		String contraseña = "h3h3";
		Utilidades cifrado = new Utilidades(contraseña);

		System.out.println(cifrado.encriptar());

		System.out.println(cifrado.desencriptar());
	}

}
