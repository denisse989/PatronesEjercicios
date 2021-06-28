package PracticaFinal.Ejercicio4Proxy;

public class Servidor2 implements ICluster {
    @Override
    public void atender(int usuario, String nombre, String password) {
        System.out.println("*** SERVIDOR 2 ***");
        System.out.println("Se esta atendiendo al usuario: "+nombre);
        System.out.println(" ");
    }
}
