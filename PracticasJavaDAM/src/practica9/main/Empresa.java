package practica9.main;

import java.io.Serializable;
import practica9.DatosException;

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

	public enum TipoEmpresa {
		INDRUSTRIA, SERVICIOS, OTROS
	}

	public Empresa(String id, String nombreEmpresa, String cif, String telefono, TipoEmpresa tipoEmpresa)
			throws DatosException {
		setId(id);
		setNombreEmpresa(nombreEmpresa);
		setCif(cif);
		setTelefono(telefono);
		setTipoEmpresa(tipoEmpresa);
	}

	public Empresa() throws DatosException {
		this("Empresa0", "EmpresaDefault", "B29778370", "666666666", TipoEmpresa.OTROS);
	}

	public Empresa(Empresa empresa) {
		this.id = new String(empresa.id);
		this.nombreEmpresa = new String(empresa.nombreEmpresa);
		this.cif = new String(empresa.cif);
		this.telefono = new String(empresa.telefono);
		this.tipoEmpresa = empresa.tipoEmpresa;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		assert id != null;
		this.id = id;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) throws DatosException {
		assert nombreEmpresa != null;

		if (isValidoNombre(nombreEmpresa)) {
			this.nombreEmpresa = nombreEmpresa;
		} 
		else {
			throw new DatosException("Nombre de empresa no válido");
		}
	}

	private boolean isValidoNombre(String nombreEmpresa) {
		return nombreEmpresa.matches("^[A-ZÑ][áéíóúña-z \\\\w]+");
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) throws DatosException {
		assert cif != null;

		if (isValidoCif(cif)) {
			this.cif = cif;
		} 
		else {
			throw new DatosException("Empresa no cumple el formato de CIF válido");
		}
	}

	private boolean isValidoCif(String cif) {
		return cif.matches("^[ABCDEFGHJPQRSUVNW][0-9]{7}[A-J0-9]");
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) throws DatosException {
		assert telefono != null;

		if (isValidoTelefono(telefono)) {
			this.telefono = telefono;
		} 
		else {
			throw new DatosException("El telefono no cumple el formato");
		}

	}

	private boolean isValidoTelefono(String telefono) {
		return telefono.matches("\\d{9}");
	}

	public TipoEmpresa getTipoEmpresa() {
		return tipoEmpresa;
	}

	public void setTipoEmpresa(TipoEmpresa tipoEmpresa) {
		assert tipoEmpresa != null;
		this.tipoEmpresa = tipoEmpresa;
	}

	@Override
	public String toString() {
		return "Id : " + id + ", nombre : " + nombreEmpresa + ", " + ", CIF: " + cif + ", telefono : " + telefono
				+ ", tipo de empresa : " + tipoEmpresa;
	}

}
