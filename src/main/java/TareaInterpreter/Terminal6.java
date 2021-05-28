package TareaInterpreter;

public class Terminal6 extends AbstractNumero {
    public Terminal6() {
    }

    @Override
    public void interpreter(ContextNumeroEntero context) {
        if (context.input.startsWith("6")) {
            context.output=context.output+"VI";
            context.input = context.input.substring(this.length);
        }

    }
}
