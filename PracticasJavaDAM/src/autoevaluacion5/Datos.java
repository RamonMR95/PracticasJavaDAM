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
		String[] result = texto.split(";");
		String[] persona;

		for (int i = 0; i < result.length; i++) {
			persona = result[i].split(",");
			
			Usuario usr = new Usuario();
			usr.nif = persona[0];
			usr.nombre = persona[1];
			usr.apellidos = persona[2];
			usr.domicilio = persona[3];
			usr.correo = persona[4];
			usr.fechaNacimiento = persona[5];
			usr.fechaAlta = persona[6];
			usr.claveAcceso = persona[7];
			usr.rol = persona[8];
		
			datosUsuarios[i] = usr;
		}

	}

} // class

/**
 * Clase que representa el usuario de un sistema.
 * @author ajp
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
