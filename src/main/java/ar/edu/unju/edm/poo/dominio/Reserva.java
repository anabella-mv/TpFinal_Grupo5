package ar.edu.unju.edm.poo.dominio;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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

	
	@OneToMany
	@JoinColumn(name = "dni")
	private ClienteP clienteP;

	@OneToMany
	@JoinColumn(name = "cuit")
	private ClienteAT clienteA;

	@OneToMany
	@JoinColumn(name = "dni")
	private Mozo mozo;

	@ManyToOne
	@JoinColumn(name = "id")
	private Mesa mesa;

	public Reserva(long id, int capacidadComensales, LocalDate fecha, LocalDateTime hora, double total,
			ClienteP clienteP, ClienteAT clienteA, Mozo mozo, Mesa mesa) {
		super();
		this.id = id;
		this.capacidadComensales = capacidadComensales;
		this.fecha = fecha;
		this.hora = hora;
		this.total = total;
		this.clienteP = clienteP;
		this.clienteA = clienteA;
		this.mozo = mozo;
		this.mesa = mesa;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ClienteP getClienteP() {
		return clienteP;
	}

	public void setClienteP(ClienteP clienteP) {
		this.clienteP = clienteP;
	}

	public ClienteAT getClienteA() {
		return clienteA;
	}

	public void setClienteA(ClienteAT clienteA) {
		this.clienteA = clienteA;
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

	@Override
	public String toString() {
		return "Reserva [id=" + id + ", capacidadComensales=" + capacidadComensales + ", fecha=" + fecha + ", hora="
				+ hora + ", total=" + total + ", clienteP=" + clienteP + ", clienteA=" + clienteA + ", mozo=" + mozo
				+ ", mesa=" + mesa + "]";
	}

	public Reserva() {
		super();
		// TODO Auto-generated constructor stub
	}

}
