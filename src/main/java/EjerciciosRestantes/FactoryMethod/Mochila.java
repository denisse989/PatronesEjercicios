package EjerciciosRestantes.FactoryMethod;

public class Mochila {
    private String numero;
    private String bolsillos;
    private String tamano;

    public Mochila() {
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBolsillos() {
        return bolsillos;
    }

    public void setBolsillos(String bolsillos) {
        this.bolsillos = bolsillos;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public void showInfo() {
        System.out.println("Numero : "+numero);
        System.out.println("Bolsillos : "+bolsillos);
        System.out.println("Tamaño : "+ tamano);

    }

}
