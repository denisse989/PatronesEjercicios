package EjerciciosPracticaSegundoParcial.Ejercicio4Strategy;

import java.util.List;

public class BusquedaMuchosModelo implements IBusquedaModelo {
    @Override
    public void busquedaModelo(List<Celular> listCelular, String modelo) {
        System.out.println("Buscando el modelo entre muchos: "+modelo);
        for (Celular c : listCelular) {
            if (c.getModelo().equals(modelo)) {
                c.showInfo();
            }
        }

    }
}
