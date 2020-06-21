package cl.jrios.ejercicio;

public class Desarrolladores extends Trabajador {

	int hora;
	int precioHora;
	
	public Desarrolladores(String nombre, int horas, int precioHora) {
		super(nombre, horas, precioHora);
		this.hora = horas;
		this.precioHora = precioHora;
	}

	@Override
	public int obtenerSalario() {
		super.setSalario(hora * precioHora);
		return getSalario();
	}
	
	@Override
	public String toString() {
		return "Trabajador" + " Nombre: " + getNombre() + " Salario:" + (getSalario()+super.sueldoBase) ;
	}
}
