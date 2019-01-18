package practica1;

/**
 * PruebaLiterales2.java 
 * Ejercicio 5 verde
 * identificadores validos en java 
 * Ramon Monino Rubio - 2018.09.27
 */

public class PruebaLiterales2 {

	Double dato = -11.1; // valido
	String a = "cañón"; // valido
	double num = +521.6; // valido
	// Double nu = 0b1010101.26f; // no valido, mal uso de b f
	// String cad = \xFE; // No valido
	// String cade = XGA; // No valido
	Character letra = 'a'; // valido
	// String ca = ab"c;"; // No valido mal uso de comillas
	String cadena = "abc;"; // valido
	String caden = "true"; // valido
	// Double n = -88.28.3e27;  // No valido mal uso de los puntos
	Integer nume = 0377; // valido
	// Integer nume2 = 099;  // No valido no se puede representar 9 en base 8
	Double nb = 1.26; // valido
	// Character retorno = ‘\n’;  // No valido mal uso de caracteres especiales
	Double no = .567; // valido
	// Character c = 'abc'; // No valido
	// Double nv = 0xf; // no valido
	 String cn = "abc';"; // valido
	// String union = ""abc""; // No es valida, no se pueden anidar comillas
	// Boolean verdad = True; // No valido, true en minusculas
	// Boolean falsedad = False; // No valido, false en minusculas
	Character b = ('\\'); // valido

}

