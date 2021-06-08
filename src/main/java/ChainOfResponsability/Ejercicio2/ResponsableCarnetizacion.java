package ChainOfResponsability.Ejercicio2;

public class ResponsableCarnetizacion implements IResponsable {
    private IResponsable next;

    @Override
    public void setNext(IResponsable responsable) {
        this.next=responsable;
    }

    @Override
    public IResponsable next() {
        return this.next;

    }

    @Override
    public void criteriaHandler(Persona persona) {
        if (persona.getCertificadoDeNacimiento()&&persona.getFicha()&& persona.getPagoAlBanco() ){
            System.out.println("************ ");
            System.out.println("Responsable de Carnetizacion: Se realizara el carnet");
            System.out.println(" ");
        } else {
            this.next.criteriaHandler(persona);
        }
    }


}
