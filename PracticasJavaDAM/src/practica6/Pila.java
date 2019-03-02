package practica6;

import java.util.ArrayList;

/**
 * Pila.java 
 * Ejercicio 6 verde 
 * Programa que implementa funciones de una pila con un arraylist
 * @author Ramon Monino Rubio - 2019.02.14
 */

class Stack {
	static ArrayList<Object> pila = new ArrayList<Object>();

	public void clear() {
		pila.clear();
	}

	public boolean contains(Object obj) {
		return pila.contains(obj);
	}

	public boolean isEmpty() {
		return pila.isEmpty();
	}

	public Object peek() {
		int indice = pila.size() - 1;
		return pila.get(indice);
	}

	public Object pop() {
		int indice = pila.size() - 1;
		return pila.remove(indice);
	}

	public void push(Object obj) {
		int size = pila.size();

		if (size == 0) {
			pila.add(obj);
		} else {
			pila.add(size, obj);
		}

	}

	public int size() {
		return pila.size();
	}

	public Object[] toArray() {
		return pila.toArray();
	}

} // Class

public class Pila {
	public static void main(String[] args) {
		Stack pila = new Stack();
		pila.push(1);
		System.out.println("El dato de la cima de la pila es : " + pila.peek());
		System.out.println("El tamaño de la pila es " + pila.size());
		System.out.println("La pila está vacia? :" + pila.isEmpty());
		System.out.println("La pila contiene 1? " + pila.contains(1) + "\n");

		pila.push(2);
		System.out.println("El tamaño de la pila es " + pila.size());
		System.out.println("El dato de la cima de la pila es : " + pila.peek() + "\n");

		pila.pop();
		System.out.println("El dato de la cima de la pila es : " + pila.peek() + "\n");

		pila.clear();
		System.out.println("El tamaño de la pila es " + pila.size());

	}
}
