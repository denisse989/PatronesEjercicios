package PracticaFinal.Ejercicio4Proxy;


public class Cliente {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new Servidor1(), new Servidor2());

        proxy.register(1,"JUAN1","123");
        proxy.register(2,"JUAN2","456");
        proxy.register(3,"JUAN3","789");
        proxy.register(4,"JUAN4","101");

        proxy.atender(1,"JUAN1","123");
        proxy.atender(2,"JUAN2","123");
        proxy.atender(5,"JUAN3","789");
        proxy.atender(4,"JUAN4","101");


}
}
