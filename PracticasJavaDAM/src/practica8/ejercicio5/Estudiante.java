package practica8.ejercicio5;

import java.util.ArrayList;

/**
 * Ejercicio 5 verde
 * Implementación de la clase Estudiante
 * @source Estudiante.java
 * @author Ramon Monino Rubio - 2019.04.02
 */
public class Estudiante extends Humano {

	private ArrayList<Double> listaNotas;
	
	/**
	 * Constructor convencional de la clase Estudiante
	 * @param nombre - Nombre del estudiante
	 * @param apellidos - Apellidos del estudiante
	 */
	public Estudiante(String nombre, String apellidos) {
		super(nombre, apellidos);
		listaNotas = new ArrayList<>();
	}

	/**
	 * Metodo get que obtiene la lista de notas del estudiante
	 * @return lista - Lista de las notas del estudiante
	 */
	public ArrayList<Double> getListaNotas() {
		return listaNotas;
	}

	/**
	 * Metodo set que establece la lista de notas
	 * @param listaNotas - Lista de las notas del estudiante
	 */
	public void setListaNotas(ArrayList<Double> listaNotas) {
		this.listaNotas = listaNotas;
	}
}
