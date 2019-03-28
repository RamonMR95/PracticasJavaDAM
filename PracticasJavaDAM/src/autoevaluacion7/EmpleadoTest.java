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
	
	private static Empleado empleado1;
	private Empleado empleado2;
	
	@BeforeAll
	public static void inicializarDatosFijos() throws Exception {
		empleado1 = new Empleado("Antonio Martinez Martinez", 50000, 35, new PuestoTrabajo("Jornalero"));
	}

	@AfterAll
	public static void limpiarDatosFijos() {
		empleado1 = null;
	}
	
	@BeforeEach
	public void inicializarDatosVariables() {
		try {
			empleado2 = new Empleado();
		} 
		catch (Exception e) {
			
		}
	}
	
	@AfterEach
	public void borrarDatosPrueba() {
		empleado2 = null;
	}
	
	@Test
	public void testEmpleadoConvencional() {
		assertEquals(empleado1.getNombre(), "Antonio Martinez Martinez");
		assertEquals(empleado1.getSueldo(), 50000);
		assertEquals(empleado1.getEdad(), 35);
		assertEquals(empleado1.getPuesto(), new PuestoTrabajo("Jornalero"));
	}
	
	@Test
	public void testEmpleadoDefecto() {
		try {
			assertEquals(empleado2.getNombre(), "Nombre Apellido Apellido");
			assertEquals(empleado2.getSueldo(), 100000);
			assertEquals(empleado2.getEdad(), 35);
			assertEquals(empleado2.getPuesto(), new PuestoTrabajo("Prueba"));
		} 
		catch (Exception e) {
		}
	}
	
	@Test
	public void testEmpleadoCopia() {
		Empleado empleado = new Empleado(empleado1);
		assertNotSame(empleado, empleado1);
		assertEquals(empleado.getNombre(), empleado1.getNombre());
		assertEquals(empleado.getSueldo(), empleado1.getSueldo());	
		assertEquals(empleado.getEdad(), empleado1.getEdad());
		assertNotSame(empleado.getPuesto(), empleado1.getPuesto());
	}
	
	@Test
	public void testSetNombre() {
		try {
			empleado2.setNombre("Antonio Martinez Martinez");
			assertEquals(empleado2.getNombre(), "Antonio Martinez Martinez");
		} 
		catch (Exception e) {
		}
	}
	
	@Test
	public void testSetSueldo() {
		try {
			empleado2.setSueldo(50000);
			assertEquals(empleado2.getSueldo(), 50000);
		} 
		catch (Exception e) {
		}
	}
	
	@Test
	public void testSetEdad() {
		try {
			empleado2.setEdad(35);;
			assertEquals(empleado2.getEdad(), 35);
		} 
		catch (Exception e) {
		}
	}
	
	@Test
	public void testSetPuestoTrabajo() {
		try {
			empleado2.setPuesto(new PuestoTrabajo("Prueba"));
			assertEquals(empleado2.getPuesto(), new PuestoTrabajo("Prueba"));
		}
		catch (Exception e) {
		}

	}
	
	@Test
	public void testToString() {
		System.out.println(empleado1.toString());
		assertEquals(empleado1.toString(), "Empleado [nombre=Antonio Martinez Martinez, sueldo=50000.0, edad=35, puesto=PuestoTrabajo [nombrePuesto=Jornalero]]");
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
	
	@Test
	public void testSetNombreblanco() {
		try {
			empleado2.setNombre(" ");
			assertEquals(empleado2.getNombre(), " ");
			
		}
		catch (Exception e) {
		}
	}
	
	@Test
	public void testSetSueldoInferior() {
		try {
			empleado2.setSueldo(10);
			assertNotEquals(empleado2.getSueldo(), 10);
		} 
		catch (Exception e) {
		}
	}
	
	@Test
	public void testSetEdadInferior() {
		try {
			empleado2.setEdad(5);
			assertNotEquals(empleado2.getEdad(), 5);
		} 
		catch (Exception e) {
		}
	}
	
	@Test
	public void testSetEdadSuperior() {
		try {
			empleado2.setEdad(70);
			assertNotEquals(empleado2.getEdad(), 70);
		} 
		catch (Exception e) {
		}
	}
	
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
