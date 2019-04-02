package practica8.ejercicio4;

/**
 * Ejercicio 4 verde
 * Clase que crea un circulo heredando de FiguraGeometrica implementando su propio metodo calcularArea
 * @source Circulo.java
 * @author Ramon Monino Rubio - 2019.04.02
 */

public class Circulo extends FiguraGeometrica {

	private int radio;
	
	public Circulo(int radio) {
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(radio, 2);
	}

}
