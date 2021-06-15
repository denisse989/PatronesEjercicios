package TareaStrategy;

public class Ropa {
    private String nombre;
    private int precio;

    private IEstacion estacion;

    public Ropa() {
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

    public IEstacion getEstacion() {
        return estacion;
    }

    public void setEstacion(IEstacion estacion) {
        this.estacion = estacion;
    }
    public void execute(){
        this.estacion.estrategia(this);
    }

    public void showInfo() {
        System.out.println("INFORMACION DE PRODUCTO");
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio: "+precio);
        System.out.println(" ");
    }
}
