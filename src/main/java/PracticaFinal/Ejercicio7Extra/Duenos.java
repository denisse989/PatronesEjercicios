package PracticaFinal.Ejercicio7Extra;

public abstract class Duenos {
    protected Notificador canalDeComunicacion;


    public abstract void messageReceived(String mensaje);
}
