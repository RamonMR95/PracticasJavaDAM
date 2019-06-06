package practica9;


/**
 * Representa el concepto de empresa en una aplicación de gestión. 
 * @source DatosException.java
 * @author Ramon Monino Rubio - 2019.06.06
 */

public class DatosException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public DatosException(String mensaje) {
		super(mensaje);
	}
	
	public DatosException() {
		
	}
}
