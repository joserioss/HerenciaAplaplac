package cl.jrios.ejercicio;

public class Trabajador {

	private Integer salarioMinimo = 320000;
	private String nombre;

	public Trabajador(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getSalarioMinimo() {
		return salarioMinimo;
	}

	@Override
	public String toString() {
		return "Trabajador: " + nombre + ".";
	}
	
	public Integer obtenerSalario() {
		return this.salarioMinimo;
    }
}
