package practica8.ejercicio6;

import java.util.ArrayList;
import java.util.Collections;

public class Estudiante extends Humano implements Comparable<Estudiante>{

	private ArrayList<Double> listaNotas;
	private ArrayList<Estudiante> listaEstudiantes;
	
	public Estudiante(String nombre, String apellidos) {
		super(nombre, apellidos);
		listaNotas = new ArrayList<>();
		listaEstudiantes = new ArrayList<>();
		cargarEstudiantes();
		
	}
	
	public Estudiante() {
		listaNotas = new ArrayList<>();
		listaEstudiantes = new ArrayList<>();
		cargarEstudiantes();
	}

	public ArrayList<Double> getListaNotas() {
		return listaNotas;
	}

	public ArrayList<Estudiante> getListaEstudiantes() {
		return listaEstudiantes;
	}
	
	public void setListaNotas(ArrayList<Double> listaNotas) {
		this.listaNotas = listaNotas;
	}
	
	public void cargarEstudiantes() {
		for (double i = 0; i < listaNotas.size(); i++) {
			Estudiante estudiante = new Estudiante("Estudiante" + i, "Estudiante" + i);
			double []a = { i, i, i, i, i, i, i, i, i, i };
			System.arraycopy(a, 0, listaNotas, 0, 10);
			listaEstudiantes.add(estudiante);
		}
	}

	public void ordenarEstudiantesByNotas() {
		Collections.sort(listaEstudiantes);
	}
	
	public double mediaNotas() {
		int sum = 0;
		
		for (int i = 0; i < listaNotas.size(); i++) {
			sum += listaNotas.get(i);
		}
		return sum / listaNotas.size();
	}
	
	@Override
	public int compareTo(Estudiante o) {
		int result = 0;
		
		if (this.mediaNotas() > o.mediaNotas()) {
			result = -1;
		}
		else if (this.mediaNotas() < o.mediaNotas()){
			result = 1;
		}
		return result;
	}
	
	
}