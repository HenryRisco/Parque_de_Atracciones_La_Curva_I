package uned.daoo.practica.capapresentacion;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
//import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import uned.daoo.practica.arraylist.ArrayListEmpleado;
import uned.daoo.practica.modelo.Empleado;

public class IdentificadorUsuario extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static final String JTextField = null;
	private JPanel contentPane;
	public static JTextField text_usuario;
	public static JPasswordField text_password;
	String nombreIU, contrasenyaIU;
	ArrayList<Empleado> empleados;
	public JFrame VentanaPrincipal;
	
	public static final String ADMINISTRADOR = "Administrador"; 
	public static final String ATENCIONALCLIENTE = "Atención al cliente"; 
	public static final String AYUDANTEDEATRACCION = "Ayudante de atracción"; 
	public static final String RELACIONESPUBLICAS = "Relaciones públicas";
	public static final String RESPONSABLEDEATRACCION = "Responable de atracción"; 
	
	
	public IdentificadorUsuario(ArrayListEmpleado BDempleados) {
		// TODO Auto-generated constructor stub
		/**
		 * Clase para pedir las credenciales de los empleados.
		 */

			ArrayListEmpleado empleados = BDempleados;
			//super(miVentanaUsuario, modal);
			
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblIngresaTusCredenciales = new JLabel("Ingresa tus credenciales");
			lblIngresaTusCredenciales.setBounds(142, 11, 145, 14);
			contentPane.add(lblIngresaTusCredenciales);
			
			JLabel lblUsuario = new JLabel("Usuario:");
			lblUsuario.setBounds(78, 60, 82, 14);
			contentPane.add(lblUsuario);
			
			text_usuario = new JTextField();
			text_usuario.setBounds(185, 57, 134, 20);
			contentPane.add(text_usuario);
			text_usuario.setColumns(10);
			
			JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
			lblContrasea.setBounds(78, 99, 97, 14);
			contentPane.add(lblContrasea);
			
			text_password = new JPasswordField();
			text_password.setBounds(185, 96, 134, 20);
			contentPane.add(text_password); 
			
			//nombreIU = text_usuario.getText();
			//contrasenyaIU = text_password.getText(); 
			final DatosUsuario data = new DatosUsuario(empleados);
			JButton btnEntrar = new JButton("Entrar");
			btnEntrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//if(data.probarCredenciales(text_usuario, text_password)) 
					if(data.probarCredenciales()) {
						JOptionPane.showMessageDialog(null, "Bienvenido al sistema");
						//VentanaPrincipal.getMenuBar().
						data.entrarEmpleado();
							
						
						dispose();
					}
					else {
						JOptionPane.showMessageDialog(null, "Error, usuario o contraseña incorrectos");
						limpiar();
					}
				}
			});
			btnEntrar.setBounds(63, 189, 89, 23);
			contentPane.add(btnEntrar);
			
			JButton btnSalir = new JButton("Salir");
			btnSalir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
				
			});
			btnSalir.setBounds(230, 189, 89, 23);
			contentPane.add(btnSalir);
		}
		
		private void limpiar() {
			text_usuario.setText("");
			text_password.setText("");
		}
		
	

}
