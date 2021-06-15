package ChainOfResponsability.Ejercicio3;


public class HandlerManager implements IAlgoritmo {
    private  IAlgoritmo next;

    @Override
    public void setNext(IAlgoritmo handler) {
        this.next=handler;
    }

    @Override
    public IAlgoritmo next() {
        return this.next;
    }

    @Override
    public void realizarAlgoritmo(Persona[] persona) {
        Algoritmo1 algoritmo1=new Algoritmo1();
       this.setNext(algoritmo1);

       Algoritmo2 algoritmo2 =new Algoritmo2();
       algoritmo1.setNext(algoritmo2);

       Algoritmo3 algoritmo3=new Algoritmo3();
       algoritmo2.setNext(algoritmo3);

       this.next.realizarAlgoritmo(persona);
    }


}
