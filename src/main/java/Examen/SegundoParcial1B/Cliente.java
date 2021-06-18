package Examen.SegundoParcial1B;

public class Cliente {
	public static void main(String[] args) {
		Versionador versionador = new Versionador();
		Versiones versiones = new Versiones();
		
		Archivo a = new Archivo("este documento es una prueba");
		
		versionador.setState(a);
		versiones.addArchivo(versionador.createVersion());
		
		a = new Archivo("el exito solo depende de tu esfuerzo");
		versionador.setState(a);
		versiones.addArchivo(versionador.createVersion());
		
		a = new Archivo("prologo");
		versionador.setState(a);
		versiones.addArchivo(versionador.createVersion());
		
		a = new Archivo("este documento fue actualizado satisfactoriamente");
		versionador.setState(a);
		versiones.addArchivo(versionador.createVersion());
		
		versionador.restoreVersion(versiones.getArchivo(0));
	}
}
