package TareaMemento;

import java.util.HashMap;
import java.util.Map;

public class Backup {
    private Map<String,Memento> stateSaved= new HashMap<>();

    public void createBackup(String aliasBackup, Memento memento){
        stateSaved.put(aliasBackup,memento);
    }

    public Memento getMemento(String aliasBackup){
        System.out.println("ALIAS: "+aliasBackup);
        return stateSaved.get(aliasBackup);
    }
}
