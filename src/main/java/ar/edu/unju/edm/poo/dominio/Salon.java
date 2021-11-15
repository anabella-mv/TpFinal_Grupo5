package ar.edu.unju.edm.poo.dominio;

public class Salon {
	private int capacidadMesas;

	public int getCapacidadMesas() {
		return capacidadMesas;
	}

	public void setCapacidadMesas(int capacidadMesas) {
		this.capacidadMesas = capacidadMesas;
	}

	@Override
	public String toString() {
		return "Salon [capacidadMesas=" + capacidadMesas + "]";
	}

	public Salon(int capacidadMesas) {
		super();
		this.capacidadMesas = capacidadMesas;
	}

	public Salon() {
		super();
		// TODO Auto-generated constructor stub
	}

}
