package PracticaFinal.Ejercicio7Extra;

public class Presidente extends Duenos {
    public Presidente() {}

    @Override
    public void messageReceived(String mensaje) {
        System.out.println("*** NOTIFICANDO AL PRESIDENTE ***");
        System.out.println("Mensaje: "+ mensaje);
        System.out.println(" ");
    }
}
