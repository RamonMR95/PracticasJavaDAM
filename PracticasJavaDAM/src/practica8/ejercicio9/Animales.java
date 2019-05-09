package practica8.ejercicio9;

/**
 * Ejercicio 9
 * Clase que implementa la clase abstracta animales.
 * @source Animales.java
 * @author Ramon Monino Rubio - 2019.04.02
 */
public abstract class Animales {

	protected int edad;
	protected String nombre;
	protected String sexo;
	
	/**
	 * Constructor convencional de la clase Animales
	 * @param edad - Edad del animal
	 * @param nombre - Nombre del animal
	 * @param sexo - Sexo del animal
	 */
	public Animales(int edad, String nombre, String sexo) {
		this.edad = edad;
		this.nombre = nombre;
		this.sexo = sexo;
	}
	
	/**
	 * Metodo abstracto que será implementado por las clases que hereden animales
	 * @return sonido - Sonido caracteristico de cada tipo de animal
	 */
	public abstract String sonidoCaracteristico();
	
	@Override
	public String toString() {
		return "Edad : " + edad + ", Nombre : " + nombre + ", sexo : " + sexo + ", sonido caracteristico: " + sonidoCaracteristico();
	}
}
