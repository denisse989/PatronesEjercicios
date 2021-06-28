package EjercicioDecorator;

public class Seguro extends Funcionalidades{
    private Boolean seguro;
    public Seguro(IBanco banco,Boolean seguro) {
        super(banco);
        this.seguro=seguro;
    }
    @Override
    public void operation() {
        super.operation();
        if(seguro){
            double seguroporcentaje=super.getMonto()*10/100;
            System.out.println("Contrato seguro : "+seguroporcentaje);
            System.out.println("Monto en la cuenta : "+(super.getMonto()-seguroporcentaje));
            System.out.println(" ");

        }else {
            System.out.println("No se contrato seguro ");
        }
    }
}
