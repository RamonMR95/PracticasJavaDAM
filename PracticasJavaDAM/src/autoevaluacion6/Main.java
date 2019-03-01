package autoevaluacion6;

/**
 * Metodo que prueba la clase ListaLink
 * @author ramon
 */

public class Main {

	public static void main(String[] args) {
		/* Creamos un objeto lista */ 
		ListaLink lista = new ListaLink();
		
		/* Insertamos en diversas posiciones */
		lista.add(0, 1);
		lista.add(1, 4);
		lista.add(1, 2);
		lista.add(2, 3);
		
		/* Visualizamos la lista */
		lista.visualizar();
	}

}
