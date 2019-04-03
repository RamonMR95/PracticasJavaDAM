package practica8.ejercicio9;

/**
 * Ejercicio 9
 * Clase que implementa la clase Gato que hereda de animales.
 * @source Gato.java
 * @author Ramon Monino Rubio - 2019.04.02
 */
public class Gato extends Animales {

	/**
	 * Constructor convencional de la clase Gato
	 * @param edad - Edad del Gato
	 * @param nombre - Nombre del Gato
	 * @param sexo - Sexo del Gato
	 */
	public Gato(int edad, String nombre, String sexo) {
		super(edad, nombre, sexo);
	}

	/**
	 * Implementación del metodo sonidoCaracteristico del Gato
	 * @return Sonido - Sonido caracteristico del Gato
	 */
	@Override
	public String sonidoCaracteristico() {
		return "Miau";
	}

}
