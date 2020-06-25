package uned.daoo.practica.arraylist;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import uned.daoo.practica.modelo.Empleado;

/**
 * Una clase para almacenar detalles de los Empleados.
 * 
 * @author Henry Risco
 *
 */
public class ArrayListEmpleado {
	
	public ArrayList<Empleado> empleados;
	public Empleado empleado;

	/**
	 * Crea un ArrayListCliente para guardar los difetentes datos de los empleados
	 */
	public ArrayListEmpleado() {
		empleados = new ArrayList<Empleado>();
	}
	
	/**
	 * Añade un empleado a la colección
	 * @param Empleado que hay que añadir
	 */
	public void addEmpleado(Empleado nuevo) {
		empleados.add(nuevo);
	}
	
	/**
	 * Buscmos un empleado por su nif 
	 */
	public boolean buscarPorNif(String nif) {
		boolean encontrado = false;
		int i = 0;
		while(encontrado == false && i < empleados.size()) {
			if(empleados.get(i).getDni().equals(nif)) {
				encontrado = true;
			} 
			else {
				i++;
			}
		}
		
		if(encontrado) {
			JOptionPane.showMessageDialog(null, "Nombre " + empleados.get(i).getNombre() + "\n" +
		"Apellidos " + empleados.get(i).getApellidos() + "\n" +
					"DNI " + empleados.get(i).getDni());
			return false;
		}
		else {
			JOptionPane.showMessageDialog(null, "No existe el dni. Intente ota vez! ");
			return true;
		}
		
	}
	
	/**
	 * Mostrar una lista de todas las pistas de la colección.
	 */
	public void listAllEmpleado() {
		System.out.println("Listado de cliente: ");
		
		for(Empleado empleado : empleados) {
			System.out.println(empleado.getClass());
		}
		System.out.println();
	}

	public void visualizarEmpleado() {
		for(int i = 0; i < empleados.size(); i++) {
			System.out.println(empleados.get(i));
		}
	}
}
