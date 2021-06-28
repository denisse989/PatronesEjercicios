package TareaComposite;
import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private List<Component> list = new ArrayList<>();

    public Composite(String nombre) {
        super(nombre);
    }


    @Override
    public void precio() {

        Global.totalPrecio=0;
        for (Component componente:list ) {
            componente.precio();
            Global.totalPrecio=Global.totalPrecio+componente.getPrecio();

        }
        System.out.println("COMPONENTE : "+getNombre());
        System.out.println("PRECIO TOTAL : " + Global.totalPrecio );

    }



    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public void getChild(int position) {
        System.out.println("Precio: "+list.get(position).getPrecio());

    }
}
