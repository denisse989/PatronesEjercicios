package TareaAdapter;

public class ArtefactosElectronicos implements IArtefactosElectronicos1{
    IArtefactosElectronicos2 artefactosElectronicos2;

    public ArtefactosElectronicos(IArtefactosElectronicos2 artefactosElectronicos2){
        this.artefactosElectronicos2 =artefactosElectronicos2;
    }
    @Override
    public void precio() {
        artefactosElectronicos2.costo();
    }

    @Override
    public void tiempoVida() {
        artefactosElectronicos2.tiempoGarantia();
    }
}
