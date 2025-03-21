package practica8.ejercicio5;

/**
 * Ejercicio 5 verde
 * Clase Humano que será heredada por Estudiante y Trabajador en la versión 2
 * @source Humano.java
 * @author Ramon Monino Rubio - 2019.04.02
 */

public class Humano {

	private String nombre;
	private String apellidos;
	
	/**
	 * Constructor convencional de la clase Humano
	 * @param nombre - Nombre del humano
	 * @param apellidos - Apellidos del humano
	 */
	public Humano(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	/**
	 * Metodo get que obtiene el nombre del Humano
	 * @return nombre - Nombre del humano
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo set que establece el nombre del Humano
	 * @param nombre - Nombre del humano
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo get que obtiene los apellidos del Humano
	 * @return apellidos - Apellidos del humano
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Metodo set que establece los apellidos del humano
	 * @param apellidos - Apellidos del humano
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
}
