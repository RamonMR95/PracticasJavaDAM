package practica2;

import javax.swing.JOptionPane;

/**
 * MostrarMensajes.java 
 * 1.2.3 Ejecicio 15 violeta
 * Programa que muestra por pantalla numero random 
 * @author Ramón Moñino Rubio
 * 2018.10.12
 */

public class MostrarMensajes {

	public static void main(String[] args) {
		System.out.println("Dos numeros entre 1 y 10 : ");
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int valor = 0;

		for (int i = 0; i < array.length; i++) {
			valor = (1 + (int) (Math.random() * 10));

		}
		System.out.println(valor);

		JOptionPane.showMessageDialog(null, "El número es " + (1 + (int) (Math.random() * 10)));

	}

}
