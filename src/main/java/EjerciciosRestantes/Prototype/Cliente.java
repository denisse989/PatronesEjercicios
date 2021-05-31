package EjerciciosRestantes.Prototype;

public class Cliente {
    public static void main (String [] argumento) {
        /*Sueldo : 5000 Carga_Horaria : 80 Curso_Educacion_Superior : true AccesoPlataforma : true
        Marcado Biometrico : false Marcado Hora de Entrada : 08:00 Marcado hora de Salida : 18:00*/

        Contrato contrato = new Contrato();

        contrato.setSueldo("5000");
        contrato.setCarga_Horaria("80");
        contrato.setCurso_Educacion_Superior(true);
        contrato.setAccesoPlataforma(true);
        contrato.setMarcadoBiometrico(false);
        contrato.setMarcadoHoraDeEntrada("08:00");
        contrato.setMarcadoHoraDeSalida("18:00");
        contrato.setNombre("");
        contrato.setApellido("");

        Contrato contrato1= (Contrato) contrato.clone();
        contrato1.setNombre("A");
        contrato1.setApellido("1");

        Contrato contrato2= (Contrato) contrato.clone();
        contrato2.setNombre("B");
        contrato2.setApellido("2");

        Contrato contrato3= (Contrato) contrato.clone();
        contrato3.setNombre("C");
        contrato3.setApellido("3");

        Contrato contrato4= (Contrato) contrato.clone();
        contrato4.setNombre("D");
        contrato4.setApellido("4");

        Contrato contrato5= (Contrato) contrato.clone();
        contrato5.setNombre("E");
        contrato5.setApellido("5");

        Contrato contrato6= (Contrato) contrato.clone();
        contrato6.setNombre("F");
        contrato6.setApellido("6");

        Contrato contrato7= (Contrato) contrato.clone();
        contrato7.setNombre("G");
        contrato7.setApellido("7");

        Contrato contrato8= (Contrato) contrato.clone();
        contrato8.setNombre("H");
        contrato8.setApellido("8");

        Contrato contrato9= (Contrato) contrato.clone();
        contrato9.setNombre("I");
        contrato9.setApellido("9");

        Contrato contrato10= (Contrato) contrato.clone();
        contrato10.setNombre("J");
        contrato10.setApellido("10");

        Contrato contrato11= (Contrato) contrato.clone();
        contrato11.setNombre("K");
        contrato11.setApellido("11");

        Contrato contrato12= (Contrato) contrato.clone();
        contrato12.setNombre("L");
        contrato12.setApellido("12");

        Contrato contrato13= (Contrato) contrato.clone();
        contrato13.setNombre("M");
        contrato13.setApellido("13");

        Contrato contrato14= (Contrato) contrato.clone();
        contrato14.setNombre("N");
        contrato14.setApellido("14");

        Contrato contrato15= (Contrato) contrato.clone();
        contrato15.setNombre("O");
        contrato15.setApellido("15");

        contrato1.showInformatio();
        contrato2.showInformatio();
        contrato3.showInformatio();
        contrato4.showInformatio();
        contrato5.showInformatio();
        contrato6.showInformatio();
        contrato7.showInformatio();
        contrato8.showInformatio();
        contrato9.showInformatio();
        contrato10.showInformatio();
        contrato11.showInformatio();
        contrato12.showInformatio();
        contrato13.showInformatio();
        contrato14.showInformatio();
        contrato15.showInformatio();



    }
}
