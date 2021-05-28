package TareaIterator;

import java.util.ArrayList;
import java.util.Stack;

public class IteratorConcreteEmpresa4 implements Iterator{

    private Stack<String> empleados;
    private int position;

    public IteratorConcreteEmpresa4(Stack<String> nombres){
        this.empleados=nombres;
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
