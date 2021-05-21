package TareaFactory;

public class PasajeInfantil implements IPasaje{
    private String numeroVuelo;
    private Origen origen;
    private Destino destino;
    private Avion avion;
    private Pasajero pasajero;
    private String numeroAsiento;
    private String costoEspecial;


    @Override
    public void crear() {
        System.out.println("Numero de vuelo: "+numeroVuelo);
        origen.showInfo();
        destino.showInfo();
        avion.showInfo();
        pasajero.showInfo();
        System.out.println("Numero de Asiento: "+numeroAsiento);
        System.out.println("Costo de pasaje: "+costoEspecial);
    }

    public String getNumeroVuelo() { return numeroVuelo; }
    public void setNumeroVuelo(String numeroVuelo) { this.numeroVuelo = numeroVuelo; }

    public Origen getOrigen() { return origen; }
    public void setOrigen(Origen origen) { this.origen = origen; }

    public Destino getDestino() { return destino; }
    public void setDestino(Destino destino) { this.destino = destino; }

    public Avion getAvion() { return avion; }
    public void setAvion(Avion avion) { this.avion = avion; }

    public Pasajero getPasajero() { return pasajero; }
    public void setPasajero(Pasajero pasajero) { this.pasajero = pasajero; }

    public String getNumeroAsiento() { return numeroAsiento; }
    public void setNumeroAsiento(String numeroAsiento) { this.numeroAsiento = numeroAsiento; }

    public String getCostoEspecial() { return costoEspecial; }
    public void setCostoEspecial(String costo) { this.costoEspecial = costo; }
}
