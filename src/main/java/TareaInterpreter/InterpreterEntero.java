package TareaInterpreter;
import java.util.ArrayList;
import java.util.List;
public class InterpreterEntero extends AbstractNumero{


        private List<AbstractNumero> parseTree= new ArrayList<>();
        private ContextNumeroEntero context;

        public InterpreterEntero(String word){
            this.interpretecion(word);
        }

        public void interpretecion(String words) {
            String input = words;
            context= new ContextNumeroEntero(input.replace(" ",""));
            for (String word : input.split(" ")) {
                switch (word){
                    case "1":
                        parseTree.add(new TerminaNumerosNaturales(word.length()));
                        break;
                    case "I":
                        parseTree.add(new TerminaNumerosRomanos(word.length()));
                        break;
                    default:
                        parseTree.add(new TerminaNumerosNaturales(word.length()));
                        break;
                }

            }
        }


        public String interpretar(){
            for (AbstractNumero terminalExpresion: parseTree) {
                terminalExpresion.interpreter(context);
            }
            return  context.output;
        }



        @Override
        public void interpreter(ContextNumeroEntero context) {

        }

}
