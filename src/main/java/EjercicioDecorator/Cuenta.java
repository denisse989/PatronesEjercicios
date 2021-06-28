package EjercicioDecorator;

public class Cuenta implements IBanco{
    private double monto;
    private String nombrePropietario;

    public Cuenta(double monto, String nombrePropietario) {
        this.monto = monto;
        this.nombrePropietario = nombrePropietario;
    }
    @Override
    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    @Override
    public void operation() {
        System.out.println("*****");
        System.out.println("Nombre Cuenta : "+nombrePropietario);
        System.out.println("Monto en la Cuenta : "+monto);
        System.out.println(" ");

    }
}
