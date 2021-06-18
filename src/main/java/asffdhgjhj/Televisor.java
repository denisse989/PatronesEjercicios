package asffdhgjhj;

public class Televisor implements ITelevisor{

    private String sistemaOperativo;
    private String versionDelSO;
    private String pulgadas;
    private String resolucion;
    private Boolean puertoHdmi;
    private String puertosUSB;
    private Boolean controlRemoto;
    private Boolean bluetooth;
    private String serialDelTelevisor;

    public Televisor() { }

    public String getSistemaOperativo() { return sistemaOperativo; }
    public void setSistemaOperativo(String sistemaOperativo) { this.sistemaOperativo = sistemaOperativo; }

    public String getVersionDelSO() {
        return versionDelSO;
    }
    public void setVersionDelSO(String versionDelSO) {
        this.versionDelSO = versionDelSO;
    }

    public String getPulgadas() {
        return pulgadas;
    }
    public void setPulgadas(String pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getResolucion() {
        return resolucion;
    }
    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getPuertoHdmi() {
        return puertoHdmi;
    }
    public void setPuertoHdmi(Boolean puertoHdmi) {
        this.puertoHdmi = puertoHdmi;
    }

    public String getPuertosUSB() {
        return puertosUSB;
    }
    public void setPuertosUSB(String puertosUSB) {
        this.puertosUSB = puertosUSB;
    }

    public Boolean getControlRemoto() {
        return controlRemoto;
    }
    public void setControlRemoto(Boolean controlRemoto) {
        this.controlRemoto = controlRemoto;
    }

    public Boolean getBluetooth() {
        return bluetooth;
    }
    public void setBluetooth(Boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getSerialDelTelevisor() {
        return serialDelTelevisor;
    }
    public void setSerialDelTelevisor(String serialDelTelevisor) {
        this.serialDelTelevisor = serialDelTelevisor;
    }


    @Override
    public Object clone() {
        Televisor objClone = new Televisor();
        objClone.setBluetooth(this.bluetooth);
        objClone.setControlRemoto(this.controlRemoto);
        objClone.setPuertoHdmi(this.puertoHdmi);
        objClone.setPuertosUSB(this.puertosUSB);
        objClone.setPulgadas(this.pulgadas);
        objClone.setResolucion(this.resolucion);
        objClone.setSerialDelTelevisor(this.serialDelTelevisor);
        objClone.setSistemaOperativo(this.sistemaOperativo);
        objClone.setVersionDelSO(this.versionDelSO);

        return objClone;
    }
    public void showInformatio(){
        System.out.println("***********************");
        System.out.println("Sistema Operativo: "+ sistemaOperativo);
        System.out.println("Version del sistema operativo: "+versionDelSO);
        System.out.println("Pulgadas: "+pulgadas);
        System.out.println("Resolucion: "+resolucion);
        System.out.println("Puerto HDMI: "+puertoHdmi);
        System.out.println("Puertos USB: "+puertosUSB);
        System.out.println("Control remoto: "+controlRemoto);
        System.out.println("Bluetooth: "+ bluetooth);
        System.out.println("Serial del Televisor:"+serialDelTelevisor);

        System.out.println("");

    }
}
