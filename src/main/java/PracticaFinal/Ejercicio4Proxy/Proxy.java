package PracticaFinal.Ejercicio4Proxy;

import java.util.ArrayList;
import java.util.List;

public class Proxy implements ICluster {
    private Servidor1 servidor1;
    private Servidor2 servidor2;
    private List<Usuario> usuarios;

    public Proxy(Servidor1 servidor1, Servidor2 servidor2) {
        usuarios = new ArrayList<>();
        this.servidor1 = servidor1;
        this.servidor2 = servidor2;
    }
    public void register(int ci, String nombre, String password){
        usuarios.add(new Usuario(ci, nombre, password));
    }

    @Override
    public void atender(int usuario,String nombre, String password) {
        for (Usuario user : usuarios) {
            if (user.getId() == usuario && user.getPassword().equals(password)) {
                if (user.getId() % 2 != 0) {
                    servidor1.atender(usuario, nombre, password);
                    user.showInfo();
                } else {
                    servidor2.atender(usuario,nombre, password);
                    user.showInfo();
                }
            }
        }
    }

}
