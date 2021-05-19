package TareasSingletonEjercicio;

public class Cliente {
    public static void main (String [] argumento) {
        Banco banco = new Banco();
        banco.realizarCambio(70,"bs","$");
        CasaDeCambio casaDeCambio = new CasaDeCambio();
        casaDeCambio.realizarCambio(70,"bs","$");
        LibreCambista libreCambista = new LibreCambista();
        libreCambista.realizarCambio(70,"bs","$");

        banco.realizarCambio(70,"bs","$");
        casaDeCambio.realizarCambio(10,"$","bs");
        libreCambista.realizarCambio(1,"E","bs");
    }
}
