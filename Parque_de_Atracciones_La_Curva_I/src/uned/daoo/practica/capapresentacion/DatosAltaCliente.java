package uned.daoo.practica.capapresentacion;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import uned.daoo.practica.arraylist.ArrayListCliente;
import uned.daoo.practica.modelo.Cliente;

public class DatosAltaCliente {
	
	//public static JTextField text_fecha_de_alta;
	public static JTextField text_nombre;
	public static JTextField text_apellidos;
	public static JTextField text_DNI;
	public static JTextField text_domicilio;
	public static JTextField text_numero_de_movil;
	public static String dniActual;
	public static Cliente clienteActual=null;
	public int enteroActual;

	
	public ArrayListCliente BD_clientes;
	public Cliente cliente;
		
	public DatosAltaCliente(ArrayListCliente BDclientes) 
	{
		BD_clientes = BDclientes;
	}
	
	//String fecha_de_altaIU;
	String nombreIU = "";
	String apellidosIU = "";
	String dniIU = "";
	String domicilioIU = "";
	String numeroMovilIU = "";
	String activoIU = "";
		
	/**
	 * Añade un Cliente a la colección
	 * @param cliente que hay que añadir
	 */
	public void altaCliente() {
		
		//fecha_de_altaIU = (String)AltaCliente.text_activo.getItemAt(AltaCliente.text_activo.getSelectedIndex());		
		nombreIU = AltaCliente.text_nombre.getText();
		apellidosIU = AltaCliente.text_apellidos.getText();
		dniIU = AltaCliente.text_DNI.getText();
		domicilioIU = AltaCliente.text_domicilio.getText();
		numeroMovilIU = AltaCliente.text_movil.getText();
		activoIU = (String)AltaCliente.text_activo.getItemAt(AltaCliente.text_activo.getSelectedIndex());
		
		/*System.out.println("El usuario está:" + activoIU);
		perfilIU = (String)AltaCliente.text_perfil.getItemAt(AltaCliente.text_perfil.getSelectedIndex());*/
		boolean activoBoolean = false;
		
		if(activoIU.compareTo("SI") == 0) {
			activoBoolean = true;
		}
		
		
		
		for(int i=0; i < BD_clientes.clientes.size(); i++) {
			System.out.println("Me llega aqui");
			if(dniIU.compareToIgnoreCase(BD_clientes.clientes.get(i).getDni()) == 0) {
				JOptionPane.showMessageDialog(null, "El usuario ya existe");
				//encontrado = true;
				return; 
			} 
		} 
		
			JOptionPane.showMessageDialog(null, "Los datos del usuario han sido guardados");
			AltaCliente.text_DNI.setText("");
			AltaCliente.text_nombre.setText("");
			AltaCliente.text_apellidos.setText("");
			AltaCliente.text_DNI.setText("");
			AltaCliente.text_domicilio.setText("");
			AltaCliente.text_movil.setText("");
			AltaCliente.text_activo.getSelectedItem().toString();
		
		
}
	
	/**
	 * Añade un empleado a la colección
	 * @param Empleado que hay que añadir
	 */
	/*public void darBajaCliente() {
		
		//boolean encontrado = false;
		
		String p = AltaCliente.text_DNI.getText();
		Cliente clienteNuevo = null;
		for(Cliente emp: BD_clientes.clientes) {
			if(emp.getDni().equals(p)) {
				clienteNuevo = emp;
			} 
		} 
		
		if(clienteNuevo != null) {
			BD_clientes.clientes.get(0).setActivo(false);
			JOptionPane.showMessageDialog(null, "El usuario se ha dado de baja satisfactoriamente");
			
			AltaCliente.text_nombre.setText("");
			AltaCliente.text_apellidos.setText("");
			AltaCliente.text_DNI.setText("");
			AltaCliente.text_domicilio.setText("");
			AltaCliente.text_movil.setText("");
			AltaCliente.text_activo.getSelectedItem().toString();
			AltaCliente.text_activo.getSelectedItem().toString();
		}
		
}*/
	
