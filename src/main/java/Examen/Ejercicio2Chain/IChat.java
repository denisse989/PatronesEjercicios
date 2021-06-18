package Examen.Ejercicio2Chain;

public interface IChat {
    void setNext(IChat ichat);
    IChat next();
    void mensaje (String mensaje);
}
