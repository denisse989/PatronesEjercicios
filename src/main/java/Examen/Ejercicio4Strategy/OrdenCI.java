package Examen.Ejercicio4Strategy;

import java.util.List;
import java.util.LinkedList;

public class OrdenCI implements IOrden {
    @Override
    public void ordenar(List<Usuarios> listUsuarios) {
        System.out.println("ORDENAR POR CI: ");
        List<Usuarios> ordenado = new LinkedList<Usuarios>();
        int menor;
        while (ordenado.size() != listUsuarios.size()) {
            menor = 10000;
            Usuarios menor1 = null;
            for (Usuarios usuario : listUsuarios) {
                if (usuario.getCi() < menor && !ordenado.contains(usuario)) {
                    menor = usuario.getCi();
                    menor1 = usuario;
                }
            }
            ordenado.add(menor1);
        }
        for (Usuarios usuario : ordenado) {
            usuario.showInfo();
        }


    }
}
