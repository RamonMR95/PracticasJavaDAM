package practica6;

/**
 * ColaDinamica.java 
 * Ejercicio 8 violeta 
 * Programa que implementa funciones de una cola con lista dinamica
 * @author Ramon Monino Rubio - 2019.02.14
 */

class DynamicQueue {
	ListaEnlazada2_3_4 listaCola = new ListaEnlazada2_3_4();

	public void clear() {
		for (int i = 0; i < listaCola.size(); i++) {
			listaCola.remove(i);
		}
	}

	public boolean contains(Object obj) {
		for (int i = 0; i < listaCola.size(); i++) {
			if (listaCola.get(i).equals(obj)) {
				return true;
			}
		}
		return false;
	}

	public boolean isEmpty() {
		if (listaCola.size() == 0) {
			return true;
		}
		return false;
	}

	public Object peek() {
		return this.listaCola.obtenerNodo(0).dato;

	}

	public Object poll() {
		return this.listaCola.remove(0);
	}

	public void offer(Object obj) {
		this.listaCola.add(obj);
	}

	public int size() {
		return this.listaCola.size();
	}

} // Class

public class ColaDinamica {
	public static void main(String[] args) {
		DynamicQueue colaDinamica = new DynamicQueue();

		System.out.println("Está vacia la cola? : " + colaDinamica.isEmpty() + "\n");
		colaDinamica.offer(1);
		colaDinamica.offer(2);

		System.out.println("Tamaño de la cola : " + colaDinamica.size() + "\n");
		System.out.println("La cola contiene el elemento 1? " + colaDinamica.contains(1) + "\n");

		System.out.println("El elemento de la cabeza es : " + colaDinamica.peek());
		System.out.println("Tamaño de la cola : " + colaDinamica.size() + "\n");

		System.out.println("Extrae el elemento de la cabeza " + colaDinamica.poll());
		System.out.println("Obtiene el elemento de la cabeza " + colaDinamica.peek());
		System.out.println("Tamaño de la cola " + colaDinamica.size());
	}

}
