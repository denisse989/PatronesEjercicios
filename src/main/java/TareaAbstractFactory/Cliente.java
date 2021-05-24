package TareaAbstractFactory;

public class Cliente {
    public static void main (String []args){
        HeladoAgua a1= (HeladoAgua) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_AGUA);
        a1.crear();
        HeladoAgua a2= (HeladoAgua) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_AGUA);
        a2.setFruta(new Fruta("dulce","frutilla","1","grande"));
        a2.crear();
        HeladoAgua a3= (HeladoAgua) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_AGUA);
        a3.setFruta(new Fruta("dulce","frutilla","1","pequeño"));
        a3.crear();

        HeladoCrema a4= (HeladoCrema) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_CREMA);
        a4.crear();
        HeladoCrema a5= (HeladoCrema) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_CREMA);
        a5.setCrema(new Crema("Frutilla","1","PIL"));
        a5.crear();
        HeladoCrema a6= (HeladoCrema) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_CREMA);
        a6.setCrema(new Crema("Mora","1","PIL"));
        a6.crear();

        HeladoMixto a7= (HeladoMixto) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_MIXTO);
        a7.crear();
        HeladoMixto a8= (HeladoMixto) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_MIXTO);
        a8.setFruta(new Fruta("agrio","limon","1","mediano"));
        a8.setCrema(new Crema("Limon","1","PIL"));
        a8.crear();
        HeladoMixto a9= (HeladoMixto) FactoryHelado.make(FactoryHelado.typeHelado.HELADO_MIXTO);
        a9.setFruta(new Fruta("agrio","limon","1","grande"));
        a9.crear();



    }
}
