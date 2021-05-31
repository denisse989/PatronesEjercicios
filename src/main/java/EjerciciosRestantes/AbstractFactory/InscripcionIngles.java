package EjerciciosRestantes.AbstractFactory;

public class InscripcionIngles implements IInscripcion {
    private String nombre;

    public InscripcionIngles() {

    }


    @Override
    public void crear() {
        System.out.println("INSCRITO A CURSO DE "+nombre);
        System.out.println(" Estas inscrito a "+nombre+" :D ");
        System.out.println(" ");
    }

    public InscripcionIngles(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
