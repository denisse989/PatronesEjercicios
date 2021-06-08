package ChainOfResponsability.Ejercicio1;

public interface IEncargado {
    void setNext(IEncargado handler); //---> saber el siguiente responsable
    IEncargado next(); //--> ir al siguient responsable
    void criteriaHandler(String peticion); // resolver el problema o moverse al siguinete responsable

}
