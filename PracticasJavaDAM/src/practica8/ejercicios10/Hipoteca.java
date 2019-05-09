package practica8.ejercicios10;

/**
 * Ejercicio 10
 * Clase que implementa la cuenta de hipoteca.
 * @source Hipoteca.java
 * @author Ramon Monino Rubio - 2019.04.02
 */

public class Hipoteca extends Cuenta implements Interesable {

	/**
	 * Construcción convencional de la clase Hipoteca.
	 * @param nombre - Nombre de la cuenta.
	 * @param saldo - Saldo actual de la cuenta.
	 * @param tipoInteres - tipo de Interes de la cuenta.
	 * @param tipoCliente - Tipo de cliente propietario de la cuenta.
	 */
	public Hipoteca(String nombre, double saldo, double tipoInteres, TipoCliente tipoCliente) {
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
	 * Metodo utilizado para realizar un reintegro de dinero en una cuenta
	 * @param cantidad - Cantidad de dinero a retirar
	 * @throws Exception - Si la cantidad es mayor al saldo actual de la cuenta.
	 */
	@Override
	public void retirarDinero(double cantidad) throws Exception {
		if (saldo >= cantidad) {
			this.saldo -= cantidad;
		}
		throw new Exception("Hipotecas : Cantidad a retirar superior al saldo disponible");
	}
	
	/**
	 * Metodo que calcula el interés mensual al que estará sujeto la cuenta.
	 * @param numeroMeses - Numero de meses del prestamo.
	 * @return interes - Interes total de la cuenta.
	 */
	@Override
	public double interesTotal(int numeroMeses) {
		if (tipoCliente == TipoCliente.PARTICULAR && numeroMeses <= 6) {
			return (numeroMeses * tipoInteres) / 2;
		}
		
		if (tipoCliente == TipoCliente.EMPRESA && numeroMeses <= 12) {
			return (numeroMeses * tipoInteres) / 2;
		}
		return numeroMeses * tipoInteres;
		
	}

}
