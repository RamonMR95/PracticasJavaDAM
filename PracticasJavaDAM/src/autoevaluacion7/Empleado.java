package autoevaluacion7;

/**
 * Clase que representa a los empleados de la empresa.
 * @source Empleado.java
 * @author Ramón Moñino Rubio - 30/03/2019
 */
public class Empleado {
	/* Atributos de la  clase */
	private String nombre;
	private double sueldo;
	private int edad;
	private PuestoTrabajo puesto;
	
	/**
	 * Constructor convencional de la clase.
	 * @param nombre - Nombre del empleado
	 * @param sueldo - Sueldo del empleado
	 * @param edad - Edad del empleado
	 * @param puesto - Puesto que ocupa el empleado
	 * @throws Exception - Excepción que se lanza si el nombre no cumple el formato válido.
	 */
	public Empleado(String nombre, double sueldo, int edad, PuestoTrabajo puesto) throws Exception {
		setNombre(nombre);
		setSueldo(sueldo);
		setEdad(edad);
		setPuesto(puesto);
	}
	
	/**
	 * Constructor copia de la clase.
	 * @param empleado - Objecto empleado a copiar
	 */
	public Empleado(Empleado empleado) {
		this.nombre = new String(empleado.nombre);
		this.sueldo = empleado.sueldo;
		this.edad = empleado.edad;
		this.puesto = empleado.puesto;
	}

	/**
	 * Constructor por defecto de la clase.
	 * @throws Exception - Lanza una excepción si el nombre no cumple el formato válido.
	 */
	public Empleado() throws Exception {
		this("Nombre Apellido Apellido", 100000, 35, new PuestoTrabajo("Prueba"));
	}
	
	/**
	 * Metodo get que obtiene el nombre del empleado.
	 * @return nombre - Nombre del empleado
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo set que establece el nombre del empleado.
	 * @param nombre - Nombre del empleado.
	 * @throws Exception - Lanza excepción si el nombre no cumple el formato.
	 */
	public void setNombre(String nombre) throws Exception {
		assert nombre != null;
		if (isNombreValido(nombre)) {
			this.nombre = nombre;
		}
		else {
			throw new Exception("El nombre no cumple el formato");
		}
	}
	
	/**
	 * Metodo que comprueba si el nombre cumple el formato de nombre válido.
	 * @param nombre - Nombre del empleado
	 * @return true - Si el nombre del empleado cumple el formato.
	 */
	public boolean isNombreValido(String nombre) {
		return nombre.matches("^[A-ZÁÉÍÓÚ][a-zñáéíóú]+\\s[A-ZÁÉÍÓÚ][a-zñáéíóú]+\\s[A-ZÁÉÍÓÚ][a-zñáéíóú]+");
	}

	/**
	 * Metodo get que obtiene el sueldo del empleado
	 * @return sueldo - Sueldo del empleado
	 */
	public double getSueldo() {
		return sueldo;
	}

	/**
	 * Metodo set que establece el sueldo del empleado
	 * @param sueldo - Sueldo del empleado
	 */
	public void setSueldo(double sueldo) {
		assert sueldo > 10000;
		this.sueldo = sueldo;
	}

	/**
	 * Metodo get que obtiene la edad del empleado.
	 * @return edad - Edad del empleado
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Metodo set que establece la edad del empleado
	 * @param edad - Edad del empleado
	 */
	public void setEdad(int edad) {
		assert edad > 16 && edad < 65;
		this.edad = edad;
	}

	/**
	 * Metodo get que obtiene el puesto de trabajo que ejerce el empleado
	 * @return puesto - Puesto que ocupa el empleado
	 */
	public PuestoTrabajo getPuesto() {
		return puesto;
	}

	/**
	 * Metodo set que establece el puesto que ejerce el empleado
	 * @param puesto - Puesto que ejerce el empleado
	 */
	public void setPuesto(PuestoTrabajo puesto) {
		assert puesto != null;
		this.puesto = puesto;
	}

	/**
	 * Metodo toString de la clase, usado para imprimir los atributos de la clase con un formato determinado por el programador
	 */
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + ", edad=" + edad + ", puesto=" + puesto + "]";
	}

	/* Metodo hashCode de la clase */
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

	/* Metodo equals de la clase */
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
	
	/* Metodo clone de la clase */
	@Override
	public Empleado clone() {
		return new Empleado(this);
	}
	
} // Class Empleado
