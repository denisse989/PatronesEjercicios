package PracticaFinal.Ejercicio1Decorator;

public class Personaje implements IJuegoWarcraft {
    String nombre;
    int nivel;
    String armas;
    int porcentajeArmadura;
    int puntosDefensa;
    int puntosAtaque;
    int puntosRegeneracion;

    public Personaje(String nombre) {
        this.nombre = nombre;
        nivel = 1;
        armas = "SIN ARMAS";
        porcentajeArmadura = 1;
        puntosDefensa = 1;
        puntosAtaque = 1;
        puntosRegeneracion = 1;
    }

    @Override
    public String nombre() {
        return nombre;
    }

    @Override
    public int nivel() {
        return nivel;
    }

    @Override
    public void subirNivel(int niveles) {
        nivel += niveles;
    }

    @Override
    public String armas() {
        return armas;
    }

    @Override
    public void equiparArma(String arma) {
        this.armas = arma;
    }

    @Override
    public int porcentajeArmadura() {
        return this.porcentajeArmadura;
    }

    @Override
    public int puntosAtaque() {
        return this.puntosAtaque;
    }

    @Override
    public int puntosDefensa() {
        return this.puntosDefensa;
    }

    @Override
    public int puntosRegeneracion() {
        return this.puntosRegeneracion;
    }

    @Override
    public void aumentarArmadura(int porcentaje) {
        this.porcentajeArmadura += porcentaje;

    }

    @Override
    public void aumentarAtaque(int puntos) {
        this.puntosAtaque += puntos;

    }

    @Override
    public void aumentarDefensa(int puntos) {
        this.puntosDefensa += puntos;
    }

    @Override
    public void aumentarRegeneracion(int puntos) {
        this.puntosRegeneracion += puntos;

    }
    public void showInfo() {
        System.out.println("*** INFORMACION DEL PERSONAJE ***");
        System.out.println("NOMBRE: " + nombre);
        System.out.println("NIVEL: " + nivel);
        System.out.println("ARMAS: " + armas);
        System.out.println("PORCENTAJE DE ARMADURA: " + porcentajeArmadura);
        System.out.println("PUNTOS DEFENSA: " + puntosDefensa);
        System.out.println("PUNTOS ATAQUE: " + puntosAtaque);
        System.out.println("PUNTOS REGENERACION: " + puntosRegeneracion);
        System.out.println(" ");
    }
}
