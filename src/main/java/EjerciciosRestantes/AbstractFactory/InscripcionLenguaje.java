package EjerciciosRestantes.AbstractFactory;

public class InscripcionLenguaje implements IInscripcion {
    private String nombre;

    public InscripcionLenguaje() {

    }
    public InscripcionLenguaje(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void crear() {
        System.out.println("INSCRITO A CURSO DE "+nombre);
        System.out.println(" Estas inscrito a "+nombre+" :D ");
        System.out.println(" ");
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
