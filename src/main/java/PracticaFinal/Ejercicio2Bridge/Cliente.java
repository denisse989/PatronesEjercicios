package PracticaFinal.Ejercicio2Bridge;

public class Cliente {
    public static void main(String[] args) {
        IInstalacion instalacionAgua1 = new InstalacionAgua(new PagoEfectivo(),"Juan1",123,500);
        IInstalacion instalacionAgua2 = new InstalacionAgua(new PagoAplicacionEmpresa(),"Juan2",123,500);

        instalacionAgua1.pagar();
        instalacionAgua2.pagar();


        IInstalacion instalacionAlcantarillado1 = new InstalacionAlcantarillado(new PagoEfectivo(),"Juan3",123,500);
        IInstalacion instalacionAlcantarillado2 = new InstalacionAlcantarillado(new PagoTigo(),"Juan4",123,500);


        instalacionAlcantarillado1.pagar();
        instalacionAlcantarillado2.pagar();


        IInstalacion instalacionElectrica1 = new InstalacionElectrica(new PagoEfectivo(),"Juan5",123,500);
        IInstalacion instalacionElectrica2 = new InstalacionElectrica(new PagoTransferencia(),"Juan6",123,500);


        instalacionElectrica1.pagar();
        instalacionElectrica2.pagar();


    }
}
