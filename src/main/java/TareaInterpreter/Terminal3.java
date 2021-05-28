package TareaInterpreter;

public class Terminal3 extends AbstractNumero {
    public Terminal3() {
    }

    @Override
    public void interpreter(ContextNumeroEntero context) {
        if (context.input.startsWith("3")) {
            context.output=context.output+"III";
            context.input = context.input.substring(this.length);
        }

    }
}
