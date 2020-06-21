package cl.jrios.ejercicio;

public class EjercicioAplaplac {

	public static void main(String[] args) {
		Desarrolladores fullStack = new Desarrolladores("Maria", 20, 56000);
		System.out.println(fullStack);
		System.out.println(fullStack.obtenerSalario());
	}
}