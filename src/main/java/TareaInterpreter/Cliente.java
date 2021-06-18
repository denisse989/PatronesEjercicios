package TareaInterpreter;

public class Cliente {
    public static void main(String[] args) {

        String entero="1 3";

        NonTerminal parcer = new NonTerminal(entero);
        String interpretado= parcer.interpretar();


        System.out.println("Entero:"+entero);
        System.out.println("Romano:" + interpretado);
    }
}
