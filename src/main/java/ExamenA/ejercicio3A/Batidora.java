package ExamenA.ejercicio3A;

public class Batidora implements ArtefactoElectrico {

	private String costo = "90";

	public Batidora() {
	}

	@Override
	public void getCosto() {
		System.out.println("Batidora: " + costo + "$");
	}

}
