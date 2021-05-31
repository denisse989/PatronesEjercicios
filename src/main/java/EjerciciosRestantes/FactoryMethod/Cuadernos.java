package EjerciciosRestantes.FactoryMethod;

public class Cuadernos {
    private String tipo;
    private String nHojas;

    public Cuadernos() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getnHojas() {
        return nHojas;
    }

    public void setnHojas(String nhojas) {
        nHojas = nhojas;
    }

    public void showInfo() {
        System.out.println("Numero de Hojas : "+nHojas);
        System.out.println("Tipo : "+tipo);


    }

}
