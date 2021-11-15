package ar.edu.unju.edm.poo.dominio;

public class Mozo {
	private long dni;

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Mozo [dni=" + dni + "]";
	}

	public Mozo(long dni) {
		super();
		this.dni = dni;
	}

	public Mozo() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
