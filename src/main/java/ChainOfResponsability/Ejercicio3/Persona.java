package ChainOfResponsability.Ejercicio3;


public class Persona  implements Comparable<Persona>{
    private String ci;
    private String name;
    private int edad;

    public Persona(String ci, String name, int edad){
        this.ci=ci;
        this.name=name;
        this.edad =edad;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void showInfo(){
        System.out.println(" ");
        System.out.println("Persona > ci: "+ci);
        System.out.println("Persona > name: "+name);
        System.out.println("Persona > edad: "+ edad);
        System.out.println(" ");
    }
    @Override
    public int compareTo(Persona o) {
        if (this.edad < o.edad) {
            return -1;
        }
        if (this.edad > o.edad) {
            return 1;
        }
        return 0;
    }

}
