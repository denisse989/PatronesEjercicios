package TareaCommand;

public class ModoDefensa implements IAcciones {
    private Juego juego;

    public ModoDefensa(Juego juego){
        this.juego =juego;
    }
    @Override
    public void execute() {
        System.out.println("Defendiendo...");
        this.juego.modoDefensa();
    }
}
