package EjerciciosRestantes.FactoryMethod;

public class KitColegial implements IKit{

    private Mochila mochila;
    private Libros libros;
    private  Computadora computadora;

    public KitColegial(Mochila mochila, Libros libros, Computadora computadora) {
        mochila = new Mochila();
        libros =new Libros();
        computadora=new Computadora();
    }

    public KitColegial() {

    }


    @Override
    public void crear() {
        System.out.println("KIT COLEGIAL");
        mochila.showInfo();
        libros.showInfo();
        computadora.showInfo();
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Libros getLibros() {
        return libros;
    }

    public void setLibros(Libros libros) {
        this.libros = libros;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }
}
