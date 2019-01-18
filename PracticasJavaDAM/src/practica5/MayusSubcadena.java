package practica5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MayusSubcadena {
	static String regex = ".*<(.|\\n)+?>.*";
	static String texto = "Estamos viviendo en un <mayus>submarino amarillo</mayus>. No tenemos <mayus>nada</mayus> qué hacer";
	static String[]cadena=  texto.split("\\s | <\\mayus+?>");

	public static void main(String[] args) {
		for (String string : cadena) {
			System.out.println(string);
		}
	}

}
