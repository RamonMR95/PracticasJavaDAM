package practica7;

import java.util.GregorianCalendar;

/**
 * Ejercicio 2 y 3 Verde
 * Identifica los datos que consideras adecuados para representar el estado de los 
 * siguientes objetos teniendo en cuenta el contexto en el que se vayan a utilizar
 * @source PruebaIdentificaConstructoresEj2_3
 * @author Ramón Moñino Rubio
 *
 */
class PuntoEspacio {
	/* Atributos que forman la coordenada de un punto */
	private int x;
	private int y;

	/**
	 * Constructor convencional de la clase PuntoEspacio.
	 * @param x - Coordenada en el eje X de coordenadas
	 * @param y - Coordenada en el eje Y de coordenadas
	 */
	public PuntoEspacio(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Constructor por defecto de la clase que inicializa el punto al valor del origen de coordenadas;
	 */
	public PuntoEspacio() {
		this(0, 0);
	}

	/**
	 * Metodo get que obtiene el valor del punto en el eje X
	 * @return x - Coordenada en el eje X de coordenadas
	 */
	public int getX() {
		return x;
	}

	/**
	 * Metodo set que establece el valor del punto en el eje X
	 * @param x - Coordenada en el eje X de coordenadas
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Metodo get que obtiene el valor del punto en el eje Y
	 * @return y - Coordenada en el eje Y de coordenadas
	 */
	public int getY() {
		return y;
	}

	/**
	 * Metodo set que establece el valor del punto en el eje Y
	 * @param y - Coordenada en el eje Y de coordenadas
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Metodo toString de la clase que imprime los atributos del objeto actual de la clase con un formato
	 * @return string - String con los atributos de la clase del objeto actual
	 */
	@Override
	public String toString() {
		return "PuntoEspacio [x=" + x + ", y=" + y + "]";
	}

} // Class PuntoEspacio

class SegmentoRecta {
	/* Objetos Punto que forman la recta */
	private Punto punto1;
	private Punto punto2;

	/**
	 * Constructor convencional de la clase SegmentoRecta.
	 * @param punto1 - Punto1 que forma la recta
	 * @param punto2 - Punto2 que forma la recta
	 */
	public SegmentoRecta(Punto punto1, Punto punto2) {
		this.punto1 = punto1;
		this.punto2 = punto2;
	}

	/**
	 * Constructor por defecto de la clase
	 */
	public SegmentoRecta() {
		this(new Punto(0.0, 0.0), new Punto(1.1, 1.1));
	}

	/**
	 * Metodo get que obtiene el valor del punto1
	 * @return punto1 - Punto1 que forma la recta
	 */
	public Punto getPunto1() {
		return punto1;
	}

	/**
	 * Metodo set que establece el valor del punto1 de la recta
	 * @param punto1 - Punto1 que forma la recta
	 */
	public void setPunto1(Punto punto1) {
		this.punto1 = punto1;
	}

	/**
	 * Metodo get que obtiene el valor del punto2 de la recta
	 * @return punto2 - Punto2 que forma la recta
	 */
	public Punto getPunto2() {
		return punto2;
	}

	/**
	 * Metodo que establece el valor del punto2 de la recta
	 * @param punto2 - Punto2 que forma la recta
	 */
	public void setPunto2(Punto punto2) {
		this.punto2 = punto2;
	}

	/**
	 * Metodo toString de la clase que imprime los atributos del objeto actual de la clase con un formato
	 * @return string - String con los atributos de la clase del objeto actual
	 */
	@Override
	public String toString() {
		return "SegmentoRecta [punto1=" + punto1 + ", punto2=" + punto2 + "]";
	}

} // Class SegmentoRecta

class Poligono {

} // Class Poligono

class Manzana {
	/* Atributos de la manzana */
	private String tipo;
	private double peso;
	private double precioKilo;

	/**
	 * Constructor convencional de la clase Manzana.
	 * @param tipo - Tipo de la manzana.
	 * @param peso - Peso de la manzana.
	 * @param precioKilo - Precio del tipo de manzana por kilo.
	 */
	public Manzana(String tipo, double peso, double precioKilo) {
		this.tipo = tipo;
		this.peso = peso;
		this.precioKilo = precioKilo;
	}

	/**
	 * Constructor por defecto de la clase para el tipo "Roja"
	 */
	public Manzana() {
		this("Roja", 200.0, 2);
	}

	/**
	 * Metodo get que obtiene el tipo de la manzana
	 * @return tipo - Tipo de la manzana
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Metodo que establece el tipo de la manzana
	 * @param tipo - Tipo de la manzana
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Metodo que obtiene el peso de la manzana
	 * @return peso - Peso de la manzana
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * Metodo que establece el peso de la manzana
	 * @param peso - Peso de la manzana
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * Metodo que obtiene el precio por kilo del tipo de manzana
	 * @return precioKilo - Precio por kilo del tipo de manzana
	 */
	public double getPrecioKilo() {
		return precioKilo;
	}

	/**
	 * Metodo que establece el precio por kilo del tipo de manzana
	 * @param precioKilo - Precio por kilo del tipo de manzana
	 */
	public void setPrecioKilo(double precioKilo) {
		this.precioKilo = precioKilo;
	}

