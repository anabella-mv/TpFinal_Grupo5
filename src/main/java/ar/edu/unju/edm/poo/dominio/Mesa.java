package ar.edu.unju.edm.poo.dominio;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mesas")
public class Mesa {

	
	@Id
	private int id;
	private int capacidadPersonas;
	private String estado;
	private LocalDate reservaFecha;
	
	//private Salon salon1;

	
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

	public LocalDate getReservaFecha() {
		return reservaFecha;
	}

	public void setReservaFecha(LocalDate reservaFecha) {
		this.reservaFecha = reservaFecha;
	}

	@Override
	public String toString() {
		return "Mesa [capacidadPersonas=" + capacidadPersonas + ", id=" + id + ", estado=" + estado + ", reservaFecha="
				+ reservaFecha + "]";
	}

	public Mesa(int capacidadPersonas, int id, String estado, LocalDate reservaFecha) {
		super();
		this.capacidadPersonas = capacidadPersonas;
		this.id = id;
		this.estado = estado;
		this.reservaFecha = reservaFecha;
	}

	public Mesa() {
		super();
		// TODO Auto-generated constructor stub
	}

}
