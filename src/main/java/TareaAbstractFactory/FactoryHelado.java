package TareaAbstractFactory;

public class FactoryHelado {
    public enum typeHelado{
        HELADO_AGUA,HELADO_CREMA,HELADO_MIXTO
    }

    public static IHelado make(typeHelado type){
        IHelado pasaje;
        switch (type){
            case HELADO_AGUA:
                pasaje= new HeladoAgua();
                ((HeladoAgua) pasaje).setForma("clasica");
                ((HeladoAgua) pasaje).setTamano("mediano");
                ((HeladoAgua) pasaje).setBase(new Base("cono","grande","galleta","5bs"));
                ((HeladoAgua) pasaje).setFruta(new Fruta("dulce","frutilla","1","mediano"));

                break;
            case HELADO_CREMA:
                pasaje= new HeladoCrema();
                ((HeladoCrema) pasaje).setForma("clasica");
                ((HeladoCrema) pasaje).setTamano("mediano");
                ((HeladoCrema) pasaje).setBase(new Base("cono","grande","galleta","5bs"));
                ((HeladoCrema) pasaje).setFruta(new Fruta("dulce","frutilla","1","mediano"));
                ((HeladoCrema) pasaje).setCrema(new Crema("Naranja","1","PIL"));

                break;
            case HELADO_MIXTO:
                pasaje= new HeladoMixto();
                ((HeladoMixto) pasaje).setForma("clasica");
                ((HeladoMixto) pasaje).setTamano("grande");
                ((HeladoMixto) pasaje).setCosto("15bs");
                ((HeladoMixto) pasaje).setBase(new Base("cono","grande","galleta","5bs"));
                ((HeladoMixto) pasaje).setFruta(new Fruta("dulce","frutilla","1","mediano"));
                ((HeladoMixto) pasaje).setCrema(new Crema("Naranja","1","PIL"));
                break;
            default:
                pasaje= new HeladoAgua();
                break;
        }
        return pasaje;
    }
}
