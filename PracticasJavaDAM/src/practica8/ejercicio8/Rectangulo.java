package practica8.ejercicio8;

public class Rectangulo extends Figura {

	public Rectangulo(double altura, double anchura) {
		super(altura, anchura);

	}

	@Override
	public double calcularArea() {
		return altura * anchura;
	}

}
