package TareaBuilder;

public class Dueno {
    private BuilderPizza builderPizza;
    public void setBuilderComputadora(BuilderPizza builderPizza){
        this.builderPizza=builderPizza;
    }
    public Pizza getPizza(){
        return builderPizza.getComputadora();
    }

    public void prepararPizza() {
        this.builderPizza.createPizza();
        this.builderPizza.buildIngredientes();
        this.builderPizza.buildTipoMasa();
        this.builderPizza.buildTipoQueso();
    }

}
