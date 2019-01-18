package practica2;
import java.util.Scanner;
/**
 * LeeOcho.java
 * 1.2.3 Ejercicio 12 verde
 * Programa que obtiene 8 numeros por teclado sin guardarlos en variables unicas y calcula el sumatorio
 * @author Ramón Moñino Rubio
 * 2018.09.27
 */

public class LeeOcho {

	public static void main(String[] args) {
		/* Defino las variables que se van a utilizar */
		int numerosRestantes = 8;
		int sumaAcumulativa = 0;

		/* Creo un objeto de la clase Scanner para utilizar la entrada por teclado */
		Scanner sc = new Scanner(System.in);

		/*
		 * Mientras que la cantidad de numeros restantes sea mayor que cero, consigo un
		 * numero por consola y realizo una suma acumulativa disminuyendo los numeros
		 * restantes hasta que llegue a 0
		 */

		System.out.println("Introduce 8 numeros a sumar: ");
		while (numerosRestantes > 0) {
			sumaAcumulativa += sc.nextInt();
			numerosRestantes--;
		}
		/* Cerramos teclado ya que no se va a usar más */
		sc.close();
		/* Mostramos la suma por teclado */
		System.out.println("La suma acumulativa es : " + sumaAcumulativa);
	}

}
