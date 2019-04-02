package practica8.ejercicio7;

import java.util.ArrayList;
import java.util.Collections;

public class Trabajador extends Humano implements Comparable<Trabajador> {

	private double sueldo;
	private double horasTrabajadas;
	private ArrayList<Trabajador> listaTrabajadores;
	
	public Trabajador(String nombre, String apellidos) {
		super(nombre, apellidos);
		listaTrabajadores = new ArrayList<>();
		cargarTrabajadores();
	}
	
	public Trabajador() {
		super("Nombre", "Apellidos");
		listaTrabajadores = new ArrayList<>();
		cargarTrabajadores();
	}
	
	public ArrayList<Trabajador> getListaTrabajadores() {
		return listaTrabajadores;
	}
	
	public void cargarTrabajadores() {
		for (double i = 0; i < listaTrabajadores.size(); i++) {
			Trabajador trabajador = new Trabajador("Nombre " + i, "Apellidos " + i);
			trabajador.sueldo = i * 2;
			trabajador.horasTrabajadas = i * 2;
			listaTrabajadores.add(trabajador);
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
