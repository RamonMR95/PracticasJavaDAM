package autoevaluacion8;

/** 
 *  Clase JUnit5 para tests de Proveedor según el enunciado del examen.
 *  @source: ProveedorTest.java
 *  @version: 1.4
 * 	@author Ramón Moñino Rubio - 01/04/2019
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProveedorTest {

	//Datos para las pruebas
	private static Proveedor proveedor1;
	private static Proveedor proveedor2;
	
	
	/**
	 * Método que se ejecuta una sola vez al principio del conjunto pruebas.
	 * @throws Exception 
	 */
	@BeforeAll
	public static void iniciarlizarDatosFijos() throws Exception {
		// Objetos no modicados en las pruebas.
		proveedor1 = new Proveedor("Pepe López Ruiz", "C/Luna 27, 30132 Murcia", 
				"+034 (968) 123 456", "pepe@gmsail.com", new GregorianCalendar());
	}
	
	/**
	 * Método que se ejecuta antes de cada @Test para preparar datos de prueba.
	 * @throws Exception 
	 */
	@BeforeEach
	public void creaProveedor() throws Exception { 	
		proveedor2 = new Proveedor();
	}

	/**
	 * Método que se ejecuta después de cada @Test para limpiar datos de prueba.
	 */
	@AfterAll	
	public static void borraProveedor() {
		proveedor2 = null;
	}

	/**
	 * Después de ejecutar el constructor convencional en el método @Before 
	 * debe haber un objeto construido no null.
	 */
	@Test
	public void testProveedorConvencional() {
		assertNotNull(proveedor1);
	}

	/**
	 * Después de ejecutar el constructor por defecto en el método @Before 
	 * debe haber un objeto construido no null.
	 */
	@Test
	public void testProveedorDefecto() {
		assertNotNull(proveedor2);
	}

	/**
	 * Después de ejecutar el constructor copia
	 * debe haber un objeto construido que no sea el mismo.
	 */
	@Test
	public void testProveedorCopia() {
		Proveedor p = new Proveedor(proveedor1);
		assertNotSame(p, proveedor1);
	}
	
	/**
	 * Una vez se tiene un objeto, creado en el método @BeforeClass, 
	 * debe coincidir: el valor del atributo con el valor esperado.
	 */
	@Test
	public void testGenerarIdProveedor() {
		assertEquals(proveedor1.getIdProveedor(), "PEP456");
	}
	
	/**
	 * Una vez se tiene un objeto, creado en el método @Before, 
	 * debe coincidir: el valor del atributo con el valor modificado.
	 * @throws Exception 
	 */
	@Test
	public void testSetFechaAlta() throws Exception {
		Calendar fec = new GregorianCalendar(2015, 4, 22);
		proveedor2.setFechaAlta((GregorianCalendar) fec);	
		assertSame(fec, proveedor2.getFechaAlta());
	}
	
	// Test CON DATOS NO VALIDOS
	/**
	 * Una vez se tiene un objeto, creado en el método @BeforeClas, 
	 * al intentar cambiar a un valor no válido, 
	 * debe fallar el aserto.
	 * @throws Exception 
	 */
	@Test
	public void testSetFechaAltaNull() throws Exception {
		try {
			proveedor1.setFechaAlta(null);
			fail("No debe llegar aquí...");
		} 
		catch (AssertionError e) {}
	}
	
	/**
	 * Una vez inicializado un objeto en el método @Before 
	 * debe obtenerse un texto como el esperado.
	 */
	@Test
	public void testToString() {
		assertNotNull(proveedor1.toString());
	}

} //class