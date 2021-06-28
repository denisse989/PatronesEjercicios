package PracticaFinal.Ejercicio7Extra;

public class VicePresidente extends Duenos {
    public VicePresidente() {}

    @Override
    public void messageReceived(String mensaje) {
        System.out.println("*** NOTIFICANDO AL VICE PRESIDENTE ***");
        System.out.println("Mensaje: "+ mensaje);
        System.out.println(" ");
    }
}
