package entidad;

public class Habitacion {
	
	private double m2;
	private String tipoHabitacion;
	
	public Habitacion(double m2, String tipoHabitacion) {
		super();
		this.m2 = m2;
		this.tipoHabitacion = tipoHabitacion;
	}

	
	
	public double getM2() {
		return m2;
	}



	@Override
	public String toString() {
		return "Habitacion con " + m2 + " m2 es : " + tipoHabitacion;
	}



	public String getTipoHabitacion() {
		return tipoHabitacion;
	}



	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}



	public void setM2(double m2) {
		this.m2 = m2;
	}
	
	
	
	
}

