package EjercicioBridge;

public class Linux implements IPlataforma{
    private IArquitectura arquitectura;

    public Linux(IArquitectura arquitectura) {
        this.arquitectura = arquitectura;
    }

    @Override
    public void plataforma() {
        System.out.println("LINUX");
        arquitectura.arquitectura();

    }
}
