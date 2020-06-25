package uned.daoo.practica.capapresentacion;


//import java.util.ArrayList;

//import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import uned.daoo.practica.arraylist.ArrayListEmpleado;

//import uned.daoo.practica.modelo.AgendaEmpleado;
/*import java.lang.reflect.Array;
import javax.swing.JPasswordField;
import javax.swing.JTextField;*/

import uned.daoo.practica.capapresentacion.IdentificadorUsuario;
//import uned.daoo.practica.modelo.Empleado;


public class DatosUsuario {
	
	public static JTextField text_usuario;
	public static JPasswordField text_password;
	public ArrayListEmpleado BD_empleados;
	public int i;
	//public static JComboBox cmb_perfil;
	public static final String ADMINISTRADOR = "Administrador"; 
	public static final String ATENCIONALCLIENTE = "Atención al cliente"; 
	public static final String AYUDANTEDEATRACCION = "Ayudante de atracción"; 
	public static final String RELACIONESPUBLICAS = "Relaciones públicas";
	public static final String RESPONSABLEDEATRACCION = "Responable de atracción"; 
	
	
	public DatosUsuario(ArrayListEmpleado BDempleados) 
	{
		BD_empleados = BDempleados;
	}
	
	String nombreIU = "";
	String passwordIU = "";
	String comboboxIU = "";
	String nombredeEmpleado = "";
	String contrasenyadeEmpleado = "";
	
	
	public boolean probarCredenciales() {
		//boolean  aceptar = true;
		boolean encontrado = false;
		nombreIU = IdentificadorUsuario.text_usuario.getText();
		passwordIU = IdentificadorUsuario.text_password.getText();
		
		System.out.println("el nombre es " + nombreIU);
		System.out.println("y su contraseña es " + passwordIU);
		for(i=0; i < BD_empleados.empleados.size(); i++) {
			System.out.println("Me llega aqui");
			//nombredeEmpleado = BD_empleados.empleados.get(i).nombre;
			//contrasenyadeEmpleado = BD_empleados.empleados.get(i).contrasenya;
			System.out.println("Estamos ahora aqui");
			if ((nombreIU.compareTo(BD_empleados.empleados.get(i).getNombre()) == 0)) {
				if((passwordIU.compareTo(BD_empleados.empleados.get(i).getContrasenya()) == 0)) {
					//	System.out.println("ha llegado hasta aqui");
						encontrado = true;
						return encontrado; 
					}
					else {
						return encontrado;
					}
				}	
			} 
			
		return encontrado;
		
	}	
	
	public boolean entrarEmpleado() {
		boolean encontrado = false;
		if (BD_empleados.empleados.get(i).getTipoEmpleado().compareTo(ADMINISTRADOR) == 0) {
			encontrado = true;
			return encontrado;
		} else if (BD_empleados.empleados.get(i).getTipoEmpleado().compareTo(ATENCIONALCLIENTE) == 0) {
			encontrado = true;
			return encontrado;
		} else if (BD_empleados.empleados.get(i).getTipoEmpleado().compareTo(RELACIONESPUBLICAS) == 0) {
			encontrado = true;
			return encontrado;
		} else if (BD_empleados.empleados.get(i).getTipoEmpleado().compareTo(RESPONSABLEDEATRACCION) == 0) {
			encontrado = true;
			return encontrado;
		} else if (BD_empleados.empleados.get(i).getTipoEmpleado().compareTo(AYUDANTEDEATRACCION) == 0) {
			encontrado = true;
			return encontrado;
		} else {
			return encontrado;
		}
	}
		
}		
