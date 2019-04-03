package practica8.ejercicio7;

/**
 * Ejercicio 7
 * Clase que implementa la clase principal del programa
 * @source Main.java
 * @author Ramon Monino Rubio - 2019.04.02
 */
public class Main {
	
	public static void main(String[] args) {
		Trabajador trabajador = new Trabajador();
		trabajador.ordenarTrabajadoresBySueldo();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(trabajador.getListaTrabajadores().get(i));
		}
	}

}
