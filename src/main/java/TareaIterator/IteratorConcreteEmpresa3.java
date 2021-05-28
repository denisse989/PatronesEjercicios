package TareaIterator;

import java.util.Vector;

public class IteratorConcreteEmpresa3 implements Iterator{
    private Vector<String> empleados;
    private int position;
    public IteratorConcreteEmpresa3(Vector<String> nombres){
        this.empleados=nombres;
        this.position=0;
    }

    @Override
    public Object next() {
        return this.empleados.get(position++);
    }

    @Override
    public boolean hasNext() {
        return this.empleados.size() !=0 && this.empleados.size() > position;
    }
}
