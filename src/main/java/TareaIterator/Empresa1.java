package TareaIterator;
import java.util.List;
import java.util.ArrayList;
public class Empresa1 implements IList{

    private  ArrayList<String> empleados;
    private int position;

    public Empresa1(){
        empleados=new ArrayList<>();
        position=0;
    }
     public void add(String value){
         empleados.add(position,value);
        position++;
     }

    @Override
    public IteratorConcreteEmpresa1 iterator() {
        return new IteratorConcreteEmpresa1(this.empleados);
    }
}
