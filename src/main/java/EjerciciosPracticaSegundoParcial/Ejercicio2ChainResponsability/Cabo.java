package EjerciciosPracticaSegundoParcial.Ejercicio2ChainResponsability;

public class Cabo implements IEjercito {
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
        if (handler.equals("Limpiezas")) {
            System.out.println("EL CABO REALIZA LA LIMPIEZA");
        } else {
            System.out.println("NO SE PUEDE PROCESAR LA ORDEN");
        }

    }
}
