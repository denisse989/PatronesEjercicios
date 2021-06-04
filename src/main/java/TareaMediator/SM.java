package TareaMediator;

public class SM extends Colleague{

    private String ci;
    private String name;
    private String certificaciones;

    public SM(ICanalDeComunicacion mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        canalDeComunicacion.send(message,this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("INFO - Message Received "+" SM "+","+name+", "+certificaciones+" > "+message);
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(String certificaciones) {
        this.certificaciones = certificaciones;
    }
}
