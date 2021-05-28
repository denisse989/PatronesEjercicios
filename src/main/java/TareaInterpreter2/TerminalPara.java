package TareaInterpreter2;

import TareaInterpreter.AbstractNumero;
import TareaInterpreter.ContextNumeroEntero;

public class TerminalPara extends Abstract {
    public TerminalPara() {
    }

    @Override
    public void interpreter(ContextGherkins context) {
        if (context.input.startsWith("Para")) {
            context.output=context.output+"Then ";
            context.input = context.input.substring(1);
        }

    }
}
