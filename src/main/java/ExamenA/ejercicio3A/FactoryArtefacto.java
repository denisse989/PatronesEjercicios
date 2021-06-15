package ExamenA.ejercicio3A;

public class FactoryArtefacto {

	enum Artefactos {
		Microondas, Batidora, Radio, Television, Refrigerador
	}

	public static ArtefactoElectrico make(Artefactos tipo) {
		ArtefactoElectrico artefacto;

		switch (tipo) {
		case Microondas: {
			artefacto = new Microondas();
			break;
		}
		case Batidora: {
			artefacto = new Batidora();
			break;
		}
		case Radio: {
			artefacto = new Radio();
			break;
		}
		case Television: {
			artefacto = new Television();
			break;
		}
		case Refrigerador: {
			artefacto = new Refrigerador();
			break;
		}
		default:
			artefacto = new Microondas();
			break;
		}

		return artefacto;
	}
}
