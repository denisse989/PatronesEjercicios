package Examen.Ejercicio3Observer;

public class Registro implements  IUsuario{
    private Boolean soloVideo;
    private Boolean imagen;
    private Persona persona;

    public Registro(Persona persona, Boolean soloVideo,Boolean imagen) {
        this.persona=persona;
        this.soloVideo = soloVideo;
        this.imagen=imagen;
    }

    @Override
    public void update(String message, Video video,Imagen imagen) {
        System.out.println("********* NOTIFY *********");
        System.out.println(message);
        persona.info();
        video.info();
    }

    public Boolean getSoloVideo() {
        return soloVideo;
    }

    public void setSoloVideo(Boolean soloVideo) {
        this.soloVideo = soloVideo;
    }

    public Boolean getImagen() {
        return imagen;
    }

    public void setImagen(Boolean imagen) {
        this.imagen = imagen;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
