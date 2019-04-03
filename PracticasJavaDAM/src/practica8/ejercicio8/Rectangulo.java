package practica8.ejercicio8;

/**
 * Ejercicio 8
 * Clase que implementa la clase Rectangulo que hereda de Figura.
 * @source Rectangulo.java
 * @author Ramon Monino Rubio - 2019.04.02
 */
public class Rectangulo extends Figura {

	/**
	 * Constructor convencional de la clase Rectangulo.
	 * @param altura - Altura del rectangulo.
	 * @param anchura - Anchura del rectangulo.
	 */
	public Rectangulo(double altura, double anchura) {
		super(altura, anchura);

	}

	/**
	 * Metodo que calcula el area de un rectangulo
	 * @return Area - Area del rectangulo
	 */
	@Override
	public double calcularArea() {
		return altura * anchura;
	}

}
