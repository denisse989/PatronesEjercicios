package TareaPrototype;

public class Accesorios {
    private String audifonos ="Audifonos";
    private String cargador ="Cargador";
    private String otro;

    public Accesorios(String otro){
        this.otro=otro;
    }

    public String getAudifonos() {
        return audifonos ;
    }
    public void setAudifonos(String audifonos ) { this.audifonos=audifonos; }

    public String getCargador() {
        return cargador;
    }
    public void setCargador(String cargador ) {
        this.cargador=cargador;
    }

    public String getOtro() {
        return otro;
    }
    public void setOtro(String otro ) {
        this.otro=otro;
    }

}
