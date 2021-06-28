package PracticaFinal.Ejercicio6Visitor;

import java.util.Random;

public class AplicacionVisitor implements IAplicacionVisitor {
    @Override
    public void mantenimiento(Celular celular) {
        celular.showInfo();
        System.out.println("SE RECOMIENDA MANTENIMIENTO PREVENTIVO PARA EL CELULAR");
        System.out.println(" ");
    }

    @Override
    public void mantenimiento(Computadora computadora) {

        Random rd = new Random();
        int numeroAleatorio = rd.nextInt(100) + 1;
        if (numeroAleatorio % 2 == 0) {
            System.out.println("SE RECOMIENDA MANTENIMIENTO PREVENTIVO PARA LA COMPUTADORA");
            System.out.println(" ");
        } else {
            System.out.println("SE RECOMIENDA MANTENIMIENTO CORRECTIVO PARA LA COMPUTADORA");
            System.out.println(" ");
        }
    }

    @Override
    public void mantenimiento(Televisor televisor) {
        televisor.showInfo();
    }
}
