package Examen.Ejercicio3Observer;

public interface IPagina {
    void attach(IUsuario observer);
    void deattach(IUsuario observer);
    void notifyObserver(Video video,Imagen imagen);
}
