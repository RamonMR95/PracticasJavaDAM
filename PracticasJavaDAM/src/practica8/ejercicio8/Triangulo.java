package practica8.ejercicio8;

public class Triangulo extends Figura {

	public Triangulo(double altura, double anchura) {
		super(altura, anchura);
	}
	
	@Override
	public double calcularArea() {
		return (altura * anchura) / 2;
	}

}
