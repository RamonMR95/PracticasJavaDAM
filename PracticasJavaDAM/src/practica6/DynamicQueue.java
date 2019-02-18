package practica6;

/**
 * Stack.java 
 * Ejercicio 8 violeta 
 * Programa que implementa funciones de una cola con lista dinamica
 * @author Ramon Monino Rubio - 2019.02.14
 */

public class DynamicQueue {
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
		return this.listaCola.obtenerNodo(listaCola.size() -1);
		
	}
	
	public Object poll() {
		return this.listaCola.remove(0);
	}
	
	public void offer(Object obj) {
		this.listaCola.add(listaCola.size(), obj);;
	}
	
	public int size() {
		return this.listaCola.size();
	}

} // Class
