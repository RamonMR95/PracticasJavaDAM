package practica8.ejercicios10;

import practica8.ejercicios10.Cuenta.TipoCliente;

/**
 * Ejercicio 10
 * Clase principal del programa.
 * @source Main.java
 * @author Ramon Monino Rubio - 2019.04.02
 */
public class Main {

	public static void main(String[] args)  {
		
		/* DEPOSITO */
		Deposito deposito = new Deposito("Ramón Moñino Rubio", 100000, 0.05, TipoCliente.PARTICULAR);
		System.out.println("El tipo de interes mensual del deposito es : " + deposito.interesMensual(5, deposito.interesMensual));
		System.out.println(deposito);
		deposito.depositar(5000);
		System.out.println(deposito);
		
		try {
			deposito.retirarDinero(100);
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(deposito + "\n");
		
		/* HIPOTECA */
		Hipoteca hipoteca = new Hipoteca("Daniel Fernandez", 2000, 0.07, TipoCliente.PARTICULAR);
		System.out.println("El tipo de interes mensual de la hipoteca es : " + hipoteca.interesMensual(2, hipoteca.interesMensual));
		System.out.println(hipoteca);
		hipoteca.depositar(5000);
		System.out.println(hipoteca);
		
		try {
			hipoteca.retirarDinero(7001);
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(hipoteca + "\n");
		
		/* CREDITO */
		Credito credito = new Credito("ONO", 50000000, 0.08, TipoCliente.EMPRESA);
		System.out.println("El tipo de interes mensual del credito es : " + credito.interesMensual(15, credito.interesMensual));
		System.out.println(credito);
		credito.depositar(5000);
		System.out.println(credito);
		
		try {
			credito.retirarDinero(7001);
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(credito + "\n");
	}

}
