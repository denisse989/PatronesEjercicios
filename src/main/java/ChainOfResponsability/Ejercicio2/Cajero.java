package ChainOfResponsability.Ejercicio2;

public class Cajero implements IResponsable {
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
        if ( persona.getFicha()&persona.getCertificadoDeNacimiento()& (!persona.getPagoAlBanco())){
            System.out.println("************ ");
            System.out.println("Cajero: Tome su factura, sera atendido");
            System.out.println(" ");
            persona.setPagoAlBanco(true);
            this.next.criteriaHandler(persona);
        } else {
            this.next.criteriaHandler(persona);
        }
    }


}
