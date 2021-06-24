package EjercicioBridge;

public class Cliente {
    public static void main(String[] args){

        IPlataforma plataforma1=new Windows(new Ax64());
        plataforma1.plataforma();

        IPlataforma plataforma2=new Linux(new Ax64());
        plataforma2.plataforma();





    }

}
