package TareaComposite;

public abstract class Component {
    private String nombre;
    private int precio;

    public Component(String nombre){
        this.nombre =nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public abstract void precio();

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract void getChild(int position);
}

