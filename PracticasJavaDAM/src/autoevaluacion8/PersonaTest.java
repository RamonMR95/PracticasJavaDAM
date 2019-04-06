package autoevaluacion8;

/** 
 *  Clase JUnit5 para tets de Persona según el enunciado del examen.
 *  @source: PersonaTest.java
 *  @version: 1.4
 *  @author: ajp
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.GregorianCalendar;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTest {

	//Datos para las pruebas
	private static Persona persona1;
	private static Persona persona2;
	
	/**
	 * Método que se ejecuta una sola vez al principio del conjunto pruebas.
	 * @throws Exception 
	 */
	@BeforeAll
	public static void iniciarlizarDatosFijos() throws Exception {
		// Objetos no modicados en las pruebas.
			persona1 = new Proveedor("Pepe López Ruiz", "C/Luna 27, 30132 Murcia", 
					"+034 (968) 123 456", "pepe@gmail.com", new GregorianCalendar());
	}
	
	/**
	 * Método que se ejecuta antes de cada @Test para preparar datos de prueba.
	 * @throws Exception 
	 */
	@BeforeEach 
	public void creaProveedor() throws Exception {	
		persona2 = new Proveedor();
	}

	/**
	 * Método que se ejecuta después de cada @Test para limpiar datos de prueba.
	 */
	@AfterAll	
	public static void borraProveedor() {
		persona2 = null;
	}

	/**
	 * Una vez se tiene un objeto, 
	 * debe coincidir: el valor del atributo con el valor modificado.
	 */
	@Test
	public void testSetNombre() {
		persona2.setNombre("Pepe López Ruiz");
		assertEquals(persona2.getNombre(), "Pepe López Ruiz");
	}
	
	/**
	 * Una vez se tiene un objeto, 
	 * debe coincidir: el valor del atributo con el valor modificado.
	 */
	@Test
	public void testSetDireccion() {
		persona2.setDireccion("C/Luna 27, 30132 Murcia");	
		assertEquals(persona2.getDireccion(), "C/Luna 27, 30132 Murcia");
	}
	
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * debe coincidir: el valor del atributo con el valor modificado.
	 */
	@Test
	public void testSetTelefono() {
		persona2.setTelefono("+034 (968) 123 456");
		assertEquals(persona2.getTelefono(), "+034 (968) 123 456");
	}
	
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * debe coincidir: el valor del atributo con el valor modificado.
	 */
	@Test
	public void testSetCorreo() {
		persona2.setCorreo("pepe@gmail.com");	
		assertEquals(persona2.getCorreo(), "pepe@gmail.com");
	}
	
	/**
	 * Una vez inicializado un objeto en el método @Before 
	 * debe obtenerse un texto como el esperado.
	 */
	@Test
	public void testToString() {
		assertNotNull(persona1.toString());
	}

	// Test CON DATOS NO VALIDOS
	/**
	 * Una vez se tiene un objeto, 
	 * al intentar cambiar a un valor no válido, 
	 * debe coincidir: el valor del atributo con el valor por defecto.
	 */
	@Test
	public void testSetNombreNull() {
		try {
			persona2.setNombre(null);
			fail("No debe llegar aquí...");
		} 
		catch (AssertionError e) { 
		}
	}
	
	/**
	 * Una vez se tiene un objeto, 
	 * al intentar cambiar a un valor no válido, 
	 * debe coincidir: el valor del atributo con el valor por defecto.
	 */
	@Test
	public void testSetDireccionNull() {
		try {
			persona2.setDireccion(null);
			fail("No debe llegar aquí...");
		} 
		catch (AssertionError e) { 
		}
	}
	
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * al intentar cambiar a un valor no válido, 
	 * debe coincidir: el valor del atributo con el valor por defecto.
	 */
	@Test
	public void testSetTelefonoNull() {
		try {
			persona2.setTelefono(null);
			fail("No debe llegar aquí...");
		} 
		catch (AssertionError e) { 
		}
	}
	
	
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * al intentar cambiar a un valor no válido, 
	 * debe coincidir: el valor del atributo con el valor por defecto.
	 */
	@Test
	public void testSetCorreoNull() {
		try {
			persona2.setCorreo(null);
			fail("No debe llegar aquí...");
		} 
		catch (AssertionError e) { 
		}
	}
	
} //class