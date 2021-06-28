package EjercicioDecorator;

public class BancaInternet extends Funcionalidades{
    private Boolean internet;

    public BancaInternet(IBanco banco, Boolean internet) {
        super(banco);
        this.internet=internet;
    }

    public Boolean getInternet() {
        return internet;
    }

    public void setInternet(Boolean internet) {
        this.internet = internet;
    }
    @Override
    public void operation() {
        super.operation();
        if(internet){
            System.out.println("Banca por internet activado : "+internet);
            System.out.println(" ");
        }else {
            System.out.println("Banca por internet no fue activado ");
            System.out.println(" ");
        }
    }
}
