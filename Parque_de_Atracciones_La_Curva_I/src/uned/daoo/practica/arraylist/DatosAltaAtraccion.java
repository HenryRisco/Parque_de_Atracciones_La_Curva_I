package uned.daoo.practica.arraylist;

import java.util.Date;

import javax.swing.JPanel;

import uned.daoo.practica.modelo.Atraccion;
import uned.daoo.practica.modelo.Empleado;

public class DatosAltaAtraccion {

	public static JPanel contentPane;
	
	public static String dniActual;
	public static Empleado empleadoActual=null;
	public int enteroActual;
	
	public ArrayListAtracciones BD_atracciones;
	public Atraccion atraccion;
	
	String NombreAtraccion;
	boolean FechaAlta;
	String DNIResponsable;
	String DniAyudante;
	int NumeroUsuarios;
	
	
	public DatosAltaAtraccion(ArrayListAtracciones BDatracciones) {
		BD_atracciones = BDatracciones;
	}

}
