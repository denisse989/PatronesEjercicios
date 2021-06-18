package EjercicioVisitor2;

public class Brasil implements IPais{
    private double valor;
    //Para saber si se quiere cambiar de la moneda local a dolares(true) o al reves (false)
    private Boolean monedaLocal;

    public Brasil() {
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Boolean getMonedaLocal() {
        return monedaLocal;
    }

    public void setMonedaLocal(Boolean monedaLocal) {
        this.monedaLocal = monedaLocal;
    }

    @Override
    public void accept(ILibreCambista visitante) {
        visitante.cambiar(this);
    }
}
