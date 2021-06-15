package Examen.Ejercicio2Chain;

public class ChatDeComunicacion implements IChat{
    private IChat next;

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

        Estudiante estudiante=new Estudiante(54351, " Andres ");
        this.setNext(estudiante);

        Docente docente=new Docente(" 654654165 "," Juan ");
        estudiante.setNext(docente);

        Administrativo administrativo=new Administrativo(" Carlos ", " Jefe de carrera ");
        docente.setNext(administrativo);

        this.next.mensaje(mensaje);


    }
}
