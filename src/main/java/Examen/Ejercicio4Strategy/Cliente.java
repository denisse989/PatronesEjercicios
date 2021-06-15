package Examen.Ejercicio4Strategy;
import java.util.List;
import java.util.LinkedList;

public class Cliente {
    public static void main(String[] args) {
        BaseDeDatos baseDeDatos = new BaseDeDatos();

        OrdenCI ordenCI = new OrdenCI();
        OrdenNombre ordenNombre = new OrdenNombre();
        OrdenNacimientoOProfesion ordenNacimientoOProfesion = new OrdenNacimientoOProfesion();

        Usuarios usuario1 = new Usuarios(1, "a", 20001225, "artista");
        Usuarios usuario2 = new Usuarios(2, "c", 20021225, "bajista");
        Usuarios usuario3 = new Usuarios(3, "b", 20061225, "cantante");
        Usuarios usuario4 = new Usuarios(4, "e", 20041225, "escritor");
        Usuarios usuario5 = new Usuarios(5, "d", 20081225, "dentista");


        List<Usuarios> usuarios = new LinkedList<Usuarios>();

        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        usuarios.add(usuario4);
        usuarios.add(usuario5);

        baseDeDatos.setListUsuarios(usuarios);
        baseDeDatos.setOrdenamiento(ordenCI);
        baseDeDatos.ordenar1();

        baseDeDatos.setOrdenamiento(ordenNombre);
        baseDeDatos.ordenar1();

        baseDeDatos.setOrdenamiento(ordenNacimientoOProfesion);
        baseDeDatos.ordenar1();
    }
}
