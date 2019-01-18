package practica3;
/**
 * TrianguloFx.java 
 * Ejercicio 18 violeta 
 * Comprueba si es un triangulo con la fx esTriangulo y muestra el tipo con tipoTriangulo
 * @author Ramon Moñino Rubio
 * 2018.11.08
 */
public class TrianguloFx {

	public static void main(String[] args) {
		System.out.println(tipoTriangulo(-2, 2, 2));
	}

	public static boolean esTriangulo(int ladoA, int ladoB, int ladoC) {
		return (ladoA > 0 && ladoB > 0 && ladoC > 0);
	}

	public static String tipoTriangulo(int ladoA, int ladoB, int ladoC) {
		String tipoTriangulo = "";
		
		if (esTriangulo(ladoA, ladoB, ladoC)) {
			if (ladoA == ladoB && ladoA == ladoC) {
				tipoTriangulo = "EQUILATERO";
			} else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
				tipoTriangulo = "ISOSCELES";
			} else {
				tipoTriangulo = "ESCALENO";
			}

		} else {
			tipoTriangulo = "ERROR";
		}
		return tipoTriangulo;
	}

}
