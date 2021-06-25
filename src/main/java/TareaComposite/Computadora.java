package TareaComposite;

public class Computadora extends Component {
    public Computadora(String nombre) {
        super(nombre);
    }

    @Override
    public void precio() {
        System.out.println(" ***** ");
        System.out.println("Componente : "+getNombre());
        System.out.println(" Precio : " + getPrecio());
    }

    @Override
    public void add(Component component) {
        System.out.println("Not Applicable");
    }

    @Override
    public void remove(Component component) {
        System.out.println("Not Applicable");
    }

    @Override
    public void getChild(int position) {
        System.out.println("Not Applicable");
    }
}
