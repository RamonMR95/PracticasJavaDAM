package practica8;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Ejercicio 1 naranja
 * Clase Trabajador que hereda de la clase Persona e implementa la interfaz 
 * comparable para ordenar un arraylist de trabajadores de manera inversa en cuanto a su salario
 * @source Trabajador.java
 * @author Ramon Monino Rubio - 2019.04.02
 */

public class Trabajador extends Persona implements Comparable<Trabajador>{
	
	private double salario;
	private double horasTrabajadas;
	private ArrayList<Trabajador> trabajadores;
	
	public Trabajador(String nombre, String apellidos, 
			double salario, double horasTrabajadas) {
		
		super(nombre, apellidos);
		this.salario = salario;
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public Trabajador() {
		super("Nombre", "Apellidos");
		this.salario = 0;
		this.horasTrabajadas = 0;
		trabajadores = new ArrayList<>();
		cargarTrabajadores();;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public ArrayList<Trabajador> getTrabajadores(){
		return trabajadores;
	}
	
	public void calcularSueldo(double precioHora) {
		this.salario = horasTrabajadas * precioHora;
	}
	
	public void OrdenarPorSalario() {
		Collections.sort(trabajadores);
	}
	
	
	public void cargarTrabajadores() {
		for (int i = 0; i < 10; i++) {
			trabajadores.add(new Trabajador("Nombre" + 1, "apellidos" + 1, i + 1, i + 1));
		}
	}
	
	@Override
	public int compareTo(Trabajador o) {
		int result = 0;
		
		if (this.salario > o.salario) {
			result = 1;
		}
		else if (this.salario < o.salario) {
			result = -1;
		}
		return result;
	}
	@Override
	public String toString() {
		return super.toString() + ", salario : " + salario + ", horas trabajadas : " + horasTrabajadas; 
	}
}
