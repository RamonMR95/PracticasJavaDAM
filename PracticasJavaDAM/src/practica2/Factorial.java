package practica2;
import java.util.*;
/**
 * Factorial.java
 * 1.2.3 Ejercicio 18 verde
 * Programa que muestra por pantalla el factorial de un numero
 * @author Ramon Monino Rubio 
 * 2018.10.13
 */

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fact, numero;
		
		numero = sc.nextInt();
		
		if(numero == 0 ) {
			fact = 1;
		}else if(numero < 0) {
			System.out.println("No existe factorial de un numero negativo");
		}else {
			fact = numero;
			for(int i = numero - 1; i> 0; i--){
				fact *=i;
			}
			System.out.println("El factorial del numero " + numero + " es " + fact);
		}
		sc.close();

	}

}
