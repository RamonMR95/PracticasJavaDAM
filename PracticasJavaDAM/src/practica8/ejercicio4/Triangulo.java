package practica8.ejercicio4;

/**
 * Ejercicio 4 verde
 * Clase Triangulo que hereda de FiguraGeometrica implementando su propio metodo calcularArea
 * @source Triangulo.java
 * @author Ramon Monino Rubio - 2019.04.02
 */

public class Triangulo extends FiguraGeometrica {

	public Triangulo(double alto, double ancho) {
		super(alto, ancho);

	}

	@Override
	public double calcularArea() {
		return (alto * ancho)/ 2;
	}

}
