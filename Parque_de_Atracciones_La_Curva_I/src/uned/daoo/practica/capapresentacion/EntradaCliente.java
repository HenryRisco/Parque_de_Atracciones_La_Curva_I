package uned.daoo.practica.capapresentacion;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import uned.daoo.practica.arraylist.DatosAltaCliente;
import uned.daoo.practica.arraylist.ArrayListEntradaAlParque;
//import uned.daoo.practica.modelo.Cliente;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;

public class EntradaCliente extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static JPanel contentPane;
	public static JTextField tfHoraFecha;
	public static String tipoEntrada = null;
	public static JTextField salidaImpresa;
	//ArrayList<Cliente> clientes;
	//public Cliente cliente;
	public static JTextField tfAdulto;
	public static JTextField tfSenior;
	public static JTextField tfNinyo;
	public static JComboBox cbTipoEntrada;
	public static JComboBox cbVIP;
	public static JComboBox tfTemporada;
	public static JComboBox cbParking;
	public static JComboBox cbBonoComida;
	public static JComboBox cbAccesoPreferente;
	public static JTextField tfNumeroEntrada;
	
	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//EntradaCliente frame = new EntradaCliente();
										frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public EntradaCliente(ArrayListEntradaAlParque BDclientes) {
		
		ArrayListEntradaAlParque clientes = BDclientes;
		
		setTitle("Cliente");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		//setBounds(100, 100, 802, 482);
		setSize(750, 500);
		setLocationRelativeTo(null); 
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelSuperior = new JPanel();
		panelSuperior.setBackground(Color.LIGHT_GRAY);
		panelSuperior.setForeground(Color.BLACK);
		contentPane.add(panelSuperior, BorderLayout.NORTH);
		
		JLabel lblParqueDeAtracciones = new JLabel("Parque de atracciones \"La Curva\" - Entrada");
		lblParqueDeAtracciones.setForeground(Color.BLACK);
		lblParqueDeAtracciones.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelSuperior.add(lblParqueDeAtracciones);
		
		JPanel panelInferior = new JPanel();
		panelInferior.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panelInferior, BorderLayout.SOUTH);
		
		JLabel lblDesarrolladoPorHenry = new JLabel("Desarrollado por Henry Risco");
		lblDesarrolladoPorHenry.setFont(new Font("Tahoma", Font.BOLD, 11));
		panelInferior.add(lblDesarrolladoPorHenry);
		
		JPanel panelCentral = new JPanel();
		contentPane.add(panelCentral, BorderLayout.CENTER);
		
		JLabel lblHoraYFecha = new JLabel("Hora y fecha:");
		
		Calendar c1 = GregorianCalendar.getInstance();
		System.out.println("Fecha actual " + c1.getTime().toLocaleString());
		
		tfHoraFecha = new JTextField(c1.getTime().toLocaleString());
		tfHoraFecha.setColumns(10);
		
		
		
		JLabel lblTipoDeEntrada = new JLabel("Tipo de entrada:");
		
		cbTipoEntrada = new JComboBox();
		cbTipoEntrada.setModel(new DefaultComboBoxModel(new String[] {"Entrada General", "Entrada de dia laborable", "Entrada de tarde", "Entrada familiar", "Otras entradas bonificadas"}));
		
		JLabel lblVip = new JLabel("VIP:");
		
		cbVIP = new JComboBox();
		cbVIP.setModel(new DefaultComboBoxModel(new String[] {"No", "Si"}));
		
		JLabel lblAdulto = new JLabel("Adulto/s:");
		
		tfAdulto = new JTextField();
		tfAdulto.setColumns(10);
		
		JLabel lblSenior = new JLabel("Senior/s:");
		
		tfSenior = new JTextField();
		tfSenior.setColumns(10);
		
		JLabel lblNios = new JLabel("Ni\u00F1o/s:");
		
		tfNinyo = new JTextField();
		//txtTfninyo.setText("tfNinyo");
		tfNinyo.setColumns(10);
		
		JLabel lblTemporada = new JLabel("Temporada:");
		
		tfTemporada = new JComboBox();
		tfTemporada.setModel(new DefaultComboBoxModel(new String[] {"Alta", "Media", "Baja"}));
		
		JLabel lblParking = new JLabel("Parking:");
		
		cbParking = new JComboBox();
		cbParking.setModel(new DefaultComboBoxModel(new String[] {"No", "Si"}));
		
		JLabel lblBonoComida = new JLabel("Bono comida:");
		
		cbBonoComida = new JComboBox();
		cbBonoComida.setModel(new DefaultComboBoxModel(new String[] {"No", "Si"}));
		
		JLabel lblAccesoPreferente = new JLabel("Acceso Preferente:");
		
		cbAccesoPreferente = new JComboBox();
		cbAccesoPreferente.setModel(new DefaultComboBoxModel(new String[] {"No", "Si"}));
		JScrollBar scrollBar = new JScrollBar();
		
		JLabel lblNmeroDeEntrada = new JLabel("N\u00FAmero de entrada:");
		
		tfNumeroEntrada = new JTextField();
		tfNumeroEntrada.setColumns(10);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		
		JTextPane textPane = new JTextPane();
		
				
		GroupLayout gl_panelCentral = new GroupLayout(panelCentral);
		gl_panelCentral.setHorizontalGroup(
			gl_panelCentral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCentral.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelCentral.createSequentialGroup()
									.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panelCentral.createSequentialGroup()
											.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panelCentral.createParallelGroup(Alignment.TRAILING)
													.addGroup(gl_panelCentral.createSequentialGroup()
														.addComponent(lblHoraYFecha)
														.addGap(40))
													.addGroup(gl_panelCentral.createSequentialGroup()
														.addComponent(lblVip)
														.addGap(86)))
												.addComponent(lblSenior, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
											.addGap(40)
											.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
												.addComponent(tfHoraFecha, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
												.addComponent(cbVIP, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
												.addComponent(cbBonoComida, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_panelCentral.createParallelGroup(Alignment.TRAILING, false)
													.addComponent(tfTemporada, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addComponent(tfSenior))
												.addComponent(tfNumeroEntrada, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
										.addComponent(lblTemporada))
									.addGap(18)
									.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
										.addComponent(lblAdulto)
										.addComponent(lblTipoDeEntrada)
										.addComponent(lblNios)
										.addComponent(lblParking)
										.addComponent(lblAccesoPreferente)))
								.addGroup(gl_panelCentral.createSequentialGroup()
									.addGap(193)
									.addComponent(btnSalir)
									.addGap(88)
									.addComponent(btnModificar)))
							.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelCentral.createSequentialGroup()
									.addGap(24)
									.addGroup(gl_panelCentral.createParallelGroup(Alignment.LEADING)
										.addComponent(tfAdulto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(cbTipoEntrada, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panelCentral.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(cbParking, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(tfNinyo, Alignment.LEADING)
											.addComponent(cbAccesoPreferente, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
								.addGroup(gl_panelCentral.createSequentialGroup()
									.addGap(62)
									.addComponent(btnEntrar))))
						.addComponent(lblBonoComida)
						.addGroup(gl_panelCentral.createSequentialGroup()
							.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 689, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(scrollBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNmeroDeEntrada))
					.addContainerGap())
		);
		gl_panelCentral.setVerticalGroup(
			gl_panelCentral.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelCentral.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHoraYFecha, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfHoraFecha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTipoDeEntrada)
						.addComponent(cbTipoEntrada, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblVip)
						.addComponent(cbVIP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAdulto)
						.addComponent(tfAdulto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSenior)
						.addComponent(tfSenior, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNios)
						.addComponent(tfNinyo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblParking)
						.addComponent(cbParking, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTemporada)
						.addComponent(tfTemporada, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBonoComida)
						.addComponent(cbBonoComida, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAccesoPreferente)
						.addComponent(cbAccesoPreferente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNmeroDeEntrada)
						.addComponent(tfNumeroEntrada, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(scrollBar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(textPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
					.addGroup(gl_panelCentral.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSalir)
						.addComponent(btnModificar)
						.addComponent(btnEntrar))
					.addGap(34))
		);
		panelCentral.setLayout(gl_panelCentral);
	}
}
