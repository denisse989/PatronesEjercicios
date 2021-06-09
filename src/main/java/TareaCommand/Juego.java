package TareaCommand;

public class Juego {
    private Boolean boxeador;//Puede ser boxeador o ninja
    private Boolean ninja;

    public Juego(Boolean boxeador, Boolean ninja) {
        this.boxeador = boxeador;
        this.ninja = ninja;
    }

    public Boolean getBoxeador() {
        return boxeador;
    }

    public void setBoxeador(Boolean boxeador) {
        this.boxeador = boxeador;
    }

    public Boolean getNinja() {
        return ninja;
    }

    public void setNinja(Boolean ninja) {
        this.ninja = ninja;
    }

    public void modoDefensa() {
        if(boxeador & !ninja){
            System.out.println("BOXEADOR");
            System.out.println("Se defiende bloqueando el golpe y lanzando un golpe");
        }else if(ninja & !boxeador){
            System.out.println("Ninja");
            System.out.println("Se defiende con su conocimiento en artes marciales");
        }else {
            System.out.println("No se puede con ambos personajes ");
        }
    }

    public void disparar() {
        if(boxeador & !ninja){
            System.out.println("BOXEADOR");
            System.out.println("No sabe disparar");
            System.out.println("Muere xd");
        }else if(ninja & !boxeador){
            System.out.println("Ninja");
            System.out.println("Lanza una estrella ninja");
        }else {
            System.out.println("No se puede con ambos personajes ");
        }
    }

    public void atacar() {
        if(boxeador & !ninja){
            System.out.println("BOXEADOR");
            System.out.println("Ataca con una patada ");
        }else if(ninja & !boxeador){
            System.out.println("Ninja");
            System.out.println("Ataca con una espada");
        }else {
            System.out.println("No se puede con ambos personajes ");
        }
    }
}
