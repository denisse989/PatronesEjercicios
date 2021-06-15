package EjerciciosPracticaSegundoParcial.Ejercicio3MementoYObserver;

public class Memento {
    private Codigo state;

    public Memento(Codigo state) {
        this.state=state;
    }

    public Codigo getState() {
        return state;
    }
}
