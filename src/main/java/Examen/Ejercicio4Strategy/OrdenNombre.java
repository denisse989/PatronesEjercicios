package Examen.Ejercicio4Strategy;

import java.util.List;
import java.util.LinkedList;

public class OrdenNombre implements IOrden {
    @Override
    public void ordenar(List<Usuarios> listUsuarios) {
        System.out.println("ORDENAR POR NOMBRE: ");
        List<Usuarios> ordenado = new LinkedList<Usuarios>();
        for (Usuarios usuario : ordenado) {
            ordenado.add(usuario);
        }
        char menor;
        while (ordenado.size() != listUsuarios.size()) {
            menor = 'z';
            Usuarios menor1 = null;
            for (Usuarios usuario : listUsuarios) {
                if (usuario.getNombre().charAt(0) < menor && !ordenado.contains(usuario)) {
                    menor = usuario.getNombre().charAt(0);
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
