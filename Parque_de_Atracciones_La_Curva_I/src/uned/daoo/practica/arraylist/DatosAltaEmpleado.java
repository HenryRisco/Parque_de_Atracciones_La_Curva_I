package uned.daoo.practica.arraylist;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import uned.daoo.practica.capapresentacion.AltaEmpleado;
import uned.daoo.practica.modelo.Empleado;
import uned.daoo.practica.modelo.Administrador;
import uned.daoo.practica.modelo.AtencionAlCliente;
import uned.daoo.practica.modelo.AyudanteDeAtraccion;
import uned.daoo.practica.modelo.RelacionesPublicas;
import uned.daoo.practica.modelo.ResponsableDeAtraccion;


public class DatosAltaEmpleado {
	
	public static JPanel contentPane;
	
	public static JTextField tfFecha;
	public static JTextField tfContrasenya;
	public static JTextField tfDNI;
	public static JTextField tfNombre;
	public static JTextField tfApellidos;
	public static JTextField tfTelefono;
	public static JTextField tfDireccion;
	public static JTextField tfCiudad;
	public static JTextField tfCP;
	public static JTextField tfNSS;  
	
	public static String dniActual;
	public static Empleado empleadoActual=null;
	public int enteroActual;
	
	


	public ArrayListEmpleado BD_empleados;
	public Empleado empleado;
	
	
	String Categoria;
	String Activo;
	Date fecha;
	String DNI;
	String Password;
	String Nombre;
	String Apellidos;
	String Telefono;
	String Direccion;
	String Ciudad;
	String CP;
	String NSS;
	String perfilIU = "";
	
	public DatosAltaEmpleado(ArrayListEmpleado BDempleados) {
		// TODO Auto-generated constructor stub
		BD_empleados = BDempleados;
	}

	/**
	 * Añade un Empleado a la colección
	 * @param empleado que hay que añadir
	 */
	public void altaEmpleado() {
		
		Categoria = (String)AltaEmpleado.cbCategoria.getItemAt(AltaEmpleado.cbCategoria.getSelectedIndex());
		Activo = (String)AltaEmpleado.cbActivo.getItemAt(AltaEmpleado.cbActivo.getSelectedIndex());
	//	fecha = (Date)AltaEmpleado.tfFecha; 
		DNI = AltaEmpleado.tfDNI.getText();
		Password = AltaEmpleado.tfContrasenya.getText();
		Nombre = AltaEmpleado.tfNombre.getText();
		Apellidos = AltaEmpleado.tfApellidos.getText();
		Telefono = AltaEmpleado.tfTelefono.getText();
		Direccion = AltaEmpleado.tfDireccion.getText();
		Ciudad = AltaEmpleado.tfCiudad.getText();
		CP = AltaEmpleado.tfCP.getText();
		NSS = AltaEmpleado.tfNSS.getText();
		perfilIU = (String)AltaEmpleado.cbCategoria.getItemAt(AltaEmpleado.cbCategoria.getSelectedIndex());
	
		//@SuppressWarnings("unused")
		boolean activoBoolean = false;
		
		if(Activo.compareTo("SI") == 0) {
			activoBoolean = true;
		}
		
		
		
		for(int i=0; i < BD_empleados.empleados.size(); i++) {
			//System.out.println("Me llega aqui");
			if(DNI.compareToIgnoreCase(BD_empleados.empleados.get(i).getDni()) == 0) {
				JOptionPane.showMessageDialog(null, "El usuario ya existe");
				//encontrado = true;
				return; 
			} 
		} 
		
		if(perfilIU.compareTo("Administrador") == 0) {
			BD_empleados.empleados.add(new Administrador(Categoria, activoBoolean, fecha, DNI, Password, Nombre, Apellidos, Telefono, Direccion, Ciudad, CP, NSS));                   
			
		}
		else if(perfilIU.compareTo("Atención al cliente") == 0) {
			BD_empleados.empleados.add(new AtencionAlCliente(Categoria, activoBoolean, fecha, DNI, Password, Nombre, Apellidos, Telefono, Direccion, Ciudad, CP, NSS));
			
		}
		else if(perfilIU.compareTo("Ayudante de atracción") == 0) {
			BD_empleados.empleados.add(new AyudanteDeAtraccion(Categoria, activoBoolean, fecha, DNI, Password, Nombre, Apellidos, Telefono, Direccion, Ciudad, CP, NSS));
			
		}
		else if(perfilIU.compareTo("Relaciones publicas") == 0) {
			BD_empleados.empleados.add(new RelacionesPublicas(Categoria, activoBoolean, fecha, DNI, Password, Nombre, Apellidos, Telefono, Direccion, Ciudad, CP, NSS));
			
		}
		else if(perfilIU.compareTo("Responsable de atracción") == 0) {
			BD_empleados.empleados.add(new ResponsableDeAtraccion(Categoria, activoBoolean, fecha, DNI, Password, Nombre, Apellidos, Telefono, Direccion, Ciudad, CP, NSS));
			
		}
		
		
			JOptionPane.showMessageDialog(null, "Los datos del usuario han sido guardados");
			AltaEmpleado.cbCategoria.getSelectedItem().toString();
			AltaEmpleado.cbActivo.getSelectedItem().toString();
			AltaEmpleado.tfDNI.setText("");
			AltaEmpleado.tfNombre.setText("");
			AltaEmpleado.tfApellidos.setText("");
			AltaEmpleado.tfTelefono.setText("");
			AltaEmpleado.tfDireccion.setText("");
			AltaEmpleado.tfCiudad.setText("");
			AltaEmpleado.tfCP.setText("");
			AltaEmpleado.tfNSS.setText("");
		
	}
	
