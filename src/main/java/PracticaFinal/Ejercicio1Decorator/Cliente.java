package PracticaFinal.Ejercicio1Decorator;

public class Cliente {
    public static void main(String[] args) {
        IJuegoWarcraft juegoWarcraft= new Personaje("Juan");


        juegoWarcraft = new AgregarArma(juegoWarcraft, "Espada");
        juegoWarcraft = new AgregarEscudo(juegoWarcraft);
        juegoWarcraft = new AgregarPocion(juegoWarcraft);
        juegoWarcraft.showInfo();


    }
}
