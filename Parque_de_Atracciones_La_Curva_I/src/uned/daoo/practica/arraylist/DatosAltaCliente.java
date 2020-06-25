package uned.daoo.practica.arraylist;

import uned.daoo.practica.modelo.Cliente;

//import java.util.Date;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import uned.daoo.practica.capapresentacion.EntradaCliente;

public class DatosAltaCliente {

	public static JPanel contentPane;
	public static JTextField tfHoraFecha;
	public static JTextField tfAdulto;
	public static JTextField tfNins;
	public static JTextField tfBebes;
	public static JTextField tfTotal;
	public static JComboBox cbTipoCliente;
	public static JComboBox cbTemporada;
	public static JComboBox cbDiaLaborable;
	public static JComboBox cbEntradaTarde;
	public static JComboBox cbEntradasFamiliares;
	public static JComboBox cbEntradasBonificadas;
	public static JComboBox cbVIP;

	public ArrayListEntradaAlParque BD_clientes;
	public Cliente cliente;
	
	String fechaEntrada;
	String tipoDeCliente;
	String tipoTemporada;
	String entradaLaborable;
	String entradaTarde;
	String entradaFamiliar;
	String otrasEntradaBonificada;
	String subVIP;
	String entradasAdultos;
	String entradasNinos;
	String entradasBebes;
	String Total;
	
	public DatosAltaCliente(ArrayListEntradaAlParque BDclientes) {
		// TODO Auto-generated constructor stub
		BD_clientes = BDclientes;
	}

