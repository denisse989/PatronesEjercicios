package TareasSingletonEjercicio;

public class EmpresaDeCambio {
    private static EmpresaDeCambio instance = null;

    private EmpresaDeCambio() {
        System.out.println("INFO> Iniciando Empresa de cambio de monedas");
    }

    public static EmpresaDeCambio getInstance() {
        if (instance == null)
            instance = new EmpresaDeCambio();
        return instance;
    }

    public void cambio(String lugarDeCambio, int monto, String tipoDelMonto, String tipoDeCambio) {
        if (tipoDelMonto == "bs" && tipoDeCambio == "$") {
            double total = monto / 7;
            System.out.println(lugarDeCambio +" <--- "+ monto + "bs ----> " + total + "$");

        } else if (tipoDelMonto == "$" && tipoDeCambio == "bs") {
            double total = monto * 7;
            System.out.println(lugarDeCambio +" <--- "+monto + "$ ----> " + total + "bs");

        } else if (tipoDelMonto == "bs" && tipoDeCambio == "E") {
            double total = monto / 9;
            System.out.println(lugarDeCambio +" <--- "+monto + "bs ----> " + total + "E");

        } else if (tipoDelMonto == "E" && tipoDeCambio == "bs") {
            double total = monto * 9;
            System.out.println(lugarDeCambio +" <--- "+monto + "E ----> " + total + "bs");

        } else {
            System.out.println("Warning > Tipo invalido");
        }
    }
}