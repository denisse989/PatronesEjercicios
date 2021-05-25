package TareaBuilder;

public class Cliente {
    public static void main (String []args) {
        Dueno jose = new Dueno();
        PizzaCarnivora pizzaCarnivora = new PizzaCarnivora();
        PizzaHawaiana pizzaHawaiana = new PizzaHawaiana();
        PizzaClasica pizzaClasica = new PizzaClasica();

        jose.setBuilderComputadora(pizzaCarnivora);
        jose.prepararPizza();
        Pizza pizzaCarnivora1 = jose.getPizza();
        pizzaCarnivora1.showData();

        jose.setBuilderComputadora(pizzaHawaiana);
        jose.prepararPizza();
        Pizza pizzaHawaiana1 = jose.getPizza();
        pizzaHawaiana1.showData();

        jose.setBuilderComputadora(pizzaClasica);
        jose.prepararPizza();
        Pizza pizzaClasica1 = jose.getPizza();
        pizzaClasica1.showData();
    }
}
