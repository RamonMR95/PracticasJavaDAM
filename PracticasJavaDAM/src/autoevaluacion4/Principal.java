package autoevaluacion4;

class Usuario {

	// Atributos
	public String nif;
	public String nombre;
	public String apellidos;
	public String correo;
	public String domicilio;
	public String fechaNacimiento;
	public String fechaAlta;
	public String claveAcceso;
	public String rol;

} // class

public class Principal {

	private final static int MAX_USUARIOS = 45;
	private final static int[] patron = { 1, 0, 1, 0, 0, 1 }; // Array que contiene el patron que vamos a usar en datosUsuarios
	
	/*  Almacén de datos resuelto con arrays */
	private static Usuario[] datosUsuarios = new Usuario[MAX_USUARIOS]; 

	public static void main(String[] args) {
		cargarDatosUsuariosPatron(patron);

		/* Bucle foreach que itera sobre cada elemento del array datosUsuarios */
		for (Usuario usr : datosUsuarios) {
			System.out.println(usr);
		}
	}

	public static void cargarDatosUsuariosPatron(int[] patron) {
		/* Contador que nos ayudará a recorrer las posiciones del array patron */
		int cont = 0; 

		/* Recorremos el array datosUsuarios y vamos comprobando si patron tiene un 1 */
		for (int i = 0; i < datosUsuarios.length; i++) {

			if (patron[cont] == 1) {
				datosUsuarios[i] = new Usuario();
			}
			cont++;

			if (cont == patron.length) {
				cont = 0;
			}
		}
	}

} // class