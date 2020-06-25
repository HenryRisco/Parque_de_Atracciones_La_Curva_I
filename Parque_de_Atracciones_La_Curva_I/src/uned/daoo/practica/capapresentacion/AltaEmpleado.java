package uned.daoo.practica.capapresentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import uned.daoo.practica.arraylist.ArrayListEmpleado;
import uned.daoo.practica.arraylist.DatosAltaEmpleado;
import uned.daoo.practica.modelo.Empleado;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class AltaEmpleado extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static JTextField tfHoraFecha;
	public JPanel contentPane;
	public static JTextField tfFecha;
	public static JTextField tfDNI;
	public static JTextField tfNombre;
	public static JTextField tfApellidos;
	public static JTextField tfTelefono;
	public static JTextField tfDireccion;
	public static JTextField tfCiudad;
	public static JTextField tfCP;
	public static JTextField tfNSS;
	public static JComboBox cbCategoria;
	public static JComboBox cbActivo;
	
	ArrayList<Empleado> BD_empleados;
	public Empleado empleado;
	private JTextField text_Fecha;
	public static JPasswordField tfContrasenya;
	public static String fecha;
	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public AltaEmpleado(ArrayListEmpleado BDempleados) {
		
		BD_empleados = BD_empleados;
		setTitle("Alta de empleado");
		setSize(750, 500);
		setLocationRelativeTo(null); 
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panelSuperior = new JPanel();
		panelSuperior.setBackground(Color.LIGHT_GRAY);
		panel.add(panelSuperior, BorderLayout.NORTH);
		
		JLabel txtAltaEmpleado = new JLabel("Alta de empleado");
		txtAltaEmpleado.setBackground(Color.BLACK);
		txtAltaEmpleado.setFont(new Font("Tahoma", Font.BOLD, 16));
		panelSuperior.add(txtAltaEmpleado);
		
		JPanel panelInferior = new JPanel();
		panelInferior.setBackground(Color.LIGHT_GRAY);
		panel.add(panelInferior, BorderLayout.SOUTH);
		
		JLabel lblHenryRisco = new JLabel("Desarrollado por Henry Risco");
		lblHenryRisco.setFont(new Font("Tahoma", Font.BOLD, 12));
		panelInferior.add(lblHenryRisco);
		
		JPanel panelCentral = new JPanel();
		panel.add(panelCentral, BorderLayout.CENTER);
		
		JLabel lblCategoria = new JLabel("Categor\u00EDa: ");
		
		cbCategoria = new JComboBox();
		cbCategoria.setModel(new DefaultComboBoxModel(new String[] {"Administrador", "Atenci\u00F3n al cliente", "Relaciones p\u00FAblicas", "Responsable de atracci\u00F3n", "Ayudante de atracci\u00F3n"}));
		
		JLabel lblActivo = new JLabel("Activo:");
		
		cbActivo = new JComboBox();
		cbActivo.setModel(new DefaultComboBoxModel(new String[] {"Si", "No"}));
		
		Date hoy= new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		fecha = sdf.format(hoy);
		
		JLabel lblFecha = new JLabel("Fecha:");
		
		tfFecha = new JTextField(fecha);
		tfFecha.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI:");
		
		tfDNI = new JTextField();
		tfDNI.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		
		tfContrasenya = new JPasswordField();
		tfContrasenya.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		
		tfNombre = new JTextField();
		tfNombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		
		tfApellidos = new JTextField();
		tfApellidos.setColumns(10);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono:");
		
		tfTelefono = new JTextField();
		tfTelefono.setColumns(10);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
		
		tfDireccion = new JTextField();
		tfDireccion.setColumns(10);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		
		tfCiudad = new JTextField();
		tfCiudad.setColumns(10);
		
		JLabel lblCp = new JLabel("CP:");
		
		tfCP = new JTextField();
		tfCP.setColumns(10);
		
		JLabel lblNss = new JLabel("NSS:");
		
		tfNSS = new JTextField();
		tfNSS.setColumns(10);
		
		final DatosAltaEmpleado data = new DatosAltaEmpleado(BDempleados);
		JButton btnDarDeAlta = new JButton("Dar de alta");
		btnDarDeAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				data.altaEmpleado();
			}
		});
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				data.modificarEmpleado();
			}
		});
		
		JButton btnBuscar = new JButton("Buscar por DNI");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				data.buscarEmpleado();
			}
		});
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		
		
		GroupLayout gl_panelCentral = new GroupLayout(panelCentral);
		gl_panelCentral.setHorizontalGroup(
			gl_panelCentral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCentral.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCategoria)
						.addComponent(lblDni)
						.addComponent(lblNombre)
						.addComponent(lblTelfono)
						.addComponent(lblCiudad)
						.addComponent(lblNss))
					.addGap(35)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING, false)
							.addComponent(tfNSS)
							.addComponent(tfCiudad)
							.addComponent(tfTelefono)
							.addComponent(tfNombre)
							.addComponent(tfDNI)
							.addComponent(cbCategoria, 0, 139, Short.MAX_VALUE))
						.addComponent(btnSalir))
					.addGap(40)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelCentral.createSequentialGroup()
									.addComponent(lblActivo)
									.addGap(33)
									.addComponent(cbActivo, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
									.addGap(57)
									.addComponent(lblFecha)
									.addGap(18)
									.addComponent(tfFecha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panelCentral.createSequentialGroup()
									.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
											.addComponent(lblContrasea)
											.addComponent(lblApellidos)
											.addComponent(btnBuscar, Alignment.TRAILING))
										.addComponent(lblDireccin)
										.addComponent(lblCp))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
										.addComponent(tfContrasenya, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
											.addComponent(tfApellidos, GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
											.addComponent(tfDireccion, GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
											.addComponent(tfCP, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)))))
							.addContainerGap(134, Short.MAX_VALUE))
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
							.addComponent(btnModificar)
							.addGap(53)
							.addComponent(btnDarDeAlta)
							.addGap(87))))
		);
		gl_panelCentral.setVerticalGroup(
			gl_panelCentral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCentral.createSequentialGroup()
					.addGap(34)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCategoria)
						.addComponent(cbCategoria, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblActivo)
						.addComponent(cbActivo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFecha)
						.addComponent(tfFecha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addGroup(gl_panelCentral.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDni)
								.addComponent(tfDNI, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblContrasea)
								.addComponent(tfContrasenya, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panelCentral.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNombre)
								.addComponent(tfNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblApellidos))
							.addGap(18)
							.addGroup(gl_panelCentral.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTelfono)
								.addComponent(tfTelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblDireccin))
							.addGap(18)
							.addGroup(gl_panelCentral.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCiudad)
								.addComponent(tfCiudad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCp))
							.addGap(18)
							.addGroup(gl_panelCentral.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNss)
								.addComponent(tfNSS, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addGap(38)
							.addComponent(tfApellidos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(tfDireccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(tfCP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(67)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnDarDeAlta)
						.addComponent(btnModificar)
						.addComponent(btnSalir)
						.addComponent(btnBuscar))
					.addContainerGap(72, Short.MAX_VALUE))
		);
		panelCentral.setLayout(gl_panelCentral);
	/*	setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);*/
	}
}
