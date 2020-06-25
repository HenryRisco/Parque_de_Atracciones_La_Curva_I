package uned.daoo.practica.lacurva;

import java.awt.EventQueue;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.text.SimpleDateFormat;
import java.time.LocalTime;
//import java.util.Calendar;
//import java.util.GregorianCalendar;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import uned.daoo.practica.arraylist.ArrayListEmpleado;
import uned.daoo.practica.arraylist.ArrayListEntradaAlParque;
import uned.daoo.practica.capapresentacion.AltaEmpleado;
import uned.daoo.practica.capapresentacion.EntradaCliente;
import uned.daoo.practica.capapresentacion.IdentificadorUsuario;
import uned.daoo.practica.modelo.Administrador;
import uned.daoo.practica.modelo.AtencionAlCliente;
import uned.daoo.practica.modelo.AyudanteDeAtraccion;

//import uned.daoo.practica.arraylist.ArrayListEmpleado;

import uned.daoo.practica.arraylist.ArrayListEmpleado;
//import uned.daoo.practica.arraylist.ArrayListEntradaAlParque;

/**
 * LaCurva es la clase principal de la aplicación de visualización
* de imágenes. Construye y visualiza la GUI de la aplicación e inicializa
* todos los demás componentes.
* 
* Para comenzar con la aplicación, cree un objeto de esta clase
* 
* @author Henry Risco
*
*/
public class LaCurva {

	
		private static final String VERSION = "Versión 1.0";
		private JFrame frame;
		//private JLabel lblReloj;
		//private SimpleDateFormat fecha = new SimpleDateFormat("dd-mm-yyyy");
		//private Calendar c1;
		private JLabel lblReloj;
		private SimpleDateFormat fecha = new SimpleDateFormat("dd-mm-yyyy");
		private Calendar c1;
		private ArrayListEmpleado empleados;
		private ArrayListEntradaAlParque clientes;
		public ArrayListEmpleado BD_empleados;

		private String USUARIO = "Usuario";
		private String ADMINISTRADOR = "Administrador";
		private String ATENCIONALCLIENTE = "Atencion al cliente";
		private String RELACIONESPUBLICAS = "Relaciones publicas";
		private String RESPONSABLEDEATRACCION = "Responsable de atraccion";
		private String AYUDANTEDEATRACCION = "Ayudante de atraccion";
		
