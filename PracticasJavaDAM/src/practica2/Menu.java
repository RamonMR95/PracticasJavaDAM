package practica2;
import java.util.*;
/**
 * Menu.java
 * 1.2.3 Ejercicio 20 verde 
 * Programa que te da opcion de sumar, multiplicar, dividir,etc
 * @autor Ramón Moñino Rubio
 * 2018.10.11
 */

public class Menu {

	public static void main(String[] args) {
		int operacion;
		int valor1;
		int valor2; 

		do {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("\nPulse : \n1 Suma \n2 Resta \n3 Multiplicar \n4 Dividir \n5 Terminar");
			operacion = sc.nextInt();

			switch (operacion) {
			case 1:
				System.out.println("Introduce dos valores : ");
				valor1 = sc.nextInt();
				valor2 = sc.nextInt();
				System.out.println("\nLa suma es : " + (valor1 + valor2));
				break;
			case 2:
				System.out.println("Introduce dos valores : ");
				valor1 = sc.nextInt();
				valor2 = sc.nextInt();
				System.out.println("\nLa resta es : " + (valor1 - valor2));
				break;
			case 3:
				System.out.println("Introduce dos valores : ");
				valor1 = sc.nextInt();
				valor2 = sc.nextInt();
				System.out.println("\nLa multiplicacion es : " + (valor1 * valor2));
				break;
			case 4:
				System.out.println("Introduce dos valores : ");
				valor1 = sc.nextInt();
				valor2 = sc.nextInt();
				System.out.println("\nLa division es : " + (double) (valor1 / valor2));
				break;
			case 5:
				System.out.println("\nGracias por usar mi menu, nos vemos!!");
				break;
			}

		} while (operacion != 5);

	}
}