	public Cliente buscarClientePorDni(String dni) {
		//Buscamos el empleado del formulario en el ArrayList
				for(int i=0; i < BD_clientes.clientes.size(); i++) {
					//System.out.println("Hemos legado hasta aqui 2");
					if(dniActual.compareTo(dni) == 0) {
					//hemos encontrado el empleado y lo asignamos a una variable de tipo Empleado
					//que representa el empleado que consta en el formulario
					clienteActual = BD_clientes.clientes.get(i);
					}
				}
				return clienteActual;
	}
	
public void buscarCliente() {
		
		dniIU = AltaUsuario.text_DNI.getText();
		System.out.println("Hemos legado hasta aqui 1");
		System.out.println("El dni del formulario es " + dniIU);
		System.out.println("Los empleados de la base de datos son: ");
		for(int i=0; i < BD_clientes.clientes.size(); i++) {
			System.out.println(BD_clientes.clientes.get(i).getNombre()+" "+ BD_clientes.clientes.get(i).getApellidos()+ " El DNI es: "+ BD_clientes.clientes.get(i).getDni() );
		}
		
		for(int i=0; i < BD_clientes.clientes.size(); i++) {
		//	System.out.println("Hemos legado hasta aqui 2");
			if(dniIU.compareToIgnoreCase(BD_clientes.clientes.get(i).getDni()) == 0) {
				//AltaUsuario.text_rol.setText(BD_empleados.empleados.get(i).toString());
				AltaUsuario.text_nombre.setText(BD_clientes.clientes.get(i).getNombre());
				AltaUsuario.text_apellidos.setText(BD_clientes.clientes.get(i).getApellidos());
				AltaUsuario.text_DNI.setText(BD_clientes.clientes.get(i).getDni());
				//Actualizamos el valor del dni actual
				dniActual = BD_clientes.clientes.get(i).getDni();
				clienteActual = BD_clientes.clientes.get(i);
				System.out.println("El puntero en buscarUsuario es:"+ clienteActual);
				//AltaUsuario.text_password.setText(BD_clientes.clientes.get(i).getContrasenya());
				//AltaUsuario.text_nombre.setText(BD_clientes.clientes.get(i).getNombre());
				//AltaUsuario.text_apellidos.setText(BD_clientes.clientes.get(i).getApellidos());
				
				AltaUsuario.text_domicilio.setText(BD_clientes.clientes.get(i).getDomicilio());
				AltaUsuario.text_movil.setText(BD_clientes.clientes.get(i).getNumero_de_movil());
				AltaUsuario.text_activo.setSelectedItem((boolean)BD_clientes.clientes.get(i).getActivo());
				System.out.println("El usuario está:" + BD_clientes.clientes.get(i).getActivo());
				//AltaUsuario.text_perfil.setSelectedItem((String)BD_clientes.clientes.get(i).getPerfil());
				//System.out.println("El perfil del usuario es:" + BD_empleados.empleados.get(i).getPerfil());
			//	AltaUsuario.text_activo.setText(BD_empleados.empleados.get(i).toString());
			//	AltaUsuario.text_perfil.setText(BD_empleados.empleados.get(i).getPerfil());
				System.out.println("Hemos legado hasta aqui 3");
				return;
				
				/*AltaUsuario.text_apellidos.getText();
				AltaUsuario.text_DNIAltaUsuario.getText();
				AltaUsuario.text_password.getPassword();
				AltaUsuario.text_domicilio.getText();
				AltaUsuario.text_movil.getText();
				AltaUsuario.text_activo.getText();
				AltaUsuario.text_perfil.getText();*/
			}
			
			}
				
		JOptionPane.showMessageDialog(null, "Usuario no encontrado");
		
	}
	
public void modificarCliente() {
		
		//rolIU = Integer.parseInt(AltaCliente.text_rol.getText());
		nombreIU = AltaCliente.text_nombre.getText();
		apellidosIU = AltaCliente.text_apellidos.getText();
		dniIU = AltaCliente.text_DNI.getText();
		domicilioIU = AltaCliente.text_domicilio.getText();
		numeroMovilIU = AltaCliente.text_movil.getText();
		activoIU = (String)AltaCliente.text_activo.getItemAt(AltaCliente.text_activo.getSelectedIndex());
		System.out.println("El usuario está:" + activoIU);
				
		System.out.println("Hemos legado a modificar()");
		System.out.println("El dni del formulario es " + dniIU);
		System.out.println("Los empleados de la base de datos son: ");
		
		for(int i=0; i < BD_clientes.clientes.size(); i++) {
			System.out.println(BD_clientes.clientes.get(i).getNombre()+" "+BD_clientes.clientes.get(i).getApellidos()+ " El DNI es: "+ BD_clientes.clientes.get(i).getDni() );
		}
		System.out.println("El dni actual antes del if es " + dniActual);
		System.out.println("El dni actual antes del if es " + dniActual);
		//COMPROBAMOS SI EL DNI DEL FORMULARIO SE HA MODIFICADO
		if(dniActual.compareToIgnoreCase(AltaCliente.text_DNI.getText())!= 0) {
		//Se ha modificado el DNI
			//BUSCAMOS SI EL DNI EXISTE
			for(int i=0; i < BD_clientes.clientes.size(); i++) {
				//	System.out.println("Hemos legado hasta aqui 2");
				if(dniIU.compareTo(BD_clientes.clientes.get(i).getDni()) == 0) {
					//Hemos encontrado el dni y por tanto no se puede modificar	
					JOptionPane.showMessageDialog(null, "El DNI ya existe");
					//Restablecemos el valor antiguo del DNI en el formulario
					AltaCliente.text_DNI.setText(dniActual);
					return;
				}
			}
			// he d'actualizar empleado
			System.out.println("El puntero es:"+ clienteActual);
			System.out.println("El valor del campo dni en el formulario es:"+ AltaCliente.text_DNI.getText());
			clienteActual.setDni(AltaCliente.text_DNI.getText());
			System.out.println("El valor nuevo dl dni es :"+ clienteActual.getDni());
			dniActual=AltaCliente.text_DNI.getText();
			clienteActual.setNombre(nombreIU);
			clienteActual.setApellidos(apellidosIU);
			clienteActual.setDomicilio(domicilioIU);
			clienteActual.setNumero_de_movil(numeroMovilIU);
			
			//empleadoActual.setRol(rolIU);
			
		}
		else {
			//Grabamos los nuevos datos en el empleado del arrayList
			//empleadoActual.setDni(dniIU);
			clienteActual.setNombre(nombreIU);
			clienteActual.setApellidos(apellidosIU);
			clienteActual.setDomicilio(domicilioIU);
			clienteActual.setNumero_de_movil(numeroMovilIU);
			//clienteActual.setActivo(activoIU);
			//empleadoActual.setRol(rolIU);
			//empleadoActual
			
			
			
				}
			  
		JOptionPane.showMessageDialog(null, "Los datos del usuario han sido guardados");
		AltaCliente.text_DNI.setText("");
		AltaCliente.text_nombre.setText("");
		AltaCliente.text_apellidos.setText("");
		AltaCliente.text_DNI.setText("");
		AltaCliente.text_domicilio.setText("");
		AltaCliente.text_movil.setText("");
		AltaCliente.text_activo.getSelectedItem().toString();
	
	}



}
	

