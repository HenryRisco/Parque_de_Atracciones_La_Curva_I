/**
 * 
 */
package uned.daoo.practica.modelo;

import java.io.Serializable;
import java.util.Date;

/**
 * La clase abstracta Empleado representa a un empleado dentro de la aplicaci�n Parque
 * de atracciones 'La Curva'
 * Almacena los detalles de los empleados que son revelantes en nuestro
 * contexto
 *  
 * @author Henry Risco
 * @version 20/01/2020
 *
 */
public abstract class Empleado implements Serializable {

	private static final long serialVersionUID = 1L;
	private String tipoEmpleado;
	private boolean activo;
	private Date fechaDeAlta;
	private String nombre;
	private String apellidos;
	private String contrasenya;
	private String dni;
	private String domicilio;
	private String ciudad;
	private String codigoPostal;
	private String numeroMovil;
	private String nss;
	
	
	/**
	 * Crear un nuevo empleado con un tipo de empleado, activo, con una fecha de alta, 
	 * nombre, apellidos, contrase�a, dni, domicilio, ciudad, c�digo postal, numero de movil, nss
	 */
	public Empleado(String tipoEmpleado, boolean activo, Date fechaDeAlta, String nombre, String apellidos, String contrasenya, String dni, 
			String domicilio, String ciudad, String codigoPostal, String numeroMovil, String nss) {
		// TODO Auto-generated constructor stub
		this.tipoEmpleado = tipoEmpleado;
		this.activo = activo;
		this.fechaDeAlta = fechaDeAlta;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.contrasenya = contrasenya;
		this.dni = dni;
		this.domicilio = domicilio;
		this.ciudad = ciudad;
		this.codigoPostal = codigoPostal;
		this.numeroMovil = numeroMovil;
		this.nss = nss;
	}

	/**
	 * M�todo que muestra el tipoEmpleado del Empleado
	 * @param tipoEmpleado
	 */
	public String getTipoEmpleado() {
		return tipoEmpleado;
	}

	/**
	 * M�todo que establece el tipoEmpleado del Empleado
	 * @@param tipoEmpleado
	 */
	public void setTipoEmpleado(String tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}
	
	/**
	 * M�todo que muestra el estado del Empleado
	 * @param activo
	 */
	public boolean getActivo() {
		return activo;
	}

	/**
	 * M�todo que establece el estado del Empleado
	 * @param activo
	 */
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	/**
	 * M�todo que devuelve la fecha de alta del empleado 
	 * @return
	 */
	
	public Date getFechaDeAlta() {
		return fechaDeAlta;
	}

	/**
	 * M�todo que establece la fecha de alta del empleado
	 * @param fechaDeAlta
	 */
	public void setFechaDeAlta(Date fechaDeAlta) {
		this.fechaDeAlta = fechaDeAlta;
	}

	/**
	 * M�todo que devuelve el nombre del Empleado
	 * @param nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * M�todo que establece el nombre del Empleado
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * M�todo que devuelve los apellidos del Empleado
	 * @param apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * M�todo que establece los apellidos del Empleado
	 * @return apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	/**
	 * M�todo que devuelve la contrase�a del Empleado
	 * @return contrasenya
	 */
	public String getContrasenya() {
		return contrasenya;
	}

	/**
	 * M�todo que establece la contrase�a del Empleado
	 * @return contrasenya
	 */
	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}

	/**
	 * M�todo que devuelve el DNI del Empleado
	 * @param dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * M�todo que establece el DNI del Empleado
	 * @return dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * M�todo que devuelve el domicilio del Empleado
	 * @param domicilio
	 */
	public String getDomicilio() {
		return domicilio;
	}

	/**
	 * M�todo que establece el domicilio del Empleado
	 * @return domicilio
	 */
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	/**
	 * M�todo que devuelve la ciudad del Empleado
	 * @param ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * M�todo que establece la ciudad del Empleado
	 * @return ciudad
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	/**
	 * M�todo que devuelve el c�digo postal del Empleado
	 * @param codigoPostal
	 */
	public String getCodigoPostal() {
		return codigoPostal;
	}

	/**
	 * M�todo que establece el codigo Postal del Empleado
	 * @return codigoPostal
	 */
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	/**
	 * M�todo que devuelve el n�mero de m�vil del Empleado
	 * @param numeroMovil
	 */
	public String getNumeroMovil() {
		return numeroMovil;
	}

	/**
	 * M�todo que establece el n�mero de m�vil del Empleado
	 * @return numeroMovil
	 */
	public void setNumeroMovil(String numeroMovil) {
		this.numeroMovil = numeroMovil;
	}
	
	/**
	 * M�todo que devuelve el n�mero de la seguridad social del empleado 
	 * @param nss
	 */
	public String getNSS() {
		return nss;
	}

	/**
	 * M�todo que establece el n�mero de la seguridad social del empleado 
	 * @return nss
	 */
	public void setNSS(String nss) {
		this.nss = nss;
	}
	
	
	

	@Override
	public String toString() {
		return "Empleado " + tipoEmpleado + ", " + activo + ", " + fechaDeAlta
				+ ", " + nombre + ", " + apellidos + ", " + contrasenya + ", " + dni
				+ ", " + domicilio + ", " + ciudad + ", " + codigoPostal
				+ ", " + numeroMovil + ", " + nss;
	}

	public void toPrint()
	{
		System.out.println(this.toString());
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Empleado empleado = (Empleado)obj;
		if(this.nombre.equals(empleado.getNombre())) {
			return true;
		}
		return false;
	}

	public int compareTo(Empleado o) {

        int resultado;

        resultado = this.getNombre().compareTo(o.getNombre());
        if(resultado == 0) {
        	resultado = this.getContrasenya().compareTo(o.getContrasenya());
        }
        return resultado;
    }
	
	public boolean equals(Empleado e) {
		if(this.nombre.equalsIgnoreCase(e.getNombre())) {
			return false;
		}
		return false;
	}
	
	/**
	 * Retorna los detalles del empleado: rol, nombre, apellidos, contrasenya, dni, 
	 * domicilio, numeroMovil, activo y perfil  
	 * @param empleado 
	 */
	public String getCamposEmpleado(Empleado empleado) {
		return tipoEmpleado + " " + nombre + " " + apellidos + " " + contrasenya + " " + dni + " " + 
	domicilio + " " + ciudad+ " " + codigoPostal + " " + numeroMovil + " " + activo;
	}
	
	/**
	 * Establece los detalles de los empleados
	 */
	@SuppressWarnings("unused")
	private void setCamposEmpleado(String tipoEmpleado, String nombre, String apellidos, String contrasenya, 
			String dni, String domicilio, String ciudad, String codigoPostal, String numeroMovil, 
			boolean activo) {
		this.tipoEmpleado = tipoEmpleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.contrasenya = contrasenya;
		this.dni = dni;
		this.domicilio = domicilio;
		this.ciudad = ciudad;
		this.codigoPostal = codigoPostal;
		this.numeroMovil = numeroMovil;
		this.activo = activo;
	}
}
