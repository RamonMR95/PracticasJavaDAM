package practica8.ejercicio9;

public class Perro extends Animales {

	public Perro(int edad, String nombre, String sexo) {
		super(edad, nombre, sexo);
	}

	@Override
	public String sonidoCaracteristico() {
		return "Guau";
	}

}
