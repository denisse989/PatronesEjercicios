package EjerciciosPracticaSegundoParcial.Ejercicio5Mediator;

import java.util.LinkedList;
import java.util.List;

public class Cliente {
    public static void main(String[] args) {
        Whatsapp whatsapp = new Whatsapp();

        Usuario usuario1 = new UsuarioDeWhatsapp(whatsapp, "Juan1");
        Usuario usuario2 = new UsuarioDeWhatsapp(whatsapp, "Juan2");
        Usuario usuario3 = new UsuarioDeWhatsapp(whatsapp, "Juan3");
        Usuario usuario4 = new UsuarioDeWhatsapp(whatsapp, "Juan4");
        Usuario usuario5 = new UsuarioDeWhatsapp(whatsapp, "Juan5");
        Usuario usuario6 = new UsuarioDeWhatsapp(whatsapp, "Juan6");
        Usuario usuario7 = new UsuarioDeWhatsapp(whatsapp, "Juan7");
        Usuario usuario8 = new UsuarioDeWhatsapp(whatsapp, "Juan8");
        Usuario usuario9 = new UsuarioDeWhatsapp(whatsapp, "Juan9");
        Usuario usuario10 = new UsuarioDeWhatsapp(whatsapp, "Juan10");

        List<Usuario> listUsuarios = new LinkedList<Usuario>();

        listUsuarios.add(usuario1);
        listUsuarios.add(usuario2);
        listUsuarios.add(usuario3);
        listUsuarios.add(usuario4);
        listUsuarios.add(usuario5);
        listUsuarios.add(usuario6);
        listUsuarios.add(usuario7);
        listUsuarios.add(usuario8);
        listUsuarios.add(usuario9);
        listUsuarios.add(usuario10);

        GrupoUsuarios grupoUsuarios = new GrupoUsuarios("GRUPO JUAN");

        grupoUsuarios.setGrupo(listUsuarios);

        whatsapp.addGrupo(grupoUsuarios);

        usuario1.sendPerson("HOLO", usuario2);

        usuario10.sendGroup("JUAN TAS AHI?!", grupoUsuarios.getNombre());

    }
}
