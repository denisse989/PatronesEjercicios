package PracticaFinal.Ejercicio6Visitor;

public interface IAplicacionVisitor {
    void mantenimiento(Celular celular);
    void mantenimiento(Computadora computadora);
    void mantenimiento(Televisor televisor);
}
