package EjerciciosPracticaSegundoParcial.Ejercicio4Strategy;

import java.util.LinkedList;
import java.util.List;

public class Cliente {
    public static void main(String[] args) {
        TiendaCelulares tiendaCelular = new TiendaCelulares(3);

        List<Celular> listCelulares = new LinkedList<Celular>();

        listCelulares.add(new Celular("S20","Samsung","Baja",100));
        listCelulares.add(new Celular("S30","Samsung","Media",200));
        listCelulares.add(new Celular("J20","Samsung","Alta",300));

        tiendaCelular.setList(listCelulares);

        tiendaCelular.buscarSegunModelo("S20");
        tiendaCelular.buscarSegunPrecio(300);

        tiendaCelular.add(new Celular("N50","Samsung","Alta", 400));

        tiendaCelular.buscarSegunModelo("N50");
        tiendaCelular.buscarSegunPrecio(400);
    }
}
