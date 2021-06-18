package EjercicioVisitor;

public class Word implements IEditoresDeTexto{
    private String body;

    public Word(String texto) {
        this.body = texto;
    }

    public Word() {

    }

    public String getTexto() {
        return body;
    }

    public void setTexto(String texto) {
        this.body = texto;

    }

    @Override
    public void guardar(IGuardar visitante) {
        visitante.guardando(this);
    }

    @Override
    public void crear(String texto) {
        System.out.println("Creando Texto");
        this.setTexto(texto);
        System.out.println("Texto: "+texto);
    }

    @Override
    public void editar(String texto) {
        System.out.println("Editando Texto");
        this.setTexto(texto);
        System.out.println(texto);

    }

    @Override
    public void eliminar(String texto) {
        System.out.println("Eliminar Texto");
        this.setTexto("");
    }
}
