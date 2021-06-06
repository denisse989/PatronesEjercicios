package ExamenA.ejercicio3A;

public class Television implements ArtefactoElectrico {

	private String costo = "100";

	public Television() {
	}

	@Override
	public void getCosto() {
		System.out.println("Televisor: " + costo + "$");
	}

}
