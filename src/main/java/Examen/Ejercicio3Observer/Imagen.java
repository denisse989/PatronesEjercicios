package Examen.Ejercicio3Observer;

public class Imagen {
    private String titulo;
    private String descripcion;


    public Imagen(String titulo,String descripcion){
        this.titulo=titulo;
        this.descripcion=descripcion;

    }

    public void info(){
        System.out.println("INFO > titulo: "+titulo);
        System.out.println("INFO > descripcion: "+descripcion);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
