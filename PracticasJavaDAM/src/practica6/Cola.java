package practica6;

import java.util.ArrayList;

/**
 * Cola.java 
 * Ejercicio 7 verde 
 * Programa que implementa funciones de una cola con un arraylist
 * @author Ramon Monino Rubio - 2019.02.14
 */

class Queue {

	static ArrayList<Object> cola = new ArrayList<Object>();

	public void clear() {
		cola.clear();
	}

	public boolean contains(Object obj) {
		return cola.contains(obj);
	}

	public boolean isEmpty() {
		return cola.isEmpty();
	}

	public Object peek() {
		return cola.get(0);
	}

	public Object poll() {
		return cola.remove(0);
	}

	public void offer(Object obj) {
		int size = cola.size();

		if (size == 0) {
			cola.add(obj);

		} else {
			cola.add(size, obj);
		}
	}

	public int size() {
		return cola.size();
	}

}

public class Cola {
	public static void main(String[] args) {
		Queue cola = new Queue();

		System.out.println("Está vacia la cola? : " + cola.isEmpty() + "\n");
		cola.offer(1);
		cola.offer(2);

		System.out.println("Tamaño de la cola : " + cola.size() + "\n");
		System.out.println("La cola contiene el elemento 1? " + cola.contains(1) + "\n");

		System.out.println("El elemento de la cabeza es : " + cola.peek());
		System.out.println("Tamaño de la cola : " + cola.size() + "\n");

		System.out.println("Extrae el elemento de la cabeza " + cola.poll());
		System.out.println("Obtiene el elemento de la cabeza " + cola.peek());
		System.out.println("Tamaño de la cola " + cola.size());

	}
}
