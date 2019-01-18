package practica2;
import java.util.Scanner;
/**
 * Redondear.java
 * 1.2.3 Ejercicio 16 verde
 * Programa que pide numero decimal y numero de decimales de redondeo y lo muestra por pantalla
 * @author Ramón Moñino Rubio
 * 2018.10.11
 */

public class Redondear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char repetir = 'n';

		do {

			System.out.println("Introduce el numero a redondear: ");
			double numero = sc.nextDouble();
			System.out.println("Introduce el numero de decimales a redondear : ");

			int nDecimales = sc.nextInt();
			int decimales = (int) Math.pow(10, nDecimales);
			double valor = Math.rint(numero * decimales) / decimales;
			System.out.println("El numero es : " + valor);
			System.out.println("Pulsa s para introducir otro numero :");
			repetir = sc.next().charAt(0);

		} while (repetir == 's');

		sc.close();
	}

}
