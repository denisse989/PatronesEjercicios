package TareaInterpreter;

public class Terminal7 extends AbstractNumero {
    public Terminal7() {
    }

    @Override
    public void interpreter(ContextNumeroEntero context) {
        if (context.input.startsWith("7")) {
            context.output=context.output+"VII";
            context.input = context.input.substring(this.length);
        }

    }
}
