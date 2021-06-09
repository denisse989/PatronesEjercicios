package TareaCommand;

public class Atacar implements IAcciones {
    private Juego juego;

    public Atacar(Juego juego){
        this.juego=juego;
    }
    @Override
    public void execute() {
        System.out.println("Atacando...");
        this.juego.atacar();
    }
}
