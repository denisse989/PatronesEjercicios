package EjerciciosPracticaSegundoParcial.Ejercicio3MementoYObserver;

public class Desarrolladores implements ISuscripcion {
    private String nombre;

    public Desarrolladores(String nombre) {
        this.nombre=nombre;
    }
    @Override
    public void update(String message) {
        System.out.println("********* NOTIFY *********");
        System.out.println(message);
        System.out.println("Del desarrollador "+nombre);


    }
}
