package practica5;

public class Cifrado {
	private static String texto = "HOLA";
	private static String clave = "claveX";

	public static void main(String[] args) {
		System.out.println(encriptar(texto, clave));
	}

	public static String encriptar(String texto, String clave) {
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < texto.length(); i++) {
			result.append((char) (texto.charAt(i) ^ clave.charAt(i % clave.length())));

		}
		return result.toString();
	}
}
