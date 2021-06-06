package ExamenA.ejercicio3A;

public class Refrigerador implements ArtefactoElectrico {

	private String costo = "150";

	public Refrigerador() {
	}

	@Override
	public void getCosto() {
		System.out.println("Refrigerador: " + costo + "$");
	}

}
