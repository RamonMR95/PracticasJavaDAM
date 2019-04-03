package practica8.ejercicio8;

/**
 * Ejercicio 8
 * Clase que implementa la clase circulo que hereda de Figura.
 * @source Circulo.java
 * @author Ramon Monino Rubio - 2019.04.02
 */
public class Circulo extends Figura {

	private int radio;
	
	/**
	 * Constructor convencional de la clase Circulo.
	 * @param radio - Radio del circulo
	 */
	public Circulo(int radio) {
		super(radio, radio);
		this.radio = radio;
	}

	/**
	 * Metodo get que obtiene el radio del circulo.
	 * @return radio - Radio del circulo.
	 */
	public int getRadio() {
		return radio;
	}
	
	/**
	 * Metodo set que establece el tamaño del radio del circulo.
	 * @param radio - Tamaño del radio del circulo.
	 */
	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	/**
	 * Metodo que calcula el area de un circulo.
	 * @return Area - Area del circulo.
	 */
	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(radio, 2);
	}

}
