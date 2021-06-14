package TareaStrategy;

public class Primavera implements IEstacion{
    @Override
    public void estrategia(Ropa ropa) {
        System.out.println("*** PRIMAVERA ***");
        ropa.showInfo();
        System.out.println("*** NUEVO PRECIO PRIMAVERA ***");
        System.out.println("El Precio se mantiene en: "+ropa.getPrecio());
        System.out.println(" ");

    }
}
