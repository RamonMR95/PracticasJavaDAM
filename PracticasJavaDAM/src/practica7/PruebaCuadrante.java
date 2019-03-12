package practica7;

/**
 * Cuadrante.java 
 * Ejercicio 7 verde 
 * Programa que muestra por pantalla el cuadrante en el que esta situado un punto
 * @author Ramon Monino Rubio - 2019.03.12
 */

class Cuadrante {
	// Punto a conocer en su cuadrante
	private Punto punto;

	/**
	 * Constructor por defecto de la clase Cuadrante
	 * @param punto - A conocer su cuadrante
	 */
	public Cuadrante(Punto punto) {
		this.punto = punto;
	}
	
	public Cuadrante() {
		this.punto = new Punto();
	}

	public String getCuadrante() {
		if (this.punto.getX() >= 0 && this.punto.getY() >= 0) {
			return "primer cuadrante";
		}

		if (this.punto.getX() >= 0 && this.punto.getY() < 0) {
			return "cuarto cuadrante";
		}

		if (this.punto.getX() <= 0 && this.punto.getY() > 0) {
			return "segundo cuadrante";
		}

		if (this.punto.getX() <= 0 && this.punto.getY() < 0) {
			return "tercer cuadrante";
		}

		return "Coordenadas inválidas";
	}

	public Punto getPunto() {
		return punto;
	}
}

public class PruebaCuadrante {

	public static void main(String[] args) {
		Cuadrante cuadrante = new Cuadrante();
		System.out.println(cuadrante.getPunto().toString() + " esta en el " + cuadrante.getCuadrante());

		cuadrante.getPunto().setX(2);
		cuadrante.getPunto().setY(-2);
		System.out.println(cuadrante.getPunto().toString() + " esta en el " + cuadrante.getCuadrante());

		cuadrante.getPunto().setX(-2);
		cuadrante.getPunto().setY(-2);
		System.out.println(cuadrante.getPunto().toString() + " esta en el " + cuadrante.getCuadrante());

		cuadrante.getPunto().setX(2);
		cuadrante.getPunto().setY(2);
		System.out.println(cuadrante.getPunto().toString() + " esta en el " + cuadrante.getCuadrante());

		cuadrante.getPunto().setX(-2);
		cuadrante.getPunto().setY(2);
		System.out.println(cuadrante.getPunto().toString() + " esta en el " + cuadrante.getCuadrante());

	}
}
