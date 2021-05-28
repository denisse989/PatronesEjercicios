package TareaInterpreter2;

import TareaInterpreter.AbstractNumero;
import TareaInterpreter.ContextNumeroEntero;

public class TerminalComo extends Abstract {
    public TerminalComo() {
    }

    @Override
    public void interpreter(ContextGherkins context) {
        if (context.input.startsWith("Como")) {
            context.output=context.output+"Given ";
            context.input = context.input.substring(1);
        }
    }
}
