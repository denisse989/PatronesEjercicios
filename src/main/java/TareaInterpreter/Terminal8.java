package TareaInterpreter;

public class Terminal8 extends AbstractNumero {
    public Terminal8() {
    }

    @Override
    public void interpreter(ContextNumeroEntero context) {
        if (context.input.startsWith("8")) {
            context.output=context.output+"VIII";
            context.input = context.input.substring(this.length);
        }

    }
}
