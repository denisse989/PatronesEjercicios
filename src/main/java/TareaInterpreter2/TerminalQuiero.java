package TareaInterpreter2;

import TareaInterpreter.AbstractNumero;
import TareaInterpreter.ContextNumeroEntero;

public class TerminalQuiero extends Abstract {
    public TerminalQuiero() {
    }

    @Override
    public void interpreter(ContextGherkins context) {
        if (context.input.startsWith("Quiero")) {
            context.output=context.output+"When ";
            context.input = context.input.substring(1);
        }

    }
}
