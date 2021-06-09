package TareaCommand;

public class Disparar implements IAcciones {
    private Juego juego;

    public Disparar(Juego juego){
        this.juego =juego;
    }
    @Override
    public void execute() {
        System.out.println("Disparando...");
        this.juego.disparar();
    }
}
