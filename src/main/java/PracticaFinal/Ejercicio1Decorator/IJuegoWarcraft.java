package PracticaFinal.Ejercicio1Decorator;

public interface IJuegoWarcraft {
     String nombre();
     String armas();
     int nivel();
     void subirNivel(int niveles);
     void equiparArma(String arma);
     int porcentajeArmadura();
     void aumentarArmadura(int porcentaje);
     int puntosAtaque();
     void aumentarAtaque(int puntos);
     int puntosDefensa();
     void aumentarDefensa(int puntos);
     int puntosRegeneracion();
     void aumentarRegeneracion(int puntos);
     void showInfo();

}
