package TareaIterator;

import java.util.ArrayList;

public class IteratorConcreteEmpresa2 implements Iterator{

    private String [] empleados;
    private int position;

    public IteratorConcreteEmpresa2(String [] nombres){
        this.empleados=nombres;
    }

    @Override
    public Object next() {
        return empleados[position++];
    }

    @Override
    public boolean hasNext() {
        return empleados.length != 0 && position < empleados.length ;
    }
}
