package practica2;
import java.util.*;
/**
 * SumaMediaNumero.java 
 * 1.2.3 Ejercicio 14 verde 
 * Programa que lee numeros y calcula suma y media 
 * @author Ramón Moñino Rubio
 * 2018.09.27
 */

public class SumaMediaNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		int sumaAcumulada = 0;
		int contador = 0;
		double media =0 ;

		do {
			numero = sc.nextInt();
			sumaAcumulada += numero;
			contador++;
			media = (double) sumaAcumulada / (contador-1);
		} while (numero != 0);
		
		System.out.println("La suma aritmetica es : " + sumaAcumulada);
		System.out.printf("La media es : " + media);
		sc.close();
	}

}
