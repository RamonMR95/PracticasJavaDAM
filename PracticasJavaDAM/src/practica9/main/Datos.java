package practica9.main;

import java.io.File;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.query.Query;

import practica9.DatosException;
import practica9.OperacionesDatos;

/**
 * La clase Datos representa el almacén de datos del programa
 * @source Datos.java
 * @author Ramon Monino Rubio - 2019.06.06
 */

public class Datos implements OperacionesDatos {

	private static ObjectContainer db;
	
	private Datos() {
		init();
	}
	
	public static ObjectContainer getInstance() {
		if (db == null) {
			 new Datos();
		}
		return db;
	}
	
	public void init() {
		EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
		db = Db4oEmbedded.openFile(config, ".fichero");

	}
	
	public Empresa obtener(String id) {
		Query consulta = db.query();
		consulta.constrain(Empresa.class);
		consulta.descend("id").constrain(id).equal();
		ObjectSet<Empresa> result = consulta.execute();
		
		if (result.size() > 0) {
			return result.get(0);
		}
		return null;
	}
	
	@Override
	public void alta(Object obj) throws DatosException {
		assert obj != null;
		Empresa empresa = (Empresa) obj;
		
		if (obtener(empresa.getId()) == null) {
			db.store(empresa);
		}
		else {
			throw new DatosException("Alta: " + empresa.getId() + " ya existe.");
		}
	}
	
	
	@Override
	public void importar(File fDatos) throws DatosException {
		
	}
	
}
