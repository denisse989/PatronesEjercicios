package Examen.Ejercicio2Chain;

public class Estudiante implements IChat{
    private IChat next;
    private int numeroMatricula;
    private String nombre;


    public Estudiante(int numeroMatricula, String nombre){
        this.numeroMatricula=numeroMatricula;
        this.nombre=nombre;
    }
    @Override
    public void setNext(IChat ichat) {
        this.next=ichat;
    }

    @Override
    public IChat next() {
        return next;
    }

    @Override
    public void mensaje(String mensaje) {

        if (mensaje.equals("A todos")) {
            System.out.println(nombre + numeroMatricula +" esta mandando su mensaje a todos");
        } else if (mensaje.equals("Solo docentes")) {
            System.out.println(nombre + numeroMatricula +" esta mandando el mensaje solo al docente");
        } else if (mensaje.equals("Solo Administrativos")) {
            System.out.println(nombre + numeroMatricula +" el mensaje es solo para los administrativos");
        }else{
            this.next.mensaje(mensaje);
        }

    }
}