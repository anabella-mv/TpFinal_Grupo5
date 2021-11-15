package ar.edu.unju.edm.poo.dominio;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mozos")
public class Mozo {
	@Id
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
