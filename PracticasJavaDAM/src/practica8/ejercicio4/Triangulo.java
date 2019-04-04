package practica8.ejercicio4;

/**
 * Ejercicio 4 verde
 * Clase Triangulo que hereda de FiguraGeometrica implementando su propio metodo calcularArea
 * @source Triangulo.java
 * @author Ramon Monino Rubio - 2019.04.02
 */

public class Triangulo extends FiguraGeometrica {

	/**
	 * Constructor convencional del Triangulo
	 * @param alto - Alto del triangulo
	 * @param ancho - Ancho del triangulo
	 */
	public Triangulo(double alto, double ancho) {
		super(alto, ancho);

	}

	/**
	 * Implementación del metodo abstracto calcularArea de {@link FiguraGeometrica} aplicado a un triangulo.
	 * @return area - Area del triangulo
	 */
	@Override
	public double calcularArea() {
		return (alto * ancho)/ 2;
	}

}
