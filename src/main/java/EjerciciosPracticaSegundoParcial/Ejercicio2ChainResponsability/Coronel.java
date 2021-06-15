package EjerciciosPracticaSegundoParcial.Ejercicio2ChainResponsability;

public class Coronel implements IEjercito {
    private IEjercito next;

    @Override
    public void setNext(IEjercito iejercito) {
        this.next = iejercito;

    }

    @Override
    public IEjercito next() {
        return next;
    }

    @Override
    public void orden(String handler) {
        if (handler.equals("Entrevistas")) {
            System.out.println("EL GENERAL REALIZA ENTREVISTAS");
        } else {
            this.next.orden(handler);
        }

    }
}
