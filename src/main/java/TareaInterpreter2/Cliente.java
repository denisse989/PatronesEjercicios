package TareaInterpreter2;

import TareaInterpreter.NonTerminal;

public class Cliente {
    public static void main(String[] args) {

        String entero="Como administrador Quiero generar un reporte diario Para evaluar las ganancias";

        NoTerminalGherkins parcer = new NoTerminalGherkins(entero);
        String interpretado= parcer.interpretar();

        System.out.println("Entero:"+entero);
        System.out.println("Romano:" + interpretado);
    }
}
