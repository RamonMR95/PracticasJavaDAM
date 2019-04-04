package practica8.ejercicio7;

import java.util.ArrayList;

/**
 * Ejercicio 7
 * Clase que implementa la clase Trabajador que hereda de la clase Humano
 * @source Trabajador.java
 * @author Ramon Monino Rubio - 2019.04.02
 */
public class Trabajador extends Humano implements Comparable<Trabajador> {

	private double sueldo;
	private double horasTrabajadas;
	
	/**
	 * Constructor convencional de la clase Trabajador.
	 * @param nombre - Nombre del trabajador
	 * @param apellidos - Apellidos del trabajador
	 * @param sueldo - Sueldo del trabajador
	 * @param horasTrabajadas - Horas trabajadas por el trabajador
 	 */
	public Trabajador(String nombre, String apellidos, double sueldo, double horasTrabajadas) {
		super(nombre, apellidos);
		this.sueldo = sueldo;
		this.horasTrabajadas = horasTrabajadas;
	}
	
	/**
	 * Constructor por defecto de la clase Trabajador
	 */
	public Trabajador() {
		this("Nombre", "Apellidos", 0 , 0);
	}
	
	/**
	 * Metodo que carga una serie de trabajadores en el arraylist de trabajadores.
	 */
	public ArrayList<Trabajador> cargarTrabajadores() {
		ArrayList<Trabajador> listaTrabajadores = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			listaTrabajadores.add(new Trabajador("Nombre ", "Apellidos ", i * 2, i));
		}
		return listaTrabajadores;
	}
	
	/**
	 * Implementación del metodo compareTo para ordenar por el sueldo del trabajador de manera inversa.
	 */
	@Override
	public int compareTo(Trabajador o) {
		int result = 0;
		
		if (this.sueldo > o.sueldo) {
			result = 1;
		}
		else if (this.sueldo < o.sueldo) {
			result = -1;
		}
		return result;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", sueldo = "+ sueldo + ", Horas : " + horasTrabajadas;
	}
	
}