	/**
	 * Añade un Empleado a la colección
	 * @param empleado que hay que añadir
	 */
	public void altaCliente() {
		
		//fecha_de_altaIU = (String)AltaCliente.text_activo.getItemAt(AltaCliente.text_activo.getSelectedIndex());
		fechaEntrada = (String)EntradaCliente.tfHoraFecha.getText();
		tipoDeCliente = (String)EntradaCliente.cbTipoCliente.getItemAt(EntradaCliente.cbTipoCliente.getSelectedIndex());
		tipoTemporada = (String)EntradaCliente.cbTemporada.getItemAt(EntradaCliente.cbTemporada.getSelectedIndex());
		entradaLaborable = (String)EntradaCliente.cbDiaLaborable.getItemAt(EntradaCliente.cbDiaLaborable.getSelectedIndex());
		entradaTarde = (String)EntradaCliente.cbEntradaTarde.getItemAt(EntradaCliente.cbEntradaTarde.getSelectedIndex());
		entradaFamiliar = (String)EntradaCliente.cbEntradasFamiliares.getItemAt(EntradaCliente.cbEntradasFamiliares.getSelectedIndex());
		otrasEntradaBonificada = (String)EntradaCliente.cbEntradasBonificadas.getItemAt(EntradaCliente.cbEntradasBonificadas.getSelectedIndex());
		subVIP = (String)EntradaCliente.cbVIP.getItemAt(EntradaCliente.cbVIP.getSelectedIndex());
		entradasAdultos = (String)EntradaCliente.tfAdulto.getText();
		entradasNinos = (String)EntradaCliente.tfNins.getText();
		entradasBebes = (String)EntradaCliente.tfBebes.getText();
		//Total = (String)EntradaCliente.tfTotal.getText();
		//@SuppressWarnings("unused")
		/*boolean activoBoolean = false;
		
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
		} */
		
			JOptionPane.showMessageDialog(null, "Los datos del usuario han sido guardados");
			EntradaCliente.tfHoraFecha.setText("");
			EntradaCliente.cbTipoCliente.getSelectedItem().toString();
			EntradaCliente.cbTemporada.getSelectedItem().toString();
			EntradaCliente.cbDiaLaborable.getSelectedItem().toString();
			EntradaCliente.cbEntradaTarde.getSelectedItem().toString();
			EntradaCliente.cbEntradasFamiliares.getSelectedItem().toString();
			EntradaCliente.cbEntradasBonificadas.getSelectedItem().toString();
			EntradaCliente.cbVIP.getSelectedItem().toString();
			EntradaCliente.tfAdulto.setText("");
			EntradaCliente.tfNins.setText("");
			EntradaCliente.tfBebes.setText("");
			//EntradaCliente.tfTotal.setText("");
		
		
	}
	
public void modificarCliente() {
	
	fechaEntrada = (String)EntradaCliente.tfHoraFecha.getText();
	tipoDeCliente = (String)EntradaCliente.cbTipoCliente.getItemAt(EntradaCliente.cbTipoCliente.getSelectedIndex());
	tipoTemporada = (String)EntradaCliente.cbTemporada.getItemAt(EntradaCliente.cbTemporada.getSelectedIndex());
	entradaLaborable = (String)EntradaCliente.cbDiaLaborable.getItemAt(EntradaCliente.cbDiaLaborable.getSelectedIndex());
	entradaTarde = (String)EntradaCliente.cbEntradaTarde.getItemAt(EntradaCliente.cbEntradaTarde.getSelectedIndex());
	entradaFamiliar = (String)EntradaCliente.cbEntradasFamiliares.getItemAt(EntradaCliente.cbEntradasFamiliares.getSelectedIndex());
	otrasEntradaBonificada = (String)EntradaCliente.cbEntradasBonificadas.getItemAt(EntradaCliente.cbEntradasBonificadas.getSelectedIndex());
	subVIP = (String)EntradaCliente.cbVIP.getItemAt(EntradaCliente.cbVIP.getSelectedIndex());
	entradasAdultos = (String)EntradaCliente.tfAdulto.getText();
	entradasNinos = (String)EntradaCliente.tfNins.getText();
	entradasBebes = (String)EntradaCliente.tfBebes.getText();
	//Total = (String)EntradaCliente.tfTotal.getText();
		
	for(int i=0; i < BD_clientes.clientes.size(); i++) {
			System.out.println( BD_clientes.clientes.get(i).getFechaDeEntrada()+" "+BD_clientes.clientes.get(i).getEntradaAdulto() );
	}
	//COMPROBAMOS SI LA ENTRADA DEL FORMULARIO SE HA MODIFICADO
	/*	if(fechaEntrada.compareToIgnoreCase(EntradaCliente.tfHoraFecha.getText())!= 0) {
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
			dniActual=AltaEmpleado.tfDNI.getText();*/
			
			EntradaCliente.tfHoraFecha.setText("");
			EntradaCliente.cbTipoCliente.getSelectedItem().toString();
			EntradaCliente.cbTemporada.getSelectedItem().toString();
			EntradaCliente.cbDiaLaborable.getSelectedItem().toString();
			EntradaCliente.cbEntradaTarde.getSelectedItem().toString();
			EntradaCliente.cbEntradasFamiliares.getSelectedItem().toString();
			EntradaCliente.cbEntradasBonificadas.getSelectedItem().toString();
			EntradaCliente.cbVIP.getSelectedItem().toString();
			EntradaCliente.tfAdulto.setText("");
			EntradaCliente.tfNins.setText("");
			EntradaCliente.tfBebes.setText("");
			//EntradaCliente.tfTotal.setText("");
			
			//empleadoActual.setRol(rolIU);
		}
		/*else {
			//Grabamos los nuevos datos en el empleado del arrayList
			//empleadoActual.setDni(dniIU);
			EntradaCliente.tfHoraFecha.setText("");
			EntradaCliente.cbTipoCliente.getSelectedItem().toString();
			EntradaCliente.cbTemporada.getSelectedItem().toString();
			EntradaCliente.cbDiaLaborable.getSelectedItem().toString();
			EntradaCliente.cbEntradaTarde.getSelectedItem().toString();
			EntradaCliente.cbEntradasFamiliares.getSelectedItem().toString();
			EntradaCliente.cbEntradasBonificadas.getSelectedItem().toString();
			EntradaCliente.cbVIP.getSelectedItem().toString();
			EntradaCliente.tfAdulto.setText("");
			EntradaCliente.tfNins.setText("");
			EntradaCliente.tfBebes.setText("");
			EntradaCliente.tfTotal.setText("");
			
			
			
		}*/
			  
	}
//}
