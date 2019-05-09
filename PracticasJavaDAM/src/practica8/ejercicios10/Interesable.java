package practica8.ejercicios10;


/**
 * Ejercicio 10
 * Interfaz que declara el método de calcula del interes total de un préstamo.
 * @source Interesable.java
 * @author Ramon Monino Rubio - 2019.04.02
 */

public interface Interesable {

	/**
	 * @param numeroMeses - Numero de meses para devolver el préstamo.
	 * @return interesTotal - Interés del préstamo
	 */
	public double interesTotal(int numeroMeses);
}
