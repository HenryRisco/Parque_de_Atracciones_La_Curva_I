package uned.daoo.practica.arraylist;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


import uned.daoo.practica.capapresentacion.EntradaCliente;
import uned.daoo.practica.modelo.Entrada;
import uned.daoo.practica.modelo.EntradaFamiliar;
import uned.daoo.practica.modelo.EntradaGeneral;
import uned.daoo.practica.modelo.EntradaBonificada;
import uned.daoo.practica.modelo.EntradaDeTarde;
import uned.daoo.practica.modelo.EntradaDiaLaborable;

public class DatosEntradaAlParque {
	
	public static Entrada entradaActual = null;
	public ArrayListEntradaAlParque BD_entradas;
	public Entrada entrada;

	Date fechaEntrada;
	String tipoEntrada;
	boolean subVIP;
	int entradaAdulto;
	int entradaSenior;
	int entradaNino;
	String tipoTemporada;
	boolean parking;
	boolean bonoComida;
	boolean accesoPreferente;
	int numeroDeEntrada;
	
	String Total;
	String perfilIU = "";
	
	public DatosEntradaAlParque(ArrayListEntradaAlParque BD_entradas) {
		BD_entradas = BD_entradas;
	}

	/**
	 * Añade una Entrada a la colección
	 * @param entrada que hay que añadir
	 */
	public void altaEntradaAlParque() {
				
		fechaEntrada = (Date)EntradaCliente.tfHoraFecha.getClientProperty(EntradaCliente.tfHoraFecha.getSelectedText());
		//fechaEntrada = (String)EntradaCliente.tfHoraFecha.getAccessibleContext();
		tipoEntrada = (String)EntradaCliente.cbTipoEntrada.getItemAt(EntradaCliente.cbTipoEntrada.getSelectedIndex());
		subVIP = (boolean)EntradaCliente.cbVIP.getItemAt(EntradaCliente.cbVIP.getSelectedIndex());
		entradaAdulto = EntradaCliente.tfAdulto.getX();
		entradaSenior = EntradaCliente.tfSenior.getX();
		entradaNino = EntradaCliente.tfNinyo.getX();
		tipoTemporada = (String)EntradaCliente.tfTemporada.getItemAt(EntradaCliente.tfTemporada.getSelectedIndex());
		parking = (boolean)EntradaCliente.cbParking.getItemAt(EntradaCliente.cbParking.getSelectedIndex());
		bonoComida = (boolean)EntradaCliente.cbBonoComida.getItemAt(EntradaCliente.cbBonoComida.getSelectedIndex());
		accesoPreferente = (boolean)EntradaCliente.cbAccesoPreferente.getItemAt(EntradaCliente.cbAccesoPreferente.getSelectedIndex());
		
			
		if(perfilIU.compareTo("Entrada General") == 0) {
			BD_entradas.entradas.add(new EntradaGeneral());                   
			
		}
		else if(perfilIU.compareTo("Entrada de dia laborable") == 0) {
			BD_entradas.entradas.add(new EntradaDiaLaborable());
			
		}
		else if(perfilIU.compareTo("Entrada de tarde") == 0) {
			BD_entradas.entradas.add(new EntradaDeTarde());
			
		}
		else if(perfilIU.compareTo("Entrada familiar") == 0) {
			BD_entradas.entradas.add(new EntradaFamiliar());
			
		}
		else if(perfilIU.compareTo("Otras entradas bonificadas") == 0) {
			BD_entradas.entradas.add(new EntradaBonificada());
			
		}
		
		JOptionPane.showMessageDialog(null, "Los datos del usuario han sido guardados");
		EntradaCliente.tfHoraFecha.getSelectedText().toString();
		EntradaCliente.cbTipoEntrada.getSelectedItem().toString();
		EntradaCliente.cbVIP.getSelectedItem().toString();
		EntradaCliente.tfAdulto.setText("");
		EntradaCliente.tfSenior.setText("");
		EntradaCliente.tfNinyo.setText("");
		EntradaCliente.tfTemporada.getSelectedItem().toString();
		EntradaCliente.cbParking.getSelectedItem().toString();
		EntradaCliente.cbBonoComida.getSelectedItem().toString();
		EntradaCliente.cbAccesoPreferente.getSelectedItem().toString();
		
	}
	
