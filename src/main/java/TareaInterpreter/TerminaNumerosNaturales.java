package TareaInterpreter;

public class TerminaNumerosNaturales extends AbstractNumero {
    public TerminaNumerosNaturales(int length) {
    }

    @Override
    public void interpreter(ContextNumeroEntero context) {
        if (context.input.startsWith("1")) {
            context.signo=1;
            context.input = context.input.substring(this.length);
        }

    }
}
