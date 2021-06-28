package PracticaFinal.Ejercicio5Adapter;

public class Escritorio implements IAplicacionesComputadora {
    @Override
    public void iniciarSesion() {
        System.out.println("***** ");
        System.out.println("INICIANDO SESION EN LA APLICACION DE ESCRITORIO");
        System.out.println(" ");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("***** ");
        System.out.println("CERRANDO SESION EN LA APLICACION DE ESCRITORIO");
        System.out.println(" ");
    }

    @Override
    public void generarDatos() {
        System.out.println("***** ");
        System.out.println("GENERANDO DATOS EN LA APLICACION DE ESCRITORIO");
        System.out.println(" ");
    }
}
