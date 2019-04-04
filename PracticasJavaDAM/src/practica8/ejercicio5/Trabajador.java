package practica8.ejercicio5;

public class Trabajador extends Humano {

	private double sueldo;
	private double horasTrabajadas;
	
	/**
	 * Constructor convencional de la clase Trabajador
	 * @param nombre - Nombre del trabajador
	 * @param apellidos - Apellidos del trabajador
	 * @param sueldo - Sueldo del trabajador
	 * @param horasTrabajadas - Horas trabajadas por el trabajador
	 */
	public Trabajador(String nombre, String apellidos, 
			double sueldo, double horasTrabajadas) {
		
		super(nombre, apellidos);
		this.sueldo = sueldo;
		this.horasTrabajadas = horasTrabajadas;
	}
	
	/**
	 * Metodo get que obtiene el sueldo del trabajador
	 * @return sueldo - Sueldo del trabajador
	 */
	public double getSueldo() {
		return sueldo;
	}

	/**
	 * Metodo set que establece el sueldo del trabajador
	 * @param sueldo - Sueldo del trabajador
	 */
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}


	/**
	 * Metodo get que obtiene el numero de horas trbajadas por el trabajador
	 * @return horas - Horas trabajadas
	 */
	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	/**
	 * Metodo set que establece el numero de horas trabajadas por el trabajador
	 * @param horasTrabajadas - Horas trbajadas por el trabajador
	 */
	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	/**
	 * Metodo que calcula el salario del trabajador
	 * @param precioHora - Precio por hora
	 */
	public void carcularSalario(double precioHora) {
		sueldo = horasTrabajadas * precioHora;
	}
	
}
