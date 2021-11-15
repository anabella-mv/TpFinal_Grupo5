package ar.edu.unju.edm.poo.dominio;

public class Persona {

	private String nombre;
	private String apellido;
	private String email;
	private long telefono;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono
				+ "]";
	}

	public Persona(String nombre, String apellido, String email, long telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
	}

	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

}
