package uned.daoo.practica.modelo;

import java.util.Arrays;
import java.util.Date;

/**
 * La clase Atracción representa a una atracción dentro de la aplicación Parque
 * de atracciones 'La Curva'
 * Almacena los detalles de la atración en si, así como los responsables de la atracción y ayudantes
 * de atracción implicados
 *   
 * @author Henry Risco
 * @version 20/01/2020
 *
 */
public class Atraccion {

	private String nombreDaLaAtraccion;
	private boolean enFuncionamiento;
	private Date fechaDeAlta;
	private String dniResponsableAtraccion;
	private String[] dniAyudanteAtraccion = new String[7];
	private int cantidadDeUsuariosPermitidos;
		
	public Atraccion() {
	
		
	}

	public Atraccion(String nombreDaLaAtraccion, boolean enFuncionamiento, Date fechaDeAlta,
			String dniResponsableAtraccion, String[] dniAyudanteAtraccion, int cantidadDeUsuariosPermitidos) {
		super();
		this.nombreDaLaAtraccion = nombreDaLaAtraccion;
		this.enFuncionamiento = enFuncionamiento;
		this.fechaDeAlta = fechaDeAlta;
		this.dniResponsableAtraccion = dniResponsableAtraccion;
		this.dniAyudanteAtraccion = dniAyudanteAtraccion;
		this.cantidadDeUsuariosPermitidos = cantidadDeUsuariosPermitidos;
	}

	public String getNombreDaLaAtraccion() {
		return nombreDaLaAtraccion;
	}

	public void setNombreDaLaAtraccion(String nombreDaLaAtraccion) {
		this.nombreDaLaAtraccion = nombreDaLaAtraccion;
	}

	public boolean isEnFuncionamiento() {
		return enFuncionamiento;
	}

	public void setEnFuncionamiento(boolean enFuncionamiento) {
		this.enFuncionamiento = enFuncionamiento;
	}

	public Date getFechaDeAlta() {
		return fechaDeAlta;
	}

	public void setFechaDeAlta(Date fechaDeAlta) {
		this.fechaDeAlta = fechaDeAlta;
	}

	public String getDniResponsableAtraccion() {
		return dniResponsableAtraccion;
	}

	public void setDniResponsableAtraccion(String dniResponsableAtraccion) {
		this.dniResponsableAtraccion = dniResponsableAtraccion;
	}

	public String[] getDniAyudanteAtraccion() {
		return dniAyudanteAtraccion;
	}

	public void setDniAyudanteAtraccion(String[] dniAyudanteAtraccion) {
		this.dniAyudanteAtraccion = dniAyudanteAtraccion;
	}

	public int getCantidadDeUsuariosPermitidos() {
		return cantidadDeUsuariosPermitidos;
	}

	public void setCantidadDeUsuariosPermitidos(int cantidadDeUsuariosPermitidos) {
		this.cantidadDeUsuariosPermitidos = cantidadDeUsuariosPermitidos;
	}

	@Override
	public String toString() {
		return "Atraccion " + nombreDaLaAtraccion + ", " + enFuncionamiento + ", " + fechaDeAlta + 
				", " + dniResponsableAtraccion + ", " + Arrays.toString(dniAyudanteAtraccion) + 
				", " + cantidadDeUsuariosPermitidos;
	}
	
	

}
