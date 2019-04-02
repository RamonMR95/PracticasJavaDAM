package practica8.ejercicio4;

/**
 * Ejercicio 4 verde
 * Clase Rectangulo que hereda de FiguraGeometrica implementando su propio metodo calcularArea
 * @source Rectangulo.java
 * @author Ramon Monino Rubio - 2019.04.02
 */

public class Rectangulo extends FiguraGeometrica {

	public Rectangulo(double alto, double ancho) {
		super(alto, ancho);

	}

	@Override
	public double calcularArea() {
		return ancho * alto;
	}

}
