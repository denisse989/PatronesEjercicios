package EjerciciosPracticaSegundoParcial.Ejercicio4Strategy;

import java.util.List;

public class BusquedaPocosPrecio implements IBusquedaPrecio {
    @Override
    public void busquedaPrecio(List<Celular> listCelular, int precio) {
        System.out.println("Buscando según el precio entre pocos: " + precio);
        for (Celular c : listCelular) {
            if (c.getPrecio() == precio) {
                c.showInfo();
            }
        }

    }
}
