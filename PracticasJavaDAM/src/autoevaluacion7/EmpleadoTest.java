package autoevaluacion7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {
	/* Atributos Empleado */
	private static Empleado empleado1;
	private Empleado empleado2;
	
	/* En primer lugar se inicializan los campos del objeto empleado1*/
	@BeforeAll
	public static void inicializarDatosFijos() throws Exception {
		empleado1 = new Empleado("Antonio Martinez Martinez", 50000, 35, new PuestoTrabajo("Jornalero"));
	}

	/* Despues de todos los test se establece el objeto empleado1 a null */
	@AfterAll
	public static void limpiarDatosFijos() {
		empleado1 = null;
	}
	
	/* Antes de cada test se inicializan los datos del empleado2 con los valores por defecto de empleado*/
	@BeforeEach
	public void inicializarDatosVariables() {
		try {
			empleado2 = new Empleado();
		} 
		catch (Exception e) { }
	}
	
	/* Después de cada test el objeto empleado2 se establece a null */
	@AfterEach
	public void borrarDatosPrueba() {
		empleado2 = null;
	}
	
	/* Test que prueba el constructor por convencional de la clase empleado */
	@Test
	public void testEmpleadoConvencional() {
		assertEquals(empleado1.getNombre(), "Antonio Martinez Martinez");
		assertEquals(empleado1.getSueldo(), 50000);
		assertEquals(empleado1.getEdad(), 35);
		assertEquals(empleado1.getPuesto().getPuesto(), new PuestoTrabajo("Jornalero").getPuesto());
	}
	
	/* Test que prueba el constructor por defecto de la clase empleado */
	@Test
	public void testEmpleadoDefecto() {
		try {
			assertEquals(empleado2.getNombre(), "Ramon Moñino Rubio");
			assertEquals(empleado2.getSueldo(), 100000);
			assertEquals(empleado2.getEdad(), 35);
			assertEquals(empleado2.getPuesto().getPuesto(), new PuestoTrabajo("Prueba").getPuesto());
		} 
		catch (Exception e) { }
	}
	
	/* Test que prueba el constructor copia de empleado */
	@Test
	public void testEmpleadoCopia() {
		Empleado empleado = new Empleado(empleado1);
		assertNotSame(empleado, empleado1);
		assertEquals(empleado.getNombre(), empleado1.getNombre());
		assertEquals(empleado.getSueldo(), empleado1.getSueldo());	
		assertEquals(empleado.getEdad(), empleado1.getEdad());
		assertEquals(empleado.getPuesto().getPuesto(), empleado1.getPuesto().getPuesto());
	}
	
	/* Test que prueba el método setNombre */
	@Test
	public void testSetNombre() {
		try {
			empleado2.setNombre("Antonio Martinez Martinez");
			assertEquals(empleado2.getNombre(), "Antonio Martinez Martinez");
		} 
		catch (Exception e) { }
	}
	
	/* Test que prueba el método setSueldo */
	@Test
	public void testSetSueldo() {
		try {
			empleado2.setSueldo(50000);
			assertEquals(empleado2.getSueldo(), 50000);
		} 
		catch (Exception e) { }
	}
	
	/* Test que prueba el método setEdad */
	@Test
	public void testSetEdad() {
		try {
			empleado2.setEdad(35);;
			assertEquals(empleado2.getEdad(), 35);
		} 
		catch (Exception e) { }
	}
	
	/* Test que prueba el método setTrabajo */
	@Test
	public void testSetPuestoTrabajo() {
		try {
			empleado2.setPuesto(new PuestoTrabajo("Prueba"));
			assertEquals(empleado2.getPuesto().getPuesto(), new PuestoTrabajo("Prueba").getPuesto());
		}
		catch (Exception e) { }

	}
	
	/* Test que comprueba el metodo toString de la clase empleado */
	@Test
	public void testToString() {
		assertEquals(empleado1.toString(), "Nombre : " + "Antonio Martinez Martinez" + ", sueldo : " + "50000.0" + ", edad : " + "35" + ", puesto : " + "Jornalero");
	}
	
	// TEST CON DATOS NO VÁLIDOS

	@Test
	public void testSetNombreNull() {
		try {
			empleado2.setNombre(null);
			fail("No debe llegar aquí...");
		} 
		catch (Exception e) {
			assertTrue(empleado2.getNombre() != null);
		}
	}
	
	/* Metodo que comprueba que el nombre del empleado no puede ser establecido en blanco */
	@Test
	public void testSetNombreblanco() {
		try {
			empleado2.setNombre(" ");
			assertEquals(empleado2.getNombre(), " ");
			
		}
		catch (Exception e) { }
	}
	
	/* Metodo que comprueba que el sueldo del empleado no es inferior a 10000€ */
	@Test
	public void testSetSueldoInferior() {
		try {
			empleado2.setSueldo(10);
			assertNotEquals(empleado2.getSueldo(), 10);
		} 
		catch (Exception e) { }
	}
	
	/* Test que comprueba que la edad del empleado no es inferior a 16 años */
	@Test
	public void testSetEdadInferior() {
		try {
			empleado2.setEdad(5);
			assertNotEquals(empleado2.getEdad(), 5);
		} 
		catch (Exception e) { }
	}
	
	/* Test que comprueba que la edad del empleado no es superior a 65 años */
	@Test
	public void testSetEdadSuperior() {
		try {
			empleado2.setEdad(70);
			assertNotEquals(empleado2.getEdad(), 35);
		} 
		catch (Exception e) { }
	}
	
	/* Test que comprueba que un puesto de trabajo no puede ser igual a null */
	@Test
	public void testSetPuestoNull() {
		try {
			empleado2.setPuesto(null);
			fail("No debe llegar aquí...");
		} 
		catch (Exception e) {
			assertTrue(empleado2.getPuesto() != null);
		}
	}
	
}
