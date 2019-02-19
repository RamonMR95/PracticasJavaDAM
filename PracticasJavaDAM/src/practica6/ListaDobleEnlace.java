package practica6;

public class ListaDobleEnlace {
	private Nodo primero;
	private Nodo ultimo;
	private int numElementos;


	public void add(Object dato) {
		addUltimo(dato);
	}

	public void add(int indice, Object dato) {
		if (indice < 0 || indice >= numElementos) {
			throw new IndexOutOfBoundsException("Índice incorrecto: " + indice);
		}
		if (indice == 0) {
			insertarPrimero(dato);
		}

		if (indice > 0) {
			insertarIntermedio(indice, dato);
		}
	}


	private void insertarIntermedio(int indice, Object dato) {
		Nodo nuevo = new Nodo(dato);
		Nodo actual = obtenerNodo(indice); // Donde insertar.
		Nodo anterior = actual.anterior; // Obtiene el anterior.
		actual.anterior = nuevo; // Enlaza el nuevo nodo.
		anterior.siguiente = nuevo;
		nuevo.anterior = anterior; // Ajusta enlaces.
		nuevo.siguiente = actual;
		numElementos++; // Actualiza tamaño.
	}


	private void insertarPrimero(Object dato) {
		Nodo nuevo = new Nodo(dato);

		if (numElementos == 0) {
			primero = nuevo;
			ultimo = nuevo;
		}
		else {
			Nodo actual = primero; // Dónde insertar.
			actual.anterior = nuevo; // Enlaza el nuevo nodo.
			nuevo.siguiente = actual; // Ajusta enlace.
			primero = nuevo; // Actualiza el nuevo primero.
		}
		numElementos++; // Actualiza tamaño.
	}


	private void addUltimo(Object dato) {
		Nodo nuevo = new Nodo(dato);

		if (numElementos == 0) {
			ultimo = nuevo;
			primero = nuevo;
		}
		else {
			Nodo actual = ultimo; // Dónde insertar.
			actual.siguiente = nuevo; // Enlaza el nuevo nodo.
			nuevo.anterior = actual; // Ajusta enlace.
			ultimo = nuevo; // Actualiza el nuevo último.
		}
		numElementos++; // Actualiza tamaño.
	}


	private Nodo obtenerNodo(int indice) {
		if (indice >= numElementos || indice < 0) {
			throw new IndexOutOfBoundsException("índice incorrecto: " + indice);
		}
		Nodo actual = primero;
		for (int i = 0; i < indice; i++) {
			actual = actual.siguiente;
		}
		return actual;
	}

	public int getSize() {
		return this.numElementos;
	}
	
	class Nodo {
		Object dato;
		Nodo siguiente;
		Nodo anterior;

		public Nodo(Object dato) {
			this.dato = dato;
			anterior = null;
			siguiente = null;

		}
	} // class

}
