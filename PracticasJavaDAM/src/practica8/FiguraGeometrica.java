package practica8;

/**
 * Ejercicio 4 verde
 * Clase abstracta FiguraGeometrica que será heredada por Rectangulo, triangulo y circulo
 * @source FiguraGeometrica.java
 * @author Ramon Monino Rubio - 2019.04.02
 */

public abstract class FiguraGeometrica {

	protected double alto;
	protected double ancho;
	
	public FiguraGeometrica(double alto, double ancho) {
		this.alto = alto;
		this.ancho = ancho;
	}
	
	public FiguraGeometrica() {
		this(0,0);
	}
	
	public abstract double calcularArea();
}
