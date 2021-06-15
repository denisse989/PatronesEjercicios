package ChainOfResponsability.Ejercicio2;

public class Notario implements IResponsable {
    private IResponsable next;

    @Override
    public void setNext(IResponsable encargado) {
        this.next=encargado;
    }

    @Override
    public IResponsable next() {
        return this.next;

    }

    @Override
    public void criteriaHandler(Persona persona) {
        if (persona.getPagoAlBanco() && persona.getFicha() && (!persona.getCertificadoDeNacimiento())){
            System.out.println("************ ");
            System.out.println("NOTARIO: Tome su certificado, sera atendido");
            System.out.println(" ");
            persona.setCertificadoDeNacimiento(true);
            this.next.criteriaHandler(persona);
        } else {
            this.next.criteriaHandler(persona);
        }
    }


}
