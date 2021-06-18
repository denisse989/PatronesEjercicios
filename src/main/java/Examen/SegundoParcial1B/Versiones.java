package Examen.SegundoParcial1B;

import java.util.ArrayList;
import java.util.List;

public class Versiones {
	private List<EstadoArchivo> versiones = new ArrayList<>();

	public void addArchivo(EstadoArchivo estadoArchivo) {
		if (estadoArchivo.getArchivo().getContenido().split(" ").length >= 5) {
			versiones.add(estadoArchivo);
		} else {
			System.out.println("No suficientes palabras para crear una version");
		}
	}

	public EstadoArchivo getArchivo(int statePosition) {
		return versiones.get(statePosition);
	}
}
