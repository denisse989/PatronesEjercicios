package TareaAbstractFactory;

public class HeladoAgua implements IHelado{

    private String tamano;
    private String forma;
    private Fruta fruta;
    private Base base;

    public HeladoAgua(){
        fruta = new Fruta();
        base= new Base();
    }

    public HeladoAgua(String tamano,String forma,Fruta fruta,Base base) {
        this.tamano = tamano;
        this.base=base;
        this.forma=forma;
        this.fruta=fruta;
    }

    @Override
    public void crear() {
        System.out.println("Helado De Agua - tamano: "+tamano);
        System.out.println("Helado De Agua - forma: "+forma);
        fruta.showInfo();
        base.showInfo();
        System.out.println(" ");
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public Fruta getFruta() {
        return fruta;
    }

    public void setFruta(Fruta fruta) {
        this.fruta = fruta;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }
}
