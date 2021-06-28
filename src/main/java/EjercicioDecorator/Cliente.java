package EjercicioDecorator;

public class Cliente {
    public static void main(String [] args){

        IBanco cuenta= new Cuenta(100,"Juan");

        cuenta=new Seguro(cuenta,true);
        cuenta=new Promocion(cuenta,true);
        cuenta=new BancaInternet(cuenta,true);
        cuenta.operation();




    }
}
