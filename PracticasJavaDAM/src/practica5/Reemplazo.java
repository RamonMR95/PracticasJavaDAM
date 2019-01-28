package practica5;
//TODO
public class Reemplazo {

	public static void main(String[] args) {
		String texto = "Oracle ha anunciado hoy su nueva generación de compilador Java hoy. Utiliza analizador avanzado y optimizador especial para la JVM de Oracle";
		String claves = "JVM,Java,Oracle";
		String [] arrayClaves= claves.split(",");	
		System.out.println(reemplazaPalabras(texto, claves));
	}
	
	public static String reemplazaPalabras(String texto, String claves) {
		StringBuilder cadena = new StringBuilder();
		String[] spliteo = texto.split("\\s+");

		for (String string : spliteo) {
			System.out.println(string);
		}
		return cadena.toString();
	}

}
