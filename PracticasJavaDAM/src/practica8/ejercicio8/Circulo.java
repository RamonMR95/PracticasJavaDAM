package practica8.ejercicio8;

public class Circulo extends Figura {

	private int radio;
	
	public Circulo(double altura, double anchura, int radio) {
		super(altura, anchura);
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}
	
	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(radio, 2);
	}

}
