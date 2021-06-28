package PracticaFinal.Ejercicio6Visitor;

public class Televisor implements IAparatoElectronico {
    private String marca;
    private Boolean smart;


    public Televisor(String marca, Boolean smart) {
        this.marca = marca;
        this.smart = smart;
    }

    @Override
    public void showInfo() {
        System.out.println("*** INFORMACION TELEVISOR ***");
        System.out.println("MARCA: "+marca);
        System.out.println("SMART TV: "+ smart);
        System.out.println(" ");
    }

    @Override
    public void darMantenimiento(IAplicacionVisitor aplicacionVisitor) {
        aplicacionVisitor.mantenimiento(this);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Boolean getSmart() {
        return smart;
    }

    public void setSmart(Boolean smart) {
        this.smart = smart;
    }
}
