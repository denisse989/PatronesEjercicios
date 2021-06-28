package PracticaFinal.Ejercicio2Bridge;

public class PagoAplicacionEmpresa implements IPago {
    @Override
    public void pagar(double monto) {
        System.out.println("*** PAGO POR APLICACION DE LA EMPRESA ***");
        System.out.println("El precio es " + monto*0.9);
        System.out.println(" ");
    }
}
