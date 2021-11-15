package ar.edu.unju.edm.poo.dominio;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "mesas")
public class Mesa {

	private int capacidadPersonas;
	private int id;
	private String estado;
	private LocalDate reserva;
	@OneToMany
	@JoinColumn(name = "nroSalon")
	private Salon salon;

	public int getCapacidadPersonas() {
		return capacidadPersonas;
	}

	public void setCapacidadPersonas(int capacidadPersonas) {
		this.capacidadPersonas = capacidadPersonas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public LocalDate getReserva() {
		return reserva;
	}

	public void setReserva(LocalDate reserva) {
		this.reserva = reserva;
	}

	@Override
	public String toString() {
		return "Mesa [capacidadPersonas=" + capacidadPersonas + ", id=" + id + ", estado=" + estado + ", reserva="
				+ reserva + "]";
	}

	public Mesa(int capacidadPersonas, int id, String estado, LocalDate reserva) {
		super();
		this.capacidadPersonas = capacidadPersonas;
		this.id = id;
		this.estado = estado;
		this.reserva = reserva;
	}

	public Mesa() {
		super();
		// TODO Auto-generated constructor stub
	}

}
