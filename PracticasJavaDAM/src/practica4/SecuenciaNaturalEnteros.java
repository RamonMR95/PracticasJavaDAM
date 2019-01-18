package practica4;

public class SecuenciaNaturalEnteros {
	static int[][] res;
	static int contador = 1;

	public static void main(String[] args) {
		secuenciaNaturalIntA(5);

		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] secuenciaNaturalIntA(int lado) {
		res = new int[lado][lado];

		for (int filas = 0; filas < lado; filas++) {
			for (int columnas = 0; columnas < lado; columnas++) {
				res[columnas][filas] = contador;
				contador++;
			}
		}
		return res;
	}

}
