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
	
	/**
	 * Constructor convencional de la clase Persona
	 * @param nombre - Nombre de la persona
	 * @param apellidos - Apellidos de la persona
	 */
	public Persona(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	/**
	 * Metodo get que obtiene el nombre de la persona
	 * @return nombre - Nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo set que establece el nombre de la persona
	 * @param nombre - Nombre de la persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo get que obtiene el valor de los apellidos
	 * @return apellidos - Apellidos de la persona
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Metodo set que establece los apellidos de la persona
	 * @param apellidos - Apellidos de la persona
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	/**
	 * Implementación de toString de Persona
	 */
	@Override
	public String toString() {
		return "Nombre : " + nombre + ", apellidos : " + apellidos;
	}
	
} // Class
