package PracticaFinal.Ejercicio1Decorator;

public class AgregarPocion implements IJuegoWarcraft {
    private IJuegoWarcraft juegoWarcraft;

    public AgregarPocion(IJuegoWarcraft juegoWarcraft) {
        this.juegoWarcraft = juegoWarcraft;
        this.aumentarRegeneracion(80);
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
    public void subirNivel(int nivel) {
        juegoWarcraft.subirNivel(nivel);

    }

    @Override
    public String armas() {
        return juegoWarcraft.armas();
    }

    @Override
    public void equiparArma(String arma) {
        juegoWarcraft.subirNivel(juegoWarcraft.nivel());

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
        System.out.println("*** SE AGREGO UNA POCION ***");
        juegoWarcraft.showInfo();
        System.out.println(" ");
    }
}
