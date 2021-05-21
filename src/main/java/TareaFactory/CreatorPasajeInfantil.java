package TareaFactory;

public class CreatorPasajeInfantil extends CreatorPasaje{
    @Override
    public PasajeInfantil create() {

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

        PasajeInfantil pasajeInfantil= new PasajeInfantil();
        pasajeInfantil.setNumeroVuelo("123");
        pasajeInfantil.setOrigen(origen);
        pasajeInfantil.setDestino(destino);
        pasajeInfantil.setAvion(avion);
        pasajeInfantil.setPasajero(pasajero);
        pasajeInfantil.setNumeroAsiento("0");
        pasajeInfantil.setCostoEspecial("300bs");
        return pasajeInfantil;
    }
}
