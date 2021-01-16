package entidad;

public class Persona {
	
	private String nombre;
	private int edad;
	private String dni;

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", edad: " + edad + " y dni=" + dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	
}
