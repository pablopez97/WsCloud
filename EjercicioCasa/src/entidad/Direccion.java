package entidad;

public class Direccion {
	
	private String nombreVia;
	private String tipoVia;
	private String cp;
	

	@Override
	public String toString() {
		return "Nombre de la via:" + nombreVia + ", tipo de via: " + tipoVia + "codigo postal: " + cp;
	}

	public String getNombreVia() {
		return nombreVia;
	}

	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}

	public String getTipoVia() {
		return tipoVia;
	}

	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}
	
	
	
}