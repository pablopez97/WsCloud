package entidad;

import java.util.ArrayList;

public class Casa {

	private Persona persona;
	private Direccion direccion;
	private double precio;
	private ArrayList<Habitacion> listaHabitaciones;
	private ArrayList<Persona> listaPersonas;

	@Override
	public String toString() {
		return "Datos de esta casa:\n" + " Direccion:\n\n" + direccion + "\n Precio de la casa: " + precio + "\n Datos de la habitaciones: "
				+ listaHabitaciones + "\n Datos de las personas que viven en esta casa: " + listaPersonas;
	}
	
	public double m2totales() {
		
		double m2t=0;
		
		for (int i = 0; i< listaHabitaciones.size(); i++) {
			
			m2t= m2t + listaHabitaciones.get(i).getM2();
			
		}
		
		return m2t;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public ArrayList<Habitacion> getListaHabitaciones() {
		return listaHabitaciones;
	}

	public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
		this.listaHabitaciones = listaHabitaciones;
	}

	public ArrayList<Persona> getListaPersonas() {
		return listaPersonas;
	}

	public void setListaPersonas(ArrayList<Persona> listaPersonas) {
		this.listaPersonas = listaPersonas;
	}

	
}
