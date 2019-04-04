package practica8.ejercicio6;


import java.util.ArrayList;
/**
 * Ejercicio 6 verde
 * Implementación de la clase Estudiante
 * @source Estudiante.java
 * @author Ramon Monino Rubio - 2019.04.02
 */
public class Estudiante extends Humano implements Comparable<Estudiante> {
	
	private ArrayList<Double> listaNotas;
	public final static int NUMERO_NOTAS = 10;
	public final static int NUMERO_ESTUDIANTES = 10;
	
	
	/**
	 * Constructor convencional de la clase Estudiante
	 * @param nombre - Nombre del estudiante
	 * @param apellidos - Apellidos del estudiante
	 */
	public Estudiante(String nombre, String apellidos) {
		super(nombre, apellidos);
		this.listaNotas = new ArrayList<>();
	}
	
	/**
	 * Constructor convencional de la clase estudiante
	 */
	public Estudiante() {
		this("Nombre", "Apellidos");
	}

	/**
	 * Metodo que obtiene la lista de las notas del estudiante
	 * @return listaNotas - Lista de las notas del estudiante
	 */
	public ArrayList<Double> getListaNotas() {
		return listaNotas;
	}

	/**
	 * Metodo set que establece la lista de notas del estudiante
	 * @param listaNotas - Lista de las notas del estudiante
	 */
	public void setListaNotas(ArrayList<Double> listaNotas) {
		this.listaNotas = listaNotas;
	}

	/**
	 * Metodo set que calcula la media de las notas del estudiante
	 * @return media - Media de las notas del estudiante
	 */
	public double calcularMedia() {
		double suma = 0;
		
		for (Double nota : listaNotas) {
			suma += nota;
		}
		return suma / listaNotas.size();
	}
	
	/**
	 * Metodo que carga notas de manera aleatoria en la lista de notas del estudiante
	 */
	public void cargarNotas() {
		for (int i = 0; i < NUMERO_NOTAS; i++) {
			double nota = (Math.random() * 9) + 1;
			this.listaNotas.add(nota);
		}
		
	}
	
	/**
	 * Metodo de carga de Estudiantes en un array
	 * @return lista de estudiantes - ArrayList con estudiantes de prueba
	 */
	public ArrayList<Estudiante> cargarEstudiantes() {
		ArrayList<Estudiante> estudiantes = new ArrayList<>();
		
		for (int i = 0; i < NUMERO_ESTUDIANTES; i++) {
			estudiantes.add(new Estudiante("Nombre" + 1, "apellidos"));
			estudiantes.get(i).cargarNotas();
		}
		
		return estudiantes;
	}
	
	/**
	 * Implementación del metodo compareTo para ordenar los estudiantes por media de las notas obtenidas
	 */
	@Override
	public int compareTo(Estudiante o) {
		int result = 0;
		
		if (calcularMedia() > o.calcularMedia()) {
			result = -1;
		}
		else if (calcularMedia() < o.calcularMedia()) {
			result = 1;
		}
		return result;
	}

	@Override
	public String toString() {
		double media = calcularMedia();
		return super.toString() + ", Estudiante [listaNotas=" + listaNotas + ", media = " + media + "]";
	}
	
}
