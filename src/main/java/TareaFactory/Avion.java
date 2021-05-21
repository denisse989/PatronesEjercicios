package TareaFactory;

public class Avion {
    private String marca;
    private String capacidad;
    private String modelo;
    private String numeroAsientos;

    public Avion(String marca,String capacidad,String modelo,String numeroAsientos) {
        this.marca = marca;
        this.capacidad =capacidad;
        this.modelo=modelo;
        this.numeroAsientos=numeroAsientos;
    }

    public Avion() {

    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroAsientos() {
        return numeroAsientos;
    }
    public void setNumeroAsientos(String numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public void showInfo(){
        System.out.println("Marca del Avion : "+marca);
        System.out.println("Capacidad del Avion : "+capacidad);
        System.out.println("Modelo del avion : "+modelo);
        System.out.println("Numero de Asientos : "+ numeroAsientos);
    }
}
