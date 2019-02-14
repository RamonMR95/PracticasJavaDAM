package practica6;

import java.util.ArrayList;

/**
 * EjUnionInterseccion.java 
 * Ejercicio 5 verde 
 * Programa que realiza la union e interseccion de dos ArrayList sin utilizar bucles
 * @author Ramon Monino Rubio - 2019.02.14
 */

public class EjUnionInterseccion {

	static ArrayList<Integer>list1 = new ArrayList<Integer>();
	static ArrayList<Integer>list2 = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		list1.add(1);
		list1.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(2);
	
		ArrayList<Integer> pruebaUnion = listaUnion(list1, list2);
		ArrayList<Integer> pruebaInterseccion = listaInterseccion(list1, list2);
		
		for (Integer entero : pruebaUnion) {
			System.out.print(entero);
		}
		
		System.out.println();
		
		for (Integer entero : pruebaInterseccion) {
			System.out.println(entero);
		}
	}

	public static ArrayList<Integer> listaUnion(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		ArrayList<Integer>listaUnion = new ArrayList<Integer>();
		listaUnion.addAll(list1);
		listaUnion.addAll(list2);
		
		return listaUnion;
	}
	
	public static ArrayList<Integer> listaInterseccion (ArrayList<Integer> list1, ArrayList<Integer> list2){
		ArrayList<Integer>listaInterseccion = new ArrayList<Integer>();
		listaInterseccion.addAll(list1);
		listaInterseccion.retainAll(list2);
		
		return listaInterseccion;
	}

}
