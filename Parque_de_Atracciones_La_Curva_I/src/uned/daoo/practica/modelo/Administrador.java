/**
 * 
 */
package uned.daoo.practica.modelo;

import java.io.Serializable;
import java.util.Date;

/**
 * Clase Administrador que representa a un administrador de la aplicación.
 *  
 * @author Henry Risco
 * @version 2019.03.01
 *
 */
public class Administrador extends Empleado implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Administrador(String tipoEmpleado, boolean activo, Date fechaDeAlta, String nombre, String apellidos,
			String contrasenya, String dni, String domicilio, String ciudad, String codigoPostal, String numeroMovil,
			String nss) {
		super(tipoEmpleado, activo, fechaDeAlta, nombre, apellidos, contrasenya, dni, domicilio, ciudad, codigoPostal,
				numeroMovil, nss);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Administrador " + getTipoEmpleado() + ", " + getActivo()
				+ ", " + getFechaDeAlta() + ", " + getNombre() + ", " + getApellidos() 
				+ ", " + getContrasenya() + ", " + getDni() + ", " + getDomicilio() 
				+ ", " + getCiudad() + ", " + getCodigoPostal() + ", " + getNumeroMovil() 
				+ ", " + getNSS();
	}

	





	

}
