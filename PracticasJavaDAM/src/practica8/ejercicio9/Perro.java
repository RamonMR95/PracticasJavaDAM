package practica8.ejercicio9;

/**
 * Ejercicio 9
 * Clase que implementa la clase Perro que hereda de animales.
 * @source Perro.java
 * @author Ramon Monino Rubio - 2019.04.02
 */
public class Perro extends Animales {

	/**
	 * Constructor convencional de la clase Perro
	 * @param edad - Edad del Perro
	 * @param nombre - Nombre del Perro
	 * @param sexo - Sexo del Perro
	 */
	public Perro(int edad, String nombre, String sexo) {
		super(edad, nombre, sexo);
	}

	/**
	 * Implementación del metodo sonidoCaracteristico del Perro
	 * @return Sonido - Sonido caracteristico del Perro
	 */
	@Override
	public String sonidoCaracteristico() {
		return "Guau";
	}

}
