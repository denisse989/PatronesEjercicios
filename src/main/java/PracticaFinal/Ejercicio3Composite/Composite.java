package PracticaFinal.Ejercicio3Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends BasicArchivo {
    List<BasicArchivo> basicArchivoList;

    public Composite() {
        basicArchivoList = new ArrayList<BasicArchivo>();
    }

    @Override
    public int getNumeroDePalabras() {
        int palabras = 0;
        for (BasicArchivo basicArchivo : basicArchivoList) {
            palabras += basicArchivo.getNumeroDePalabras();
        }
        return palabras;
    }

    @Override
    public void MostrarPalabras() {

        System.out.println("Numero de palabras: " + this.getNumeroDePalabras());
    }

    @Override
    public void add(BasicArchivo component) {
        basicArchivoList.add(component);

    }

    @Override
    public void remove(BasicArchivo component) {
        basicArchivoList.remove(component);

    }

    @Override
    public void getChild(int position) {
        basicArchivoList.get(position);


    }
}
