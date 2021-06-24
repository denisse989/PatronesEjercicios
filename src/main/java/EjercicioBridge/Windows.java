package EjercicioBridge;

public class Windows implements IPlataforma{
    private IArquitectura arquitectura;

    public Windows(IArquitectura arquitectura) {
        this.arquitectura = arquitectura;
    }

    @Override
    public void plataforma() {
        System.out.println("WINDOWS");
     arquitectura.arquitectura();
    }
}
