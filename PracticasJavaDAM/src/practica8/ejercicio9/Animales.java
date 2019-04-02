package practica8.ejercicio9;

public abstract class Animales {

	protected int edad;
	protected String nombre;
	protected String sexo;
	
	public Animales(int edad, String nombre, String sexo) {
		this.edad = edad;
		this.nombre = nombre;
		this.sexo = sexo;
	}
	
	public abstract String sonidoCaracteristico();
	
	@Override
	public String toString() {
		return "Edad : " + edad + ", Nombre : " + nombre + ", sexo : " + sexo;
	}
}
