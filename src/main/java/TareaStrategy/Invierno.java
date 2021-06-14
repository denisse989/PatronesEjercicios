package TareaStrategy;

public class Invierno implements IEstacion{
    @Override
    public void estrategia(Ropa ropa) {
        System.out.println("*** INVIERNO ***");
        ropa.showInfo();
        System.out.println("*** NUEVO PRECIO INVIERNO ***");
        int precioActual= ropa.getPrecio()+(ropa.getPrecio()*10/100);
        System.out.println("Nuevo Precio: "+precioActual);
        System.out.println(" ");

    }
}
