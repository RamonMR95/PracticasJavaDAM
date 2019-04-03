package practica8.ejercicio8;

/**
 * Ejercicio 8
 * Clase que implementa la clase abstracta Figura.
 * @source Figura.java
 * @author Ramon Monino Rubio - 2019.04.02
 */
public abstract class Figura {

	protected double anchura;
	protected double altura;
	
	/**
	 * Constructor convencional de la clase Figura
	 * @param altura - Altura de la figura
	 * @param anchura - Ancho de la figura
	 */
	public Figura(double altura, double anchura) {
		this.altura = altura;
		this.anchura = anchura;
	}
	
	/**
	 * Metodo abstracto que calcula el area de una figura geométrica, debe ser implementado por las clases que lo hereden
	 * @return Area - Area de la figura.
	 */
	public abstract double calcularArea();

	/**
	 * Metogo get que obtiene la anchura de la figura geométrica
	 * @return anchura - Anchura de la figura geométrica
	 */
	public double getAnchura() {
		return anchura;
	}

	/**
	 * Metodo set que establece la anchura de la figura geométrica
	 * @param anchura - Anchura de la figura geométrica
	 */
	public void setAnchura(double anchura) {
		this.anchura = anchura;
	}

	/**
	 * Metodo get que obtiene la altura de la figura geométrica
	 * @return altura - Altura de la figura geométrica
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * Metodo set que establece la algura de la figura geométrica
	 * @param altura - Altura de la figura geométrica
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
