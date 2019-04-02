package practica8.ejercicio9;

public class Rana extends Animales {

	public Rana(int edad, String nombre, String sexo) {
		super(edad, nombre, sexo);
	}

	@Override
	public String sonidoCaracteristico() {
		return "Croak";
	}

}
