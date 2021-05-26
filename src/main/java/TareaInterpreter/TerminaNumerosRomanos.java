package TareaInterpreter;

public class TerminaNumerosRomanos extends AbstractNumero {
    public TerminaNumerosRomanos(int length) { this.length=length; }

    @Override
    public void interpreter(ContextNumeroEntero context) {
        if (context.input.startsWith("I")) {
            context.signo=1;
            context.input = context.input.substring(this.length);
        }

    }
}
