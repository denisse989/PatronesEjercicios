package EjerciciosPracticaSegundoParcial.Ejercicio4Strategy;

import java.util.List;

public class BusquedaPocosModelo implements IBusquedaModelo {
    @Override
    public void busquedaModelo(List<Celular> listCelular, String modelo) {
        System.out.println("Buscando  según el modelo entre pocos: " + modelo);
        for (Celular c : listCelular) {
            if (c.getModelo().equals(modelo)) {
                c.showInfo();
            }
        }

    }
}
