package Examen.Ejercicio4Strategy;

import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos {
    private IOrden ordenamiento;
    private List<Usuarios> listUsuarios= new ArrayList<>();

    public BaseDeDatos(){

    }

    public IOrden getOrdenamiento() {
        return ordenamiento;
    }

    public void setOrdenamiento(IOrden ordenamiento) {
        this.ordenamiento = ordenamiento;
    }

    public List<Usuarios> getListUsuarios() {
        return listUsuarios;
    }

    public void setListUsuarios(List<Usuarios> listUsuarios) {
        this.listUsuarios = listUsuarios;
    }

    public void ordenar1(){
        ordenamiento.ordenar(this.listUsuarios);
    }



}
