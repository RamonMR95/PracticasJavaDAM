package practica8.ejercicio1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Ejercicio 1 - 2
 * Crea la clase Estudiante e implementa Comparable para ordenar estudiantes por nota
 * @source Estudiante.java
 * @author Ramon Monino Rubio - 2019.04.02
 */

public class Estudiante extends Persona implements Comparable<Estudiante> { 
	
	private int evaluacion;
	private ArrayList<Estudiante> estudiantes;
	
	public Estudiante(String nombre, String apellidos, int evaluacion) {
		super(nombre, apellidos);
		this.evaluacion = evaluacion;
	}
	
	public Estudiante() {
		this("Prueba", "Prueba" , 0);
		estudiantes = new ArrayList<>();
		cargarEstudiantes();
	}

	public int getEvaluacion() {
		return evaluacion;
	}

	public void setEvaluacion(int evaluacion) {
		this.evaluacion = evaluacion;
	}
	
	public ArrayList<Estudiante> getEstudiantes(){
		return estudiantes;
	}
	
	@Override
	public String toString() {
		return super.toString() + " , Evaluacion : " + evaluacion; 
	}

	public void ordenarPorNota() {
		Collections.sort(estudiantes);
	}
	
	@Override
	public int compareTo(Estudiante o) {
		int result = 0;
		
		if (this.evaluacion > o.evaluacion) {
			result = -1;
		}
		else if (this.evaluacion < o.evaluacion) {
			result = 1;
		}
		return result;
	}
	
	public void cargarEstudiantes() {
		for (int i = 0; i < 10; i++) {
			estudiantes.add(new Estudiante("Nombre" + 1, "apellidos" + 1, i + 1));
		}
	}
}
