package autoevaluacion9.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;

import autoevaluacion9.DatosException;
import autoevaluacion9.OperacionesDatos;

/**
 * La clase Datos representa el almacén de datos del programa
 * @source Datos.java
 * @author Ramon Monino Rubio - 2019.06.06
 */

public class Datos implements OperacionesDatos {

	private static Datos instance;
	private ObjectContainer db;

	private Datos() {
		init();
	}
	
	public static Datos getInstance() {
		if (instance == null) {
			 instance = new Datos();
		}
		return instance;
	}

	/**
	 * Metodo que inicializa db usando el singletón de conexion
	 */
	public void init() {
		db = Conexion.getInstance();

	}

	/**
	 * Metodo que obtiene una empresa de la base de datos dado su id
	 * @param id - Id de empresa
	 * @return Empresa - Empresa a buscar o null si no la encuentra
	 */
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

	/**
	 * Metodo que da de  alta una empresa en la base de datos
	 * @param obj - Empresa a almacenar.
	 * @throws DatosException - Si la empresa ya se encontraba en la base de datos
	 */
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

	/**
	 * Metodo que da de basa una empresa de la base de datos
	 * @param empresa - Empresa a dar de baja
	 * @throws DatosException - Si el mundo a dar de baja no existe
	 */
	public void baja(Empresa empresa) throws DatosException {
		assert empresa != null;
		
		if (obtener(empresa.getId()) == null) {
			db.delete(empresa);
		}
		else {
			throw new DatosException("El mundo a dar de baja no existe");
		}
		
	}

	/**
	 * Metodo que obtiene todos los registros de la base de datos
	 * @return - Lista con los registros de db
	 */
	public List<Empresa> obtenerTodos(){
		Query consulta = db.query();
		consulta.constrain(Empresa.class);
		return consulta.execute();
	}


	/**
	 * Metodo que borra todas las empresas de la base de datos
	 */
	public void borrarTodos() {
		for(Empresa empresa : obtenerTodos()) {
			db.delete(empresa);
		}
	}

	/**
	 * Metodo que importa objectos desde fichero empresas
	 * @param fDatos - Fichero con los datos a importar.
	 * @throws DatosException
	 */
	@Override
	public void importar(File fDatos) throws DatosException {
		if (fDatos.exists()) {
			FileInputStream fis;
			try {
				fis = new FileInputStream(fDatos);
				ObjectInputStream ois = new ObjectInputStream(fis);
				db.store(ois.readObject());
				ois.close();
				
			} 
			catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	/**
	 * Metodo que cierra las conexiones de la base de datos
	 * @throws Exception
	 */
	public static void cerrarConexiones() throws Exception {
		Conexion.cerrarConexiones();
	}
	
	
}
