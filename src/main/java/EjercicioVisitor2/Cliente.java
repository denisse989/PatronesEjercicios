package EjercicioVisitor2;

public class Cliente {

    public static void main(String []sss){
        Bolivia bolivia=new Bolivia();
        bolivia.setMonedaLocal(true);
        bolivia.setValor(70);

        Brasil brasil=new Brasil();
        brasil.setMonedaLocal(false);
        brasil.setValor(1);

        Argentina argentina=new Argentina();
        argentina.setMonedaLocal(true);
        argentina.setValor(1);

        Italia italia=new Italia();
        italia.setMonedaLocal(false);
        italia.setValor(1);

        LibreCambista libreCambista=new LibreCambista();
        bolivia.accept(libreCambista);
        brasil.accept(libreCambista);
        argentina.accept(libreCambista);
        italia.accept(libreCambista);


    }
}
