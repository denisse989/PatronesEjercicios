package TareaIterator;

import java.util.ArrayList;

public class IteratorConcreteEmpresa1 implements Iterator{
    private  ArrayList<String> empleados;
    private int position;

    public IteratorConcreteEmpresa1(ArrayList<String> empleados) {
        this.empleados=empleados;
    }


    @Override
    public Object next() {
        return empleados.get(position++);
    }

    @Override
    public boolean hasNext() {
        return empleados.size() != 0 && position < empleados.size() ;
    }
}
