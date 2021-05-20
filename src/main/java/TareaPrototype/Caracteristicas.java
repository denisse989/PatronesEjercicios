package TareaPrototype;


public class Caracteristicas implements ICaracteristicas {
    private String tamano;
    private String cpu;
    private String memory;
    private SIM sim;
    private String versionAndroid;
    private String camara;
    private String bluetoo;
    private String cantidadDeMemoriasExternas;
    private String tipoBateria;
    private Accesorios accesorios;

    public Caracteristicas(){}

    public String getTamano(){return tamano;}
    public void setTamano(String tamano){this.tamano = tamano;}
    public String getCpu(){return cpu;}
    public void setCpu(String cpu){this.cpu = cpu;}
    public String getMemory(){return memory;}
    public void setMemory(String memory){this.memory = memory;}
    public String getVersionAndroid(){return versionAndroid;}
    public void setVersionAndroid(String versionAndroid){this.versionAndroid= versionAndroid;}
    public String getCamara(){return camara;}
    public void setCamara(String camara){this.camara = camara;}
    public String getBluetoo(){return bluetoo;}
    public void setBluetoo(String bluetoo){this.bluetoo= bluetoo;}
    public String getCantidadDeMemoriasExternas(){return cantidadDeMemoriasExternas;}
    public void setCantidadDeMemoriasExternas(String cantidadDeMemoriasExternas){this.cantidadDeMemoriasExternas = cantidadDeMemoriasExternas;}
    public String getTipoBateria(){return tipoBateria;}
    public void setTipoBateria(String tipoBateria){this.tipoBateria = tipoBateria;}
    public SIM getSim(){return sim;}
    public void setSim(SIM sim){this.sim = sim;}
    public Accesorios getAccesorios(){return accesorios;}
    public void setAccesorios(Accesorios accesorios){this.accesorios = accesorios;}



    @Override
    public Object clone() {
        Caracteristicas objClone = new Caracteristicas();
        objClone.setBluetoo(this.bluetoo);
        objClone.setCamara(this.camara);
        objClone.setCpu(this.cpu);
        objClone.setMemory(this.memory);
        objClone.setCantidadDeMemoriasExternas(this.cantidadDeMemoriasExternas);
        objClone.setTipoBateria(this.tipoBateria);
        objClone.setVersionAndroid(this.versionAndroid);
        objClone.setTamano(this.tamano);
        objClone.setSim(this.sim);
        objClone.setAccesorios(this.accesorios);
        return objClone;
    }
    public void showInformatio(){
        System.out.println("***********************");
        System.out.println("Tamaño:"+ tamano);
        System.out.println("CPU: "+cpu);
        System.out.println("Memoria: "+memory);
        System.out.println("SIM nombre de Empresa Telefonica: "+ sim.getNombreEmpresaTel());
        System.out.println("SIM numero de telefono: "+ sim.getNumeroTelefono());
        System.out.println("Version Android: "+versionAndroid);
        System.out.println("Camara: "+camara);
        System.out.println("Bluetoo: "+ bluetoo);
        System.out.println("Cantidad de memorias externas: "+ cantidadDeMemoriasExternas);
        System.out.println("Bateria: "+tipoBateria);
        System.out.println("Accesorios: "+ accesorios.getAudifonos()+", "+accesorios.getCargador()+", "+accesorios.getOtro());

    }
}
