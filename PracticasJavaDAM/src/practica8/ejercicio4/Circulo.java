package practica8.ejercicio4;

/**
 * Ejercicio 4 verde
 * Clase que crea un circulo heredando de FiguraGeometrica implementando su propio metodo calcularArea
 * @source Circulo.java
 * @author Ramon Monino Rubio - 2019.04.02
 */

public class Circulo extends FiguraGeometrica {

	private int radio;
	
	/**
	 * Constructor convencional de la clase Circulo.
	 * @param radio - Radio del circulo
	 */
	public Circulo(int radio) {
		this.radio = radio;
	}

	/**
	 * Metodo para calcular el area de un circulo
	 * @return Area - Area de un circulo
	 */
	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(radio, 2);
	}

}
