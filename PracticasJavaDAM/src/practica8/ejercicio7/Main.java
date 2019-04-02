package practica8.ejercicio7;

public class Main {
	
	public static void main(String[] args) {
		Trabajador trabajador = new Trabajador();
		trabajador.ordenarTrabajadoresBySueldo();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(trabajador.getListaTrabajadores().get(i));
		}
	}

}
