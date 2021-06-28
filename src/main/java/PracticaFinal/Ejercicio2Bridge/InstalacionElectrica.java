package PracticaFinal.Ejercicio2Bridge;

public class InstalacionElectrica implements IInstalacion {
    private IPago pago;
    private String nombre;
    private int ci;
    private double monto;


    public InstalacionElectrica(IPago pago, String nombre, int ci, double monto){
        this.pago = pago;
        this.nombre=nombre;
        this.ci = ci;
        this.monto = monto;
    }

    @Override
    public void pagar() {
        showInfo();
        System.out.println("*** METODO DE PAGO ***");
        pago.pagar(monto);
    }
    @Override
    public void showInfo(){
        System.out.println("*** INFORMACION FACTURA ELECTRICIDAD***");
        System.out.println("NOMBRE : "+nombre);
        System.out.println("CI: "+ ci);
        System.out.println("MONTO : "+ monto);
        System.out.println(" ");
    }
}
