package practica8.ejercicio9;

public class Gato extends Animales {

	public Gato(int edad, String nombre, String sexo) {
		super(edad, nombre, sexo);
	}

	@Override
	public String sonidoCaracteristico() {
		return "Miau";
	}

}
