package cl.jrios.ejercicio;

public class Desarrolladores extends Trabajador {

	int hora;
	int precioHora;
	
	public Desarrolladores(String nombre, int horas, int precioHora) {
		super(nombre);
		this.hora = horas;
		this.precioHora = precioHora;
	}

	@Override
	public int obtenerSalario() {
		int salarioMin = super.getSalarioMinimo();
		int salarioDesarrollador = salarioMin + (hora * precioHora);
		return salarioDesarrollador;
	}
	
	@Override
	public String toString() {
		return "Desarrollador ->" + " Nombre: " + getNombre() + ". Salario:" + obtenerSalario();
	}
}
