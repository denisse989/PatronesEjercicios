package ChainOfResponsability.Ejercicio2;


public interface IResponsable {
    void setNext(IResponsable handler); //---> saber el siguiente responsable
    IResponsable next(); //--> ir al siguient responsable
    void criteriaHandler(Persona persona); // resolver el problema o moverse al siguinete responsable

}
