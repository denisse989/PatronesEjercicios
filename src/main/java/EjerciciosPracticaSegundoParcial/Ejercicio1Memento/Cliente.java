package EjerciciosPracticaSegundoParcial.Ejercicio1Memento;

public class Cliente {
    public static void main (String []argsss ) {
        CareTaker careTaker= new CareTaker();
        Originator originator = new Originator();
        Tesis tesis;

        tesis= new Tesis("13 junio","Titulo","Estado 1");
        originator.setState(tesis);
        careTaker.addMemento(originator.createMemento());

        tesis= new Tesis("15 junio","Titulo","Estado 2");
        originator.setState(tesis);
        careTaker.addMemento(originator.createMemento());

        tesis= new Tesis("17 junio","Titulo","Estado 3");
        originator.setState(tesis);
        careTaker.addMemento(originator.createMemento());

        tesis= new Tesis("19 junio","Titulo","Estado 4");
        originator.setState(tesis);
        careTaker.addMemento(originator.createMemento());

        tesis= new Tesis("21 junio","Titulo","Estado 5");
        originator.setState(tesis);
        careTaker.addMemento(originator.createMemento());





        //RESTAURAR EL BACKUP 2
        originator.restoreFromMemento(careTaker.getMemento(2));
    }
}
