package uned.daoo.practica.arraylist;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import uned.daoo.practica.modelo.Atraccion;
import uned.daoo.practica.modelo.Empleado;

/**
 * Una clase para almacenar detalles del arraylist de Atracciones.
 * 
 * @author Henry Risco
 *
 */
public class ArrayListAtracciones {

	public ArrayList<Empleado> empleados;
	public ArrayList<Atraccion> atracciones;
	public Empleado empleado;
	public Atraccion atraccion;
	
	/**
	 * Crea un ArrayListAtracciones para guardar los diferentes datos de las atracciones
	 */
	public ArrayListAtracciones() {
		atracciones = new ArrayList<Atraccion>();
	}
	
	/**
	 * A�ade una atracci�n a la colecci�n
	 * @param Atraccion que hay que a�adir
	 */
	public void addAtraccionn(Atraccion nuevo) {
		
		atracciones.add(nuevo);
	}

	/**
	 * Buscamos una atracci�n por su nombre 
	 */
	public boolean buscarPorNombreAtraccion(String nombreDeLaAtraccion) {
		boolean encontrado = false;
		int i = 0;
		while(encontrado == false && i < atracciones.size()) {
			if(atracciones.get(i).getNombreDaLaAtraccion().equals(nombreDeLaAtraccion)) {
				encontrado = true;
			} 
			else {
				i++;
			}
		}
		
		if(encontrado) {
			JOptionPane.showMessageDialog(null, "Nombre de la atracci�n " + atracciones.get(i).getNombreDaLaAtraccion() + "\n" +
		"Funcionamiento " + atracciones.get(i).isEnFuncionamiento() + "\n" +
					"Fecha de alta " + atracciones.get(i).getFechaDeAlta());
			return false;
		}
		else {
			JOptionPane.showMessageDialog(null, "No existe la atracci�n. Intente ota vez! ");
			return true;
		}
		
	}
}
