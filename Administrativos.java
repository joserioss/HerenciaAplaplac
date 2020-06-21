package cl.jrios.ejercicio;

public class Administrativos extends Trabajador {

	int aniosServicio;
	int nivelCargo;
	
	public Administrativos(String nombre, int aniosServicio, int nivelCargo) {
		super(nombre);
		this.aniosServicio = aniosServicio;
		this.nivelCargo = nivelCargo;
	}

	@Override
	public int obtenerSalario() {
		int salarioMin = super.getSalarioMinimo();
		int salarioAdministrativo = salarioMin * aniosServicio * nivelCargo;
		return salarioAdministrativo;
	}
	
	@Override
	public String toString() {
		return "Administrativo ->" + " Nombre: " + getNombre() + ". Salario:" + obtenerSalario();
	}
}
