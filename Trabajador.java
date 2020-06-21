package cl.jrios.ejercicio;

public class Trabajador {

	private int salario;
	private String nombre;	
	protected int sueldoBase = 320500;

	
	public Trabajador() {
		super();
	}

	public Trabajador(String nombre, int horas, int precioHora) {
		this.nombre = nombre;
	}

	public Trabajador(int salario, String nombre) {
		super();
		this.salario = salario;
		this.nombre = nombre;
	}



	public int getSalario() {
		return salario;
	}


	public void setSalario(int salario) {
		this.salario = salario;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Trabajador" + " Nombre: " + nombre + " Salario:" + (getSalario()+sueldoBase) ;
	}

	
	public int obtenerSalario() {
		return salario;
	}
}
