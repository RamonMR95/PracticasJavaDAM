package practica8.ejercicio7;

import java.util.ArrayList;
import java.util.Collections;

public class Trabajador extends Humano implements Comparable<Trabajador> {

	private double sueldo;
	private double horasTrabajadas;
	private ArrayList<Trabajador> listaTrabajadores;
	
	public Trabajador(String nombre, String apellidos, double sueldo, double horasTrabajadas) {
		super(nombre, apellidos);
		this.sueldo = sueldo;
		this.horasTrabajadas = horasTrabajadas;
		this.listaTrabajadores = new ArrayList<>();
	}
	
	public Trabajador() {
		this("Nombre", "Apellidos",0 , 0);
		cargarTrabajadores();
	}
	
	public ArrayList<Trabajador> getListaTrabajadores() {
		return listaTrabajadores;
	}
	
	public void cargarTrabajadores() {
		for (int i = 0; i < 10; i++) {
			this.listaTrabajadores.add(new Trabajador("Nombre ", "Apellidos ", i * 2, i));
		}
	}

	public void ordenarTrabajadoresBySueldo() {
		Collections.sort(listaTrabajadores);
	}
	
	@Override
	public int compareTo(Trabajador o) {
		int result = 0;
		
		if (this.sueldo > o.sueldo) {
			result = 1;
		}
		else if (this.sueldo < o.sueldo) {
			result = -1;
		}
		return result;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", sueldo = "+ sueldo + ", Horas : " + horasTrabajadas;
	}
	
}
