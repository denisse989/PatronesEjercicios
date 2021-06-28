package EjercicioDecorator;

public class Funcionalidades implements IBanco{
    private IBanco banco;

    public Funcionalidades(IBanco banco) {
        this.banco = banco;
    }

    public IBanco getBanco() {
        return banco;
    }

    public void setBanco(IBanco banco) {
        this.banco = banco;
    }

    @Override
    public void operation() {
        this.banco.operation();
    }

    @Override
    public double getMonto() {
        return banco.getMonto();
    }
}