	public void modificarEntradaAlParque() {
		
		fechaEntrada = (Date)EntradaCliente.tfHoraFecha.getClientProperty(EntradaCliente.tfHoraFecha.getSelectedText());
		//fechaEntrada = (String)EntradaCliente.tfHoraFecha.getAccessibleContext();
		tipoEntrada = (String)EntradaCliente.cbTipoEntrada.getItemAt(EntradaCliente.cbTipoEntrada.getSelectedIndex());
		subVIP = (boolean)EntradaCliente.cbVIP.getItemAt(EntradaCliente.cbVIP.getSelectedIndex());
		entradaAdulto = EntradaCliente.tfAdulto.getX();
		entradaSenior = EntradaCliente.tfSenior.getX();
		entradaNino = EntradaCliente.tfNinyo.getX();
		tipoTemporada = (String)EntradaCliente.tfTemporada.getItemAt(EntradaCliente.tfTemporada.getSelectedIndex());
		parking = (boolean)EntradaCliente.cbParking.getItemAt(EntradaCliente.cbParking.getSelectedIndex());
		bonoComida = (boolean)EntradaCliente.cbBonoComida.getItemAt(EntradaCliente.cbBonoComida.getSelectedIndex());
		accesoPreferente = (boolean)EntradaCliente.cbAccesoPreferente.getItemAt(EntradaCliente.cbAccesoPreferente.getSelectedIndex());
		
		
		
		for(int i=0; i < BD_entradas.entradas.size(); i++) {
			System.out.println(BD_entradas.entradas.get(i).getNumeroEntrada());
		}
	/*	System.out.println("El dni actual antes del if es " + dniActual);
		System.out.println("El dni actual antes del if es " + dniActual);*/
		//COMPROBAMOS SI EL DNI DEL FORMULARIO SE HA MODIFICADO
	/*	if(dniActual.compareToIgnoreCase(AltaEmpleado.tfDNI.getText())!= 0) {
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
			}*/
			// he d'acualizar empleado
		//	System.out.println("El puntero es:"+ empleadoActual);
		//	System.out.println("El valor del campo dni en el formulario es:"+ AltaEmpleado.tfDNI.getText());
		//	empleadoActual.setDni(AltaEmpleado.tfDNI.getText());
		//	System.out.println("El valor nuevo dl dni es :"+ empleadoActual.getDni());
		//	dniActual=AltaEmpleado.tfDNI.getText();
			entradaActual.setFechaDeEntrada(fechaEntrada);
			entradaActual.setTipoEntrada(tipoEntrada);
			entradaActual.setVIP(subVIP);
			entradaActual.setEntradaAdulto(entradaAdulto);
			entradaActual.setEntradaSenior(entradaSenior);
			entradaActual.setEntradaNinyo(entradaNino);
			entradaActual.setParking(parking);
			entradaActual.setBonoComida(bonoComida);
			entradaActual.setAccesoPrefente(accesoPreferente);
			entradaActual.setNumeroEntrada(numeroDeEntrada);
			
	//	}
	/*	else {
			//Grabamos los nuevos datos en el empleado del arrayList
			//empleadoActual.setDni(dniIU);
			//dniActual=AltaEmpleado.tfDNI.getText();
			entradaActual.setFechaDeEntrada(fechaEntrada);
			entradaActual.setTipoEntrada(tipoEntrada);
			entradaActual.setVIP(subVIP);
			entradaActual.setEntradaAdulto(entradaAdulto);
			entradaActual.setEntradaSenior(entradaSenior);
			entradaActual.setEntradaNinyo(entradaNino);
			entradaActual.setParking(parking);
			entradaActual.setBonoComida(bonoComida);
			entradaActual.setAccesoPrefente(accesoPreferente);
			entradaActual.setNumeroEntrada(numeroDeEntrada);
			
		}*/
			  
	}
}
