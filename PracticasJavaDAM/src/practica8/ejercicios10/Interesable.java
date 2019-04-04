package practica8.ejercicios10;


/**
 * Ejercicio 10
 * Interfaz que declara el método de calcula del interes mensual de un préstamo.
 * @source Interesable.java
 * @author Ramon Monino Rubio - 2019.04.02
 */

public interface Interesable {

	/**
	 * @param numeroMeses - Numero de meses para devolver el préstamo.
	 * @param tipoInteres - Tipo de interés del préstamo.
	 * @return interesMensual - Interés del préstamo
	 */
	public double interesMensual(int numeroMeses, double tipoInteres);
}
