package autoevaluacion7;

public class Empleado {

	private String nombre;
	private double sueldo;
	private int edad;
	private PuestoTrabajo puesto;
	
	public Empleado(String nombre, double sueldo, int edad, PuestoTrabajo puesto) throws Exception {
		setNombre(nombre);
		setSueldo(sueldo);
		setEdad(edad);
		setPuesto(puesto);
	}
	
	public Empleado(Empleado empleado) {
		this.nombre = new String(empleado.nombre);
		this.sueldo = empleado.sueldo;
		this.edad = empleado.edad;
		this.puesto = empleado.puesto;
	}

	public Empleado() throws Exception {
		this("Nombre Apellido Apellido", 100000, 35, new PuestoTrabajo("Prueba"));
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws Exception {
		assert nombre != null;
		if (isNombreValido(nombre)) {
			this.nombre = nombre;
		}
		else {
			throw new Exception("El nombre no cumple el formato");
		}
	}
	
	public boolean isNombreValido(String nombre) {
		return nombre.matches("^[A-ZÁÉÍÓÚ][a-zñáéíóú]+\\s[A-ZÁÉÍÓÚ][a-zñáéíóú]+\\s[A-ZÁÉÍÓÚ][a-zñáéíóú]+");
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		assert sueldo > 10000;
		this.sueldo = sueldo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		assert edad > 16 && edad < 65;
		this.edad = edad;
	}

	public PuestoTrabajo getPuesto() {
		return puesto;
	}

	public void setPuesto(PuestoTrabajo puesto) {
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + ", edad=" + edad + ", puesto=" + puesto + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + edad;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((puesto == null) ? 0 : puesto.hashCode());
		long temp;
		temp = Double.doubleToLongBits(sueldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && getClass() == obj.getClass()) {
			if (this == obj) {
				return true;
			}

			if (edad == ((Empleado) obj).edad 
					&& nombre.equals(((Empleado) obj).nombre)
					&& sueldo == ((Empleado) obj).sueldo 
					&& puesto.equals(((Empleado) obj).puesto)) {
				
				return true;
			}
		}
		return false;

	}
	
	@Override
	public Empleado clone() {
		return new Empleado(this);
	}
} // Class Empleado
