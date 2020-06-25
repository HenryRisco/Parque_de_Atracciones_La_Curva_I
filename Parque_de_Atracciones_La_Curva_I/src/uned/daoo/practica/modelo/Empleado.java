/**
 * 
 */
package uned.daoo.practica.modelo;

import java.io.Serializable;
import java.util.Date;

/**
 * La clase abstracta Empleado representa a un empleado dentro de la aplicación Parque
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
	 * nombre, apellidos, contraseña, dni, domicilio, ciudad, código postal, numero de movil, nss
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
	 * Método que muestra el tipoEmpleado del Empleado
	 * @param tipoEmpleado
	 */
	public String getTipoEmpleado() {
		return tipoEmpleado;
	}

	/**
	 * Método que establece el tipoEmpleado del Empleado
	 * @@param tipoEmpleado
	 */
	public void setTipoEmpleado(String tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}
	
	/**
	 * Método que muestra el estado del Empleado
	 * @param activo
	 */
	public boolean getActivo() {
		return activo;
	}

	/**
	 * Método que establece el estado del Empleado
	 * @param activo
	 */
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	/**
	 * Método que devuelve la fecha de alta del empleado 
	 * @return
	 */
	
	public Date getFechaDeAlta() {
		return fechaDeAlta;
	}

	/**
	 * Método que establece la fecha de alta del empleado
	 * @param fechaDeAlta
	 */
	public void setFechaDeAlta(Date fechaDeAlta) {
		this.fechaDeAlta = fechaDeAlta;
	}

	/**
	 * Método que devuelve el nombre del Empleado
	 * @param nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método que establece el nombre del Empleado
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método que devuelve los apellidos del Empleado
	 * @param apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Método que establece los apellidos del Empleado
	 * @return apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	/**
	 * Método que devuelve la contraseña del Empleado
	 * @return contrasenya
	 */
	public String getContrasenya() {
		return contrasenya;
	}

	/**
	 * Método que establece la contraseña del Empleado
	 * @return contrasenya
	 */
	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}

	/**
	 * Método que devuelve el DNI del Empleado
	 * @param dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Método que establece el DNI del Empleado
	 * @return dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * Método que devuelve el domicilio del Empleado
	 * @param domicilio
	 */
	public String getDomicilio() {
		return domicilio;
	}

	/**
	 * Método que establece el domicilio del Empleado
	 * @return domicilio
	 */
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	/**
	 * Método que devuelve la ciudad del Empleado
	 * @param ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * Método que establece la ciudad del Empleado
	 * @return ciudad
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	/**
	 * Método que devuelve el código postal del Empleado
	 * @param codigoPostal
	 */
	public String getCodigoPostal() {
		return codigoPostal;
	}

	/**
	 * Método que establece el codigo Postal del Empleado
	 * @return codigoPostal
	 */
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	/**
	 * Método que devuelve el número de móvil del Empleado
	 * @param numeroMovil
	 */
	public String getNumeroMovil() {
		return numeroMovil;
	}

	/**
	 * Método que establece el número de móvil del Empleado
	 * @return numeroMovil
	 */
	public void setNumeroMovil(String numeroMovil) {
		this.numeroMovil = numeroMovil;
	}
	
	/**
	 * Método que devuelve el número de la seguridad social del empleado 
	 * @param nss
	 */
	public String getNSS() {
		return nss;
	}

	/**
	 * Método que establece el número de la seguridad social del empleado 
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
