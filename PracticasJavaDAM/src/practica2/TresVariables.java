package practica2;
import java.util.Scanner;
/**
 * TresVariables.java
 * 1.2.3 Ejercicio 10 verde
 * Programa que asigna valor a 3 variables, las ordena y las muestra
 * @author Ramon Moñino Rubio
 * 2018.09.27
 */

public class TresVariables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero1, numero2, numero3,aux;
		
		System.out.println("Introduce 3 números a ordenar :");
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		numero3 = sc.nextInt();
		
		if(numero1 > numero2) {
			aux = numero1;
			numero1 = numero2;
			numero2 = aux;
		}
		
		if(numero1 > numero3) {
			aux = numero1;
			numero1 = numero3;
			numero3 = aux;
		}
		if(numero2 > numero3) {
			aux = numero2;
			numero2 = numero3;
			numero3 = aux;
		}
		sc.close();
		
		System.out.println("El menor numero es :" + numero1);
		System.out.println("El numero intermedio es : " +numero2);
		System.out.println("El mayor numero es : " + numero3);
	}
	

}
