package ChainOfResponsability.Ejercicio2;


public class AyudaAlCliente implements IResponsable {
    private IResponsable next;

    @Override
    public void setNext(IResponsable responsable) {
        this.next = responsable;
    }

    @Override
    public IResponsable next() {
        return this.next;

    }

    @Override
    public void criteriaHandler(Persona persona) {
        if (!persona.getFicha()){
            System.out.println("************ ");
            System.out.println("Ayuda al cliente:");
            System.out.println("Los requisitos son:");
            System.out.println("* CERTIFICADO DE NACIMIENTO");
            System.out.println("* PAGO AL BANCO ");
            System.out.println("* FICHA ");
            System.out.println(" ");
        }else {
            this.next.criteriaHandler(persona);
        }

    }

}
