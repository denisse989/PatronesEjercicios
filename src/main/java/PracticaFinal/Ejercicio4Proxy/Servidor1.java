package PracticaFinal.Ejercicio4Proxy;

public class Servidor1 implements ICluster {
    @Override
    public void atender(int usuario, String nombre, String password) {
        System.out.println("*** SERVIDOR 1 ***");
        System.out.println("Se esta atendiendo al usuario: "+nombre);
        System.out.println(" ");

    }
}
