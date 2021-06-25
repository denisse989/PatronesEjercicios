package TareaComposite;

public class Cliente {
    public static void main (String[] args){
        Computadora computadora1 = new Computadora("Computadora1");
        Computadora computadora2 = new Computadora("Computadora2");
        Computadora computadora3 = new Computadora("Computadora3");

        computadora1.setPrecio(100);
        computadora2.setPrecio(100);
        computadora3.setPrecio(100);

        Composite laboratorio1 =new Composite("Laboratorio1");
        laboratorio1.add(computadora1);
        laboratorio1.add(computadora2);
        laboratorio1.add(computadora3);

        Composite laboratorio2 =new Composite("Laboratorio2");
        laboratorio2.add(computadora1);
        laboratorio2.add(computadora2);
        laboratorio2.add(computadora3);

        Composite Laboratorio3 =new Composite("Laboratorio3");
        Laboratorio3.add(computadora1);
        Laboratorio3.add(computadora2);
        Laboratorio3.add(computadora3);

        Composite contenedor1 = new Composite("Contenedor 1");
        contenedor1.add(laboratorio1);
        contenedor1.add(laboratorio2);
        contenedor1.add(Laboratorio3);

        contenedor1.precio();
    }
}
