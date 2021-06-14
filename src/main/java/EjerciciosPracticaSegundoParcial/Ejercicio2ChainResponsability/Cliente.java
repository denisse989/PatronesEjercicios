package EjerciciosPracticaSegundoParcial.Ejercicio2ChainResponsability;

public class Cliente {
    public static void main(String[] args) {
        CadenaDeMando cadenaDeMando = new CadenaDeMando();

        cadenaDeMando.orden("Entrevistas");
        cadenaDeMando.orden("Disciplina");
        cadenaDeMando.orden("Desbloqueos");
        cadenaDeMando.orden("Manifestaciones");
        cadenaDeMando.orden("Limpiezas");
        cadenaDeMando.orden("Agarrar");

    }
}
