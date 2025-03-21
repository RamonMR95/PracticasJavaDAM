package practica6;

/**
 * ListaEnlazada2_3_4.java
 * Ejercicios 2, 3 y 4 verdes
 * @author - Ramon Monino Rubio - 2019.02.14
 *
 */
public class ListaEnlazada2_3_4 {
	// Atributos
	private Nodo primero;
	private int numElementos;

	// Métodos
	/**
	 * Constructor que inicializa los atributos al valor por defecto.
	 */
	public ListaEnlazada2_3_4() {
		primero = null;
		numElementos = 0;
	}

	/**
	 * Añade un elemento al final de la lista.
	 * @param elem - el elemento a añadir. Admite que el elemento a añadir sea null.
	 */
	public void add(Object dato) {
		// variables auxiliares
		Nodo nuevo = new Nodo(dato);
		Nodo ultimo = null;
		if (numElementos == 0) {
			// Si la lista está vacía enlaza el nuevo nodo el primero.
			primero = nuevo;
		} else {
			// Obtiene el último nodo y enlaza el nuevo.
			ultimo = obtenerNodo(numElementos - 1);
			ultimo.siguiente = nuevo;
		}
		numElementos++; // Actualiza el número de elementos.
	}

	/**
	 * Metodo que añade un dato a la lista en un indice concreto de éste
	 * @param indice - posicion del nodo a obtener.
	 * @param dato   - Dato a añadir a la lista
	 */
	public void add(int indice, Object dato) {
		Nodo nuevo = new Nodo(dato);
		Nodo actual = primero;

		if (numElementos == 0) {
			primero = nuevo;

		} else {
			for (int i = 0; i < indice -1; i++) {
				actual = actual.siguiente;
			}
			nuevo.siguiente = actual.siguiente;
			actual.siguiente = nuevo;

		}
		numElementos++;

	}

	/**
	 * Obtiene el nodo correspondiente al índice. Recorre secuencialmente la cadena
	 * de enlaces.
	 * @param indice - posición del nodo a obtener.
	 * @return - el nodo que ocupa la posición indicada por el índice.
	 * @exception IndexOutOfBoundsException - índice no está entre 0 y
	 *                                      numElementos-1
	 */
	public Nodo obtenerNodo(int indice) {
		// Lanza excepción si el índice no es válido.
		if (indice > numElementos || indice < 0) {
			throw new IndexOutOfBoundsException("Índice incorrecto: " + indice);
		}
		// Recorre la lista hasta llegar al nodo de posición buscada.
		Nodo actual = primero;
		for (int i = 0; i < indice; i++)
			actual = actual.siguiente;
		return actual;
	}

	/**
	 * Elimina el elemento indicado por el índice. Ignora índices negativos
	 * @param indice - posición del elemento a eliminar
	 * @return - el elemento eliminado o null si la lista está vacía.
	 * @exception IndexOutOfBoundsException - índice no está entre 0 y
	 *                                      numElementos-1
	 */
	public Object remove(int indice) {
		// Lanza excepción si el índice no es válido.
		if (indice >= numElementos || indice < 0) {
			throw new IndexOutOfBoundsException("Índice incorrecto: " + indice);
		}
		if (indice > 0) {
			return removeIntermedio(indice);
		}
		if (indice == 0) {
			return removePrimero();
		}
		return null;
	}

	/**
	 * Elimina el primer elemento.
	 * @return - el elemento eliminado o null si la lista está vacía.
	 */
	private Object removePrimero() {
		// variables auxiliares
		Nodo actual = null;
		actual = primero; // Guarda actual.
		primero = primero.siguiente; // Elimina elemento del principio.
		numElementos--;
		return actual.dato;
	}

	/**
	 * Elimina el elemento indicado por el índice.
	 * @param indice - posición del elemento a eliminar.
	 * @return - el elemento eliminado o null si la lista está vacía.
	 */
	private Object removeIntermedio(int indice) {
		// variables auxiliares
		Nodo actual = null;
		Nodo anterior = null;
		// Busca nodo del elemento anterior correspondiente al índice.
		anterior = obtenerNodo(indice - 1);
		actual = anterior.siguiente; // Guarda actual.
		anterior.siguiente = actual.siguiente; // Elimina el elemento.
		numElementos--;
		return actual.dato;
	}

	/**
	 * Elimina el dato especificado.
	 * @param dato – a eliminar.
	 * @return - el índice del elemento eliminado o -1 si no existe.
	 */
	public int remove(Object dato) {
		// Obtiene el índice del elemento especificado.
		int actual = indexOf(dato);
		if (actual != -1) {
			remove(actual); // Elimina por índice.
		}
		return actual;
	}

	/**
	 * Sirve para poder eliminar de la lista todos los elementos que se le
	 * proporcionan en otra lista pasada como argumento
	 * @param datosABorrar - Lista que contiene los términos que queremos borrar
	 */
	public void removeAll(ListaEnlazada2_3_4 datosABorrar) {
		Nodo actual = primero;
		Nodo borrar = datosABorrar.primero;
		
		for (int i = 0; i < datosABorrar.size() -1; i++) {
			borrar = borrar.siguiente;
			for (int j = 0; j < numElementos -1; j++) {
				actual = actual.siguiente;
				if (borrar.dato.equals(actual.dato)) {
					remove(actual.dato);
				} else {
					break;
				}
			}
		}

	}
	
	/**
	 * Busca el índice que corresponde a un elemento de la lista.
	 * @param dato- el objeto elemento a buscar.
	 */
	public int indexOf(Object dato) {
		Nodo actual = primero;
		for (int i = 0; actual != null; i++) {
			if ((actual.dato != null && actual.dato.equals(dato)) || actual.dato == dato) {
				return i;
			}
			actual = actual.siguiente;
		}
		return -1;
	}

	/**
	 * @param indice – obtiene un elemento por su índice.
	 * @return elemento contenido en el nodo indicado por el índice.
	 * @exception IndexOutOfBoundsException - índice no está entre 0 y
	 *                                      numElementos-1.
	 */
	public Object get(int indice) {
		// lanza excepción si el índice no es válido
		if (indice >= numElementos || indice < 0) {
			throw new IndexOutOfBoundsException("índice incorrecto: " + indice);
		}
		Nodo aux = obtenerNodo(indice);
		return aux.dato;
	}

	/**
	 * @return el número de elementos de la lista
	 */
	public int size() {
		return numElementos;
	}


/**
 * Representa la estructura de un nodo para una lista dinámica con enlace
 * simple.
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
} // class

