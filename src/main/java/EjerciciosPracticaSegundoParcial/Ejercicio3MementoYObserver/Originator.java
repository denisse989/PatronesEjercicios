package EjerciciosPracticaSegundoParcial.Ejercicio3MementoYObserver;

import java.util.ArrayList;
import java.util.List;

public class Originator implements IVersion {
    private Codigo state;
    private List<ISuscripcion> observerList = new ArrayList<>();

    public void setState(Codigo state) {
        System.out.println("**** Set State *****");
        state.showInfo();
        this.state = state;
    }

    public Memento createVersion() {
        System.out.println("**** Create State *****");
        state.showInfo();
        ;
        return new Memento(this.state);
    }

    public void restoreFromMemento(Memento version) {
        this.state = version.getState();
        System.out.println("**** State Restored *****");
        this.state.showInfo();
        this.notifyObserver(state.getVersion());
    }

    @Override
    public void notifyObserver(int version) {
        System.out.println("**** Notificando usuarios ****");
        for (ISuscripcion observer : observerList) {
            observer.update("Se ha restaurado la version: " + version);
        }
    }

    @Override
    public void attach(ISuscripcion observer) {
        observerList.add(observer);

    }

    @Override
    public void deattach(ISuscripcion observer) {
        observerList.remove(observer);

    }
}
