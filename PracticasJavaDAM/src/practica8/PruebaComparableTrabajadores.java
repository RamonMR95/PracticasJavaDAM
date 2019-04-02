package practica8;

import java.util.ArrayList;

import practica8.ejercicio1.Trabajador;

/**
 * Ejercicio 3 verde
 * Comprueba la funcionalidad de comparable en Trabajador
 * @source PruebaComparableTrabajadores.java
 * @author Ramon Monino Rubio - 2019.04.02
 */

public class PruebaComparableTrabajadores {

	public static void main(String[] args) {
		Trabajador trabajador = new Trabajador();
		trabajador.OrdenarPorSalario();
		
		ArrayList<Trabajador> trabajadores = trabajador.getTrabajadores();
		
		for (int i = 0; i < trabajadores.size(); i++) {
			System.out.println(trabajadores.get(i));
		}
	}
}