	public Empleado buscarClientePorDni(String dni) {
		//Buscamos el empleado del formulario en el ArrayList
				for(int i=0; i < BD_empleados.empleados.size(); i++) {
					//System.out.println("Hemos legado hasta aqui 2");
					if(DNI.compareTo(dni) == 0) {
					//hemos encontrado el empleado y lo asignamos a una variable de tipo Empleado
					//que representa el empleado que consta en el formulario
					empleadoActual = BD_empleados.empleados.get(i);
					}
				}
				return empleadoActual;
	}
	
	public void buscarEmpleado() {
		
		DNI = AltaEmpleado.tfDNI.getText();
		//System.out.println("Hemos legado hasta aqui 1");
		System.out.println("El dni del formulario es " + DNI);
		System.out.println("Los empleados de la base de datos son: ");
		for(int i=0; i < BD_empleados.empleados.size(); i++) {
			System.out.println(BD_empleados.empleados.get(i).getNombre()+" "+ BD_empleados.empleados.get(i).getApellidos()+ " El DNI es: "+ BD_empleados.empleados.get(i).getDni() );
		}
		
		for(int i=0; i < BD_empleados.empleados.size(); i++) {
		//	System.out.println("Hemos legado hasta aqui 2");
			if(DNI.compareToIgnoreCase(BD_empleados.empleados.get(i).getDni()) == 0) {
				//AltaUsuario.text_rol.setText(BD_empleados.empleados.get(i).toString());
			//	AltaEmpleado.cbCategoria.setSelectedItem((String)BD_empleados.empleados.get(i).getContrasenya());
				AltaEmpleado.cbCategoria.setSelectedItem((String)BD_empleados.empleados.get(i).getTipoEmpleado());
				AltaEmpleado.cbActivo.setSelectedItem((boolean)BD_empleados.empleados.get(i).getActivo());
				AltaEmpleado.tfNombre.setText(BD_empleados.empleados.get(i).getNombre());
				AltaEmpleado.tfApellidos.setText(BD_empleados.empleados.get(i).getApellidos());
				AltaEmpleado.tfDNI.setText(BD_empleados.empleados.get(i).getDni());
				//Actualizamos el valor del dni actual
				dniActual = BD_empleados.empleados.get(i).getDni();
				empleadoActual = BD_empleados.empleados.get(i);
				System.out.println("El puntero en buscarUsuario es:"+ empleadoActual);
				AltaEmpleado.tfContrasenya.setText(BD_empleados.empleados.get(i).getContrasenya());
				AltaEmpleado.tfTelefono.setText(BD_empleados.empleados.get(i).getNumeroMovil());
				AltaEmpleado.tfDireccion.setText(BD_empleados.empleados.get(i).getDomicilio());
				AltaEmpleado.tfCiudad.setText(BD_empleados.empleados.get(i).getCiudad());
				AltaEmpleado.tfCP.setText(BD_empleados.empleados.get(i).getCodigoPostal());
				AltaEmpleado.tfNSS.setText(BD_empleados.empleados.get(i).getNSS());
	
				return;
				
				}
			
			}
				
		JOptionPane.showMessageDialog(null, "Usuario no encontrado");
		AltaEmpleado.cbCategoria.getSelectedItem().toString();
		AltaEmpleado.cbActivo.getSelectedItem().toString();
		AltaEmpleado.tfDNI.setText("");
		AltaEmpleado.tfNombre.setText("");
		AltaEmpleado.tfApellidos.setText("");
		AltaEmpleado.tfTelefono.setText("");
		AltaEmpleado.tfDireccion.setText("");
		AltaEmpleado.tfCiudad.setText("");
		AltaEmpleado.tfCP.setText("");
		AltaEmpleado.tfNSS.setText("");
		
	}

public void modificarEmpleado() {
		
		Categoria = (String)AltaEmpleado.cbCategoria.getItemAt(AltaEmpleado.cbCategoria.getSelectedIndex());
		Activo = (String)AltaEmpleado.cbActivo.getItemAt(AltaEmpleado.cbActivo.getSelectedIndex());
		DNI = AltaEmpleado.tfDNI.getText();
		Password = AltaEmpleado.tfContrasenya.getText();
		Nombre = AltaEmpleado.tfNombre.getText();
		Apellidos = AltaEmpleado.tfApellidos.getText();
		Telefono = AltaEmpleado.tfTelefono.getText();
		Direccion = AltaEmpleado.tfDireccion.getText();
		Ciudad = AltaEmpleado.tfCiudad.getText();
		CP = AltaEmpleado.tfCP.getText();
		NSS = AltaEmpleado.tfNSS.getText();
		
		for(int i=0; i < BD_empleados.empleados.size(); i++) {
			System.out.println(BD_empleados.empleados.get(i).getNombre()+" "+BD_empleados.empleados.get(i).getApellidos()+ " El DNI es: "+ BD_empleados.empleados.get(i).getDni() );
		}
		System.out.println("El dni actual antes del if es " + dniActual);
		System.out.println("El dni actual antes del if es " + dniActual);
		//COMPROBAMOS SI EL DNI DEL FORMULARIO SE HA MODIFICADO
		if(dniActual.compareToIgnoreCase(AltaEmpleado.tfDNI.getText())!= 0) {
		//Se ha modificado el DNI
			//BUSCAMOS SI EL DNI EXISTE
			for(int i=0; i < BD_empleados.empleados.size(); i++) {
				//	System.out.println("Hemos legado hasta aqui 2");
				if(DNI.compareTo(BD_empleados.empleados.get(i).getDni()) == 0) {
					//Hemos encontrado el dni y por tanto no se puede modificar	
					JOptionPane.showMessageDialog(null, "El DNI ya existe");
					//Restablecemos el valor antiguo del DNI en el formulario
					AltaEmpleado.tfDNI.setText(dniActual);
					return;
				}
			}
			// he d'acualizar empleado
			System.out.println("El puntero es:"+ empleadoActual);
			System.out.println("El valor del campo dni en el formulario es:"+ AltaEmpleado.tfDNI.getText());
			empleadoActual.setDni(AltaEmpleado.tfDNI.getText());
			System.out.println("El valor nuevo dl dni es :"+ empleadoActual.getDni());
			dniActual=AltaEmpleado.tfDNI.getText();
			empleadoActual.setTipoEmpleado(Categoria);
		//	empleadoActual.setActivo((String)Activo);
			empleadoActual.setNombre(Nombre);;
			empleadoActual.setApellidos(Apellidos);
			empleadoActual.setContrasenya(Password);
			empleadoActual.setDomicilio(Direccion);
			empleadoActual.setCiudad(Ciudad);
			empleadoActual.setCodigoPostal(CP);
			empleadoActual.setNumeroMovil(Telefono);
			empleadoActual.setNSS(NSS);
			
			//empleadoActual.setRol(rolIU);
		}
		else {
			//Grabamos los nuevos datos en el empleado del arrayList
			//empleadoActual.setDni(dniIU);
			dniActual=AltaEmpleado.tfDNI.getText();
			empleadoActual.setTipoEmpleado(Categoria);
		//	empleadoActual.setActivo((String)Activo);
			empleadoActual.setNombre(Nombre);;
			empleadoActual.setApellidos(Apellidos);
			empleadoActual.setContrasenya(Password);
			empleadoActual.setDomicilio(Direccion);
			empleadoActual.setCiudad(Ciudad);
			empleadoActual.setCodigoPostal(CP);
			empleadoActual.setNumeroMovil(Telefono);
			empleadoActual.setNSS(NSS);
			
		}
			  
	}
}
