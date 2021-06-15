package TareaCommand;

public class Cliente {
    public static void main (String[]args){
        Juego juego = new Juego(true,false);

        Atacar atacar= new Atacar(juego);
        ModoDefensa modoDefensa = new ModoDefensa(juego);
        Disparar disparar = new Disparar(juego);


        Invoker jugar= new Invoker();
        jugar.addCommand(atacar);
        jugar.addCommand(modoDefensa);
        jugar.addCommand(disparar);


        jugar.executeCommands();

    }
}
