package autoevaluacion8;

public class Producto {
	
	public enum TipoProducto {NACIONAL, IMPORTADO};
	private String nombre;
	private double precioCoste;
	private TipoProducto tipoProducto;
	private Proveedor suministrador;
	

	public Producto(String nombre, double precioCoste, 
			 Proveedor suministrador, TipoProducto tipoProducto) {
		setNombre(nombre);
		setPrecioCoste(precioCoste);
		setSuministrador(suministrador);
		setTipoProducto(tipoProducto);
	}

	public Producto() {
		
	}
	
	public Producto(Producto producto) {

	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecioCoste() {
		return precioCoste;
	}


	public void setPrecioCoste(double precioCoste) {
		this.precioCoste = precioCoste;
	}


	public TipoProducto getTipoProducto() {
		return tipoProducto;
	}


	public void setTipoProducto(TipoProducto tipoProducto) {
		this.tipoProducto = tipoProducto;
	}


	public Proveedor getSuministrador() {
		return suministrador;
	}


	public void setSuministrador(Proveedor suministrador) {
		this.suministrador = suministrador;
	}
	
}
