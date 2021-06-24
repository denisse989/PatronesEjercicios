package TareaProxy;

public class Cliente {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(500);

        proxy.comprar(100, "BOLIVIANOS");
        proxy.comprar(50, "DOLARES");
        proxy.comprar(10, "EUROS");
        proxy.comprar(50, "PESOS");


    }
}
