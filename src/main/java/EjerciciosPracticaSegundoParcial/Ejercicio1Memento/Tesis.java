package EjerciciosPracticaSegundoParcial.Ejercicio1Memento;

public class Tesis {
    private String titulo;
    private String fecha;
    private String estado;

    public Tesis(String fecha, String titulo, String estado) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.estado=estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void showInfo(){
        System.out.println("*** INFORMACION TESIS *** ");
        System.out.println("Titulo: "+titulo);
        System.out.println("Fecha: "+fecha);
        System.out.println("Estado: "+estado);
        System.out.println(" ");
    }
}
