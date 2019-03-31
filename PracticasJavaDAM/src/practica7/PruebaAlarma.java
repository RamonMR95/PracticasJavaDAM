package practica7;
/**
 * Ejercicio 4 y 5 Verdes
 * Programa que crea una clase llamada Alarma cuyos métodos activen un objeto de tipo 
 * Timbre cuando el valor medido por un Sensor supere un umbral preestablecido
 * @source PruebaAlarma.java
 * @author Ramon Monino Rubio - 2019.03.12
 */
class Sensor {
	private double valorActual; // Valor que percibe el sensor

	/**
	 * Constructor convencional de la clase Sensor
	 * @param valorActual - Valor que percibe el sensor
	 */
	public Sensor(double valorActual) {
		this.valorActual = valorActual;
	}
	
	/**
	 * Metodo get que obtiene el valor que percibe el sensor
	 * @return valorActual - Valor que percibe el sensor
	 */
	public double getValorActual() {
		return valorActual;
	}
	
	/**
	 * Metodo set que establece el valor que percibe el sensor
	 * @param valorActual - Valor que percibe el sensor
	 */
	public void setSensorValorActual(double valorActual) {
		this.valorActual = valorActual;
	}

} // Class Sensor


class Timbre {
	private boolean estado; // Variable binaria que contiene el estado en el que se encuentra el timbre

	/**
	 * Constructor por defecto de la clase timbre que inicializa éste a apagado
	 */
	public Timbre() {
		this.estado = false;
	}
	
	/**
	 * Metodo get que obtiene el estado en el que se encuentra el timbre
	 * @return estado - Estado del timbre (apagado/encendido)/(false/true)
	 */
	public boolean getTimbre() {
		return estado;
	}
	
	/**
	 * Metodo que establece el estado a true, es decir, enciende el timbre
	 */
	public void activar() {
		this.estado = true;
	}
	
	/**
	 * Metodo que establece el estado a false, es decir, se apaga el timbre
	 */
	public void desactivar() {
		this.estado = false;
	}
} // Class Timbre


class Alarma {
	/* Atributos de la clase Alarma */
	private double umbral;
	private Sensor sensor;
	private Timbre timbre;
	
	/**
	 * Constructor convencional de la clase Alarma
	 * @param umbral - Umbral mínimo de deteccion de la alarma
	 * @param sensor - Sensor encargado de detecciones
	 * @param timbre - Timbre de la alarma
	 */
	public Alarma(double umbral, Sensor sensor, Timbre timbre) {
		this.umbral = umbral;
		this.sensor = sensor;
		this.timbre = timbre;
	}
	
	/**
	 * Metodo get que obtiene el umbral minimo frente al obtenido por el sensor
	 * @return umbral - umbral minimo de deteccion
	 */
	public double getUmbral() {
		return umbral;
	}

	/**
	 * Metodo que obtiene el sensor de la alarma
	 * @return sensor - Sensor de la alarma
	 */
	public Sensor getSensor() {
		return sensor;
	}

	/**
	 * Metodo que obtiene el timbre de la alarma
	 * @return timbre - Timbre de la alarma
	 */
	public Timbre getTimbre() {
		return timbre;
	}

	/**
	 * Metodo que comprueba si se debe activar la alarma o no
	 * @return true - si el valor del sensor es mayor que el valor del umbral de la alarma
	 */
	public boolean comprobar() {
		if (sensor.getValorActual() > umbral) {
			timbre.activar();
			return true;
		}
		return false;
	}
	
	/**
	 * Metodo toString de la clase Alarma que imprime sus atributos
	 * @return toString - Valores de los atributos de la instancia actual
	 */
	public String toString() {
		return "Umbral : " + umbral + ", sensor : " + sensor.getValorActual() + ", timbre : " + timbre.getTimbre();
		
	}
	
} // Class Alarma


class Bombilla {
	
	private boolean isOn; // Variable que define si la bombilla está encendida o apagada
	
	/**
	 * Metodo get que obtiene el estado en el que se encuentra la bombilla
	 * @return isOn - Estado de la bombilla
	 */
	public boolean getIsOn() {
		return isOn;
	}
	
	/**
	 * Metodo que establece el estado de la bombilla
	 * @param isOn - Estado de la bombilla
	 */
	public void setIsOn(boolean isOn) {
		this.isOn = isOn;
	}
	
} // Class Bombilla


class AlarmaLuminosa extends Alarma{
	private Bombilla bombilla; 
	
	/**
	 * Constructor convencional de la clase AlarmaLuminosa
	 * @param umbral - umbral minimo de deteccion de la alarma
	 * @param sensor - Sensor de la alarma
	 * @param timbre - Timbre de la alarma
	 */
	public AlarmaLuminosa(double umbral, Sensor sensor, Timbre timbre) {
		super(umbral, sensor, timbre);
		bombilla = new Bombilla();
	}
	
	/**
	 * Metodo que comprueba si se tienen que activar la bombilla y el timbre 
	 * utilizando el metodo de comprobación de la clase padre y añadiendo el caso de la bombilla
	 * @return true - Si el sensor detecta un valor superior al del umbral
	 */
	@Override
	public boolean comprobar() {
		if (super.comprobar()) {
			this.bombilla.setIsOn(true);
			return true;
		}
		return false;
	}
	
	/**
	 * Metodo toString de la clase AlarmaLuminosa que incluye el de la clase padre + la definición del estado de la bombilla
	 * @return toString - Valores de los atributos de la instancia actual
	 */
	@Override
	public String toString() {
		return super.toString() + ", bombilla : " + bombilla.getIsOn();
	}
} // Class AlarmaLuminosa


public class PruebaAlarma {

	public static void main(String[] args) {
		/* Caso en el que la alarma se activa encendiendo el timbre */
		Alarma alarmaON = new Alarma(50, new Sensor(51), new Timbre());
		alarmaON.comprobar();
		System.out.println(alarmaON);
		
		/* Caso en el que la alarma no se activa dejando apagado el timbre */
		Alarma alarmaOFF = new Alarma(50, new Sensor(51), new Timbre());
		alarmaOFF.comprobar();
		System.out.println(alarmaOFF);
		
		/* Caso en el que la alarmaluminosa se activa encendiendo el timbre y la bombilla */
		Alarma alarmaLuminosaON = new AlarmaLuminosa(50, new Sensor(51), new Timbre());
		alarmaLuminosaON.comprobar();
		System.out.println(alarmaLuminosaON);
		
		/* Caso en el que la alarma no se activa dejando el timbre y la bombilla apagados */
		Alarma alarmaLuminosaOFF = new AlarmaLuminosa(49, new Sensor(51), new Timbre());
		alarmaLuminosaOFF.comprobar();
		System.out.println(alarmaLuminosaOFF);
	}
}
