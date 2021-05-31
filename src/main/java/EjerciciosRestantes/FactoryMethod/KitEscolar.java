package EjerciciosRestantes.FactoryMethod;

public class KitEscolar implements IKit{

    private Mochila mochila;
    private Deportivo deportivo;
    private  Cuadernos cuadernos;

    public KitEscolar() {
        mochila = new Mochila();
        deportivo =new Deportivo();
        cuadernos=new Cuadernos();
    }


    @Override
    public void crear() {
        System.out.println("KIT ESCOLAR");
        mochila.showInfo();
        deportivo.showInfo();
        cuadernos.showInfo();
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Deportivo getDeportivo() {
        return deportivo;
    }

    public void setDeportivo(Deportivo deportivo) {
        this.deportivo = deportivo;
    }

    public Cuadernos getCuadernos() {
        return cuadernos;
    }

    public void setCuadernos(Cuadernos cuadernos) {
        this.cuadernos = cuadernos;
    }
}
