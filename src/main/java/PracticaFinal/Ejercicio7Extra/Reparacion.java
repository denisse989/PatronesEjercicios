package PracticaFinal.Ejercicio7Extra;

public class Reparacion implements IReparacion {
    @Override
    public int reparar(Laptop laptop) {
        laptop.showInfo();
        int precio=laptop.getTamano()*20;
        if (laptop.getTamano()>=11 && laptop.getTamano()<=15){
            System.out.println("Precio Laptop: "+ precio);
            return precio;
        }else{
            System.out.println("Precio Laptop: "+ precio+50);
            return precio+50;
        }
    }

    @Override
    public int reparar(PC pc) {
        pc.showInfo();
        int precio=pc.getTamano()*10;
        if (pc.getTamano()>=23 && pc.getTamano()<=32){
            System.out.println("Precio PC: "+precio);
            return precio;
        }else{
            System.out.println("Precio PC: "+precio+50);
            return precio+50;
        }
    }

    @Override
    public int reparar(Tablet tablet) {
        tablet.showInfo();
        int precio=tablet.getTamano()*15;
        if (tablet.getTamano()>=7 && tablet.getTamano()<=9){
            System.out.println("Precio tablet: "+ precio);
            return precio;
        }else{
            System.out.println("Precio tablet: "+ precio+20);
            return precio+20;
        }
    }
}
