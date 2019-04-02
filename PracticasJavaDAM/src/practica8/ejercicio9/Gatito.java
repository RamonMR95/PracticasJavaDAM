package practica8.ejercicio9;

public class Gatito extends Animales {

	public Gatito(int edad, String nombre, String sexo) {
		super(edad, nombre, sexo);
	}

	@Override
	public String sonidoCaracteristico() {
		return "Miau";
	}
	

}
