package EjerciciosRestantes.Prototype;

public class Contrato implements IContrato {
    private String sueldo;
    private String carga_Horaria;
    private Boolean curso_Educacion_Superior;
    private Boolean accesoPlataforma;
    private Boolean marcadoBiometrico;
    private String marcadoHoraDeEntrada;
    private String marcadoHoraDeSalida;
    private String nombre;
    private String apellido;

    public Contrato() { }

    public String getSueldo() {
        return sueldo;
    }
    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public String getCarga_Horaria() {
        return carga_Horaria;
    }
    public void setCarga_Horaria(String carga_Horaria) {
        this.carga_Horaria = carga_Horaria;
    }

    public Boolean getCurso_Educacion_Superior() {
        return curso_Educacion_Superior;
    }
    public void setCurso_Educacion_Superior(Boolean curso_Educacion_Superior) {
        this.curso_Educacion_Superior = curso_Educacion_Superior;
    }

    public Boolean getAccesoPlataforma() {
        return accesoPlataforma;
    }
    public void setAccesoPlataforma(Boolean accesoPlataforma) {
        this.accesoPlataforma = accesoPlataforma;
    }

    public Boolean getMarcadoBiometrico() {
        return marcadoBiometrico;
    }
    public void setMarcadoBiometrico(Boolean marcadoBiometrico) {
        this.marcadoBiometrico = marcadoBiometrico;
    }

    public String getMarcadoHoraDeEntrada() {
        return marcadoHoraDeEntrada;
    }
    public void setMarcadoHoraDeEntrada(String marcadoHoraDeEntrada) {
        this.marcadoHoraDeEntrada = marcadoHoraDeEntrada;
    }

    public String getMarcadoHoraDeSalida() {
        return marcadoHoraDeSalida;
    }
    public void setMarcadoHoraDeSalida(String marcadoHoraDeSalida) {
        this.marcadoHoraDeSalida = marcadoHoraDeSalida;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public Object clone() {
        Contrato objClone = new Contrato();
        objClone.setAccesoPlataforma(this.accesoPlataforma);
        objClone.setCarga_Horaria(this.carga_Horaria);
        objClone.setMarcadoBiometrico(this.marcadoBiometrico);
        objClone.setCurso_Educacion_Superior(this.curso_Educacion_Superior);
        objClone.setMarcadoHoraDeEntrada(this.marcadoHoraDeEntrada);
        objClone.setMarcadoHoraDeSalida(this.marcadoHoraDeSalida);
        objClone.setSueldo(this.sueldo);
        objClone.setNombre(this.nombre);
        objClone.setApellido(this.apellido);
        return objClone;
    }
    public void showInformatio() {
        System.out.println("***********************");
        System.out.println("CONTRATO" );
        System.out.println("Nombre : " +nombre );
        System.out.println("Apellido : " +apellido);
        System.out.println("Sueldo : " +sueldo );
        System.out.println("Carga Horaria : " +carga_Horaria );
        System.out.println("Curso Educacion Superior : " + curso_Educacion_Superior);
        System.out.println("Acceso Plataforma : " + accesoPlataforma);
        System.out.println("Marcado Biometrico : " + marcadoBiometrico);
        System.out.println("Marcado Hora De Entrada : " + marcadoHoraDeEntrada);
        System.out.println("Marcado Hora De Salida : " + marcadoHoraDeSalida);

    }
}
