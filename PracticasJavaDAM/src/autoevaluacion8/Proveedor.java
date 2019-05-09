package autoevaluacion8;

import java.util.GregorianCalendar;

/**
 * Representa a los proveedores para un negocio.
 * @source Proveedor.java
 * @author Ramón Moñino Rubio - 01/04/2019
 */
public class Proveedor extends Persona {

	private String idProveedor;
	private GregorianCalendar fechaAlta;
	
	/**
	 * Constructor convencional de la clase Proveedor
	 * @param nombre - Nombre del proveedor
	 * @param direccion - Direccón del proveedor
	 * @param telefono - Telefono del proveedor
	 * @param correo - Correo del proveedor
	 * @param fechaAlta - Fecha de alta en el programa del proveedor
	 * @throws Exception - Excepción si la fecha de alta no es válida
	 */
	public Proveedor(String nombre, String direccion, String telefono, 
			String correo, GregorianCalendar fechaAlta) throws Exception {
		super(nombre, direccion, telefono, correo);
		generarID();
		setFechaAlta(fechaAlta);
	}
	
	/**
	 * Constructor por defecto de la clase Proveedor
	 * @throws Exception - Si la fecha de alta es inválida
	 */
	public Proveedor() throws Exception  {
		this("Proveedor Proveedor Proveedor", "C/ falsa", "+034 (968) 123 456", "proveedor@gmail.com", new GregorianCalendar());
	}
	
	/**
	 * Constructor copia de la clase
	 * @param proveedor - Proveedor a copiar
	 */
	public Proveedor(Proveedor proveedor) {
		super(proveedor.nombre, proveedor.direccion, proveedor.telefono, proveedor.correo);
		this.idProveedor = proveedor.idProveedor;
		this.fechaAlta = (GregorianCalendar) proveedor.fechaAlta.clone();
	}
	
	/**
	 * Metodo get que obtiene el id del proveedor
	 * @return idProveedor - Id del proveedor
	 */
	public String getIdProveedor() {
		return idProveedor;
	}

	/**
	 * Metodo get que obtiene la fecha de alta del proveedor en el programa
	 * @return fechaAlta - Fecha de alta del proveedor en el programa
	 */
	public GregorianCalendar getFechaAlta() {
		return fechaAlta;
	}

	/**
	 * Metodo que genera un id al proveedor, según su nombre y su telefono
	 */
	public void generarID() {
		this.idProveedor = nombre.substring(0, 3).toUpperCase() + telefono.substring(this.telefono.length() - 3);
	}
	
	/**
	 * Metodo set que establece la fecha de alta del proveedor en el sistema
	 * @param fechaAlta - Fecha de alta del proveedor
	 * @throws Exception - Si no cumple el formato
	 */
	public void setFechaAlta(GregorianCalendar fechaAlta) throws Exception {
		assert fechaAlta != null;
		
		if (isFechaValido(fechaAlta)) {
			this.fechaAlta = fechaAlta;
		}
		else {
			throw new Exception("La fecha de alta no cumple el formato");
		}
	}
	
	/**
	 * Metodo que comprueba si una fecha de alta es válida
	 * @param fechaAlta - Fecha de alta del proveedor en el sistema
	 * @return true - Si cumple el formato
	 */
	public boolean isFechaValido(GregorianCalendar fechaAlta) {
		return !fechaAlta.after(new GregorianCalendar()) && !(fechaAlta.getClass().equals(String.class));
	}
	
	/**
	 * Metodo toString de la clase que concatena los valores de los atributos de proveedor en un string
	 * @return String - String con los valores de los atributos de proveedor
	 */
	@Override
	public String toString() {
		return super.toString() + "IdProveedor : " + idProveedor + ", fechaAlta : " + fechaAlta;
	}
	
}
