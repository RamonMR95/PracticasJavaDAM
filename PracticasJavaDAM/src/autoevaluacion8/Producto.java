package autoevaluacion8;

/**
 * Representa a cualquiera de los productos para un negocio.
 * @source Producto.java
 * @author Ramón Moñino Rubio - 01/04/2019
 */
public class Producto {
	
	public enum Tipo {NACIONAL, IMPORTADO};
	private String nombre;
	private double precioCoste;
	private Tipo tipoProducto;
	private Proveedor suministrador;
	

	/**
	 * Constructor convencional de la clase Producto
	 * @param nombre - Nombre del producto
	 * @param precioCoste - Precio pagado al proveedor por el producto
	 * @param suministrador - Proveedor del producto
	 * @param tipo - Procedencia del producto
	 * @throws Exception - Si el precio no cumple con el formato
	 */
	public Producto(String nombre, double precioCoste, 
			 Proveedor suministrador, Tipo tipoProducto) throws Exception {
		setNombre(nombre);
		setPrecioCoste(precioCoste);
		setSuministrador(suministrador);
		setTipo(tipoProducto);
	}

	/**
	 * Constructor por defecto de la clase Producto
	 * @throws Exception
	 */
	public Producto() throws Exception {
		this("Producto", 1, new Proveedor(), Tipo.NACIONAL);
		
	}
	
	/**
	 * Constructor convencional de la clase Producto
	 * @param producto - Producto a ser copiado
	 */
	public Producto(Producto producto) {
		assert producto != null;
		this.nombre = new String(producto.nombre);
		this.precioCoste = producto.precioCoste;
		this.suministrador = new Proveedor(producto.suministrador);
		this.tipoProducto = producto.tipoProducto;
	}

	/**
	 * Metodo get que obtiene el nombre del producto
	 * @return nombre - Nombre del producto
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo set que establece el nombre del producto
	 * @param nombre - Nombre del producto
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * Metodo get que obtiene el precio pagado al proveedor por el producto
	 * @return precioCoste - Precio pagado al proveedor
	 */
	public double getPrecioCoste() {
		return precioCoste;
	}

	/**
	 * Metodo set que establece el precio pagado al proveedor
	 * @param precioCoste - Precio pagado al proveedor
	 * @throws Exception - Si el precio no cumple por el formato
	 */
	public void setPrecioCoste(double precioCoste) throws Exception {
		if (isPrecioValido(precioCoste)) {
			this.precioCoste = precioCoste;
		}
		else {
			throw new Exception("El precio coste no cumple con el formato");
		}
	}

	/**
	 * Metodo que comprueba si el precio pagado al proveedor cumple un formato. Que sea mayor que 0 y pueda tener hasta 3 decimales.
	 * @param precioCoste - Precio pagado al proveedor por el producto
	 * @return true - Si el precio cumple con el formato
	 */
	public boolean isPrecioValido(double precioCoste) {
		return precioCoste > 0 && String.valueOf(precioCoste).split("\\.")[1].length() < 4;
	}

	/**
	 * Metodo get que obtiene la procedencia del producto
	 * @return tipoProducto - Procedencia del producto
	 */
	public Tipo getTipo() {
		return tipoProducto;
	}

	/**
	 * Metodo set que establece la procedencia del producto
	 * @param tipoProducto - Procedencia del producto
	 */
	public void setTipo(Tipo tipoProducto) {
		assert tipoProducto != null;
		this.tipoProducto = tipoProducto;
	}

	/**
	 * Metodo get que obtiene el proveedor de un producto
	 * @return suministrador - Proveedor que suministra el producto
	 */
	public Proveedor getSuministrador() {
		return suministrador;
	}


	/**
	 * Metodo set que establece el proveedor de un producto
	 * @param suministrador - Proveedor de un producto
	 */
	public void setSuministrador(Proveedor suministrador) {
		assert suministrador != null;
		this.suministrador = suministrador;
	}
	
	/**
	 * Metodo toString de la clase que concatena los valores de los atributos de producto en un string
	 * @return String - String con los valores de los atributos de producto
	 */
	@Override
	public String toString() {
		return "Nombre : " + nombre + ", PrecioCoste : " + precioCoste + ", TipoProducto " + tipoProducto + ", Suministrador : " + suministrador;
	}
	
}
