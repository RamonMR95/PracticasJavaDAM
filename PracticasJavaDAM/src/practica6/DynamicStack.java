package practica6;

public class DynamicStack {
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
		return this.listaPila.obtenerNodo(listaPila.size() -1);
		
	}
	
	public Object pop() {
		return this.listaPila.remove(listaPila.size()-1);
	}
	
	public void push(Object obj) {
		this.listaPila.add(listaPila.size(), obj);;
	}
	
	public int size() {
		return this.listaPila.size();
	}
	
	public Object[] toArray() {
		Object[]array = new Object[listaPila.size()];
		
		for (int i = 0; i < listaPila.size(); i++) {
			array[i] = listaPila.get(i);
		}
		
		return array;
	}
}
