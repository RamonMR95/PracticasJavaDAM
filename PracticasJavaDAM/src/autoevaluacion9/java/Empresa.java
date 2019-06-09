package autoevaluacion9.java;

import java.io.Serializable;

import autoevaluacion9.DatosException;

/**
 * Representa el concepto de empresa en una aplicación de gestión. 
 * @source Empresa.java
 * @author Ramon Monino Rubio - 2019.06.06
 */

public class Empresa implements Serializable {

	private static final long serialVersionUID = 1L;
	private String id;
	private String nombreEmpresa;
	private String cif;
	private String telefono;
	private TipoEmpresa tipoEmpresa;
	public enum TipoEmpresa {INDRUSTRIA, SERVICIOS, OTROS}

	/**
	 * Constructor convencional de la clase
	 * @param id - id de la empresa
	 * @param nombreEmpresa - Nombre de la empresa
	 * @param cif - Cif de la empresa
	 * @param telefono - Telefono de la empresa
	 * @param tipoEmpresa - Sector en el que se encuentra la empresa
	 */
	public Empresa(String id, String nombreEmpresa, String cif, String telefono, TipoEmpresa tipoEmpresa) {
		try {
			setId(id);
			setNombreEmpresa(nombreEmpresa);
			setCif(cif);
			setTelefono(telefono);
			setTipoEmpresa(tipoEmpresa);
		} catch (DatosException e) {
		}
	}

	/**
	 * Constructor por defecto de empresa
	 */
	public Empresa() {
		this("E0", "Empresa", "B29778370", "666666666", TipoEmpresa.SERVICIOS);
	}

	/**
	 * Constructor copia de empresa
	 * @param empresa - Empresa a copiar
	 */
	public Empresa(Empresa empresa) {
		assert empresa != null;
		this.id = new String(empresa.id);
		this.nombreEmpresa = new String(empresa.nombreEmpresa);
		this.cif = new String(empresa.cif);
		this.telefono = new String(empresa.telefono);
		this.tipoEmpresa = empresa.tipoEmpresa;
	}

	/**
	 * Metodo de obtencion del identificador de la empresa
	 * @return id - id de la empresa
	 */
	public String getId() {
		return id;
	}

	/**
	 *	Metodo que establece el id de la empresa
	 * @param id - Id de la empresa
	 * @throws DatosException - Si el id no cumple el formato
	 */
	public void setId(String id) throws DatosException {
		assert id != null;
		
		if (isValidoId(id)) {
			this.id = id;
		}
		else {
			throw new DatosException("El id de la empresa no cumple el formato");
		}

	}

	/**
	 * Metodo que comprueba si el formato de id es válido
	 * @param id - id de empresa
	 * @return true - si cumple el formato
	 */
	private boolean isValidoId(String id) {
		return id.matches("^[A-Z]\\d");
	}

	/**
	 * Metodo que obtiene el nombre de la empresa
	 * @return nombreEmpresa - Nombre de la empresa
	 */
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	/**
	 * Metodo que establece el nombre de la empresa
	 * @param nombreEmpresa - Nombre de la empresa
	 * @throws DatosException - Si no cumple el formato de nombre
	 */
	public void setNombreEmpresa(String nombreEmpresa) throws DatosException {
		assert nombreEmpresa != null;

		if (isValidoNombre(nombreEmpresa)) {
			this.nombreEmpresa = nombreEmpresa;
		} 
		else {
			throw new DatosException("Nombre de empresa no cumple el formato" + nombreEmpresa);
		}
	}

	/**
	 * Metodo que comprueba si el formato del nombre de la empresa es válido
	 * @param nombreEmpresa - Nombre de la empresa
	 * @return True - Si cumple el formato
	 */
	private boolean isValidoNombre(String nombreEmpresa) {
		return nombreEmpresa.matches("^[A-ZÑ][áéíóúña-z \\w]+");
	}

	/**
	 * Metodo que obtiene el cif de una empresa
	 * @return cif - cif de una empresa
	 */
	public String getCif() {
		return cif;
	}

	/**
	 * Metodo que establece el cif de una empresa
	 * @param cif - cif de una empresa
	 * @throws DatosException - Si el cif no cumple con el formato
	 */
	public void setCif(String cif) throws DatosException {
		assert cif != null;

		if (isValidoCif(cif)) {
			this.cif = cif;
		} 
		else {
			throw new DatosException("Empresa no cumple el formato de CIF válido");
		}
	}

	/**
	 * Metodo que comprueba el formato de cif
	 * @param cif - Cif de la empresa
	 * @return True - si cumple el formato
	 */
	private boolean isValidoCif(String cif) {
		return cif.matches("^[ABCDEFGHJPQRSUVNW][0-9]{7}[A-J0-9]");
	}

	/**
	 * Metodo que obtiene el telefono de la empresa
	 * @return telefono - telefono de la empresa
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Metodo que establece el telefono de la empresa
	 * @param telefono - Telefono de la empresa
	 * @throws DatosException - Si el telefono no cumple con el formato
	 */
	public void setTelefono(String telefono) throws DatosException {
		assert telefono != null;

		if (isValidoTelefono(telefono)) {
			this.telefono = telefono;
		} 
		else {
			throw new DatosException("El telefono no cumple el formato");
		}

	}

	/**
	 * Metodo que comprueba el formato de telefono
	 * @param telefono - Telefono de la empresa
	 * @return True - Si cumple el formato
	 */
	private boolean isValidoTelefono(String telefono) {
		return telefono.matches("\\d{9}");
	}

	/**
	 * Metodo que obtiene el tipo de la empresa
	 * @return tipoEmpresa - Sector al que se dedica la empresa
	 */
	public TipoEmpresa getTipoEmpresa() {
		return tipoEmpresa;
	}

	/**
	 * Metodo que establece el tipo de empresa
	 * @param tipoEmpresa - Sector de la empresa
	 */
	public void setTipoEmpresa(TipoEmpresa tipoEmpresa) {
		assert tipoEmpresa != null;
		this.tipoEmpresa = tipoEmpresa;
	}

	/**
	 * Metodo toString de la clase
	 * @return cadena de texto con los valores de los atributos
	 */
	@Override
	public String toString() {
		return "Id : " + id + ", nombre : " + nombreEmpresa + ", " + ", CIF: " + cif + ", telefono : " + telefono
				+ ", tipo de empresa : " + tipoEmpresa;
	}

	/**
	 * Metodo clone de la clase
	 */
	@Override
	public Empresa clone() {
		return new Empresa(this);
	}
}
