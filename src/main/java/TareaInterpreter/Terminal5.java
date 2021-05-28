package TareaInterpreter;

public class Terminal5 extends AbstractNumero {
    public Terminal5() {
    }

    @Override
    public void interpreter(ContextNumeroEntero context) {
        if (context.input.startsWith("5")) {
            context.output=context.output+"V";
            context.input = context.input.substring(this.length);
        }

    }
}
