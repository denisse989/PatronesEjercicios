package TareaFactory;

public class Pasajero {
    private String nombre;
    private String ci;
    private String fechaNacimiento;

    public Pasajero(String nombre,String ci,String fechaNacimiento) {
        this.nombre = nombre;
        this.ci=ci;
        this.fechaNacimiento=fechaNacimiento;
    }

    public Pasajero() {
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }
    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void showInfo(){
        System.out.println("Nombre del Pasajero : "+nombre);
        System.out.println("CI del Pasajero : "+ci);
        System.out.println("Fecha de Nacimiento del Pasajero : "+fechaNacimiento);

    }
}
