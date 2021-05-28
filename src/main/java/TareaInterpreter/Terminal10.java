package TareaInterpreter;

public class Terminal10 extends AbstractNumero {
    public Terminal10() {
    }

    @Override
    public void interpreter(ContextNumeroEntero context) {
        if (context.input.startsWith("10")) {
            context.output=context.output+"X";
            context.input = context.input.substring(this.length);
        }

    }
}
