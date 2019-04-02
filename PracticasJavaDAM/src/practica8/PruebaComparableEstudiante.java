package practica8;

import java.util.ArrayList;

/**
 * Ejercicio 2 verde
 * Comprueba la funcionalidad de comparable en Estudiante
 * @source PruebaComparableEstudiante.java
 * @author Ramon Monino Rubio - 2019.04.02
 */

public class PruebaComparableEstudiante {

	public static void main(String[] args) {
		Estudiante estudiante = new Estudiante();
		estudiante.ordenarPorNota();
		
		ArrayList<Estudiante> estudiantes = estudiante.getEstudiantes();
		
		for (int i = 0; i < estudiantes.size(); i++) {
			System.out.println(estudiantes.get(i));
		}
	}
}
