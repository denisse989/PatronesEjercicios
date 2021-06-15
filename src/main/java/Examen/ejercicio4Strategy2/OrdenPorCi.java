package Examen.ejercicio4Strategy2;

import java.util.*;

public class OrdenPorCi implements IStrategy {

	@Override
	public void ejecutar(List<Usuario> user) {

		Usuario us;

		for (int i = 0; i < user.size() - 1; i++) {
			if (user.get(i).getCi() > user.get(i + 1).getCi()) {
				us = user.get(i + 1);
				user.set(i + 1, user.get(i));
				user.set(i, us);
			}
		}

		for (int i = 0; i < user.size(); i++) {
			System.out.println("Orden por CI:");
			((Usuario) user.get(i)).show();
		}

	}
}
