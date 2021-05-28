package TareaInterpreter2;

public class TerminalUsuario extends Abstract {

    @Override
    public void interpreter(ContextGherkins context) {
        if (context.input.startsWith(" ")) {
            context.output=context.output+ context.input;
            context.input = context.input.substring(1);
        }
    }
}
