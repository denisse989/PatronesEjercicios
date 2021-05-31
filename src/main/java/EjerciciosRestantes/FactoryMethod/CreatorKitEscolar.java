package EjerciciosRestantes.FactoryMethod;

public class CreatorKitEscolar extends CreatorKit{
    @Override
    public KitEscolar create() {
        Mochila mochila = new Mochila();
        mochila.setBolsillos("2");
        mochila.setNumero("101");
        mochila.setTamano("Carta");

        Deportivo deportivo=new Deportivo();
        deportivo.setColor("Azul");
        deportivo.setTalla("32");
        deportivo.setNumeroDePrendas("4");

        Cuadernos cuadernos=new Cuadernos();
        cuadernos.setnHojas("100");
        cuadernos.setTipo("Carta");

        KitEscolar kitEscolar=new KitEscolar();
        kitEscolar.setMochila(mochila);
        kitEscolar.setCuadernos(cuadernos);
        kitEscolar.setDeportivo(deportivo);
        return kitEscolar;
    }
}
