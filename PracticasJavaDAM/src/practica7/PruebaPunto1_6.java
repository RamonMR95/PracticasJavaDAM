package practica7;

/**
 * Punto.java 
 * Ejercicio 1 naranja
 * Programa que implementa un Punto con unas coordenadas
 * @author Ramon Monino Rubio - 2019.03.12
 */

class Punto {
	/**
	 * Atributos de la clase punto que formaran las coordenadas del mismo
	 */
	private double x;
	private double y;
	
	/**
	 * Constructor convencional de la clase Punto.
	 * @param x - Coordenada en el eje X
	 * @param y - Coordenada en el eje Y
	 */
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Constructor por defecto de la clase Punto.
	 */
	public Punto() {
		x = 0.0;
		y = 0.0;
	}

	/**
	 * Metodo get que obtiene el campo x de la coordenada
	 * @return x - Coordenada en el eje X
	 */
	public double getX() {
		return x;
	}

	/**
	 * Metodo set que establece el valor del punto en el eje x
	 * @param x - Coordenada en el eje X
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * Metodo get que obtiene el campo y de la coodenada
	 * @return y - Coordenada en el eje Y
	 */
	public double getY() {
		return y;
	}

	/**
	 * Metodo set que establece el valor del punto en el eje y
	 * @param y - Coordenada en el eje y
	 */
	public void setY(double y) {
		this.y = y;
	}
	
	/**
	 * Metodo toString de la clase el cual será usado para imprimir con formato los valores del punto
	 */
	public String toString() {
		return "Punto : (" + this.x + ", " + this.y + ")";
	}
}

/**
 * Clase que prueba el punto
 * @author Ramon Moñino Rubio
 */
public class PruebaPunto1_6{
	
	public static void main(String[] args) {
		// Creo un punto y lo muestro
		Punto punto = new Punto(2.2, 5.5);
		System.out.println(punto.toString());
		
		// Cambio los valores de los atributos
		punto.setX(3.5);
		punto.setY(1.5);
		// Muestro el valor de los atributos al cambiarlos
		System.out.println(punto.toString());
		
	}
}
