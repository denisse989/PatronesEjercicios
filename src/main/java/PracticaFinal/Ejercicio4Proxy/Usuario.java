package PracticaFinal.Ejercicio4Proxy;

public class Usuario {
    String nombre;
    String password;
    int id;

    public Usuario(int id, String nombre, String password) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void showInfo() {
        System.out.println("*** INFORMACION CLIENTE *** ");
        System.out.println("ID: " + id);
        System.out.println("Nombre usuario: " + nombre);
        System.out.println(" ");

    }
}
