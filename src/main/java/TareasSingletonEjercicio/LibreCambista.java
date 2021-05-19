package TareasSingletonEjercicio;

public class LibreCambista {
    public void realizarCambio(int monto, String tipoDelMonto, String tipoDeCambio){
        EmpresaDeCambio.getInstance().cambio("LC",monto,tipoDelMonto,tipoDeCambio);

    }

}
