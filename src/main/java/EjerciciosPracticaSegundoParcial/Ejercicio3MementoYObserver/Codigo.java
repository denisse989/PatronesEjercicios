package EjerciciosPracticaSegundoParcial.Ejercicio3MementoYObserver;

public class Codigo {
    private int version;
    private String codigo;
    public Codigo(int version, String codigo) {
        super();
        this.version = version;
        this.codigo = codigo;
    }
    public int getVersion() {
        return version;
    }
    public void setVersion(int version) {
        this.version = version;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void showInfo() {
        System.out.println("*** INFORMACION CODIGO *** ");
        System.out.println("VERSION: "+version);
        System.out.println("CODIGO:"+codigo);
        System.out.println(" ");
    }
}
