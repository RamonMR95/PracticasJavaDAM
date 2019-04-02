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
	
	public Humano(String nombre, String apellidos) {
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
}
