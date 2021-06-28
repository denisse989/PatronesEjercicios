package PracticaFinal.Ejercicio3Composite;

public abstract class BasicArchivo {
    int numeroPalabras;
    String contenido;

    public int getNumeroDePalabras() {
        return numeroPalabras;
    }

    public void setNumeroPalabras(int numeroPalabras) {
        this.numeroPalabras = numeroPalabras;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenidos) {
        this.contenido = contenidos;
    }

    public abstract void MostrarPalabras();

    public abstract void add(BasicArchivo component);
    public abstract void remove(BasicArchivo component);
    public abstract void getChild(int position);
}
