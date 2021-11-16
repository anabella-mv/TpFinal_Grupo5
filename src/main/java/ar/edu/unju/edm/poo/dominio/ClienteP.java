package ar.edu.unju.edm.poo.dominio;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;



@Entity
@DiscriminatorValue(value="Particular")
public class ClienteP extends Persona  {

	private static final long serialVersionUID = 1L;
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

	public ClienteP(String nombre, String apellido, String email, long telefono, long dni) {
		super(nombre, apellido, email, telefono);
		this.dni = dni;
	}

	public ClienteP() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClienteP(String nombre, String apellido, String email, long telefono) {
		super(nombre, apellido, email, telefono);
		// TODO Auto-generated constructor stub
	}

	
	

}
