package ChainOfResponsability.Ejercicio3;


public class Cliente {
    public static void main(String[] args) {
        HandlerManager handlerManager = new HandlerManager();
        Persona[] personas = new Persona[4];
        personas[0] = new Persona("123", "Juan0", 7);
        personas[1] = new Persona("123", "Juan1", 5);
        personas[2] = new Persona("123", "Juan2", 9);
        personas[3] = new Persona("123", "Juan3", 2);

        handlerManager.realizarAlgoritmo(personas);

        personas = new Persona[20];
        for (int i = 0; i < personas.length; i++) {
            personas[i] = new Persona("123", "Juan" + i, i+1);
        }
        handlerManager.realizarAlgoritmo(personas);

        personas = new Persona[50];
        for (int i = 0; i < personas.length; i++) {
            personas[i] = new Persona("123", "Juan" + i, i+1);
        }
        handlerManager.realizarAlgoritmo(personas);

        personas = new Persona[52];
        for (int i = 0; i < personas.length; i++) {
            personas[i] = new Persona("123", "Juan" + i, i+1);
        }
        handlerManager.realizarAlgoritmo(personas);
    }


}

