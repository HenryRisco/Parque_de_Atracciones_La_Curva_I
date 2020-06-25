package uned.daoo.practica.arraylist;

import java.util.ArrayList;

import uned.daoo.practica.modelo.Entrada;

/**
 * Una clase para almacenar detalles del arraylist de Entrada al Parque.
 * @author Henry Risco
 *
 */
public class ArrayListEntradaAlParque {

	public ArrayList<Entrada> entradas;
	public Entrada entrada;
	
	/**
	 * Crea un ArrayListEntradaAlParque para guardar los diferentes datos de los clientes
	 */
	public ArrayListEntradaAlParque() {
		// TODO Auto-generated constructor stub
		entradas = new ArrayList<Entrada>();
	}

	/**
	 * A�ade una Entrada al parque a la colecci�n
	 * @param EntradaAlParque que hay que a�adir
	 */
	public void addEntradaAlParque(Entrada entrada) {
		
		entradas.add(entrada);
	}
	
	
	/**
	 * Mostrar una lista de todas las pistas de la colecci�n.
	 */
	public void listAllEntradasAlParque() {
		System.out.println("Listado de entrada: ");
		
		for(Entrada entrada : entradas) {
			System.out.println(entrada.getClass());
		}
		System.out.println();
	}

	/**
	 * Muestra una lista con todos los elementos de la colecci�n
	 */
	public void listAllfiles()
	{
		for(Entrada entradaXXX : entradas) {
			System.out.println(entradaXXX);
		}
	}
}
