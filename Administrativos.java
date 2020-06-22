package cl.jrios.ejercicio;

public class Administrativos extends Trabajador {

	private Integer salarioAdministrativo;
	private Integer aniosServicio;
	private Integer nivelCargo;
	
	public Administrativos(String nombre, int aniosServicio, int nivelCargo) {
		super(nombre);
		this.aniosServicio = aniosServicio;
		this.nivelCargo = nivelCargo;
	}

	@Override
	public Integer getSalarioMinimo() {
		return salarioAdministrativo;
	}
	
	@Override
	public Integer obtenerSalario() {
		salarioAdministrativo = super.getSalarioMinimo() * aniosServicio * nivelCargo;
		return salarioAdministrativo;
	}
	
	@Override
	public String toString() {
		return "Trabajador. " + " Nombre: " + getNombre() + ". Salario:" + obtenerSalario() + " Tipo: Administrativo";
	}
}
