package EjercicioVisitor;

public class Cliente {
    public static void main(String []sss){
        Word word=new Word();
        word.crear("HOLA");

        Sublime sublime=new Sublime();
        sublime.crear("hola2");

        Notepad notepad=new Notepad();
        notepad.crear("HOLO3");

       Guardar guardar=new Guardar();
       word.guardar(guardar);
       sublime.guardar(guardar);
       notepad.guardar(guardar);;


    }
}
