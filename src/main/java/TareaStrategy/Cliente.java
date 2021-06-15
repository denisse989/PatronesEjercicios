package TareaStrategy;

public class Cliente {
    public static void main (String []args) {

        Ropa ropa = new Ropa();
        //PRIMER PRODUCTO
        ropa.setNombre("POLERA");
        ropa.setPrecio(80);

        ropa.setEstacion(new Verano());
        ropa.execute();

        ropa.setEstacion(new Primavera());
        ropa.execute();

        ropa.setEstacion(new Otono());
        ropa.execute();

        ropa.setEstacion(new Invierno());
        ropa.execute();
    }
}
