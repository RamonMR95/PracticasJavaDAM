package practica8.ejercicio1;

/**
 * Ejercicio 1 naranja
 * Clase Persona que será heredada por Estudiante y Trabajador en la versión 1
 * @source Persona.java
 * @author Ramon Monino Rubio - 2019.04.02
 */

public class Persona {
	
	private String nombre;
	private String apellidos;
	
	public Persona(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	@Override
	public String toString() {
		return "Nombre : " + nombre + ", apellidos : " + apellidos;
	}
	
} // Class
