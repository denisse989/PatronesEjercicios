package TareaProxy;

public class Proxy implements ITarjeta{
    private TarjetaDebito tarjetaDebito;

    public Proxy(double monto) {
        tarjetaDebito = new TarjetaDebito(monto);
    }

    @Override
    public void comprar(double costo, String tipoMoneda) {
        if (tipoMoneda.equals("BOLIVIANOS")) {
            System.out.println("***** ");
            System.out.println("EL COSTO ES EN BOLIVIANOS ");
            tarjetaDebito.comprar(costo, tipoMoneda);
        } else if (tipoMoneda.equals("DOLARES")) {
            System.out.println("***** ");
            System.out.println("EL COSTO ES EN DOLARES ");
            double nuevoMonto = costo * 6.96;
            tarjetaDebito.comprar(nuevoMonto, "BOLIVIANOS");

        } else if (tipoMoneda.equals("EUROS")) {
            System.out.println("***** ");
            System.out.println("EL COSTO ES EN EUROS ");
            double nuevoMonto = costo * 8.23;
            tarjetaDebito.comprar(nuevoMonto, "BOLIVIANOS");
        } else {
            System.out.println("***** ");
            System.out.println("NO SE PUEDE REALIZAR EL CAMBIO A BOLIVIANOS");
            System.out.println(" ");
        }

    }
}
