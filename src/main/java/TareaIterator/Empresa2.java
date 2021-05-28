package TareaIterator;

public class Empresa2 implements IList{

    private String [] empleados;
    private int position;

    public Empresa2(){
        position=0;
        empleados= new String[5];
    }
     public void add(String value){
         empleados[position]=value;
        position++;
     }

    @Override
    public IteratorConcreteEmpresa2 iterator() {
        return new IteratorConcreteEmpresa2(this.empleados);
    }
}
