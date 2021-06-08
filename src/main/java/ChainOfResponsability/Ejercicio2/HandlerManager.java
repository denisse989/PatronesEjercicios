package ChainOfResponsability.Ejercicio2;

public class HandlerManager implements IResponsable {
    private IResponsable next;

    @Override
    public void setNext(IResponsable handler) {
        this.next=handler;
    }

    @Override
    public IResponsable next() {
        return this.next;
    }

    @Override
    public void criteriaHandler(Persona persona) {
        AyudaAlCliente ayudaAlCliente = new AyudaAlCliente();
        this.setNext(ayudaAlCliente);

       Notario notario = new Notario();
        ayudaAlCliente.setNext(notario);

        Cajero cajero = new Cajero();
        notario.setNext(cajero);

        ResponsableCarnetizacion responsableCarnetizacion = new ResponsableCarnetizacion();
        cajero.setNext(responsableCarnetizacion);



        this.next.criteriaHandler(persona);
    }
}
