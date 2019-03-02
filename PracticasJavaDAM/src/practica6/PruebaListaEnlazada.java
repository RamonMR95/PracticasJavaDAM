package practica6;

/**
 * Clase de prueba de todas las funciones de la lista dinamica ejercicio 2, 3 y 4
 * @author - Ramon Monino Rubio - 2019.02.14
 *
 */
public class PruebaListaEnlazada {
	public static void main(String[] args) {
		ListaEnlazada2_3_4 listaCompra = new ListaEnlazada2_3_4();
		listaCompra.add("Leche");
		listaCompra.add("Miel");
		listaCompra.add("Aceitunas");
		listaCompra.add("Cerveza");
		listaCompra.add("Café");
		listaCompra.add(5, "Almendras");
		
		System.out.println("Lista de la compra:");
		for (int i = 0; i < listaCompra.size(); i++) {
			System.out.println(listaCompra.get(i));
		}
		System.out.println("elementos en la lista: " + listaCompra.size());
		System.out.println("elementos 3 en la lista: " + listaCompra.get(3));
		System.out.println("posición del elemento Miel: " + listaCompra.indexOf("Miel"));
		System.out.println("eliminado: " + listaCompra.remove("Miel"));
		

		/* Prueba de remove all */
		System.out.println("\n\nPrueba de remove all");
		ListaEnlazada2_3_4 listaBorrar = new ListaEnlazada2_3_4();
		listaBorrar.add("te");
		listaBorrar.add("Miel");
		listaBorrar.add("tele");
		
		listaCompra.removeAll(listaBorrar);
		System.out.println("Lista de la compra despues de borrar:");
		for (int i = 0; i < listaCompra.size(); i++) {
			System.out.println(listaCompra.get(i));
		}
		
	}
}