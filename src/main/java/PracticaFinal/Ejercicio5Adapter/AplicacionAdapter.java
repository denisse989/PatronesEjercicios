package PracticaFinal.Ejercicio5Adapter;

public class AplicacionAdapter implements IAplicacionesMoviles {
    private IAplicacionesComputadora aplicacionesComputadora;

    public AplicacionAdapter(IAplicacionesComputadora aplicacionesComputadora) {
        this.aplicacionesComputadora = aplicacionesComputadora;
    }

    @Override
    public void login() {
        System.out.println("*** ADAPTANDO ***");
        aplicacionesComputadora.iniciarSesion();
    }

    @Override
    public void logout() {
        System.out.println("*** ADAPTANDO ***");
        aplicacionesComputadora.cerrarSesion();

    }

    @Override
    public void reportes() {
        System.out.println("*** ADAPTANDO ***");
        aplicacionesComputadora.generarDatos();

    }

}
