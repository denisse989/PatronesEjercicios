package Examen.Ejercicio2Chain;

public class Docente implements IChat {
    private IChat next;
    private String ci;
    private String nombre;


    public Docente(String nombre, String ci) {
        this.nombre=nombre;
        this.ci=ci;
    }


    @Override
    public void setNext(IChat ichat) {
        this.next = ichat;
    }

    @Override
    public IChat next() {
        return next;
    }

    @Override
    public void mensaje(String mensaje) {

        if (mensaje.equals("Solo a docentes y estudiantes")) {
            System.out.println(ci + nombre + " envia mensajes a los demas docentes y alumnos");
        } else {
            this.next.mensaje(mensaje);
        }


    }

}
