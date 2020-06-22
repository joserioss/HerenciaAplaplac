package cl.jrios.ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjercicioAplaplac {

	public static void main(String[] args) {
		List<Trabajador> trabajadores = new ArrayList<Trabajador>();
		trabajadores = constructorTrabajadores();
		
		System.out.println("Bienvenido al sistema. \nIngrese una opcion \n");
		System.out.println("1: Ordenar por salario");
		System.out.println("2: Ordenar por nombre");
		
		Scanner sc = new Scanner(System.in);
		
		switch(sc.nextInt()) {
		case 1:
			trabajadores.stream()
			.sorted((p1, p2)->p1.getSalarioMinimo().compareTo(p2.getSalarioMinimo())) 
	        .forEach(System.out::println); 
			break;
		case 2:
			trabajadores.stream()
			.sorted((o1,o2) -> o1.getNombre().compareTo(o2.getNombre()))
			.forEach(trab -> System.out.println(trab));
			break;
		default:
			System.out.println("Opcion invalida");
		}		
	}
	
	public static List<Trabajador> constructorTrabajadores() {
		List<Trabajador> lista = new ArrayList<Trabajador>();
		lista.add(new Desarrolladores("Maria", 20, 56000));
		lista.add(new Administrativos("Antonio", 7, 2));
		lista.add(new Directores("Luis", "tecnologias de la informacion"));
		return lista;
	}
}