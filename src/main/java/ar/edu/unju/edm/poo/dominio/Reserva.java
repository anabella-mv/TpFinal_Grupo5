package ar.edu.unju.edm.poo.dominio;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reservas")
public class Reserva {
	@Id
	private long id;
	private int capacidadComensales;
	private LocalDate fecha;
	private LocalDateTime hora;
	private double total;

	@OneToOne
	private Persona cliente;

	@ManyToOne
	@JoinColumn(name = "dni")
	private Mozo mozo;

	@OneToMany
	@JoinColumn(name = "id")
	private Mesa mesa;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Mozo getMozo() {
		return mozo;
	}

	public void setMozo(Mozo mozo) {
		this.mozo = mozo;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public int getCapacidadComensales() {
		return capacidadComensales;
	}

	public void setCapacidadComensales(int capacidadComensales) {
		this.capacidadComensales = capacidadComensales;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalDateTime getHora() {
		return hora;
	}

	public void setHora(LocalDateTime hora) {
		this.hora = hora;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Persona getCliente() {
		return cliente;
	}

	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Reserva [id=" + id + ", capacidadComensales=" + capacidadComensales + ", fecha=" + fecha + ", hora="
				+ hora + ", total=" + total + ", cliente=" + cliente + ", mozo=" + mozo + ", mesa=" + mesa + "]";
	}

	public Reserva(long id, int capacidadComensales, LocalDate fecha, LocalDateTime hora, double total, Persona cliente,
			Mozo mozo, Mesa mesa) {
		super();
		this.id = id;
		this.capacidadComensales = capacidadComensales;
		this.fecha = fecha;
		this.hora = hora;
		this.total = total;
		this.cliente = cliente;
		this.mozo = mozo;
		this.mesa = mesa;
	}

	public Reserva() {
		super();
		// TODO Auto-generated constructor stub
	}

}
