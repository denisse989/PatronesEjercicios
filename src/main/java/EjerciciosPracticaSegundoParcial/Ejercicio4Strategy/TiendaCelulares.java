package EjerciciosPracticaSegundoParcial.Ejercicio4Strategy;

import java.util.LinkedList;
import java.util.List;

public class TiendaCelulares {
    private IBusquedaModelo busquedaModelo;
    private IBusquedaPrecio busquedaPrecio;
    private int value;
    private List<Celular> list = new LinkedList<Celular>();


    public TiendaCelulares(int value) {
        this.value = value;
    }

    public void add(Celular c) {
        list.add(c);
    }
    public IBusquedaModelo getBusquedaModelo() {
        return busquedaModelo;
    }

    public void setBusquedaModelo(IBusquedaModelo busquedaModelo) {
        this.busquedaModelo = busquedaModelo;
    }

    public IBusquedaPrecio getBusquedaPrecio() {
        return busquedaPrecio;
    }

    public void setBusquedaPrecio(IBusquedaPrecio busquedaPrecio) {
        this.busquedaPrecio = busquedaPrecio;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    public List<Celular> getList() {
        return list;
    }

    public void setList(List<Celular> list) {
        this.list = list;
    }

    public void buscarSegunPrecio(int precio) {
        if(list.size()>value) {
            busquedaPrecio = new BusquedaMuchosPrecio();
        }else {
            busquedaPrecio = new BusquedaPocosPrecio();
        }
        busquedaPrecio.busquedaPrecio(list, precio);
    }

    public void buscarSegunModelo(String modelo) {
        if(list.size()>value) {
            busquedaModelo = new BusquedaMuchosModelo();
        }else {
            busquedaModelo = new BusquedaPocosModelo();
        }
        busquedaModelo.busquedaModelo(list, modelo);
    }
}
