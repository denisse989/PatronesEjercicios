package Examen.Ejercicio4Strategy;

public class Usuarios  {
    private int ci;
    private String nombre;
    private int fechaNacimiento;
    private String profesion;

    public Usuarios(int ci, String nombre, int fechaNacimiento, String profesion) {
        this.ci = ci;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.profesion = profesion;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void showInfo() {
        System.out.println(" ");
        System.out.println("*** INFORMACION USUARIO ***");
        System.out.println("Nombre: " + nombre);
        System.out.println("CI: " + ci);
        System.out.println("Fecha Nacimiento: " + fechaNacimiento);
        System.out.println("Profesion: " + profesion);
        System.out.println(" ");
    }

}
