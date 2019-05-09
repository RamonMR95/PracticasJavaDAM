package practica8.ejercicio9;

/**
 * Ejercicio 9
 * Clase que implementa el metodo principal para realizar pruebas.
 * @source Main.java
 * @author Ramon Monino Rubio - 2019.04.02
 */

public class Main {

	public static void main(String[] args) {
		Animales perro = new Perro(5, "Toby", "Macho");
		Animales rana = new Rana(1, "Gustavo", "Macho");
		Animales gato = new Gato( 2, "Garfield", "Macho");
		Animales gatito = new Gatito(1, "Gatito", "Macho");
		Animales tigre = new Tigre(14, "Tigresa", "Hembra");
		
		System.out.println(perro);
		System.out.println(rana);
		System.out.println(gato);
		System.out.println(gatito);
		System.out.println(tigre);
		
	}

}
