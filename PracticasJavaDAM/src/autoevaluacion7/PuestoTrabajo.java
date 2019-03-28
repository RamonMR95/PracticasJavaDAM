package autoevaluacion7;

public class PuestoTrabajo {

	private String nombrePuesto;
	
	public PuestoTrabajo(String nombrePuesto) {
		this.nombrePuesto = nombrePuesto;
	}

	public String getPuesto() {
		return nombrePuesto;
	}
	
	@Override
	public String toString() {
		return "PuestoTrabajo [nombrePuesto=" + nombrePuesto + "]";
	}
	
}
