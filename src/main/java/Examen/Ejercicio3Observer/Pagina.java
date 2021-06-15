package Examen.Ejercicio3Observer;

import java.util.ArrayList;
import java.util.List;

public class Pagina implements IPagina {
    private List<IUsuario> observerList= new ArrayList<>();

    private List<Video> videoList = new ArrayList<>();
    private List<Imagen> imagenList = new ArrayList<>();

    public void uploadNewPost(Video video,Imagen imagen){
        videoList.add(video);
        imagenList.add(imagen);
        this.notifyObserver(video,imagen);
    }

    @Override
    public void attach(IUsuario observer) {
        observerList.add(observer);
    }

    @Override
    public void deattach(IUsuario observer) {
        observerList.remove(observer);
    }


    @Override
    public void notifyObserver(Video video,Imagen imagen) {
        for (IUsuario userYoutube:observerList) {
            if (userYoutube.equals(userYoutube)){
                // notificacion
                userYoutube.update("Se subio un nuevo video titulo: "+video.getTitulo(),video,imagen);
            }

        }
    }
}
