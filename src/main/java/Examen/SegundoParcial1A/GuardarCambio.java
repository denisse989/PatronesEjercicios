package Examen.SegundoParcial1A;

public class GuardarCambio {
	private Documento estado;

	public void setState(Documento estado) {
		System.out.println("**** Set State *****");
		estado.mostrarInfo();
		this.estado = estado;
	}

	public EstadoDocumento createEstado() {
		System.out.println("**** Create State *****");
		estado.mostrarInfo();
		return new EstadoDocumento(this.estado);
	}

	public void restoreEstado(EstadoDocumento estadoDocumento) {
		this.estado = estadoDocumento.getEstado();
		System.out.println("**** State Restored *****");
		this.estado.mostrarInfo();

	}
	
	

}
