package Examen.Ejercicio4Strategy;

import java.util.List;
import java.util.LinkedList;

public class OrdenNacimientoOProfesion implements IOrden {
    @Override
    public void ordenar(List<Usuarios> listUsuarios) {
        System.out.println("ORDENAR POR PROFESION O FECHA DE NACIMIENTO: ");

        List<Usuarios> ordenarProfesion = new LinkedList<Usuarios>();
        for (Usuarios usuario : ordenarProfesion) {
            ordenarProfesion.add(usuario);
        }
        char menor;
        while (ordenarProfesion.size() != listUsuarios.size()) {
            menor = 'z';
            Usuarios menor1 = null;
            for (Usuarios usuario : listUsuarios) {

                if (usuario.getProfesion().charAt(0) < menor && !ordenarProfesion.contains(usuario)) {
                    menor = usuario.getProfesion().charAt(0);
                    menor1 = usuario;
                }
            }
            ordenarProfesion.add(menor1);
        }
        boolean ordenado = false;
        while (!ordenado) {
            ordenado = true;
            for (int i = 1; i < ordenarProfesion.size(); i++) {
                if (ordenarProfesion.get(i).getProfesion().equals(ordenarProfesion.get(i - 1).getProfesion())
                        && ordenarProfesion.get(i).getFechaNacimiento() < ordenarProfesion.get(i - 1)
                        .getFechaNacimiento()) {
                    ordenado=false;
                    Usuarios u = ordenarProfesion.remove(i);
                    ordenarProfesion.add(i + 1, u);
                }
            }
        }
        for (Usuarios usuario : ordenarProfesion) {
            usuario.showInfo();
        }
        
    }
}
