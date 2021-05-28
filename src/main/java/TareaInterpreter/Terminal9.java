package TareaInterpreter;

public class Terminal9 extends AbstractNumero {
    public Terminal9() {
    }

    @Override
    public void interpreter(ContextNumeroEntero context) {
        if (context.input.startsWith("9")) {
            context.output=context.output+"IX";
            context.input = context.input.substring(this.length);
        }

    }
}
