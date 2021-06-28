package PracticaFinal.Ejercicio6Visitor;

public class Cliente {
    public static void main(String[] args) {
        Celular celular = new Celular("SAMSUNG A20", "8Gb");
        Computadora computadora = new Computadora("HP PAVILON", "8Gb");
        Televisor televisor = new Televisor("SAMSUNG 55'",  true);

        AplicacionVisitor aplicacionVisitor = new AplicacionVisitor();

        celular.darMantenimiento(aplicacionVisitor);
        computadora.darMantenimiento(aplicacionVisitor);
        televisor.darMantenimiento(aplicacionVisitor);


    }

}
