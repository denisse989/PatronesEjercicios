package TareaFactory;

public class PasajeSolidario implements IPasaje{
    private String numeroVuelo;
    private Origen origen;
    private Destino destino;
    private Avion avion;
    private Pasajero pasajero;
    private String numeroAsiento;
    private String costo;
    private String descuento;
    private String motivoDescuento;

    @Override
    public void crear() {
        System.out.println("Numero de vuelo: "+numeroVuelo);
        origen.showInfo();
        destino.showInfo();
        avion.showInfo();
        pasajero.showInfo();
        System.out.println("Numero de Asiento: "+numeroAsiento);
        System.out.println("Costo de pasaje: "+costo);
        System.out.println("Descuento de pasaje: "+descuento);
        System.out.println("Motivo del descuento: "+motivoDescuento);
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

    public String getCosto() { return costo; }
    public void setCosto(String costo) { this.costo = costo; }

    public String getDescuento() { return descuento; }
    public void setDescuento(String descuento) { this.descuento = descuento; }

    public String getMotivoDescuento() { return motivoDescuento; }
    public void setMotivoDescuento(String motivoDescuento) { this.motivoDescuento = motivoDescuento; }
}
