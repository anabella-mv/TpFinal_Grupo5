package ar.edu.unju.edm.poo.dominio;

public class ClienteP {
	private long dni;

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "ClienteP [dni=" + dni + "]";
	}

	public ClienteP(long dni) {
		super();
		this.dni = dni;
	}

	public ClienteP() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
