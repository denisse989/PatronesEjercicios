package TareaIterator;

import java.util.Vector;

public class Empresa3 implements IList{
    private Vector<String> empleados;

    public Empresa3(){
        empleados= new Vector<>();
    }
     public void add(String value){
         empleados.add(value);
     }

    @Override
    public IteratorConcreteEmpresa3 iterator() {
        return new IteratorConcreteEmpresa3(this.empleados);
    }
}
