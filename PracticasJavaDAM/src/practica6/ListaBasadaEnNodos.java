package practica6;

public class ListaBasadaEnNodos {
	// Atributos
	private Nodo primero;
	private int numElementos;

	// Métodos
	/**
	 * Constructor que inicializa los atributos al valor por defecto.
	 */
	public ListaBasadaEnNodos() {
	primero = null;
	numElementos = 0;
	}

	//...

	} // class

	/** 
	 * Representa la estructura de un nodo para una lista dinámica con enlace simple.
	 */
	class Nodo {
	// Atributos
	Object dato;
	Nodo siguiente;    
	/**
	 * Constructor que inicializa atributos por defecto.
	 * @param elem - el elemento de información útil a almacenar.
	*/
	public Nodo(Object dato) {
	this.dato = dato;
	siguiente = null;
	}

	} // class
