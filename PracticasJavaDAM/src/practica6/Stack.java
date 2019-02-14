package practica6;

import java.util.ArrayList;

/**
 * Stack.java 
 * Ejercicio 6 verde 
 * Programa que implementa funciones de una pila
 * @author Ramon Monino Rubio - 2019.02.14
 */

public class Stack {
	static final int INITIAL_SIZE = 4;
	static ArrayList<Object>pila = new ArrayList<Object>(INITIAL_SIZE);
	
	public static void main(String[] args) {
		push(1);
		pop();
		peek();
		System.out.println(size());
	}
	
	public static void clear() {
		pila.clear();
	}
	
	public static boolean contains(Object obj) {
		return pila.contains(obj);
	}
	
	public static boolean isEmpty() {
		return pila.isEmpty();
	}
	
	public static Object peek() {
		int tamaño = pila.size();
		return pila.get(tamaño-1);
	}
	
	public static Object pop() {
		int tamaño = pila.size();
		return pila.remove(tamaño-1);
	}
	
	public static void push(Object obj) {
		int tamaño = pila.size();
		pila.add(tamaño	, obj);
	}
	
	public static int size() {
		return pila.size();
	}
	
	public static Object[] toArray() {
		return pila.toArray();
	}

}
