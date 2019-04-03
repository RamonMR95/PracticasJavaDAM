package practica8.ejercicio9;

/**
 * Ejercicio 9
 * Clase que implementa la clase Tigre que hereda de animales.
 * @source Tigre.java
 * @author Ramon Monino Rubio - 2019.04.02
 */
public class Tigre extends Animales {

	/**
	 * Constructor convencional de la clase Tigre
	 * @param edad - Edad del Tigre
	 * @param nombre - Nombre del Tigre
	 * @param sexo - Sexo del Tigre
	 */
	public Tigre(int edad, String nombre, String sexo) {
		super(edad, nombre, sexo);
	}


	/**
	 * Implementación del metodo sonidoCaracteristico del Tigre
	 * @return Sonido - Sonido caracteristico del Tigre
	 */
	@Override
	public String sonidoCaracteristico() {
		return "Miau";
	}

}
