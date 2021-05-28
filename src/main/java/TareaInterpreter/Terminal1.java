package TareaInterpreter;

public class Terminal1 extends AbstractNumero {
    public Terminal1() {
    }

    @Override
    public void interpreter(ContextNumeroEntero context) {
        if (context.input.startsWith("1")) {
            context.output=context.output+"I ";
            context.input = context.input.substring(1);
        }

    }
}
