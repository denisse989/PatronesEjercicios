package PracticaFinal.Ejercicio6Visitor;

public class Computadora implements IAparatoElectronico {
    private String marca;
    private String ram;


    public Computadora(String marca, String ram) {
        this.marca = marca;
        this.ram = ram;
    }

    @Override
    public void showInfo() {
        System.out.println("*** INFORMACION COMPUTADORA ***");
        System.out.println("MARCA: "+marca);
        System.out.println("MEMORIA RAM: "+ram);
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

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
}
