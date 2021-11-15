package ar.edu.unju.edm.poo.dominio;

public class ClienteAT {

	private long cuit;

	public long getCuit() {
		return cuit;
	}

	public void setCuit(long cuit) {
		this.cuit = cuit;
	}

	@Override
	public String toString() {
		return "ClienteAT [cuit=" + cuit + "]";
	}

	public ClienteAT(long cuit) {
		super();
		this.cuit = cuit;
	}

	public ClienteAT() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
