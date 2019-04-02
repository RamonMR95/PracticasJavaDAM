package practica8.ejercicio8;

public abstract class Figura {

	protected double anchura;
	protected double altura;
	
	public Figura(double altura, double anchura) {
		this.altura = altura;
		this.anchura = anchura;
	}
	
	public abstract double calcularArea();

	public double getAnchura() {
		return anchura;
	}

	public void setAnchura(double anchura) {
		this.anchura = anchura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
