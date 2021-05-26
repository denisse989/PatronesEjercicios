package TareaInterpreter;

public class Cliente {
    public static void main(String[] args) {

        String entero="1 2 3 4 5 6 7 8 9 10";

        InterpreterEntero interpreterEntero = new InterpreterEntero(entero);
        System.out.println("Entero:"+entero);
        System.out.println("Romano:" +interpreterEntero.interpretar());
    }
}
