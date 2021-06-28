package EjercicioDecorator;
import java.util.Random;

public class Promocion extends Funcionalidades {
    private Boolean participando;

    public Promocion(IBanco banco, Boolean participando) {
        super(banco);
        this.participando = participando;
    }

    @Override
    public void operation() {
        super.operation();
        if (participando) {
            Random r = new Random();
            int numero = r.nextInt(10)+1;
            System.out.println("Numero que le toco: "+numero);
            if (numero % 2 == 0) {
                System.out.println("Gano el sorte!");
                System.out.println("Monto Actual:" + super.getMonto());
                System.out.println("Monto con Promocion:" + super.getMonto() * 2);

                System.out.println(" ");

            } else {
                System.out.println("No participa");
                System.out.println(" ");
            }
        }
    }
}
