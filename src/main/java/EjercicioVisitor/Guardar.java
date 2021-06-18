package EjercicioVisitor;

public class Guardar implements IGuardar{
    @Override
    public void guardando(Word word) {
        System.out.println("Guardar como PDF:");
        System.out.println("Texto:"+word.getTexto()+".pdf");
        System.out.println("Cantidad de Caracteres: "+word.getTexto().length());
    }

    @Override
    public void guardando(Notepad notepad) {
        System.out.println("Guardar como PDF:");
        System.out.println("Texto:"+notepad.getBody()+".pdf");
        System.out.println("Cantidad de Caracteres: "+notepad.getBody().length());

    }

    @Override
    public void guardando(Sublime sublime) {
        System.out.println("Guardar como PDF:");
        System.out.println("Texto:"+sublime.getBody()+".pdf");
        System.out.println("Cantidad de Caracteres: "+sublime.getBody().length());

    }
}
