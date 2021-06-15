package TareaMemento;

public class Persona {
    private String nombre;
    private String ci;
    private String edad;

    public Persona(String nombre, String ci, String edad) {
        this.nombre = nombre;
        this.ci = ci;
        this.edad = edad;
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

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    public void info(){
        System.out.println("****");
        System.out.println("INFO > Nombre: "+nombre);
        System.out.println("INFO > CI: "+ci);
        System.out.println("INFO > Edad: "+edad);
        System.out.println(" ");
    }
}
