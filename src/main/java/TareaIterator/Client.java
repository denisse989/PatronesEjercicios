package TareaIterator;

public class Client {
    public static void main (String[] args){
        Empresa1 empresa1 = new Empresa1();
        empresa1.add("Juan1");
        empresa1.add("Juan2");
        empresa1.add("Juan3");
        empresa1.add("Juan4");
        empresa1.add("Juan5");

        Empresa2 empresa2 = new Empresa2();
        empresa2.add("Jose1");
        empresa2.add("Jose2");
        empresa2.add("Jose3");
        empresa2.add("Jose4");
        empresa2.add("Jose5");

        Empresa3 empresa3 = new Empresa3();
        empresa3.add("Maria1");
        empresa3.add("Maria2");
        empresa3.add("Maria3");
        empresa3.add("Maria4");
        empresa3.add("Maria5");

        Empresa4 empresa4 = new Empresa4();
        empresa4.add("Ana1");
        empresa4.add("Ana2");
        empresa4.add("Ana3");
        empresa4.add("Ana4");
        empresa4.add("Ana5");

        Iterator iterator = empresa1.iterator();
        while (iterator.hasNext()){
            System.out.println("Empleado: "+iterator.next());
        }
        iterator = empresa2.iterator();
        while (iterator.hasNext()){
            System.out.println("Empleado: "+iterator.next());
        }
        iterator = empresa3.iterator();
        while (iterator.hasNext()){
            System.out.println("Empleado: "+iterator.next());
        }
        iterator = empresa4.iterator();
        while (iterator.hasNext()){
            System.out.println("Empleado: "+iterator.next());
        }
    }
}
