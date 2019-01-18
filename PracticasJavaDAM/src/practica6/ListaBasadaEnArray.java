package practica6;

public class ListaBasadaEnArray {

	// Atributos 
	private Object[] arrayElementos;
	private int numElementos;
	private static final int TAMAÑO_INICIAL = 4;

	// Métodos  
	/** 
	 * Inicializa el array de elementos de la lista.  
	 */
	public ListaBasadaEnArray() {
	arrayElementos = new Object[TAMAÑO_INICIAL];
	numElementos = 0;
	}
	 
	/**
	 * @return número de elementos actual en la lista.
	 */
	public int size() {
	       return numElementos;
	}

	// ...

	} // class