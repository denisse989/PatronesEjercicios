package EjerciciosPracticaSegundoParcial.Ejercicio3MementoYObserver;

public class Cliente {
    public static void main(String[] args) {

        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();

        Codigo codigo;

        codigo = new Codigo(1, "codigo1");
        originator.setState(codigo);
        careTaker.addMemento(originator.createVersion());

        codigo = new Codigo(2, "codigo2");
        originator.setState(codigo);
        careTaker.addMemento(originator.createVersion());

        codigo = new Codigo(3, "codigo3");
        originator.setState(codigo);
        careTaker.addMemento(originator.createVersion());

        codigo = new Codigo(4, "codigo4");
        originator.setState(codigo);
        careTaker.addMemento(originator.createVersion());

        codigo = new Codigo(5, "codigo5");
        originator.setState(codigo);
        careTaker.addMemento(originator.createVersion());

        Desarrolladores desarrolladores1 = new Desarrolladores("Juan1");
        Desarrolladores desarrolladores2= new Desarrolladores("Juan2");
        Desarrolladores desarrolladores3 = new Desarrolladores("Juan3");

        originator.attach(desarrolladores1);
        originator.attach(desarrolladores2);
        originator.attach(desarrolladores3);

        originator.restoreFromMemento(careTaker.getVersion(0));


        originator.deattach(desarrolladores1);
        originator.deattach(desarrolladores2);
        originator.deattach(desarrolladores3);

        Desarrolladores desarrolladores4 = new Desarrolladores("Juan4");
        Desarrolladores desarrolladores5 = new Desarrolladores("Juan5");
        Desarrolladores desarrolladores6 = new Desarrolladores("Juan6");


        originator.attach(desarrolladores4);
        originator.attach(desarrolladores5);
        originator.attach(desarrolladores6);
        originator.restoreFromMemento(careTaker.getVersion(4));



    }
}
