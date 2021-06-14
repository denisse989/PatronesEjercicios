package EjerciciosPracticaSegundoParcial.Ejercicio2ChainResponsability;

public class Teniente implements IEjercito {
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
        if (handler.equals("Disciplina")) {
            System.out.println("EL TENIENTE APLICA DISCIPLINA");
        } else {
            this.next.orden(handler);
        }

    }
}
