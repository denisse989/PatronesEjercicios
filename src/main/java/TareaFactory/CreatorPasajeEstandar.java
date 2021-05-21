package TareaFactory;

public class CreatorPasajeEstandar extends CreatorPasaje{

    @Override
    public PasajeEstandar create() {

        Origen origen= new Origen();
        origen.setPais("Bolivia");
        origen.setCiudad("La Paz");
        origen.setNombreAeropuerto("Aeropuerto Internacional El Alto");

        Destino destino = new Destino();
        destino.setPais("Mexico");
        destino.setCiudad("Ciudad de Mexico");
        destino.setNombreAeropuerto("Aeropuerto Internacional de la Ciudad de México");

        Avion avion=new Avion();
        avion.setMarca("AVIANCA");
        avion.setCapacidad("47000 kilogramos");
        avion.setModelo("Airbus A330");
        avion.setNumeroAsientos("300");

        Pasajero pasajero =new Pasajero();
        pasajero.setNombre("0");
        pasajero.setCi("0");
        pasajero.setFechaNacimiento("0");

        PasajeEstandar pasajeEstandar= new PasajeEstandar();
        pasajeEstandar.setNumeroVuelo("123");
        pasajeEstandar.setOrigen(origen);
        pasajeEstandar.setDestino(destino);
        pasajeEstandar.setAvion(avion);
        pasajeEstandar.setPasajero(pasajero);
        pasajeEstandar.setNumeroAsiento("0");
        pasajeEstandar.setCosto("300bs");
        return pasajeEstandar;
    }
}
