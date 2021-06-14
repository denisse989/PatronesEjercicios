package EjerciciosPracticaSegundoParcial.Ejercicio1Memento;


public class Originator {
    private Tesis state;


    public Originator() {
    }

    public void setState(Tesis state) {
        System.out.println("**** SET STATE *****");
        System.out.println(" ");
        state.showInfo();
        this.state = state;
    }

    public Memento createMemento(){
        System.out.println("**** CREATE STATE *****");
        System.out.println(" ");
        state.showInfo();
        return new Memento(this.state) ;
    }

    public void restoreFromMemento(Memento memento){
        this.state=memento.getState();
        System.out.println("**** STATE RESTORED *****");
        System.out.println(" ");
        this.state.showInfo();
    }
}
