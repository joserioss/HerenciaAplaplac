package cl.jrios.ejercicio;

public class EjercicioAplaplac {

	public static void main(String[] args) {
		Trabajador trabajador1 = new Trabajador("José");
		System.out.println(trabajador1);
		Desarrolladores trabajador2 = new Desarrolladores("Maria", 20, 56000);
		System.out.println(trabajador2);
		Administrativos trabajador3 = new Administrativos("Antonio", 7, 2);
		System.out.println(trabajador3);
		Directores trabajador4 = new Directores("Luis", "tecnologias de la informacion");
		System.out.println(trabajador4);
	}
}