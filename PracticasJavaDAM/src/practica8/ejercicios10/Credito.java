package practica8.ejercicios10;

/**
 * Ejercicio 10
 * Clase que implementa la cuenta de crédito.
 * @source Credito.java
 * @author Ramon Monino Rubio - 2019.04.02
 */

public class Credito extends Cuenta implements Interesable {

	/**
	 * Constructor convencional de la clase Credito.
	 * @param nombre - Nombre de la cuenta.
	 * @param saldo - Saldo actual de la cuenta.
	 * @param tipoInteres - tipo de Interes de la cuenta.
	 * @param tipoCliente - Tipo de cliente propietario de la cuenta.
	 */
	public Credito(String nombre, double saldo, double tipoInteres, TipoCliente tipoCliente) {
		super(nombre, saldo, tipoInteres, tipoCliente);

	}

	/**
	 * Metodo utilizado para realizar un deposito de una cuenta
	 * @param cantidad - Cantidad de dinero a depositar
	 */
	@Override
	public void depositar(double cantidad) {
		this.saldo += cantidad;
		System.out.println("Deposito de " + cantidad);
	}

	
	/**
	 * Metodo que calcula el interés mensual al que estará sujeto la cuenta.
	 * @param numeroMeses - Numero de meses del prestamo.
	 * @return interes - Interes total de la cuenta.
	 */
	@Override
	public double interesTotal(int numeroMeses) {
		if (tipoCliente == TipoCliente.PARTICULAR && numeroMeses <= 3) {
			return 0;
		}
		return numeroMeses * tipoInteres;
	}

	/**
	 * Metodo utilizado para realizar un reintegro de dinero en una cuenta de credito
	 * @param cantidad - Cantidad de dinero a retirar
	 * @throws Exception - Si la cantidad es mayor al saldo actual de la cuenta.
	 */
	@Override
	public void retirarDinero(double cantidad) throws Exception {
		throw new Exception("No se puede retirar dinero en un Credito");
		
	}

}
