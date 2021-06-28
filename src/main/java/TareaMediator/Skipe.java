package TareaMediator;
import java. util. HashMap;
import java.util.Map;

public class Skipe implements ICanalDeComunicacion{

        Map<String, Colleague> personasChat = new HashMap<String, Colleague>();
    public void addPersonasAlChat(Colleague colleague){
        //personasChat.put();
    }
    @Override
    public void send(String message, Colleague colleague) {
        /*Colleague personaParseOrigen= (Colleague) colleague;
        for (Colleague persona:personasChat.) {
            if ( !personaParseOrigen.getId().equals(persona.getId())){
                if (personaParseOrigen.getCargo().equals("SM")){
                    persona.messageReceived(message);
                }
                if (personaParseOrigen.getCargo().equals("QA") && persona.getCargo().equals("QA")){
                    persona.messageReceived(message);
                }
                if (personaParseOrigen.getCargo().equals("DEV") && persona.getCargo().equals("DEV")){
                    persona.messageReceived(message);
                }
            }
        }*/

    }
}
