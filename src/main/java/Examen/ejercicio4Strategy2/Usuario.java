package Examen.ejercicio4Strategy2;

public class Usuario {

	public Usuario(long ci, String nombre, String fecha, String profesion) {
		super();
		this.ci = ci;
		this.nombre = nombre;
		this.fecha = fecha;
		this.profesion = profesion;
	}

	long ci;
	String nombre;
	String fecha;
	String profesion;

	public long getCi() {
		return ci;
	}

	public void setCi(long ci) {
		this.ci = ci;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public void show() {

		System.out.println();
		System.out.println("CI:" + ci);
		System.out.println("Nombre: " + nombre);
		System.out.println("Fecha: " + fecha);
		System.out.println("Profesion: " + profesion);

	}

}
