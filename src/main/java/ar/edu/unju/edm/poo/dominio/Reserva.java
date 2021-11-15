package ar.edu.unju.edm.poo.dominio;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Reserva {
	private long idCliente;
	private int capacidadComensales;
	private LocalDate fecha;
	private LocalDateTime hora;
	private double total;

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
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
		return "Reserva [idCliente=" + idCliente + ", capacidadComensales=" + capacidadComensales + ", fecha=" + fecha
				+ ", hora=" + hora + ", total=" + total + "]";
	}

	public Reserva(long idCliente, int capacidadComensales, LocalDate fecha, LocalDateTime hora, double total) {
		super();
		this.idCliente = idCliente;
		this.capacidadComensales = capacidadComensales;
		this.fecha = fecha;
		this.hora = hora;
		this.total = total;
	}

	public Reserva() {
		super();
		// TODO Auto-generated constructor stub
	}

}
