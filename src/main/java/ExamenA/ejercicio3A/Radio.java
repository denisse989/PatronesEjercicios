package ExamenA.ejercicio3A;

public class Radio implements ArtefactoElectrico {

	private String costo = "50";

	public Radio() {
	}

	@Override
	public void getCosto() {
		System.out.println("Radio: " + costo + "$");
	}

}
