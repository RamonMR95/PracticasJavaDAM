package autoevaluacion7;

/**
 * Clase principal del programa para probar los 
 * datos de una forma alternativa a las pruebas de JUnit.
 * @source Main.java
 * @author Ramón Moñino Rubio - 30/03/2019
 */
public class Main {

	public static void main(String[] args) throws Exception {
		Empleado emp1 = new Empleado("Ramon Moñino Rubio", 500000 ,64, new PuestoTrabajo("Administrador"));
		System.out.println(emp1);
	}
}
