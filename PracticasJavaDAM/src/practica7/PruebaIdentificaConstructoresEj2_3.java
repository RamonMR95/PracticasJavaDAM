package practica7;

import java.util.GregorianCalendar;

class PuntoEspacio {

	private int x;
	private int y;

	public PuntoEspacio(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public PuntoEspacio() {
		this(0, 0);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "PuntoEspacio [x=" + x + ", y=" + y + "]";
	}

} // Class PuntoEspacio

class SegmentoRecta {

	private Punto punto1;
	private Punto punto2;

	public SegmentoRecta(Punto punto1, Punto punto2) {
		this.punto1 = punto1;
		this.punto2 = punto2;
	}

	public SegmentoRecta() {
		this(new Punto(0.0, 0.0), new Punto(1.1, 1.1));
	}

	public Punto getPunto1() {
		return punto1;
	}

	public void setPunto1(Punto punto1) {
		this.punto1 = punto1;
	}

	public Punto getPunto2() {
		return punto2;
	}

	public void setPunto2(Punto punto2) {
		this.punto2 = punto2;
	}

	@Override
	public String toString() {
		return "SegmentoRecta [punto1=" + punto1 + ", punto2=" + punto2 + "]";
	}

} // Class SegmentoRecta

class Poligono {

} // Class Poligono

class Manzana {

	private String tipo;
	private double peso;
	private double precioKilo;

	public Manzana(String tipo, double peso, double precioKilo) {
		this.tipo = tipo;
		this.peso = peso;
		this.precioKilo = precioKilo;
	}

	public Manzana() {
		this("Roja", 200.0, 2);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPrecioKilo() {
		return precioKilo;
	}

	public void setPrecioKilo(double precioKilo) {
		this.precioKilo = precioKilo;
	}

	@Override
	public String toString() {
		return "Manzana [tipo=" + tipo + ", peso=" + peso + ", precioKilo=" + precioKilo + "]";
	}

} // Class Manzana

class Carta {

	private String remitente;
	private String receptor;
	private String direccionDeEnvio;

	public Carta(String remitente, String receptor, String direccionDeEnvio) {
		this.remitente = remitente;
		this.receptor = receptor;
		this.direccionDeEnvio = direccionDeEnvio;
	}

	public Carta() {
		this("Ramón Moñino", "Ignacio Perona", "C/ Falsa 123");
	}

	public String getRemitente() {
		return remitente;
	}

	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}

	public String getReceptor() {
		return receptor;
	}

	public void setReceptor(String receptor) {
		this.receptor = receptor;
	}

	public String getDireccionDeEnvio() {
		return direccionDeEnvio;
	}

	public void setDireccionDeEnvio(String direccionDeEnvio) {
		this.direccionDeEnvio = direccionDeEnvio;
	}

	@Override
	public String toString() {
		return "Carta [remitente=" + remitente + ", receptor=" + receptor + ", direccionDeEnvio=" + direccionDeEnvio
				+ "]";
	}

} // Class Carta

class LibroBiblioteca {

	private String ISBN;
	private String titulo;
	private String autor;
	private boolean isAlquilado;

	public LibroBiblioteca(String ISBN, String titulo, String autor, boolean isAlquilado) {
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.autor = autor;
		this.isAlquilado = isAlquilado;
	}

	public LibroBiblioteca() {
		this("566-54", "Navidad", "Charles", true);
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public boolean isAlquilado() {
		return isAlquilado;
	}

	public void setAlquilado(boolean isAlquilado) {
		this.isAlquilado = isAlquilado;
	}

	@Override
	public String toString() {
		return "Libro [ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", isAlquilado=" + isAlquilado + "]";
	}

} // Class LibroBiblioteca

class LibroLibreria {

	private String ISBN;
	private String titulo;
	private String autor;
	private double precio;

	public LibroLibreria(String ISBN, String titulo, String autor, double precio) {
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}

	public LibroLibreria() {
		this("455-66", "El libro de la selva", "Anonimo", 5.35);
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "LibroLibreria [ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
	}

} // Class LibroLibreria

class CancionMP3 {

	private String nombreCancion;
	private String autor;
	private double tamaño;
	private double duracion;
	private GregorianCalendar fechaLanzamiento;

	public CancionMP3(String nombreCancion, String autor, double tamaño, double duracion,
			GregorianCalendar fechaLanzamiento) {
		this.nombreCancion = nombreCancion;
		this.autor = autor;
		this.tamaño = tamaño;
		this.duracion = duracion;
		this.fechaLanzamiento = fechaLanzamiento;
	}

	public String getNombreCancion() {
		return nombreCancion;
	}

	public void setNombreCancion(String nombreCancion) {
		this.nombreCancion = nombreCancion;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public GregorianCalendar getFechaLanzamiento() {
		return fechaLanzamiento;
	}

	public void setFechaLanzamiento(GregorianCalendar fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}

	@Override
	public String toString() {
		return "CancionMP3 [nombreCancion=" + nombreCancion + ", autor=" + autor + ", tamaño=" + tamaño + ", duracion="
				+ duracion + ", fechaLanzamiento=" + fechaLanzamiento + "]";
	}

} // Class CancionMP3

class CancionRadio {

	private String nombreCancion;
	private String autor;
	private String nombreRadio;

	public CancionRadio(String nombreCancion, String autor, String nombreRadio) {
		this.nombreCancion = nombreCancion;
		this.autor = autor;
		this.nombreRadio = nombreRadio;
	}

	public CancionRadio() {
		this("Sweet child o mine", "Guns and Roses", "Radio FM");
	}

	public String getNombreCancion() {
		return nombreCancion;
	}

	public void setNombreCancion(String nombreCancion) {
		this.nombreCancion = nombreCancion;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getNombreRadio() {
		return nombreRadio;
	}

	public void setNombreRadio(String nombreRadio) {
		this.nombreRadio = nombreRadio;
	}

	@Override
	public String toString() {
		return "CancionRadio [nombreCancion=" + nombreCancion + ", autor=" + autor + ", nombreRadio=" + nombreRadio
				+ "]";
	}

} // Class CancionRadio

class DiscoMusicaTienda {

}

public class PruebaIdentificaConstructoresEj2_3 {

	public static void main(String[] args) {

	}
}
