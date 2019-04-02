package practica8.ejercicio5;

public class Trabajador extends Humano {

	private double sueldo;
	private double horasTrabajadas;
	
	public Trabajador(String nombre, String apellidos, 
			double sueldo, double horasTrabajadas) {
		
		super(nombre, apellidos);
		this.sueldo = sueldo;
		this.horasTrabajadas = horasTrabajadas;
	}
	
	
	public double getSueldo() {
		return sueldo;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}


	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}


	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}


	public void carcularSalario(double precioHora) {
		sueldo = horasTrabajadas * precioHora;
	}
	
	
}
