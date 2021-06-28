package PracticaFinal.Ejercicio5Adapter;

public class Cliente {
    public static void main(String[] args) {
        Android android = new Android();
        IOS ios = new IOS();
        WindowsPhone windowsPhone = new WindowsPhone();

        AplicacionAdapter aplicacionAdapter1 = new AplicacionAdapter(new WEB());
        AplicacionAdapter aplicacionAdapter2 = new AplicacionAdapter(new Escritorio());

        android.login();
        android.logout();
        android.reportes();

        ios.login();
        ios.logout();
        ios.reportes();

        windowsPhone.login();
        windowsPhone.logout();
        windowsPhone.reportes();

        aplicacionAdapter1.login();
        aplicacionAdapter1.logout();
        aplicacionAdapter1.reportes();

        aplicacionAdapter2.login();
        aplicacionAdapter2.logout();
        aplicacionAdapter2.reportes();
    }
}
