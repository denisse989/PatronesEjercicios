package TareaFactory;

public class Cliente {

    public  static void main (String[]args){


        PasajeEstandar pasajeEstandar1 = new CreatorPasajeEstandar().create();
        Pasajero pasajero1= new Pasajero();
        pasajero1.setNombre("Jose");
        pasajero1.setCi("423212");
        pasajeEstandar1.setPasajero(pasajero1);
        pasajeEstandar1.setNumeroAsiento("31 p");
        pasajeEstandar1.crear();

        PasajeEstandar pasajeEstandar2 = new CreatorPasajeEstandar().create();
        Pasajero pasajero2= new Pasajero();
        pasajero2.setNombre("Maria");
        pasajero2.setCi("425762");
        pasajeEstandar2.setPasajero(pasajero2);
        pasajeEstandar2.setNumeroAsiento("32 v");
        pasajeEstandar2.crear();

        PasajeInfantil pasajeInfantil1= new CreatorPasajeInfantil().create();
        Pasajero pasajero3= new Pasajero();
        pasajero3.setNombre("Juan");
        pasajero3.setCi("4890266");
        pasajero3.setFechaNacimiento("25 Diciembre 2010");
        pasajeInfantil1.setPasajero(pasajero3);
        pasajeInfantil1.setNumeroAsiento("33 c");
        pasajeInfantil1.crear();

        PasajeInfantil pasajeInfantil2= new CreatorPasajeInfantil().create();
        Pasajero pasajero4= new Pasajero();
        pasajero4.setNombre("Mario");
        pasajero4.setCi("105266");
        pasajero4.setFechaNacimiento("12 Diciembre 2012");
        pasajeInfantil2.setPasajero(pasajero4);
        pasajeInfantil2.setNumeroAsiento("29 c");
        pasajeInfantil2.crear();

        PasajeSolidario pasajeSolidario1= new CreatorPasajeSolidario().create();
        Pasajero pasajero5= new Pasajero();
        pasajero5.setNombre("Rosario");
        pasajero5.setCi("1044756");
        pasajeSolidario1.setPasajero(pasajero5);
        pasajeSolidario1.setNumeroAsiento("10 c");
        pasajeSolidario1.crear();

        PasajeSolidario pasajeSolidario2= new CreatorPasajeSolidario().create();
        Pasajero pasajero6= new Pasajero();
        pasajero6.setNombre("Carlos");
        pasajero6.setCi("857356");
        pasajeSolidario2.setPasajero(pasajero6);
        pasajeSolidario2.setNumeroAsiento("40 p");
        pasajeSolidario2.crear();




    }
}
