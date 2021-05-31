package EjerciciosRestantes.FactoryMethod;

public class CreatorKitColegial extends CreatorKit{
    @Override
    public KitColegial create() {
        Mochila mochila = new Mochila();
        mochila.setBolsillos("2");
        mochila.setNumero("101");
        mochila.setTamano("Carta");

        Libros libros=new Libros();
        libros.setTipo("Matematicas");
        libros.setAutor("A.R.");

        Computadora computadora=new Computadora();
        computadora.setMarca("HP");
        computadora.setOs("Windows");

        KitColegial kitColegial=new KitColegial();
        kitColegial.setComputadora(computadora);
        kitColegial.setLibros(libros);
        kitColegial.setMochila(mochila);
        return kitColegial;
    }
}
