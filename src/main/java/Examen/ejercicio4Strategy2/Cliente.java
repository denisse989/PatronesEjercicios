package Examen.ejercicio4Strategy2;

import java.util.*;

//		12%(Strategy) Se tiene una base de datos que contiene usuarios (ci, nombre, fecha
//		nacimiento, profesi�n), se desea tener 3 tipos de ordenamiento de esta base de datos
//		estrategia 1---> ordenar por ci
//		estrategia 2 ---> ordenar por nombre
//		estrategia 3 ---> escoger por fecha de nacimiento o profesi�n

public class Cliente {

	public static void main(String[] args) {

		ListaUsuarios context = new ListaUsuarios();

		context.add(new Usuario(1, "Ignacio", "15/10/2000", "ing de sistemas"));
		context.add(new Usuario(2, "Mariana", "16/11/2001", "ing petrolera"));
		context.add(new Usuario(3, "Andres", "15/12/2002", "ing civil"));
		context.add(new Usuario(5, "Juan", "01/09/2000", "ing de sistemas"));
		context.add(new Usuario(4, "Tere", "16/12/2000", "economia"));
		context.add(new Usuario(6, "Manu", "15/1/1999", "militar"));

		context.setStrategy(new OrdenPorCi());
		context.ejecutar();

		context.setStrategy(new OrdenPorNombre());
		context.ejecutar();

		context.setStrategy(new OrdenPorFecha());
		context.ejecutar();

	}

}
