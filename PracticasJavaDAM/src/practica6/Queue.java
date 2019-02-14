package practica6;

import java.util.ArrayList;

/**
 * Queue.java 
 * Ejercicio 7 verde 
 * Programa que implementa funciones de una cola
 * @author Ramon Monino Rubio - 2019.02.14
 */

public class Queue {

	static ArrayList<String> cola = new ArrayList<String>();
	
	public static void main(String[] args) {

	}
	
	public static void clear() {
		cola.clear();
	}
	
	public static boolean contains(Object obj) {
		return cola.contains(obj);	}
	
	public static boolean isEmpty() {
		return cola.isEmpty();
	}
	
	public static Object peek() {
		int i = 0;
		while (cola.toArray()[i] != null) {
			i++;
			return cola.get(i);
		}
		return null;
	}
	
	public static Object poll() {
		int i = 0;
		while (cola.toArray()[i] != null) {
			i++;
			return cola.remove(i);
		}
		return null;
	}
	
	public static void offer(Object obj) {
		cola.add(obj.toString());
	}
	
	public static int size() {
		return cola.size();
	}

}
