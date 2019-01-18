package practica1;

/**
 * PruebaIdentificadores.java
 * Ejercicio 3 verde
 * Programa que comprueba si las variables son posibles o no
 * Ramon Monino Rubio- 2018.09.27
 */

@SuppressWarnings("unused")
public class PruebaIdentificadores {

	public static void main(String[] args) {
		int _alpha; // No valido porque por convenido no puede empezar por caracteres especiales
		int maxValor; // Valido
		int Nbytes; // Valido, aunque mejor escrito como nBytes
		// int qué_dices?; // No valido por uso de caracteres especiales
		// int Cañón; // No valido por el uso de caracteres especiales, como la tilde
		int Return; // Valido en principio pero evitar para no confundir con return del lexico de java para devolver algun valor
		// int Bloque#4; // No valido por el uso de caracteres especiales
		// int 8ªRoca; // No valido por el uso de caracteres especiales
		int FLOAT; // Valido en principio pero evitar para no confundir con el tipo de datos primitivo float definido por el lexico de java
		int cuantos; // Valido
		// int pink.panter; // No valido por el uso de caracteres especiales
		// int int; //No valido porque int es una palabra reservada del lenguaje
		// int Número; // Por convenio no se debe usar tildes
		// int café; // No valido, por convenio no se deben usar tildes
		int While; // Valido en principio pero evitar para no confundir con while del lexico de java para realizar estructuras tipo bucle
		// int c o s a; // No valido porque la variable no puede contener espacios en
		// blanco entre si
		// int 3d2; // No valido, no puede empezar por numeros
		// int 1_de_muchos; // No valido, no puede empezar por numero
		// int "dado"; // No valido, no se pueden utilizar caracteres especiales
		// int cadena 2; // No valido, no se pueden existir espacios en el nombre de la variable
		// int Mesa-3; // No valido
		int __if; // Valido pero no aconsejable por convenio
		int _CaPrIcHoSo_; // Valido pero no aconsejable por convenio
		// int Hoja3/5; // No valido por el uso de caracteres especiales

	}
}
