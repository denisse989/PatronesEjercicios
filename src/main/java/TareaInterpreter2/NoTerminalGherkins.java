package TareaInterpreter2;
import java.util.ArrayList;
import java.util.List;

public class NoTerminalGherkins extends Abstract{
    private List<Abstract> parseTree= new ArrayList<>();
    private ContextGherkins context;

    public NoTerminalGherkins(String word){
        this.interpretecion(word);
    }

    private void interpretecion(String words) {
        String input = words;
        context = new ContextGherkins(input.replace(" ", ""));
        for (String word : input.split(" ")) {
            switch (word) {
                case "Como":
                    parseTree.add(new TerminalComo());
                    break;
                case "Quiero":
                    parseTree.add(new TerminalQuiero());
                    break;
                case "Para":
                    parseTree.add(new TerminalPara());
                    break;
                default:
                    parseTree.add(new TerminalUsuario());
                    break;

            }
        }
    }
    public String interpretar(){
        for (Abstract terminalExpresion: parseTree) {
            terminalExpresion.interpreter(context);
        }
        return  context.output;
    }

            @Override
            public void interpreter (ContextGherkins context){

            }


    }