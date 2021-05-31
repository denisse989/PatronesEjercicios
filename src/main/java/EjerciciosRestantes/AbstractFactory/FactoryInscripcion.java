package EjerciciosRestantes.AbstractFactory;


public class FactoryInscripcion {
    public enum typeInscripcion{
        INSCRIPCION_MATEMATICAS, INSCRIPCION_LENGUAJE, INSCRIPCION_HISTORIA, INSCRIPCION_INGLES
    }
    public static IInscripcion make (typeInscripcion type) {
        IInscripcion inscripcion1;
        switch (type) {
            case INSCRIPCION_MATEMATICAS:
                inscripcion1 = new InscripcionMatematicas();
                ((InscripcionMatematicas) inscripcion1).setNombre("Matematicas");
                break;
            case INSCRIPCION_LENGUAJE:
                inscripcion1 = new InscripcionLenguaje();
                ((InscripcionLenguaje) inscripcion1).setNombre("Lenguaje");
                break;
            case INSCRIPCION_HISTORIA:
                inscripcion1 = new InscripcionHistoria();
                ((InscripcionHistoria) inscripcion1).setNombre("Historia");
                break;
            case INSCRIPCION_INGLES:
                inscripcion1 = new InscripcionIngles();
                ((InscripcionIngles) inscripcion1).setNombre("Ingles");
                break;
            default:
                inscripcion1=new InscripcionIngles();
                System.out.println(" TE INSCRIBISTE POR ERROR :C");
        }

        return inscripcion1;

    }
}
