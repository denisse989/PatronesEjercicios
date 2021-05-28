package TareaInterpreter;

public class Terminal2 extends AbstractNumero {
    public Terminal2() {
    }

    @Override
    public void interpreter(ContextNumeroEntero context) {
        if (context.input.startsWith("2")) {
            context.output=context.output+"II ";
            context.input = context.input.substring(this.length);
        }

    }
}
