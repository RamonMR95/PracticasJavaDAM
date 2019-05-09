package practica8.ejercicio1;

import java.util.ArrayList;

/**
 * Ejercicio 1 - 2
 * Crea la clase Estudiante e implementa Comparable para ordenar estudiantes por nota
 * @source Estudiante.java
 * @author Ramon Monino Rubio - 2019.04.02
 */

public class Estudiante extends Persona implements Comparable<Estudiante> { 
	
	private int evaluacion;
	
	/**
	 * Constructor convencional de la clase Estudiante
	 * @param nombre - Nombre del estudiante
	 * @param apellidos - Apellidos del estudiante
	 * @param evaluacion - Nota del estudiante
	 */
	public Estudiante(String nombre, String apellidos, int evaluacion) {
		super(nombre, apellidos);
		this.evaluacion = evaluacion;
	}
	
	/**
	 * Constructor por defecto de la clase Estudiante
	 */
	public Estudiante() {
		this("Prueba", "Prueba" , 0);
		
	}

	/**
	 * Metodo get que obtiene la nota del estudiante
	 * @return
	 */
	public int getEvaluacion() {
		return evaluacion;
	}

	/**
	 * Metodo set que establece la nota del estudiante
	 * @param evaluacion - Nota del estudiante
	 */
	public void setEvaluacion(int evaluacion) {
		this.evaluacion = evaluacion;
	}
	
	/**
	 * Implementación del metodo toString de la clase para imprimir el valor de los atributos de la clase.
	 * @return toString - Cadena de caracteres que contiene los valores de los atributos de la clase.
	 */
	@Override
	public String toString() {
		return super.toString() + " , Evaluacion : " + evaluacion; 
	}

	/**
	 * Implementación del método compareTo para ordenar estudiantes según su nota
	 * @param o - Estudiante a ordenar
	 */
	@Override
	public int compareTo(Estudiante estudianteOtro) {
		return Integer.compare(this.evaluacion, estudianteOtro.evaluacion);
	}
	
	/**
	 * Metodo de carga de Estudiantes en un array
	 * @return lista de estudiantes - ArrayList con estudiantes de prueba
	 */
	public ArrayList<Estudiante> cargarEstudiantes() {
		ArrayList<Estudiante> estudiantes = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			estudiantes.add(new Estudiante("Nombre" + 1, "apellidos" + 1, i + 1));
		}
		return estudiantes;
	}
}
