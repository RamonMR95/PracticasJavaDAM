package practica8.ejercicio9;

/**
 * Ejercicio 9
 * Clase que implementa la clase gatito que hereda de animales.
 * @source Gatito.java
 * @author Ramon Monino Rubio - 2019.04.02
 */

public class Gatito extends Animales {

	/**
	 * Constructor convencional de la clase Gatito
	 * @param edad - Edad del Gatito
	 * @param nombre - Nombre del Gatito
	 * @param sexo - Sexo del Gatito
	 */
	public Gatito(int edad, String nombre, String sexo) {
		super(edad, nombre, sexo);
	}

	/**
	 * Implementación del metodo sonidoCaracteristico del gatito
	 * @return Sonido - Sonido caracteristico del gatito
	 */
	@Override
	public String sonidoCaracteristico() {
		return "Miau";
	}
	
}
