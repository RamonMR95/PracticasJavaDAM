package practica8.ejercicio6;


/**
 * Ejercicio 6 verde
 * Implementación de la clase Humano
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
	 * Constructor por defecto de la clase Humano
	 */
	public Humano() {
		this("Nombre", "Apellidos");
	}

	/**
	 * Metodo get que obtiene el nombre del humano
	 * @return nombre - Nombre del humano
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo set que establece el nombre del humano
	 * @param nombre - Nombre del humano
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo get que obtiene los apellidos del humano
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

	@Override
	public String toString() {
		return "Humano [nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
	
}
