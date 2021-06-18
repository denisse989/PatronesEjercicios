package Examen.SegundoParcial1A;

public class Cliente {
	public static void main(String[] args) {
		GuardarCambio guardarCambio = new GuardarCambio();
		Cambios cambios = new Cambios();
		
		Documento d = new Documento("1 version", "aaaaaa");
		
		guardarCambio.setState(d);
		cambios.guardar(guardarCambio.createEstado());
		
		d= new Documento("2 version", "bbbbbb");
		guardarCambio.setState(d);
		cambios.guardar(guardarCambio.createEstado());
		
		d= new Documento("3 version", "cccccc");
		guardarCambio.setState(d);
		cambios.guardar(guardarCambio.createEstado());
		
		d= new Documento("4 version", "dddddd");
		guardarCambio.setState(d);
		cambios.guardar(guardarCambio.createEstado());
		
		
		guardarCambio.restoreEstado(cambios.getRevertir());
		guardarCambio.restoreEstado(cambios.getRevertir());
		guardarCambio.restoreEstado(cambios.getRevertir());
		
		guardarCambio.restoreEstado(cambios.getDeshacer());
		guardarCambio.restoreEstado(cambios.getDeshacer());
		guardarCambio.restoreEstado(cambios.getDeshacer());



		
	}
}
