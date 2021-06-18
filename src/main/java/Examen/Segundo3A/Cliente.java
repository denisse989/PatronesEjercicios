package Examen.Segundo3A;

public class Cliente {

    public static void main (String []args){

        NotificacionFacebook notificacionFacebook1 = new NotificacionFacebook();

        UsuarioRegistrado usuario1 =new UsuarioRegistrado(new Persona("Carla1"), "Imagen");
        UsuarioRegistrado usuario2 =new UsuarioRegistrado(new Persona( "Carla2"), "Video");
        UsuarioRegistrado usuario3 =new UsuarioRegistrado(new Persona("Carla3"), "Video");
        UsuarioRegistrado usuario4 =new UsuarioRegistrado(new Persona("Carla4"), "Imagen");
        UsuarioRegistrado usuario5 =new UsuarioRegistrado(new Persona("Carla5"), "Video");

        notificacionFacebook1.attach(usuario1);
        notificacionFacebook1.attach(usuario2);
        notificacionFacebook1.attach(usuario3);
        notificacionFacebook1.attach(usuario4);
        notificacionFacebook1.attach(usuario5);


        notificacionFacebook1.uploadNewNotificacion(new Notificacion("Video", "Se cargo el video"));

    }

}
