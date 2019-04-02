package practica8.ejercicio5;

import java.util.ArrayList;

public class Estudiante extends Humano {

	private ArrayList<Double> listaNotas;
	
	public Estudiante(String nombre, String apellidos) {
		super(nombre, apellidos);
		listaNotas = new ArrayList<>();
	}

	public ArrayList<Double> getListaNotas() {
		return listaNotas;
	}

	public void setListaNotas(ArrayList<Double> listaNotas) {
		this.listaNotas = listaNotas;
	}
}
