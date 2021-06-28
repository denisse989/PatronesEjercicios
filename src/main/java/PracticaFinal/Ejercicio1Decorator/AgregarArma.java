package PracticaFinal.Ejercicio1Decorator;

public class AgregarArma implements IJuegoWarcraft {
    IJuegoWarcraft juegoWarcraft;
    String armas;

    public AgregarArma(IJuegoWarcraft juegoWarcraft, String armas) {
        this.juegoWarcraft = juegoWarcraft;
        this.equiparArma(armas);
    }


    @Override
    public String nombre() {

        return juegoWarcraft.nombre();
    }

    @Override
    public int nivel() {
        return juegoWarcraft.nivel();
    }

    @Override
    public void subirNivel(int niveles) {
        juegoWarcraft.subirNivel(niveles);

    }

    @Override
    public String armas() {
        return juegoWarcraft.armas();
    }

    @Override
    public void equiparArma(String arma) {
        juegoWarcraft.equiparArma(arma);
        juegoWarcraft.aumentarAtaque(30);
        juegoWarcraft.subirNivel(juegoWarcraft.nivel()*2);

    }

    @Override
    public int porcentajeArmadura() {
        return juegoWarcraft.porcentajeArmadura();
    }

    @Override
    public void aumentarArmadura(int porcentaje) {
        juegoWarcraft.aumentarArmadura(porcentaje);
    }

    @Override
    public int puntosAtaque() {
        return juegoWarcraft.puntosAtaque();
    }

    @Override
    public void aumentarAtaque(int puntos) {
        juegoWarcraft.aumentarAtaque(puntos);
    }

    @Override
    public int puntosDefensa() {
        return juegoWarcraft.puntosDefensa();
    }

    @Override
    public void aumentarDefensa(int puntos) {
        juegoWarcraft.aumentarDefensa(puntos);
    }

    @Override
    public int puntosRegeneracion() {
        return juegoWarcraft.puntosRegeneracion();
    }

    @Override
    public void aumentarRegeneracion(int puntos) {
        juegoWarcraft.aumentarRegeneracion(puntos);
    }

    @Override
    public void showInfo() {
        System.out.println("*** SE AGREGO UN ARMA ***");
        juegoWarcraft.showInfo();
        System.out.println(" ");

    }
}
