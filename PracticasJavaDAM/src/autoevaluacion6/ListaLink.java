package autoevaluacion6;

/**
 * Representa la implementación parcial de una lista enlazada simple en la que
 * se tiene acceso directo al primer elemento y también al último.
 */
public class ListaLink {

	/**
	 * La clase Nodo está anidada y representa la estructura de un elemento de la
	 * lista enlazada simple.
	 */
	class Nodo {

		// Atributos
		Object dato;
		Nodo siguiente;

		/**
		 * Constructor que inicializa atributos al valor por defecto.
		 */
		public Nodo() {
			dato = null;
			siguiente = null;
		}

	} // class Nodo

	// Atributos ListaLink
	private Nodo primero;
	private Nodo ultimo;
	public int numElementos;

	/**
	 * Constructor que inicializa los atributos al valor por defecto
	 */
	public ListaLink() {
		primero = null;
		ultimo = null;
		numElementos = 0;
	}

	public void add(Object dato, int indice) {
		assert dato != null;

		Nodo actual = primero;
		Nodo nuevo = new Nodo();
		nuevo.dato = dato;

		if (numElementos == 0) {
			primero = nuevo;

		} else if (indice == numElementos - 1) {
			ultimo.siguiente = nuevo;
			nuevo.siguiente = null;
			ultimo = nuevo;

		} else {

			for (int i = 0; i < indice; i++) {
				actual = actual.siguiente;
			}
			nuevo.siguiente = actual.siguiente;
			actual.siguiente = nuevo;

		}

	}
} // class listaLink
