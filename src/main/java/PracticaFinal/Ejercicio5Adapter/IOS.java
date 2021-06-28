package PracticaFinal.Ejercicio5Adapter;

public class IOS implements IAplicacionesMoviles {
    @Override
    public void login() {
        System.out.println(" ***** ");
        System.out.println("LOGIN EN LA APLICACION DE IOS");
        System.out.println(" ");
    }

    @Override
    public void logout() {
        System.out.println(" ***** ");
        System.out.println("LOGOUT EN LA APLICACION DE IOS");
        System.out.println(" ");
    }

    @Override
    public void reportes() {
        System.out.println(" ***** ");
        System.out.println("REPORTES EN LA APLICACION DE IOS");
        System.out.println(" ");
    }
}
