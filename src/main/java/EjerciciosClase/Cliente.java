package EjerciciosClase;

import TareaBuilder.*;

public class Cliente {
    public static void main (String []args) {
        Dueno jose = new Dueno();

        Bife bife=new Bife();
        Lomito lomito =new Lomito();
        Tira tira =new Tira();

        jose.setBuilderParrilla(bife);
        jose.prepararParrilla();
        Parrillas bife1 = jose.getParrillas();
        bife1.showData();

        jose.setBuilderParrilla(lomito);
        jose.prepararParrilla();
        Parrillas lomito1 = jose.getParrillas();
        lomito1.showData();

        jose.setBuilderParrilla(tira);
        jose.prepararParrilla();
        Parrillas tira1 = jose.getParrillas();
        tira1.showData();
    }
}
