package ar.edu.unju.edm.poo.dominio;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="clientesAgencia")
@DiscriminatorValue(value="Agencia")
public class ClienteAT extends Persona   {

	private static final long serialVersionUID = 1L;
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

	public ClienteAT(String nombre, String apellido, String email, long telefono, long cuit) {
		super(nombre, apellido, email, telefono);
		this.cuit = cuit;
	}

	public ClienteAT() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClienteAT(String nombre, String apellido, String email, long telefono) {
		super(nombre, apellido, email, telefono);
		// TODO Auto-generated constructor stub
	}

	
	
	
}
