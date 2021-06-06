package TareaMemento;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public static void main (String []argsss ) {
        Backup backup = new Backup();
        Originator originator = new Originator();
        BaseDeDatos datos;

        //BACKUP 1
        List<Persona> bd1 = new ArrayList<>();
        Persona p1 = new Persona("Juan1", "123", "1");
        Persona p2 = new Persona("Juan2", "456", "3");
        bd1.add(p1);
        bd1.add(p2);
        datos = new BaseDeDatos(bd1);
        originator.setState(datos);
        backup.createBackup("backupMarzo",originator.createVersion());

        //BACKUP 2
        List<Persona> bd2 = new ArrayList<>();
        Persona p3 = new Persona("Juan3", "123", "2");
        Persona p4 = new Persona("Juan4", "123", "4");
        p1.setCi("908");
        bd2.add(p3);
        bd2.add(p4);
        bd2.add(p1);
        datos = new BaseDeDatos(bd2);
        originator.setState(datos);
        backup.createBackup("backupAbril",originator.createVersion());

        //BACKUP 3
        List<Persona> bd3 = new ArrayList<>();
        Persona p5 = new Persona("Juan5", "123", "1");
        Persona p6 = new Persona("Juan6", "456", "3");
        bd3.add(p5);
        bd3.add(p6);
        datos = new BaseDeDatos(bd3);
        originator.setState(datos);
        backup.createBackup("backupMayo",originator.createVersion());

        //BACKUP 4
        List<Persona> bd4 = new ArrayList<>();
        Persona p7 = new Persona("Juan7", "123", "1");
        Persona p8 = new Persona("Juan8", "456", "3");
        bd4.add(p7);
        bd4.add(p8);
        datos = new BaseDeDatos(bd4);
        originator.setState(datos);
        backup.createBackup("backupJunio",originator.createVersion());

        //BACKUP 5
        List<Persona> bd5 = new ArrayList<>();
        Persona p9 = new Persona("Juan9", "123", "1");
        Persona p10 = new Persona("Juan10", "456", "3");
        bd5.add(p9);
        bd5.add(p10);
        datos = new BaseDeDatos(bd5);
        originator.setState(datos);
        backup.createBackup("backupJulio",originator.createVersion());



        //RESTAURAR EL BACKUP 2
        originator.restoreFromMemento(backup.getMemento("backupAbril"));
    }
}
