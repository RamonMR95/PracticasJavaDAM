package autoevaluacion5;

/**
 * Clase que contiene un array de objetos de la clase Usuario y métodos para las
 * pruebas y manipulación del array.
 * @author Ramon Moñino Rubio
 */
public class Datos {

	// Vector de objetos
	public static Usuario[] datosUsuarios;

	/**
	 * Método principal que coordina la llamada a los distintos métodos probados.
	 * @param args
	 */
	public static void main(String[] args) {
		
		datosUsuarios = new Usuario[21];
		String texto = "0344556K, pepe0, López Pérez0, C/Luna 27 30132 Murcia, pepe0@gmail.com, 1990.11.12, 2015.12.3, miau0, usuario normal;00000000T, "
				+ "Ramon, Moñino, C/LUL 30 30157 Alicante, ramonmr16@gmail.com, 1995.12.15, 2016.12.05, loco, usuario normal";
		importarUsuariosTexto(texto);

		for (Usuario usr : datosUsuarios) {
			System.out.println(usr);
		}

	}

	public static void importarUsuariosTexto(String texto) {
		String[] usuarios = texto.split(";");
		String[] atributosPersona;

		for (int i = 0; i < usuarios.length; i++) {
			atributosPersona = usuarios[i].split(",");
			
			datosUsuarios[i] = new Usuario();
			datosUsuarios[i].nif = atributosPersona[0];
			datosUsuarios[i].nombre = atributosPersona[1];
			datosUsuarios[i].apellidos = atributosPersona[2];
			datosUsuarios[i].domicilio = atributosPersona[3];
			datosUsuarios[i].correo = atributosPersona[4];
			datosUsuarios[i].fechaNacimiento = atributosPersona[5];
			datosUsuarios[i].fechaAlta = atributosPersona[6];
			datosUsuarios[i].claveAcceso = atributosPersona[7];
			datosUsuarios[i].rol = atributosPersona[8];

		}

	}

} // class

/**
 * Clase que representa el usuario de un sistema.
 * @author Ramón Moñino
 */
class Usuario {

	// Atributos
	public String nif;
	public String nombre;
	public String apellidos;
	public String domicilio;
	public String correo;
	public String fechaNacimiento;
	public String fechaAlta;
	public String claveAcceso;
	public String rol;

	@Override
	public String toString() {
		return nif + "," + nombre + "," + apellidos + "," + domicilio + "," + correo + "," + fechaNacimiento + ","
				+ fechaAlta + "," + claveAcceso + "," + rol;
	}

} // class
