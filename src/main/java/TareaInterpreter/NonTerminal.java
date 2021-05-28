package TareaInterpreter;
import java.util.ArrayList;
import java.util.List;
public class NonTerminal extends AbstractNumero{


        private List<AbstractNumero> parseTree= new ArrayList<>();
        private ContextNumeroEntero context;

        public NonTerminal(String word){
            this.interpretecion(word);
        }

        public void interpretecion(String words) {
            String input = words;
            context= new ContextNumeroEntero(input.replace(" ",""));
            for (String word : input.split(" ")) {
                switch (word){
                    case "1":
                        parseTree.add(new Terminal1());
                        break;
                    case "2":
                        parseTree.add(new Terminal2());
                        break;
                    case "3":
                        parseTree.add(new Terminal3());
                        break;
                    case "4":
                        parseTree.add(new Terminal4());
                        break;
                    case "5":
                        parseTree.add(new Terminal5());
                        break;
                    case "6":
                        parseTree.add(new Terminal6());
                        break;
                    case "7":
                        parseTree.add(new Terminal7());
                        break;
                    case "8":
                        parseTree.add(new Terminal8());
                        break;
                    case "9":
                        parseTree.add(new Terminal9());
                        break;
                    case "10":
                        parseTree.add(new Terminal10());
                        break;

                    default:
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
