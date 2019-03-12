package practica7;

class Sensor {
	private double valorActual;

	public double getValorActual() {
		return valorActual;
	}

} // Class Sensor

class Timbre {
	private boolean estado;

	public void activar() {
		this.estado = true;
	}
	
	public void desactivar() {
		this.estado = false;
	}
}

class Alarma {
	private double umbral;
	private Sensor sensor;
	private Timbre timbre;

	public Alarma(double umbral, Sensor sensor, Timbre timbre) {
		this.umbral = umbral;
		this.sensor = sensor;
		this.timbre = timbre;
	}
	
	public boolean comprobar() {
		if (sensor.getValorActual() > umbral) {
			timbre.activar();
			return true;
		}
		return false;
	}
} // Class Alarma

class Bombilla{
	
	private boolean isOn;
	
	public boolean getIsOn() {
		return isOn;
	}
	
	public void setIsOn(boolean isOn) {
		this.isOn = isOn;
	}
	
}
class AlarmaLuminosa extends Alarma{
	private Bombilla bombilla;
	
	public AlarmaLuminosa(double umbral, Sensor sensor, Timbre timbre) {
		super(umbral, sensor, timbre);
		bombilla = new Bombilla();
	}
	
	public boolean comprobar() {
		if (super.comprobar()) {
			this.bombilla.setIsOn(true);
			return true;
		}
		return false;
	}
}

public class PruebaAlarma {

}
