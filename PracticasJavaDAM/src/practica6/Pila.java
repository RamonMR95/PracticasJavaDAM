package practica6;

import java.util.ArrayList;

/**
 * Stack.java Ejercicio 6 verde Programa que implementa funciones de una pila
 * 
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
		int tamaño = pila.size();
		return pila.get(tamaño - 1);
	}

	public  Object pop() {
		int tamaño = pila.size();
		return pila.remove(tamaño - 1);
	}

	public void push(Object obj) {
		int size = pila.size();
		
		if (size == 0) {
			pila.add(obj);
		} else {
			pila.add(size -1 , obj);
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
		System.out.println(pila.size());
		pila.pop();
		pila.peek();
		
	}
}
