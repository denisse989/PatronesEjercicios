package TareaMemento;

public class Originator {
    private BaseDeDatos state;


    public Originator() {
    }

    public void setState(BaseDeDatos state) {
        System.out.println("**** SET STATE *****");
        System.out.println(" ");
        state.info();
        this.state = state;
    }

    public Memento createVersion(){
        System.out.println("**** CREATE STATE *****");
        System.out.println(" ");
        state.info();
        return new Memento(this.state) ;
    }

    public void restoreFromMemento(Memento memento){
        this.state=memento.getState();
        System.out.println("**** STATE RESTORED *****");
        System.out.println(" ");
        this.state.info();
    }
}
