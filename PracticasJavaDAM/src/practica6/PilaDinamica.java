package practica6;

/**
 * PilaDinamica.java
 * Escribe una implementación del TDA pila basada en una lista dinámica
 * Ejercicio 9 violeta
 * @author - Ramon Monino Rubio - 2019.02.14
 *
 */
class DynamicStack {
	ListaEnlazada2_3_4 listaPila = new ListaEnlazada2_3_4();

	public void clear() {
		for (int i = 0; i < listaPila.size(); i++) {
			listaPila.remove(i);
		}
	}

	public boolean contains(Object obj) {
		for (int i = 0; i < listaPila.size(); i++) {
			if (listaPila.get(i).equals(obj)) {
				return true;
			}
		}
		return false;
	}

	public boolean isEmpty() {
		if (listaPila.size() == 0) {
			return true;
		}
		return false;
	}

	public Object peek() {
		return this.listaPila.obtenerNodo(listaPila.size() - 1).dato;

	}

	public Object pop() {
		return this.listaPila.remove(listaPila.size() - 1);
	}

	public void push(Object obj) {
		this.listaPila.add(listaPila.size(), obj);
		;
	}

	public int size() {
		return this.listaPila.size();
	}

	public Object[] toArray() {
		Object[] array = new Object[listaPila.size()];

		for (int i = 0; i < listaPila.size(); i++) {
			array[i] = listaPila.get(i);
		}

		return array;
	}
} // Class

public class PilaDinamica {

	public static void main(String[] args) {
		DynamicStack pilaDinamica = new DynamicStack();

		pilaDinamica.push(1);
		System.out.println("El dato de la cima de la pila es : " + pilaDinamica.peek());
		System.out.println("El tamaño de la pila es " + pilaDinamica.size());
		System.out.println("La pila está vacia? :" + pilaDinamica.isEmpty());
		System.out.println("La pila contiene 1? " + pilaDinamica.contains(1) + "\n");

		pilaDinamica.push(2);
		System.out.println("El tamaño de la pila es " + pilaDinamica.size());
		System.out.println("El dato de la cima de la pila es : " + pilaDinamica.peek() + "\n");

		pilaDinamica.pop();
		System.out.println("El dato de la cima de la pila es : " + pilaDinamica.peek() + "\n");

		pilaDinamica.clear();
		System.out.println("El tamaño de la pila es " + pilaDinamica.size());
	}

}
