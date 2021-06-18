package EjercicioVisitor;

public interface IGuardar {
    void guardando(Word word);
    void guardando(Notepad notepad);
    void guardando(Sublime sublime);
}
