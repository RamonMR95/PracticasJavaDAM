package practica1;
/**
 * PruebaLiterales.java
 * Ejercicio 4 verde
 * Programa que comprueba los identificadores validos en java
 * Ramon Monino Rubio - 2018.09.27
 */


@SuppressWarnings("unused")
public class PruebaLiterales {

	public static void main(String[] args) {
		double number = -11.1; // valido
		String a = "cañón"; //valido
		double num = +521.6; //valido
		// double nu = 0b1010101.26f; // no valido
		// String cad = \xFE; // no valido, no puede ser ningun tipo
		// String cade = XGA; // no valido, no puede ser de ningun tipo
		char letra = 'a';  // valido
		// String ca = ab"c;"; // no valido por el mal uso de " y ,
		String cadena = "abc;"; // valido
		String caden = "true"; // valido
		// double n = -88.28.3e27; //no valido por el mal uso de puntos
		int nume = 0377;  // valido
		//int nume2 = 099; // No valido, por 9 no es representable en base octal
		double nb = 1.26; // valido
		// char retorno = ‘\n’; // no valido no apostrofo/ caracteres especiales
		double no = .567; // valido
		//char c = 'abc'; // no valido
		double nv = 0xf; // valido
		 String cn = "abc';"; // valido
		// String union = ""abc""; // No es valida, no se pueden anidar comillas
		//boolean verdad =True; // no valido, true empieza en minuscula
		// boolean falsedad = False; // no valido, false es en minuscula
		char b = '\\'; // valido
	}
}
