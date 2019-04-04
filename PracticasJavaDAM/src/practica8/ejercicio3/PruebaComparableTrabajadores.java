package practica8.ejercicio3;

import java.util.ArrayList;
import java.util.Collections;

import practica8.ejercicio1.Trabajador;

/**
 * Ejercicio 3 verde
 * Comprueba la funcionalidad de comparable en Trabajador
 * @source PruebaComparableTrabajadores.java
 * @author Ramon Monino Rubio - 2019.04.02
 */

public class PruebaComparableTrabajadores {

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
