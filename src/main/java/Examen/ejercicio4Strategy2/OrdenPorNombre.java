package Examen.ejercicio4Strategy2;

import java.util.*;

public class OrdenPorNombre implements IStrategy {

	@Override
	public void ejecutar(List<Usuario> user) {
		System.out.println("Orden por nombre:");

		for (int i = 0; i < user.size(); i++) {

			int k = 0;
			if (user.get(i).getNombre().charAt(k) == 'a') {
				user.get(i).show();
			} else {
				user.get(i).show();
				k++;
			}

		}

	}

}
