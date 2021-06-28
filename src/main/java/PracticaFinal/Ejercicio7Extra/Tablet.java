package PracticaFinal.Ejercicio7Extra;

public class Tablet implements IComputadora {
    private String modelo;
    private int tamano;

    public Tablet(int tamano, String modelo) {
        this.tamano = tamano;
        this.modelo = modelo;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    @Override
    public void showInfo() {
        System.out.println("*** Caracteristicas de Tablet ***");
        System.out.println("Modelo: " + modelo);
        System.out.println("Tamaño: " + tamano);
    }


    @Override
    public int darReparacion(IReparacion reparacion) {
        return reparacion.reparar(this);
    }

}
