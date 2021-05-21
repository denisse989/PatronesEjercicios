package TareaFactory;

public class CreatorPasajeSolidario extends CreatorPasaje{
    @Override
    public PasajeSolidario create() {

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

        PasajeSolidario pasajeSolidario= new PasajeSolidario();
        pasajeSolidario.setNumeroVuelo("123");
        pasajeSolidario.setOrigen(origen);
        pasajeSolidario.setDestino(destino);
        pasajeSolidario.setAvion(avion);
        pasajeSolidario.setPasajero(pasajero);
        pasajeSolidario.setNumeroAsiento("0");
        pasajeSolidario.setCosto("300bs");
        pasajeSolidario.setDescuento("200bs");
        pasajeSolidario.setMotivoDescuento("necesidad");
        return pasajeSolidario;
    }
}
