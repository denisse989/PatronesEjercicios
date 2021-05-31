package EjerciciosRestantes.AbstractFactory;

public class InscripcionMatematicas implements IInscripcion {
    private String nombre;

    public InscripcionMatematicas() {

    }
    public InscripcionMatematicas(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public void crear() {
        System.out.println("INSCRIPCION A CURSO DE "+nombre);
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
