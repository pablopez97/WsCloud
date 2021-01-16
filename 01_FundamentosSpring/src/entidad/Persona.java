package entidad;

//Muy importante, Spring es un contenedor de POJOs, por lo tanto
//tienen que tener esa estructura. Además tienen que seguir
//el convenio de JavaBean
public class Persona {
	private String nombre;
	private int edad;
	private double peso;
	
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
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + "]";
	}
	
	

}
