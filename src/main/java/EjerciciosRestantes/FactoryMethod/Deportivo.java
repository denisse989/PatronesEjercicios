package EjerciciosRestantes.FactoryMethod;

public class Deportivo {
    private String talla;
    private String color;
    private String numeroDePrendas;

    public Deportivo() {
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumeroDePrendas() {
        return numeroDePrendas;
    }

    public void setNumeroDePrendas(String numeroDePrendas) {
        this.numeroDePrendas = numeroDePrendas;
    }
    public void showInfo() {
        System.out.println("Talla : "+talla);
        System.out.println("Color : "+color);
        System.out.println("Numero de Prendas : "+numeroDePrendas);

    }
}
