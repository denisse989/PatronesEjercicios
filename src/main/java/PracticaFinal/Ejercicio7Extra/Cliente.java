package PracticaFinal.Ejercicio7Extra;

public class Cliente {
    public static void main(String[] args) {
        Duenos presidente = new Presidente();
        Duenos vicePresidente = new VicePresidente();
        Duenos contabilidad = new Contabilidad();

        CuentaSingleton cuenta = CuentaSingleton.getInstance();

        cuenta.addDueno(presidente);
        cuenta.addDueno(vicePresidente);
        cuenta.addDueno(contabilidad);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                cuenta.pagar(cuenta.repararComputador(new PC(32, "LG")));
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                cuenta.pagar(cuenta.repararComputador(new Tablet(9, "SAMSUNG")));

            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                cuenta.pagar(cuenta.repararComputador(new Laptop(16, "HP")));

            }
        });

        thread1.run();
        thread2.run();
        thread3.run();

    }
}
