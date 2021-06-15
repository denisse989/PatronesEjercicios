package TareaStrategy;

public class Verano implements IEstacion{
    @Override
    public void estrategia(Ropa ropa) {
        System.out.println("*** VERANO ***");
        ropa.showInfo();
        System.out.println("*** NUEVO PRECIO VERANO ***");
        int precioActual= ropa.getPrecio()-(ropa.getPrecio()*10/100);
        System.out.println("Nuevo Precio: "+precioActual);
        System.out.println(" ");

    }
}
