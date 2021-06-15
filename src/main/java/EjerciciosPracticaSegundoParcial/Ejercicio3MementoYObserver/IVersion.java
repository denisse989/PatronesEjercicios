package EjerciciosPracticaSegundoParcial.Ejercicio3MementoYObserver;

public interface IVersion {
    void attach(ISuscripcion observer);
    void deattach(ISuscripcion observer);
    void notifyObserver(int version);
}
