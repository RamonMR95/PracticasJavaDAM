package practica8.ejercicio9;

public class Tigre extends Animales {

	public Tigre(int edad, String nombre, String sexo) {
		super(edad, nombre, sexo);
	}

	@Override
	public String sonidoCaracteristico() {
		return "Miau";
	}

}
