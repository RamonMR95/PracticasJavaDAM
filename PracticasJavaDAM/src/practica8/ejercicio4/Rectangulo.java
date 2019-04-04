package practica8.ejercicio4;

/**
 * Ejercicio 4 verde
 * Clase Rectangulo que hereda de FiguraGeometrica implementando su propio metodo calcularArea
 * @source Rectangulo.java
 * @author Ramon Monino Rubio - 2019.04.02
 */

public class Rectangulo extends FiguraGeometrica {

	/**
	 * Constructor convencional de la clase Rectangulo.
	 * @param alto - Alto del rectangulo
	 * @param ancho - Ancho del rectangulo
	 */
	public Rectangulo(double alto, double ancho) {
		super(alto, ancho);

	}

	/**
	 * Implementación del metodo abstracto calcularArea de {@link FiguraGeometrica} aplicado a un rectangulo.
	 * @return area - Area del rectangulo
	 */
	@Override
	public double calcularArea() {
		return ancho * alto;
	}

}
