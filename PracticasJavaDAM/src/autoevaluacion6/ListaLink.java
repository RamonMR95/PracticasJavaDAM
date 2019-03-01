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

	public void add(int indice, Object dato) {
		assert dato != null;

		Nodo nuevo = new Nodo();
		nuevo.dato = dato;
		Nodo actual = primero;

		if (numElementos == 0) {
			primero = nuevo;
			ultimo = nuevo;
			
		} else if (indice == numElementos && numElementos != 0) {
			ultimo.siguiente = nuevo;
			nuevo.siguiente = null;
			ultimo = nuevo;
			
		} else {
			for (int i = 0; i < indice - 1; i++) {
				actual = actual.siguiente;
			}
			nuevo.siguiente = actual.siguiente;
			actual.siguiente = nuevo;

		}
		numElementos++;

	}

	public void visualizar() {
		Nodo actual = primero;

		for (int i = 0; i < numElementos; i++) {
			System.out.println(actual.dato);
			actual = actual.siguiente;
		}
	}
} // class listaLink
