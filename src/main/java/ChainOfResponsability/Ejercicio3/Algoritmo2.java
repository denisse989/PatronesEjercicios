package ChainOfResponsability.Ejercicio3;

import java.util.Arrays;

public class Algoritmo2 implements IAlgoritmo{
    private IAlgoritmo next;

    @Override
    public void setNext(IAlgoritmo algoritmo) {
        this.next =algoritmo;
    }

    @Override
    public IAlgoritmo next() {
        return this.next;
    }

    @Override
    public void realizarAlgoritmo(Persona[] persona) {
        if (persona.length <=50) {
            Arrays.sort(persona);
            System.out.println("**************");
            System.out.println(" ");
            System.out.println("ALGORITMO 2");
            for (int i = 0; i < persona.length; i++) {
                persona[i].showInfo();
            }
            System.out.println(" ");
            System.out.println("**************");

        }else {
            this.next.realizarAlgoritmo(persona);
        }

    }
}
