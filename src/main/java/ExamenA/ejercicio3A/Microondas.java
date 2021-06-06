package ExamenA.ejercicio3A;

public class Microondas implements ArtefactoElectrico {

	private String costo = "80";

	public Microondas() {
	}

	@Override
	public void getCosto() {
		System.out.println("Microondas: " + costo + "$");
	}

}
