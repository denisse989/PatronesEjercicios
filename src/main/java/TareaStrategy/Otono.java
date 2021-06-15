package TareaStrategy;

public class Otono implements IEstacion{
    @Override
    public void estrategia(Ropa ropa) {
        System.out.println("*** OTOÑO ***");
        ropa.showInfo();
        System.out.println("*** NUEVO PRECIO OTOÑO ***");
        int precioActual= ropa.getPrecio()-(ropa.getPrecio()*50/100);
        System.out.println("Nuevo Precio: "+precioActual);
        System.out.println(" ");

    }
}
