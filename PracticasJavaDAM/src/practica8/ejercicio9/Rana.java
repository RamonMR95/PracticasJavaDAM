package practica8.ejercicio9;

/**
 * Ejercicio 9
 * Clase que implementa la clase Rana que hereda de animales.
 * @source Rana.java
 * @author Ramon Monino Rubio - 2019.04.02
 */
public class Rana extends Animales {

	/**
	 * Constructor convencional de la clase Rana
	 * @param edad - Edad del Rana
	 * @param nombre - Nombre del Rana
	 * @param sexo - Sexo del Rana
	 */
	public Rana(int edad, String nombre, String sexo) {
		super(edad, nombre, sexo);
	}

	/**
	 * Implementación del metodo sonidoCaracteristico de la Rana
	 * @return Sonido - Sonido caracteristico de la Rana
	 */
	@Override
	public String sonidoCaracteristico() {
		return "Croak";
	}

}
