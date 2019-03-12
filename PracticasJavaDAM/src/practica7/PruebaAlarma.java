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

	
	public void comprobar() {
		
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
	
	public AlarmaLuminosa() {
		super();
		bombilla = new Bombilla();
		
	}
}

public class PruebaAlarma {

}
