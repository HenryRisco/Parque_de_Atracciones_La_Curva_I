/**
 * 
 */
package uned.daoo.practica.modelo;

import java.io.Serializable;
import java.util.Date;

/**
 * Clase AyudanteDeAtraccion que representa a un ayudante de atraccion dentro de la aplicación.
 *  
 * @author Henry Risco
 * @version 2019.03.01
 *
 */
public class AyudanteDeAtraccion extends Empleado implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Contructor con parametros
	 */
	public AyudanteDeAtraccion(String tipoEmpleado, boolean activo, Date fechaDeAlta, String nombre, String apellidos,
			String contrasenya, String dni, String domicilio, String ciudad, String codigoPostal, String numeroMovil,
			String nss) {
		super(tipoEmpleado, activo, fechaDeAlta, nombre, apellidos, contrasenya, dni, domicilio, ciudad, codigoPostal,
				numeroMovil, nss);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AyudanteDeAtraccion [getTipoEmpleado()=" + getTipoEmpleado() + ", getActivo()=" + getActivo()
				+ ", getFechaDeAlta()=" + getFechaDeAlta() + ", getNombre()=" + getNombre() + ", getApellidos()="
				+ getApellidos() + ", getContrasenya()=" + getContrasenya() + ", getDni()=" + getDni()
				+ ", getDomicilio()=" + getDomicilio() + ", getCiudad()=" + getCiudad() + ", getCodigoPostal()="
				+ getCodigoPostal() + ", getNumeroMovil()=" + getNumeroMovil() + ", getNSS()=" + getNSS() + "]";
	}

	
}
