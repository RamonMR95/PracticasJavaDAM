package practica8.ejercicio1;

import java.util.ArrayList;

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
	
	/**
	 * Constructor convencional de la clase Trabajador
	 * @param nombre - Nombre del trabajador
	 * @param apellidos - Apellidos del trabajador
	 * @param salario - Salario del trabajador
	 * @param horasTrabajadas - Horas trabajadas por el trabajador
	 */
	public Trabajador(String nombre, String apellidos, 
			double salario, double horasTrabajadas) {
		
		super(nombre, apellidos);
		this.salario = salario;
		this.horasTrabajadas = horasTrabajadas;
	}
	
	/**
	 * Constructor por defecto de la clase Trabajador
	 */
	public Trabajador() {
		this("Nombre", "Apellidos", 0, 0);

	}

	/**
	 * Metodo get que obtiene el salario del trabajador
	 * @return salario - Salario del trabajador
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * Metodo set que establece el salario del trabajador
	 * @param salario - Salario del trabajador
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	/**
	 * Metodo get que obtiene el numero de horas trabajadas por el trabajador
	 * @return horasTrabajadas - Horas trabajadas por el trabajador
	 */
	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	/**
	 * Metodo set que establece las horas trabajadas por el trabajador
	 * @param horasTrabajadas - Horas trabajadas por el trabajador
	 */
	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	/**
	 * Metodo que calcula el sueldo del trabajador
	 * @param precioHora - Precio por cada hora de trabajo
	 */
	public void calcularSueldo(double precioHora) {
		this.salario = horasTrabajadas * precioHora;
	}
	
	/**
	 * Metodo que carga una serie de trabajadores en un ArrayList y lo devuelve
	 * @return lista - Lista trabajadores de prueba
	 */
	public ArrayList<Trabajador> cargarTrabajadores() {
		ArrayList<Trabajador> trabajadores = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			trabajadores.add(new Trabajador("Nombre" + 1, "apellidos" + 1, i + 1, i + 1));
		}
		return trabajadores;
	}
	
	/**
	 * Implementación del método compareTo de la interfaz comparable 
	 * para ordenar inversamente por salario los trabajadores.
	 * @param o - Trabajador a ordenar
	 */
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
	
	/**
	 * Metodo toString de la clase
	 */
	@Override
	public String toString() {
		return super.toString() + ", salario : " + salario + ", horas trabajadas : " + horasTrabajadas; 
	}
}
