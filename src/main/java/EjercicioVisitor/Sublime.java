package EjercicioVisitor;

public class Sublime implements IEditoresDeTexto {
    private String body;

    public Sublime(String body) {
        this.body = body;
    }

    public Sublime() {

    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public void guardar(IGuardar visitante) {
        visitante.guardando(this);

    }
    @Override
    public void crear(String texto) {
        System.out.println("Creando Texto");
        this.setBody(texto);
        System.out.println("Texto: "+texto);
    }

    @Override
    public void editar(String texto) {
        System.out.println("Editando Texto");
        this.setBody(texto);
        System.out.println("Texto: "+texto);


    }

    @Override
    public void eliminar(String texto) {
        System.out.println("Eliminar Texto");
        this.setBody("");
        System.out.println("Texto: "+texto);

    }
}
