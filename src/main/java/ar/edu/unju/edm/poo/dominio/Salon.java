package ar.edu.unju.edm.poo.dominio;

import javax.persistence.Id;

public class Salon {
	private int capacidadMesas;
	@Id
	private int nroSalon;
	public int getCapacidadMesas() {
		return capacidadMesas;
	}

	public void setCapacidadMesas(int capacidadMesas) {
		this.capacidadMesas = capacidadMesas;
	}

	@Override
	public String toString() {
		return "Salon [capacidadMesas=" + capacidadMesas + ", nroSalon=" + nroSalon + "]";
	}



	public int getNroSalon() {
		return nroSalon;
	}

	public void setNroSalon(int nroSalon) {
		this.nroSalon = nroSalon;
	}
	
	

	public Salon(int capacidadMesas, int nroSalon) {
		super();
		this.capacidadMesas = capacidadMesas;
		this.nroSalon = nroSalon;
	}

	public Salon() {
		super();
		// TODO Auto-generated constructor stub
	}

}
