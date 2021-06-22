package TareaAdapter;

public class Cliente {
    public static void main(String[] args) {
        IArtefactosElectronicos1 celular = new Celular("Samsung A16", 1000, "5 años");
        IArtefactosElectronicos1 tableta = new Tablet("Samsung Tablet", 3000, "4 años");
        IArtefactosElectronicos1 computadora = new Computadora("Samsung", 2000 , "3 años");
        IArtefactosElectronicos1 televisor = new ArtefactosElectronicos(new Televisor("Samsung", 3000, "10 años"));
        IArtefactosElectronicos1 refrigerador = new ArtefactosElectronicos(new Refrigerador("Samsung", 5000, "8 años"));
        IArtefactosElectronicos1 lavadora = new ArtefactosElectronicos(new Lavadora("Samsung", 4000, "6 años"));

        celular.precio();
        tableta.precio();
        computadora.precio();
        televisor.precio();
        refrigerador.precio();
        lavadora.precio();

        celular.tiempoVida();
        tableta.tiempoVida();
        computadora.tiempoVida();
        televisor.tiempoVida();
        refrigerador.tiempoVida();
        lavadora.tiempoVida();
    }
}
