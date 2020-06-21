package cl.jrios.ejercicio;

public class Directores extends Trabajador {
	
	String departamento; 

	public Directores(String nombre, String departamento) {
		super(nombre);
		this.departamento = departamento;
	}
	
	@Override
	public int obtenerSalario() {
		int salarioMin = super.getSalarioMinimo();
		int salarioDirector = salarioMin * 10;
		return salarioDirector;
	}

	@Override
	public String toString() {
		return "Director ->" + " Nombre: " + getNombre() + ". Salario:" + obtenerSalario();
	}
}
