package EjerciciosPracticaSegundoParcial.Ejercicio2ChainResponsability;

public class General implements IEjercito {
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
        if (handler.equals("Desbloqueos")) {
            System.out.println("EL CORONEL VA A DESBLOQUEAR");
        } else if (handler.equals("Manifestaciones")) {
            System.out.println("EL CORONEL VA A TERMINAR MANIFESTACIONES");
        } else {
            this.next.orden(handler);
        }

    }
}
