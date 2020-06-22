package cl.jrios.ejercicio;

public class Desarrolladores extends Trabajador {

	private Integer hora;
	private Integer precioHora;
	private Integer salarioDesarrollador;
	
	public Desarrolladores(String nombre, int horas, int precioHora) {
		super(nombre);
		this.hora = horas;
		this.precioHora = precioHora;
	}
	
	@Override
	public Integer getSalarioMinimo() {
		return salarioDesarrollador;
	}

	@Override
	public Integer obtenerSalario() {
		salarioDesarrollador = super.getSalarioMinimo() + (hora * precioHora);
		return salarioDesarrollador;
	}
	
	@Override
	public String toString() {
		return "Trabajador. " + " Nombre: " + getNombre() + ". Salario:" + obtenerSalario() + " Tipo: Desarrollador";
	}
}
