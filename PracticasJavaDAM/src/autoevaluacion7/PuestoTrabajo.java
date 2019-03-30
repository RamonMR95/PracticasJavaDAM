package autoevaluacion7;

/**
 * Clase que representa el puesto de trabajo de los empleados.
 * @source PuestoTrabajo.java
 * @author Ramón Moñino Rubio - 30/03/2019
 */
public class PuestoTrabajo {
	/* Nombre del puesto que ejerce el empleado */
	private String nombrePuesto;
	
	/**
	 * Constructor convencional de la clase.
	 * @param nombrePuesto - Nombre del puesto que ejerce el empleado
	 */
	public PuestoTrabajo(String nombrePuesto) {
		this.nombrePuesto = nombrePuesto;
	}

	/**
	 * Metodo get que obtiene el puesto de trabajo
	 * @return nombrePuesto - Puesto de trabajo del empleado
	 */
	public String getPuesto() {
		return nombrePuesto;
	}
	
	/* Metodo toString de la clase */
	@Override
	public String toString() {
		return "PuestoTrabajo [nombrePuesto=" + nombrePuesto + "]";
	}
	
}
