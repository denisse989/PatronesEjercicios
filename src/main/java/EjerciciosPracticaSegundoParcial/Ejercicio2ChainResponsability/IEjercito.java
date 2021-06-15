package EjerciciosPracticaSegundoParcial.Ejercicio2ChainResponsability;

public interface IEjercito {
    void setNext(IEjercito handler);
    IEjercito next();
    void orden (String orden);
}
