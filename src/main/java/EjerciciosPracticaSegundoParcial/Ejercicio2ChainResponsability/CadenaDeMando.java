package EjerciciosPracticaSegundoParcial.Ejercicio2ChainResponsability;

public class CadenaDeMando implements IEjercito {
    private IEjercito next;
    @Override
    public void setNext(IEjercito handler) {
        this.next = handler;
    }

    @Override
    public IEjercito next() {
        return null;
    }

    @Override
    public void orden(String orden) {
        General general = new General();
        this.setNext(general);

        Teniente teniente = new Teniente();
        general.setNext(teniente);

        Coronel coronel = new Coronel();
        teniente.setNext(coronel);

        Cabo cabo = new Cabo();
        coronel.setNext(cabo);

        this.next.orden(orden);

    }
}
