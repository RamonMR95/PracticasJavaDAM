package autoevaluacion9.java;

import java.io.File;
import java.util.Calendar;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.config.EmbeddedConfiguration;

public class Conexion {

	private static ObjectContainer db;
	
	private Conexion() {
		init();
	}
	
	public static ObjectContainer getInstance() {
		if (db == null) {
			new Conexion();
		}
		return db;
	}

	/**
	 * Metodo que genera el fichero en el que se van a importar los objetos
	 */
	public void init() {
		new File("empresas").mkdirs();
		final String PATH = "." 
				+ File.separator + "empresas" + File.separator + "empresas.db4o";
		EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
		config.common().objectClass(Calendar.class).callConstructor(true);
		db = Db4oEmbedded.openFile(config, PATH);
	}

	/**
	 * Metodo que cierra las conexiones de la base de datos
	 * @throws Exception
	 */
	public static void cerrarConexiones() throws Exception {
		if (db != null) {
			db.close();
		}
		else {
			throw new Exception("db Already closed");
		}
	}
	
}
