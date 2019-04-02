package practica8.ejercicio6;

public class Main {
	
	public static void main(String[] args) {
		Estudiante estudiante = new Estudiante("Ramon", "Moñino");
		estudiante.ordenarEstudiantesByNotas();
		
		for (int i = 0; i < estudiante.getListaNotas().size(); i++) {
			System.out.println(estudiante.getListaEstudiantes().get(i));
		}
	}

}
