package TareaMemento;
import java.util.List;

public class BaseDeDatos {
    private List<Persona> state;

    public BaseDeDatos(List<Persona> state) {
        this.state = state;
    }

    public List<Persona> getState() {
        return state;
    }

    public void setState(List<Persona> state) {
        this.state = state;
    }
    public void info() {
        System.out.println("LISTA DE PERSONAS: ");
        for (Persona p : state) {
            p.info();
            System.out.println(" ");
        }
    }
}
