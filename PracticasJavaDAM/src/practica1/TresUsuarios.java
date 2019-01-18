package practica1;

/**
 * TresUsuarios.java
 * Ejercicio 9 violeta
 * Programa que obtiene los datos de 3 personas por teclado y los muestra, mostrando en primer lugar, los datos de la ultima persona que introdujo los datos
 * Ramon Monino Rubio - 2018.09.27
 */


import java.util.Scanner;

public class TresUsuarios {
	public static void main(String[] args) {
		/*
		 * Definimos las variables que contendran los valores del nombre, apellidos, nif
		 * y cp de los usuarios
		 */
		String nombre1, apellidos1, nif1;
		String nombre2, apellidos2, nif2;
		String nombre3, apellidos3, nif3;
		int cp1, cp2, cp3;
		/*
		 * Creamos un objeto de la clase Scanner que nos ayudara� a realizar la entrada
		 * de datos por teclado
		 */
		Scanner teclado = new Scanner(System.in);
		Scanner tecladoNumerico = new Scanner(System.in);

		/* Introducimos los datos por teclado */
		System.out.println("Introducza su nombre, apellidos, nif y cp s : ");
		nombre1 = teclado.nextLine();
		apellidos1 = teclado.nextLine();
		nif1 = teclado.nextLine();
		cp1 = tecladoNumerico.nextInt();

		System.out.println("Introducza su nombre, apellidos, nif y cp : ");
		nombre2 = teclado.nextLine();
		apellidos2 = teclado.nextLine();
		nif2 = teclado.nextLine();
		cp2 = tecladoNumerico.nextInt();

		System.out.println("Introducza su nombre, apellidos, nif y cp : ");
		nombre3 = teclado.nextLine();
		apellidos3 = teclado.nextLine();
		nif3 = teclado.nextLine();
		cp3 = tecladoNumerico.nextInt();

		/* Mostramos los datos por pantalla */
		System.out.println("Nombre : " + nombre3 + ", Apellidos : " + apellidos3 + ", Nif : " + nif3 + ", cp : " + cp3);
		System.out.println("Nombre : " + nombre2 + ", Apellidos : " + apellidos2 + ", Nif : " + nif2 + ", cp : " + cp2);
		System.out.println("Nombre : " + nombre1 + ", Apellidos : " + apellidos1 + ", Nif : " + nif1 + ", cp : " + cp1);

		/* Cerramos teclado ya que no se va a usar mas */
		teclado.close();
		tecladoNumerico.close();

	}

}
