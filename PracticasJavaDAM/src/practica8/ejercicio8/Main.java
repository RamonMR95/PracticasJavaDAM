package practica8.ejercicio8;

public class Main {

	public static void main(String[] args) {
		Figura triangulo = new Triangulo(2, 5);
		Figura rectangulo = new Rectangulo(5, 6);
		Figura circulo = new Circulo(2);
		
		System.out.println(triangulo.calcularArea());
		System.out.println(rectangulo.calcularArea());
		System.out.println(circulo.calcularArea());
	}
}
