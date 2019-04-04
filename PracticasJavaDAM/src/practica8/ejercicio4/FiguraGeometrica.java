package practica8.ejercicio4;

/**
 * Ejercicio 4 verde
 * Clase abstracta FiguraGeometrica que será heredada por Rectangulo, triangulo y circulo
 * @source FiguraGeometrica.java
 * @author Ramon Monino Rubio - 2019.04.02
 */

public abstract class FiguraGeometrica {

	protected double alto;
	protected double ancho;
	
	/**
	 * Constructor convencional de FiguraGeometrica
	 * @param alto - Alto de la figura
	 * @param ancho - Ancho de la figura
	 */
	public FiguraGeometrica(double alto, double ancho) {
		this.alto = alto;
		this.ancho = ancho;
	}
	
	/**
	 * Constructor por defecto de la clase {@link FiguraGeometrica}
	 */
	public FiguraGeometrica() {
		this(0,0);
	}
	
	/**
	 * Definición del metodo generico para todas las clase que heredan {@link FiguraGeometrica} q
	 * ue tiene que implementar este metodo
	 * @return area - Area de la figura
	 */
	public abstract double calcularArea();
}
