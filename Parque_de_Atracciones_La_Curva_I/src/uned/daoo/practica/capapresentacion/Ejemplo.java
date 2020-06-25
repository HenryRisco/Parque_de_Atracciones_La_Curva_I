package uned.daoo.practica.capapresentacion;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ejemplo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel contenedor;
	
	public Ejemplo() {
		
		contenedor = new JPanel();
		contenedor.setLayout(new BorderLayout());
		
		contenedor.add(new JButton("Norte"), BorderLayout.NORTH);
		contenedor.add(new JButton("Sur"), BorderLayout.SOUTH);
		contenedor.add(new JButton("Oeste"), BorderLayout.WEST);
		contenedor.add(new JButton("Este"), BorderLayout.EAST);
		contenedor.add(new JButton("Centro"), BorderLayout.CENTER);
		add(contenedor);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejemplo ejemplo1 = new Ejemplo();
	}

}
