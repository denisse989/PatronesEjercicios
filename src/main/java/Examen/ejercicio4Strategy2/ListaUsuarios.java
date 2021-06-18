package Examen.ejercicio4Strategy2;

import java.util.*;

public class ListaUsuarios {

	ArrayList<Usuario> list = new ArrayList<>();

	IStrategy strategy;

	public void add(Usuario user) {
		this.list.add(user);
	}

	public IStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}

	public ArrayList<Usuario> getList() {
		return list;
	}

	public void setList(ArrayList<Usuario> list) {
		this.list = list;
	}

	public void ejecutar() {
		this.strategy.ejecutar(list);
	}

}
