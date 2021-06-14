package EjerciciosPracticaSegundoParcial.Ejercicio5Mediator;

import java.util.LinkedList;
import java.util.List;

public class Whatsapp implements ICanalDeComunicacion {
    private List<GrupoUsuarios> gruposList = new LinkedList<GrupoUsuarios>();

    public void addGrupo(GrupoUsuarios grupo) {
        gruposList.add(grupo);
    }
    @Override
    public void send(String message, Usuario usuario) {
        usuario.messageReceived(message);
    }

    @Override
    public void sendGroup(String message, String nombreGrupo, Usuario origen) {
        GrupoUsuarios grupoActual = new GrupoUsuarios("");
        for (GrupoUsuarios grupoUsuarios : gruposList) {
            if(grupoUsuarios.getNombre().equals(nombreGrupo)) {
                grupoActual=grupoUsuarios;
                break;
            }
        }
        for (Usuario usuario : grupoActual.getGrupo()) {
            if(!usuario.equals(origen)) {
                usuario.messageReceived(message);
            }
        }
    }
}