	/**
	 * Metodo toString de la clase que imprime los atributos del objeto actual de la clase con un formato
	 * @return string - String con los atributos de la clase del objeto actual
	 */
	@Override
	public String toString() {
		return "Manzana [tipo=" + tipo + ", peso=" + peso + ", precioKilo=" + precioKilo + "]";
	}

} // Class Manzana

class Carta {
	/* Atributos de la clase Carta */
	private String remitente;
	private String receptor;
	private String direccionDeEnvio;

	/**
	 * Constructor convencional de la clase Carta
	 * @param remitente - Persona que envia la carta
	 * @param receptor - Persona que recibe la carta
	 * @param direccionDeEnvio - Direccion a la que se envia la carta
	 */
	public Carta(String remitente, String receptor, String direccionDeEnvio) {
		this.remitente = remitente;
		this.receptor = receptor;
		this.direccionDeEnvio = direccionDeEnvio;
	}

	/**
	 * Constructor por defecto de la carta que genera unos datos de prueba
	 */
	public Carta() {
		this("Ramón Moñino", "Ignacio Perona", "C/ Falsa 123");
	}

	/**
	 * Metodo get que obtiene el nombre del remitente
	 * @return remitente - Nombre de la persona que envia la carta
	 */
	public String getRemitente() {
		return remitente;
	}

	/**
	 * Metodo set que establece el nombre del remitente
	 * @param remitente - Nombre de la persona que envia la carta
	 */
	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}

	/**
	 * Metodo get que obtiene el nombre del receptor de la carta
	 * @return receptor - Nombre de la persona que recibe la carta
	 */
	public String getReceptor() {
		return receptor;
	}

	/**
	 * Metodo set que establece el nombre del receptor de la carta
	 * @param receptor - Nombre de la persona que recibe la carta
	 */
	public void setReceptor(String receptor) {
		this.receptor = receptor;
	}

	/**
	 * Metodo get que obtiene la direccion a la que se envia la carta
	 * @return direccionDeEnvio - Direccion a la que se envía la carta
	 */
	public String getDireccionDeEnvio() {
		return direccionDeEnvio;
	}

	/**
	 * Metodo que establece la direccion de envia de la carta
	 * @param direccionDeEnvio - Direccion a la que se envia la carta
	 */
	public void setDireccionDeEnvio(String direccionDeEnvio) {
		this.direccionDeEnvio = direccionDeEnvio;
	}

	/**
	 * Metodo toString de la clase que imprime los atributos del objeto actual de la clase con un formato
	 * @return string - String con los atributos de la clase del objeto actual
	 */
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

	/**
	 * Metodo toString de la clase que imprime los atributos del objeto actual de la clase con un formato
	 * @return string - String con los atributos de la clase del objeto actual
	 */
	@Override
	public String toString() {
		return "Libro [ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", isAlquilado=" + isAlquilado + "]";
	}

} // Class LibroBiblioteca

class LibroLibreria {
	/* Atributos de la clase LibroLibreria */
	private String ISBN;
	private String titulo;
	private String autor;
	private double precio;

	/**
	 * Constructor convencional de la clase LibroLibreria
	 * @param ISBN - Identificador del libro
	 * @param titulo - Titulo del libro
	 * @param autor - Autor del libro
	 * @param precio - Precio del libro
	 */
	public LibroLibreria(String ISBN, String titulo, String autor, double precio) {
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}

	/**
	 * Constructor por defecto de la clase usado para utilizar unos valores por defecto
	 */
	public LibroLibreria() {
		this("455-66", "El libro de la selva", "Anonimo", 5.35);
	}

	/**
	 * Metodo get que obtiene el valor del identificador ISBN del libro
	 * @return ISBN - Identificador del libro
	 */
	public String getISBN() {
		return ISBN;
	}

	/**
	 * Metodo set que establece el valor del identificador ISBN del libro
	 * @param iSBN - Identificador del libro
	 */
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	/**
	 * Metodo get que obtiene el valor del titulo del libro
	 * @return titulo - Titulo del libro
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Metodo set que establece el titulo del libro
	 * @param titulo - Titulo del libro
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Metodo get que obtiene el autor del libro
	 * @return autor - Autor del libro
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Metodo set que establece el autor del libro
	 * @param autor - Autor del libro
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * Metodo get que obtiene el precio del libro
	 * @return precio - Precio del libro
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Metodo set que establece el valor del libro
	 * @param precio - Precio del libro
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * Metodo toString de la clase que imprime los atributos del objeto actual de la clase con un formato
	 * @return string - String con los atributos de la clase del objeto actual
	 */
	@Override
	public String toString() {
		return "LibroLibreria [ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
	}

} // Class LibroLibreria

class CancionMP3 {
	/* Atributos de la CancionMP3*/
	private String nombreCancion;
	private String autor;
	private double tamaño;
	private double duracion;
	private GregorianCalendar fechaLanzamiento;

