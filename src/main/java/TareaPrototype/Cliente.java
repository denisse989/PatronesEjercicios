package TareaPrototype;

import TareasSingletonEjercicio.Banco;
import TareasSingletonEjercicio.CasaDeCambio;
import TareasSingletonEjercicio.LibreCambista;

public class Cliente {

    public static void main (String [] argumento) {

        Caracteristicas caracteristicas= new Caracteristicas();

        caracteristicas.setTamano("6.4 pulgadas");
        caracteristicas.setMemory("0");  //puede ser 64 gb o 128 gb
        caracteristicas.setVersionAndroid("Android 9 con One UI");
        caracteristicas.setCpu("Exynos 9610 2.3GHz");
        caracteristicas.setTipoBateria("4.000 mAh");
        caracteristicas.setCamara("Triple, 25MP+5MP+8MP");
        caracteristicas.setBluetoo("Si");
        caracteristicas.setCantidadDeMemoriasExternas("1 micro SD");
        caracteristicas.setSim(new SIM("",""));
        caracteristicas.setAccesorios(new Accesorios(""));

        Caracteristicas primerSamsungR10= (Caracteristicas) caracteristicas.clone();
        primerSamsungR10.setMemory("64 GB");
        primerSamsungR10.setSim(new SIM("Telecel","8734590"));
        primerSamsungR10.setAccesorios(new Accesorios("Estuche"));

        Caracteristicas segundoSamsungR10= (Caracteristicas) caracteristicas.clone();
        segundoSamsungR10.setMemory("128 GB");
        segundoSamsungR10.setSim(new SIM("Entel","4529063"));
        segundoSamsungR10.setAccesorios(new Accesorios("Nada"));

        Caracteristicas tercerSamsungR10= (Caracteristicas) caracteristicas.clone();
        tercerSamsungR10.setMemory("64 GB");
        tercerSamsungR10.setSim(new SIM("Tigo","5014739"));
        tercerSamsungR10.setAccesorios(new Accesorios("Polera"));

        primerSamsungR10.showInformatio();
        segundoSamsungR10.showInformatio();
        tercerSamsungR10.showInformatio();
    }
}
