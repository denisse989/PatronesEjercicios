package PracticaFinal.Ejercicio2Bridge;

public class PagoTransferencia implements IPago {
    @Override
    public void pagar(double monto) {
        System.out.println("*** PAGO POR TRANSFERENCIA ***");
        System.out.println("El precio es: " + monto*0.95);
        System.out.println(" ");
    }
}
