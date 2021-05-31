package EjerciciosRestantes.FactoryMethod;

public class Cliente {
    public  static void main (String[]args) {

        KitEscolar kitEscolar=new CreatorKitEscolar().create();
        Mochila mochila=new Mochila();
        mochila.setBolsillos("6");
        mochila.setNumero("101");
        mochila.setTamano("Carta");
        kitEscolar.setMochila(mochila);
        kitEscolar.crear();

        KitColegial kitColegial=new CreatorKitColegial().create();
        kitColegial.crear();
    }
}
