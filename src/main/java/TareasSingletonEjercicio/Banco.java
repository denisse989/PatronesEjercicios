package TareasSingletonEjercicio;

public class Banco {
    public void realizarCambio(int monto, String tipoDelMonto, String tipoDeCambio){
        EmpresaDeCambio.getInstance().cambio("B",monto,tipoDelMonto,tipoDeCambio);

    }
}
