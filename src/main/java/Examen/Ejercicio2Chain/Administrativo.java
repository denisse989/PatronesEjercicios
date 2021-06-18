package Examen.Ejercicio2Chain;

public class Administrativo implements IChat{
    private IChat next;
    private String nombre;
    private String cargo;

    public Administrativo(String nombre, String cargo){
        this.cargo=cargo;
        this.nombre=nombre;
    }

    @Override
    public void setNext(IChat ichat) {
        this.next=ichat;
    }

    @Override
    public IChat next() {
        return next;
    }

    @Override
    public void mensaje(String mensaje) {

        if(mensaje.equals("A todas las personas")){
            System.out.println(nombre+cargo+" esta mandando el examen a todos");
        }else{
            this.next.mensaje(mensaje);
        }


    }

}