		private String ALTADEUSUARIO = "Alta de usuario";
		private String IDENTIFICADORDEUSUARIO = "Identificador del usuario...";
		private String SALIR = "Salir";
		private String ENTRADAALPARQUEDEATRACCIONES = "Entrada al parque de atracciones";
		private String PROBLEMASCONLASENTRADAS = "Problemas con las entradas";
		private String GESTIONALGUNTIPOPAGODEVOLUCION = "Gestión de algún tipo de pago/devolución";
		private String ESTUDIOPREVIODELMERCADO ="Estudio previo del mercado";
		private String GESTIONDEATRACCION = "Gestión de atracción";
		private String NUMEROAYUDANTESDEATRACCION = "Número de ayudantes de atracción";
		private String ASIGNADOATRACCION = "Asignado a atracción";
		
		
	

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LaCurva window = new LaCurva();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Crear la aplicación.
	 * @throws Exception 
	 */
	public LaCurva() throws Exception {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws Exception y
	 */
	private void initialize() throws Exception {

		frame = new JFrame("Parque de atracciones 'La Curva'"); //creamos el objeto y establecemos el titulo de la ventana
		frame.setSize(750, 500);  // Establecemos el tamaño de la ventana
		//frame.setBounds(100, 100, 750, 500); //mandamos llamar el método setBounds
		frame.setLocationRelativeTo(null);  // Establecemos la ventana en el centro
		empleados = new ArrayListEmpleado();
		creacionEmpleado();
		creacionCliente();
		//empleadosFinales = listAllFiles();
		makeMenuBar(frame);
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	/**
	 * Método que me crea y me llena los Empleados de la aplicación
	 * @throws ParseException 
	 */
	private void creacionEmpleado() throws ParseException {
		// TODO Auto-generated method stub
				
		empleados.addEmpleado(new Administrador("Administrador", true, fecha.parse("18-12-2018"), "Jesus", "Lopez Galvez", "admin", "89652310K", "Gran Via 415", "Barcelona", "08015", "591222313", "12-1515"));
		empleados.addEmpleado(new AtencionAlCliente("Atención al cliente", true, fecha.parse("12-01-2019"),"Joan", "Gausa Lopez", "atencionCliente01", "14250101U", "Gran Via 38",  "Barcelona", "08015", "89562310", "12-3636"));
		empleados.addEmpleado(new AtencionAlCliente("Atención al cliente", true, fecha.parse("12-01-2019"),"Sergi", "Oros Ezquerra", "atencionCliente2", "13467925M", "Gran Via 45", "Barcelona", "08020", "586214257", "12-1414"));
		empleados.addEmpleado(new AyudanteDeAtraccion("Ayudante de atracción", true, fecha.parse("12-01-2019"),"Jordi", "Ribera Mundo", "AyudanteAtraccion1", "65648910E", "Muntaner 81", "Bercelona", "08030", "123123123", "12-8787"));
		empleados.addEmpleado(new AyudanteDeAtraccion("Ayudante de atracción",true, fecha.parse("12-01-2019"),"Jaume", "Medeiros Vaz",  "AyudanteDeAtraccion2", "454789123N", "Av. Diagonal 54", "Barcelona", "08028", "789987456", "12-4556"));
		empleados.addEmpleado(new AyudanteDeAtraccion("Ayudante de atracción",true, fecha.parse("12-01-2019"), "Pere", "Jarque Lopez",  "AyudanteDeAtraccion3", "56325649K",  "Consejo de Ciento 115", "Barcelona", "08027", "258696147", "12-7899"));
	//	empleados.addEmpleado(new EntradaAlParque("Entrada al parque", "Anna", "Arciniega Luces", "entradaAlParque01", "15152627P", "Entença 45", "Barcelona", "08026", "78956214", true));
		//empleados.addEmpleado(new PostVenta("Mayte", "Chichizola Luces", "postventa1", "4578101E", "Vilamaia 78", "123987654", true,  "PostVenta"));
	//	empleados.addEmpleado(new Comercial("Maribel", "González Perdomo", "comercial1", "6548101E", "Bagdad 14", "789457654", true,  "Comercial"));
			
	//	empleados.listAllfiles();
	}
	
	private void creacionCliente() throws ParseException {
		
		/*	clientes.addCliente(new Cliente(fecha.parse("19-03-2016"), "Adulto", "Alta", "No", "No", "No", "No", 1, 0, 0, 35.0));
			clientes.addCliente(new Cliente(fecha.parse("19-03-2016"), "Adulto", "Alta", "No", "No", "No", "No", 1, 0, 0, 35.0));
			clientes.addCliente(new Cliente(fecha.parse("19-03-2016"), "Adulto", "Alta", "No", "No", "No", "No", 1, 0, 0, 35.0));
			clientes.addCliente(new Cliente(fecha.parse("19-03-2016"), "Adulto", "Alta", "No", "No", "No", "No", 1, 0, 0, 35.0));*/
		
		//	clientes.listAllClientes();
		}

	   /* Usuarios */
	    
		/**
	     * Funcion identificador del usuario: identifica al usuario.
		 * @return 
	     */
	    private void identificadorUsuario() {
	    	IdentificadorUsuario identificaUsuario;
	    	identificaUsuario = new IdentificadorUsuario(empleados); //, window, true);
	    	identificaUsuario.setVisible(true);
	    }
	    
	    /**
	     * Funcion Salir: sale de la aplicación.
	     */
	    private void salirDelPrograma() {
	    	System.exit(0);
	    }
	    
	   /* Administrador */
	    /**
	     * Funcion identificador del administrador: Alta de empleados.
		 * @return 
	     */
	    private void altaDeEmpleado() {
	    	AltaEmpleado altaEmpleado;
	    	altaEmpleado = new AltaEmpleado(empleados);
	    	altaEmpleado.setVisible(true);
	    }
	    /* Atención al cliente */
	    /**
	     * Función de atanción al cliente
	     */
	    private void entradaAlParqueDeAtracciones() {
		   
		   EntradaCliente entrada = new EntradaCliente(clientes);
		 //  String administrador = Usuario.getSelectedItem();
		   entrada.setVisible(true);
	    }
	    
	    private void problemasConLasEntradas() {
		   
	    }
	   
	   private void gestionAlgunTipoPagoDevolucion() {
		   
	   }
		
	   /* Relaciones públicas */
	   
	    
	   private void estudioPrevioDelMercado() {
			
	   }
	   
	   /* Responsable atraccion */
	   private void gestionDeAtraccion() {
		   
	   }
	   
	   private void numeroAyudantesAtraccion() {
	    	//ATENCIONALCLIENTE.setEnabled(true);
	    }
	   
	   /* Ayudante de atracción */
	   
	   private void asignadoAtraccion() {
	   
	   }
	   
	  

	    
	    /**
	     * Función ayudaAplicación: me enseña la caja de ayudaAplicación
	     */
	    private void ayudaAplicacion() {
	    	JOptionPane.showMessageDialog(frame, 
	                "Parque de atracciones 'La Curva'\n" + VERSION,
	                "Sobre La Curva", 
	                JOptionPane.INFORMATION_MESSAGE);
	    }
	    
	    
	    /**
		 * Crea la barra de menús del marco principal.
		 * @param frame El marco al que añadir la barra de menús
		 */
		private void makeMenuBar(JFrame frame) {
			JMenuBar menubar = new JMenuBar();
			frame.setJMenuBar(menubar);
			//creaFrame(); //Llamada al método que muestra un jFrame
			
	        JMenu menu;
	        JMenuItem item;
			
	        /**
	         * Crea el menú Usuario
	         */
	        menu = new JMenu(USUARIO);
	        menubar.add(menu);
	        
	        item = new JMenuItem(IDENTIFICADORDEUSUARIO);
	           // int SHORTCUT_MASK = 0;
				//item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, SHORTCUT_MASK));
	            item.addActionListener(e -> identificadorUsuario());
	        menu.add(item);
	        
	        item = new JMenuItem(SALIR);
	        // int SHORTCUT_MASK = 0;
			//item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, SHORTCUT_MASK));
	        item.addActionListener(e -> salirDelPrograma());
	        menu.add(item);
	        
	        /**
	         * Crea el menú Administrador
	         */
	        menu = new JMenu(ADMINISTRADOR);
	        menubar.add(menu);
	        
	        item = new JMenuItem(ALTADEUSUARIO);
	        //item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, SHORTCUT_MASK));
	        item.addActionListener(e -> altaDeEmpleado());
	        menu.add(item);
	    //menu.addSeparator();

	         
	        /**
	         * Crea el JMenu "Atención al cliente"
	         */
	       menu = new JMenu(ATENCIONALCLIENTE);
	       //menu.setEnabled(false);
	       menubar.add(menu);
	        
	       item = new JMenuItem(ENTRADAALPARQUEDEATRACCIONES);
	       //item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, SHORTCUT_MASK));
	       item.addActionListener(e -> entradaAlParqueDeAtracciones());
	       menu.add(item);

	       item = new JMenuItem(PROBLEMASCONLASENTRADAS);
	       //item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, SHORTCUT_MASK));
	       item.addActionListener(e -> problemasConLasEntradas());
	       menu.add(item); 
	       
	       item = new JMenuItem(GESTIONALGUNTIPOPAGODEVOLUCION);
	       //item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, SHORTCUT_MASK));
	       item.addActionListener(e -> gestionAlgunTipoPagoDevolucion());
	       menu.add(item); 
	        
	       /*
	        * Crea el JMenu Relaciones Publicas
	        */
	       menu = new JMenu(RELACIONESPUBLICAS);
	       menu.setEnabled(true);
	       menubar.add(menu);
	        
	      item = new JMenuItem(ESTUDIOPREVIODELMERCADO);
	      //item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, SHORTCUT_MASK));
	      item.addActionListener(e -> estudioPrevioDelMercado());
	      menu.add(item); 
	        
	   
	     /*
	      * Crea el JMenu Responsable de atracción  
	      */
	     menu = new JMenu(RESPONSABLEDEATRACCION);
	     menu.setEnabled(true);
	     menubar.add(menu);
	        
	     item = new JMenuItem(GESTIONDEATRACCION);
	     //item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, SHORTCUT_MASK));
	     item.addActionListener(e -> gestionDeAtraccion());
	     menu.add(item);    
	        
	  
	     item = new JMenuItem(NUMEROAYUDANTESDEATRACCION);
	     //item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, SHORTCUT_MASK));
	     item.addActionListener(e -> numeroAyudantesAtraccion());
	     menu.add(item);
	     
	     /**
	      * Crea el JMenu Ayudante de atraccion
	      */
	     menu = new JMenu(AYUDANTEDEATRACCION);
	     menu.setEnabled(true);
	     menubar.add(menu);
	     
	     item = new JMenuItem(ASIGNADOATRACCION);
	     //item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, SHORTCUT_MASK));
	     item.addActionListener(e -> asignadoAtraccion());
	     menu.add(item);
	         /**
	         * función 'About': nos enseña la caja 'about'.
	         */
	        // create the File Ayuda
	        menu = new JMenu("Ayuda");
	        menubar.add(menu);
	        
	        item = new JMenuItem("Sobre la aplicación...");
	            //item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, SHORTCUT_MASK));
	            item.addActionListener(e -> ayudaAplicacion());
	        menu.add(item);
	        
	        /**
	         * 'About' function: show the 'about' box.
	         */
	       /* private void showAbout()
	        {
	            JOptionPane.showMessageDialog(frame, 
	                        "ImageViewer\n" + VERSION,
	                        "About ImageViewer", 
	                        JOptionPane.INFORMATION_MESSAGE);
	        }*/
	        
		}
		
		
	    
	    /**
	     * Enable or disable all toolbar buttons.
	     * 
	     * @param status  'true' to enable the buttons, 'false' to disable.
	     */
	    private void setButtonsEnabled(boolean status)
	    {
	  /*      smallerButton.setEnabled(status);
	        largerButton.setEnabled(status);*/
	    }

}
