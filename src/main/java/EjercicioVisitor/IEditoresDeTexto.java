package EjercicioVisitor;

public interface IEditoresDeTexto {
    void guardar(IGuardar visitante);
    void crear(String texto);
    void editar(String texto);
    void eliminar(String texto);
}
