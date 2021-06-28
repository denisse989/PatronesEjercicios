package PracticaFinal.Ejercicio2Bridge;

public class PagoEfectivo implements IPago {
    @Override
    public void pagar(double monto) {
        System.out.println("*** PAGO EN EFECTIVO ***");
        System.out.println("El precio se mantiene: " + monto);
        System.out.println(" ");
    }
}