	/**
	 * Constructor convencional de la clase {@link CancionMP3}
	 * @param nombreCancion - Nombre de la cancion
	 * @param autor - Autor de la cancion
	 * @param tamaño - Tamaño que pesa la canción
	 * @param duracion - Duración de la canción
	 * @param fechaLanzamiento - Fecha de lanzamiento de la cancion
	 */
	public CancionMP3(String nombreCancion, String autor, double tamaño, double duracion,
			GregorianCalendar fechaLanzamiento) {
		this.nombreCancion = nombreCancion;
		this.autor = autor;
		this.tamaño = tamaño;
		this.duracion = duracion;
		this.fechaLanzamiento = fechaLanzamiento;
	}

	/**
	 * Metodo get que obtiene el nombre de la canción
	 * @return nombreCancion - Nombre de la canción
	 */
	public String getNombreCancion() {
		return nombreCancion;
	}

	/**
	 * Metodo set que establece el nombre de la canción
	 * @param nombreCancion - Nombre de la canción
	 */
	public void setNombreCancion(String nombreCancion) {
		this.nombreCancion = nombreCancion;
	}

	/**
	 * Metodo get que obtiene el nombre del autor
	 * @return autor - Nombre del autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Metodo set que establece el nombre del autor
	 * @param autor - Nombre del autor
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * Metodo get que obtiene el tamaño de la canción
	 * @return tamaño - Tamaño de la canción
	 */
	public double getTamaño() {
		return tamaño;
	}

	/**
	 * Metodo set que establece el tamaño de la canción
	 * @param tamaño - Tamaño de la canción
	 */
	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	/**
	 * Metodo get que obtiene la duración de la canción
	 * @return duracion - Duracion de la cancion
	 */
	public double getDuracion() {
		return duracion;
	}

	/**
	 * Metodo set que establece la duración de la canción
	 * @param duracion - Duración de la cancion
	 */
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	/**
	 * Metodo get que obtiene la fecha de lanzamiento de la cancion
	 * @return fechaLanzamiento - Fecha de lanzamiento de la cancion
	 */
	public GregorianCalendar getFechaLanzamiento() {
		return fechaLanzamiento;
	}

	/**
	 * Metodo set que establece la fecha de lanzamiento de la cancion
	 * @param fechaLanzamiento - Fecha de lanzamiento de la cancion
	 */
	public void setFechaLanzamiento(GregorianCalendar fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}
	
	/**
	 * Metodo toString de la clase que imprime los atributos del objeto actual de la clase con un formato
	 * @return string - String con los atributos de la clase del objeto actual
	 */
	@Override
	public String toString() {
		return "CancionMP3 [nombreCancion=" + nombreCancion + ", autor=" + autor + ", tamaño=" + tamaño + ", duracion="
				+ duracion + ", fechaLanzamiento=" + fechaLanzamiento + "]";
	}

} // Class CancionMP3

class CancionRadio {
	/* Atributos de la clase CancionRadio */
	private String nombreCancion;
	private String autor;
	private String nombreRadio;

	/**
	 * Constructor convencional de la clase {@link CancionRadio}
	 * @param nombreCancion - Nombre de la canción
	 * @param autor - Nombre del autor de la cancion
	 * @param nombreRadio - Nombre de la emisora de radio
	 */
	public CancionRadio(String nombreCancion, String autor, String nombreRadio) {
		this.nombreCancion = nombreCancion;
		this.autor = autor;
		this.nombreRadio = nombreRadio;
	}

	/**
	 * Constructor por defecto de la clase {@link CancionRadio}
	 */
	public CancionRadio() {
		this("Sweet child o mine", "Guns and Roses", "Radio FM");
	}

	/**
	 * Metodo get que obtiene el nombre de la cancion
	 * @return nombreCancion - Nombre de la cancion
	 */
	public String getNombreCancion() {
		return nombreCancion;
	}

	/**
	 * Metodo set que establece el nombre de la cancion
	 * @param nombreCancion - Nombre de la cancion
	 */
	public void setNombreCancion(String nombreCancion) {
		this.nombreCancion = nombreCancion;
	}

	/**
	 * Metodo get que obtiene el nombre del autor de la cancion
	 * @return autor - Nombre del autor de la cancion
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Metodo set que establece el nombre del autor de la cancion
	 * @param autor - Autor de la cancion
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	/**
	 * Metodo get que obtiene el nombre de la emisora de radio
	 * @return nombreRadio - Nombre de la emisora de radio
	 */
	public String getNombreRadio() {
		return nombreRadio;
	}

	/**
	 * Metodo set que establece el nombre de la emisora de radio
	 * @param nombreRadio - Nombre de la emisora de radio
	 */
	public void setNombreRadio(String nombreRadio) {
		this.nombreRadio = nombreRadio;
	}
	
	/**
	 * Metodo toString de la clase que imprime los atributos del objeto actual de la clase con un formato
	 * @return string - String con los atributos de la clase del objeto actual
	 */
	@Override
	public String toString() {
		return "CancionRadio [nombreCancion=" + nombreCancion + ", autor=" + autor + ", nombreRadio=" + nombreRadio
				+ "]";
	}

} // Class CancionRadio

public class PruebaIdentificaConstructoresEj2_3 {

	public static void main(String[] args) {

	}
}
