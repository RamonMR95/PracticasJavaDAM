package practica8.ejercicio9;

public class Main {

	public static void main(String[] args) {
		Animales perro = new Perro(5, "Toby", "Macho");
		Animales rana = new Rana(1, "Gustavo", "Macho");
		Animales gato = new Gato( 2, "Garfield", "Macho");
		Animales gatito = new Gatito(1, "Gatito", "Macho");
		
		System.out.println("Perro = " + perro);
		System.out.println("Rana = " + rana);
		System.out.println("Gato = " + gato);
		System.out.println("Gatito = " + gatito);
		
	}

}
