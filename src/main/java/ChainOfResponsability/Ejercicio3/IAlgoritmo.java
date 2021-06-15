package ChainOfResponsability.Ejercicio3;

public interface IAlgoritmo {
    void setNext(IAlgoritmo handler); //---> saber el siguiente responsable
    IAlgoritmo next(); //--> ir al siguient responsable
    void realizarAlgoritmo(Persona[] persona); // resolver el problema o moverse al siguinete responsable
}
