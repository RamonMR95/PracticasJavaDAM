package autoevaluacion9.test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import autoevaluacion9.DatosException;
import autoevaluacion9.PruebasBasicas;
import autoevaluacion9.java.Datos;
import autoevaluacion9.java.Empresa;
import autoevaluacion9.java.Empresa.TipoEmpresa;

import org.junit.jupiter.api.Test;


/**
 * Organiza pruebas de JUnit5 para la clase Empresa y Datos en sus métodos 
 * realiza una prueba de las características y métodos de la clase Empresa.
 * @source EmpresaTest.java
 * @author Ramon Monino Rubio - 2019.06.06
 */

public class EmpresaTest implements PruebasBasicas {

	private static Datos datos;
	private static Empresa empresa1;


	@BeforeAll
	public static void crearObjetosPrueba() {
		datos = Datos.getInstance();
		empresa1 = new Empresa("E0", "Empresa", "B29778255", "666666555", TipoEmpresa.SERVICIOS);
	}

	@AfterAll
	public static void borrarObjetosPrueba() {
		datos.borrarTodos();
		empresa1 = null;

		try {
			Datos.cerrarConexiones();
		}
		catch (Exception e) {
		}
	}

    @Test
	public void testConstructorNormal() {
			empresa1 = new Empresa("E0", "Empresa", "B29778255", "666666555", TipoEmpresa.SERVICIOS);
			assertEquals(empresa1.getId(), "E0");
			assertEquals(empresa1.getNombreEmpresa(), "Empresa");
			assertEquals(empresa1.getCif(), "B29778255");
			assertEquals(empresa1.getTelefono(), "666666555");
			assertEquals(empresa1.getTipoEmpresa(), TipoEmpresa.SERVICIOS);
	}

    @Test
	public void testConstructorNormalIncorrectos() {
		Empresa empresa = null;
		try {
			empresa = new Empresa(
					" ",
					" ",
					" ",
					" ",
					null
			);
			fail("No debe de llegar aquí.");
		}
		catch (AssertionError e) {
		}
	}

    @Test
	public void testConstructorDefecto() {
			empresa1 = new Empresa();
			assertEquals(empresa1.getId(), "E0");
			assertEquals(empresa1.getNombreEmpresa(), "Empresa");
			assertEquals(empresa1.getCif(), "B29778370");
			assertEquals(empresa1.getTelefono(), "666666666");
			assertEquals(empresa1.getTipoEmpresa(), TipoEmpresa.SERVICIOS);
	}

    @Test
	public void testConstructorCopia() {
		Empresa empresaOtra = new Empresa(empresa1);
		assertNotSame(empresa1.getId(), empresaOtra.getId());
		assertNotSame(empresa1.getNombreEmpresa(), empresaOtra.getNombreEmpresa());
		assertNotSame(empresa1.getCif(), empresaOtra.getCif());
		assertNotSame(empresa1.getTelefono(), empresaOtra.getTelefono());
		assertSame(empresa1.getTipoEmpresa(), empresaOtra.getTipoEmpresa());
	}

    @Test
	public void testConstructorCopiaIncorrecto() {
			Empresa empresaOtra = null;
			try {
				empresa1 = new Empresa(empresaOtra);
				assertNull(empresa1);
				fail("No debe llegar Aqui. ...");
			} catch (AssertionError e) {
				e.printStackTrace();
			}
	}

    @Test
	public void testToString() {
		String stringEmpresa = "Id : " + "E0" + ", nombre : " + "Empresa" + ", "
				+ ", CIF: " + "B29778255" + ", telefono : " + "666666555"
				+ ", tipo de empresa : " + "SERVICIOS";

		assertEquals(stringEmpresa, empresa1.toString());
	}

    @Test
	public void testAltaDatos() {
		try {
			datos.alta(empresa1);
			assertNotNull(datos.obtener(empresa1.getId()));
		}
		catch (DatosException e) {
			e.printStackTrace();
		}

	}

    @Test
	public void testImportarDatos() {
		
	}

}
