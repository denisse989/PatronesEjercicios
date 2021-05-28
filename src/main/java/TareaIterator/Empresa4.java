package TareaIterator;
import java.util.Stack;

public class Empresa4 implements IList{

    private Stack<String> empleados;


    public Empresa4(){
        empleados= new Stack<>();
    }
     public void add(String value){
         empleados.push(value);
     }

    @Override
    public IteratorConcreteEmpresa4 iterator() {
        return new IteratorConcreteEmpresa4(this.empleados);
    }
}
