package PracticaFinal.Ejercicio3Composite;


public class Archivo extends BasicArchivo {
    public Archivo(String contenido) {
        this.contenido = contenido;
        this.numeroPalabras = contenido.split(" ").length;
    }

    @Override
    public void MostrarPalabras() {
        System.out.println("Numero de palabras: " + numeroPalabras);

    }

    @Override
    public void add(BasicArchivo component) {
        System.out.println("No aplicable");

    }

    @Override
    public void remove(BasicArchivo component) {
        System.out.println("No palicable");

    }

    @Override
    public void getChild(int position) {
        System.out.println("No aplicable");
    }
}
