package practica8.ejercicio7;

import java.util.ArrayList;
import java.util.Collections;


/**
 * Ejercicio 7
 * Clase que implementa la clase principal del programa
 * @source Main.java
 * @author Ramon Monino Rubio - 2019.04.02
 */
public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Trabajador> listaTrabajadores = new ArrayList<>();
		Trabajador trabajador = new Trabajador();
		listaTrabajadores = trabajador.cargarTrabajadores();
		Collections.sort(listaTrabajadores);
		
		
		for (int i = 0; i < listaTrabajadores.size(); i++) {
			System.out.println(listaTrabajadores.get(i));
		}
	}
}
