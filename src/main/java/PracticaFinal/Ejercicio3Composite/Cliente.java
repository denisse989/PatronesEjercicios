package PracticaFinal.Ejercicio3Composite;

public class Cliente {
    public static void main(String[] args) {
        Archivo archivo1 = new Archivo("a");
        Archivo archivo2 = new Archivo("b");
        Archivo archivo3 = new Archivo("c");

        archivo1.MostrarPalabras();

        Archivo archivo4 = new Archivo("d");
        Archivo archivo5 = new Archivo("e");
        Archivo archivo6 = new Archivo("f");

        archivo6.MostrarPalabras();

        Composite folder1 = new Composite();

        folder1.add(archivo1);
        folder1.add(archivo2);
        folder1.add(archivo3);

        folder1.MostrarPalabras();

        Composite folder2 = new Composite();

        folder2.add(archivo4);
        folder2.add(archivo5);
        folder2.add(archivo6);

        folder2.MostrarPalabras();

        Composite unidadDisco = new Composite();

        unidadDisco.add(folder1);
        unidadDisco.add(folder2);

        unidadDisco.MostrarPalabras();
    }
}
