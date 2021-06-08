package ChainOfResponsability.Ejercicio2;

public class Client {

    public static void main(String[] args) {
        HandlerManager handlerManager = new HandlerManager();

        handlerManager.criteriaHandler(new Persona(true,true,true));

        handlerManager.criteriaHandler(new Persona(false,true,true));

        handlerManager.criteriaHandler(new Persona(true,false,true));

        handlerManager.criteriaHandler(new Persona(true,false,false));


    }
}
