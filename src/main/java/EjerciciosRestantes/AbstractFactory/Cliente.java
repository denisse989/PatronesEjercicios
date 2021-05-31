package EjerciciosRestantes.AbstractFactory;

public class Cliente {
    public static void main (String []args) {
        InscripcionMatematicas a1 = (InscripcionMatematicas) FactoryInscripcion.make(FactoryInscripcion.typeInscripcion.INSCRIPCION_MATEMATICAS);
        a1.crear();
        InscripcionHistoria a2 = (InscripcionHistoria) FactoryInscripcion.make(FactoryInscripcion.typeInscripcion.INSCRIPCION_HISTORIA);
        a2.crear();
        InscripcionIngles a3 = (InscripcionIngles) FactoryInscripcion.make(FactoryInscripcion.typeInscripcion.INSCRIPCION_INGLES);
        a3.crear();
        InscripcionLenguaje a4 = (InscripcionLenguaje) FactoryInscripcion.make(FactoryInscripcion.typeInscripcion.INSCRIPCION_LENGUAJE);
        a4.crear();
    }
}
