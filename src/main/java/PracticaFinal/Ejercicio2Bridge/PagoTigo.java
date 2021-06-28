package PracticaFinal.Ejercicio2Bridge;

public class PagoTigo implements IPago {
    @Override
    public void pagar(double monto) {
        System.out.println("*** PAGO POR TIGO MONEY ***");
        System.out.println("El precio es: " + monto*0.98);
        System.out.println(" ");
    }
}
