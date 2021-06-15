package ExamenA.ejercicio3A;


public class Cliente {

	public static void main(String[] args) {

		FactoryArtefacto.make(FactoryArtefacto.Artefactos.Batidora).getCosto();

		FactoryArtefacto.make(FactoryArtefacto.Artefactos.Microondas).getCosto();

		FactoryArtefacto.make(FactoryArtefacto.Artefactos.Radio).getCosto();

		FactoryArtefacto.make(FactoryArtefacto.Artefactos.Refrigerador).getCosto();

		FactoryArtefacto.make(FactoryArtefacto.Artefactos.Television).getCosto();
	}

}
