package TareaInterpreter;

public class Terminal4 extends AbstractNumero {
    public Terminal4() {
    }

    @Override
    public void interpreter(ContextNumeroEntero context) {
        if (context.input.startsWith("4")) {
            context.output=context.output+"IV";
            context.input = context.input.substring(this.length);
        }

    }
}
