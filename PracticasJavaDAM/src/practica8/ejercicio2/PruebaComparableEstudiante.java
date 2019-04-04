package practica8.ejercicio2;

import java.util.ArrayList;
import java.util.Collections;

import practica8.ejercicio1.Estudiante;

/**
 * Ejercicio 2 verde
 * Comprueba la funcionalidad de comparable en Estudiante
 * @source PruebaComparableEstudiante.java
 * @author Ramon Monino Rubio - 2019.04.02
 */

public class PruebaComparableEstudiante {

	public static void main(String[] args) {
		
		ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
		Estudiante estudiante = new Estudiante();
		listaEstudiantes = estudiante.cargarEstudiantes();
		Collections.sort(listaEstudiantes);
		
		
		for (int i = 0; i < listaEstudiantes.size(); i++) {
			System.out.println(listaEstudiantes.get(i));
		}
	}
}
