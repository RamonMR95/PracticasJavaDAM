package autoevaluacion8;

import java.util.GregorianCalendar;

public class Proveedor extends Persona {

	private String idProveedor;
	private GregorianCalendar fechaAlta;
	
	public Proveedor(String nombre, String direccion, String telefono, 
			String correo, GregorianCalendar fechaAlta) throws Exception {
		super(nombre, direccion, telefono, correo);
		setIdProveedor();
		setFechaAlta(fechaAlta);
	}
	
	public Proveedor() throws Exception {
		this("Proveedor", "C/ falsa", "649460978", "proveedor@gmail.com", new GregorianCalendar());
	}
	
	public Proveedor(Proveedor proveedor) {
		super(proveedor.nombre, proveedor.direccion, proveedor.telefono, proveedor.correo);
		this.idProveedor = proveedor.idProveedor;
		this.fechaAlta = (GregorianCalendar) proveedor.fechaAlta.clone();
	}
	
	public String getIdProveedor() {
		return idProveedor;
	}

	public GregorianCalendar getFechaAlta() {
		return fechaAlta;
	}

	public void setIdProveedor() {
		this.idProveedor = nombre.substring(0, 4) + telefono.substring(6);
	}
	
	public void setFechaAlta(GregorianCalendar fechaAlta) throws Exception {
		if (isFechaValido(fechaAlta)) {
			this.fechaAlta = fechaAlta;
		}
		else {
			throw new Exception("La fecha de alta no cumple el formato");
		}
	}
	
	public boolean isFechaValido(GregorianCalendar fechaAlta) {
		return !fechaAlta.after(new GregorianCalendar());
	}
	
}
