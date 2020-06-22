package cl.jrios.ejercicio;

public class Directores extends Trabajador {
	
	private String departamento; 
	private Integer salarioDirector;
	
	public Directores(String nombre, String departamento) {
		super(nombre);
		this.departamento = departamento;
	}
		
	@Override
	public Integer getSalarioMinimo() {
		return salarioDirector;
	}

	@Override
	public Integer obtenerSalario() {
		salarioDirector = super.getSalarioMinimo() * 10;
		return salarioDirector;
	}

	@Override
	public String toString() {
		return "Trabajador. " + " Nombre: " + getNombre() + ". Salario:" + obtenerSalario() + " Tipo: Director, area: " + departamento;
	}
}
