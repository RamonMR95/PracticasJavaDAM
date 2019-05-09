package practica8.ejercicio6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Ejercicio 6 verde
 * Implementación del array de estudiantes y prueba del comparable
 * @source EstudiantesOrdenadorPorNota.java
 * @author Ramon Monino Rubio - 2019.04.02
 */
public class EstudiantesOrdenadorPorNota {
	
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
