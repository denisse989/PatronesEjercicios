package TareasSingletonEjercicio;

public class CasaDeCambio {
    public void realizarCambio(int monto, String tipoDelMonto, String tipoDeCambio){
        EmpresaDeCambio.getInstance().cambio("CC",monto,tipoDelMonto,tipoDeCambio);

    }
}
