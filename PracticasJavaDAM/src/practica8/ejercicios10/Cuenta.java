package practica8.ejercicios10;

/**
 * Ejercicio 10
 * @source Cuenta.java
 * @author Ramon Monino Rubio - 2019.04.02
 */

public abstract class Cuenta {

	public enum TipoCliente { PARTICULAR, EMPRESA };
	protected TipoCliente tipoCliente;
	protected String nombre;
	protected  double saldo;
	protected  double interesMensual;
	
	/**
	 * Constructor convencional de la clase Cuenta.
	 * @param nombre - Nombre de la cuenta.
	 * @param saldo - Saldo actual de la cuenta.
	 * @param interesMensual - Interes mensual de la cuenta.
	 * @param tipoCliente - Tipo de cliente propietario de la cuenta.
	 */
	public Cuenta(String nombre, double saldo, double interesMensual, TipoCliente tipoCliente) {
		this.nombre = nombre;
		this.saldo = saldo;
		this.interesMensual = interesMensual;
		this.tipoCliente = tipoCliente;
	}
	
	public abstract void depositar(double cantidad);
	public abstract void retirarDinero(double cantidad) throws Exception;
	
	@Override
	public String toString() {
		return "Nombre : " + nombre + ", saldo " + saldo + ", interesMensual " + interesMensual + "%, tipoCliente " + tipoCliente;
	}
	
}
