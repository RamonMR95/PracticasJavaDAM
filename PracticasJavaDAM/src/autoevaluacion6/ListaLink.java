package autoevaluacion6;

/**
 * Representa la implementación parcial de una lista enlazada simple en la que
 * se tiene acceso directo al primer elemento y también al último.
 * @author Ramón Moñino Rubio
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

	/**
	 * Metodo que añade en nodos a una lista enlazada dado un índice
	 * @param indice - En el que queremos insertar
	 * @param dato - Dato a insertar en la lista
	 * @author Ramon Moñino Rubio
	 */
	public void add(int indice, Object dato) {
		assert dato != null;

		Nodo nuevo = new Nodo();	// Creación del nuevo nodo a insertar
		nuevo.dato = dato;
		Nodo actual = primero;

		/* Si la lista está vacia se inserta en la primera posición */
		if (numElementos == 0) {
			primero = nuevo;
			ultimo = nuevo;
			
		/* Inserción por el final */
		} else if (indice == numElementos && numElementos != 0) {
			ultimo.siguiente = nuevo;
			nuevo.siguiente = null;
			ultimo = nuevo;
			
		/* Recorremos la lista hasta la posición anterior a indice e insertamos el nuevo nodo */
		} else {
			for (int i = 0; i < indice - 1; i++) {
				actual = actual.siguiente;
			}
			nuevo.siguiente = actual.siguiente;
			actual.siguiente = nuevo;

		}
		numElementos++;

	}

	/**
	 * Metodo auxiliar que visualiza la lista enlazada
	 */
	public void visualizar() {
		Nodo actual = primero;

		for (int i = 0; i < numElementos; i++) {
			System.out.println(actual.dato);
			actual = actual.siguiente;
		}
	}
} // class listaLink
