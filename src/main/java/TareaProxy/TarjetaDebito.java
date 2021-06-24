package TareaProxy;

public class TarjetaDebito implements ITarjeta{
    double montoTarjeta;

    public double getMontoTarjeta() {
        return montoTarjeta;
    }

    public TarjetaDebito(double montoTarjeta) {
        this.montoTarjeta = montoTarjeta;
    }

    @Override
    public void comprar(double costo, String tipoMoneda) {
        if (montoTarjeta >= costo) {
            montoTarjeta -= costo;

            System.out.println("EL SALDO TOTAL EN LA TARJETA ES: " + montoTarjeta);
            System.out.println(" ");
        }else {
            System.out.println("***** ");
            System.out.println("SALDO INSUFICIENTE");
            System.out.println(" ");
        }
    }
}
