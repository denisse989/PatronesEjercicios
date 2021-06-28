package PracticaFinal.Ejercicio7Extra;

public class Contabilidad extends Duenos {
    public Contabilidad() {}

    @Override
    public void messageReceived(String mensaje) {
        System.out.println("*** NOTIFICANDO A CONTABILIDAD ***");
        System.out.println("Mensaje: "+ mensaje);
        System.out.println(" ");
    }
}
