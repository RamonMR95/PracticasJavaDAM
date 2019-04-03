package practica8.ejercicio8;

/**
 * Ejercicio 8
 * Clase que implementa la clase Triangulo que hereda de Figura.
 * @source Triangulo.java
 * @author Ramon Monino Rubio - 2019.04.02
 */
public class Triangulo extends Figura {

	/**
	 * Constructor convencional de la clase Triangulo
	 * @param altura - Altura del triangulo
	 * @param anchura - Anchura del triangulo
	 */
	public Triangulo(double altura, double anchura) {
		super(altura, anchura);
	}
	
	/**
	 * Metodo que calcula el area del triangulo
	 * @return Area - Area del triangulo
	 */
	@Override
	public double calcularArea() {
		return (altura * anchura) / 2;
	}

}
