package PracticaFinal.Ejercicio6Visitor;

public interface IAparatoElectronico {
    public void showInfo();

    public void darMantenimiento(IAplicacionVisitor aplicacionVisitor);
}
