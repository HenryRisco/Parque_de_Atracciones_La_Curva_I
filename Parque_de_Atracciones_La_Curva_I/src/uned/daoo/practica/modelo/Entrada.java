package uned.daoo.practica.modelo;

import java.util.Date;

/**
 * Clase  abstracta Entrada que representa a los datos del cliente que quiere acceder al Parque de Atracciones La Curva,
 * que quieren acceder al parque.
 *  
 * @author Henry Risco
 * @version 2019.12.14
 *
 */

public abstract class Entrada implements TipoEntrada {

	private int numeroEntrada;
	private Date fechaDeEntrada;
	private String temporada;
	private String tipoEntrada;
	private boolean VIP;
	private int entradaAdulto; 
	private int entradaSenior;
	private int entradaNinyo;
	private boolean parking;
	private boolean accesoPrefente;
	private boolean bonoComida;
	
	/**
	 * Generamos el constructor de la clase Entrada vacío
	 */
	public Entrada() {
		super();
	}

	/**
	 * Generamos el constructor de la clase Entrada
	 * 
	 * @param fechaDeEntrada
	 * @param temporada
	 * @param tipoEntrada
	 * @param vIP
	 * @param entradaAdulto
	 * @param entradaSenior
	 * @param entradaNinyo
	 * @param entradaBebe
	 * @param parking
	 * @param accesoPrefente
	 * @param bonoComida
	 */
	
	public Entrada(Date fechaDeEntrada, String temporada, String tipoEntrada, boolean vIP,
			int entradaAdulto, int entradaSenior, int entradaNinyo, boolean parking, boolean accesoPrefente,
			boolean bonoComida, int numeroEntrada) {
		super();
		this.fechaDeEntrada = fechaDeEntrada;
		this.temporada = temporada;
		this.tipoEntrada = tipoEntrada;
		VIP = vIP;
		this.entradaAdulto = entradaAdulto;
		this.entradaSenior = entradaSenior;
		this.entradaNinyo = entradaNinyo;
		this.parking = parking;
		this.accesoPrefente = accesoPrefente;
		this.bonoComida = bonoComida;
		this.numeroEntrada = numeroEntrada;
	}

	/* Generamos los getters y setters */
	
	
	
	

	/**
	 * Método que devuelve la fecha de entrada y la hora de acceso al parque
	 * @param fechaDeEntrada
	 */
	public Date getFechaDeEntrada() {
		return fechaDeEntrada;
	}
	
	/**
	 * Método que establece la fecha de entrada y la hora de acceso al parque
	 * @@param fechaDeEntrada
	 */
	public void setFechaDeEntrada(Date fechaDeEntrada) {
		this.fechaDeEntrada = fechaDeEntrada;
	}

	/**
	 * Método que devuelve la temporada de acceso al parque
	 * @param temporada
	 */
	public String getTemporada() {
		return temporada;
	}

	/**
	 * Método que establece la temporada de acceso al parque
	 * @@param temporada
	 */
	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}
	
	/**
	 * Método que devuelve el tipo de entrada de acceso al parque
	 * @return
	 */
	public String getTipoEntrada() {
		return tipoEntrada;
	}

	/**
	 * Método ue establece el tipo de entrada de acceso al parque
	 * @param tipoEntrada
	 */
	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	/**
	 * Método que devuelve si tiene el acceso VIP al parque
	 * @param VIP
	 */
	public boolean isVIP() {
		return VIP;
	}

	/**
	 * Método que establece si tiene el acceso VIP al parque
	 * @@param VIP
	 */
	public void setVIP(boolean vIP) {
		VIP = vIP;
	}

	/**
	 * Método que devuelve la cantidad de adultos
	 * @param entradaAdulto
	 */
	public int getEntradaAdulto() {
		return entradaAdulto;
	}

	/**
	 * Método que establece la cantidad de adultos
	 * @@param entradaAdulto
	 */
	public void setEntradaAdulto(int entradaAdulto) {
		this.entradaAdulto = entradaAdulto;
	}

	/**
	 * Método que devuelve la cantidad de seniors
	 * @param entradaSenior
	 */
	public int getEntradaSenior() {
		return entradaSenior;
	}

	/**
	 * Método que establece la cantidad de seniors
	 * @@param entradaSenior
	 */
	public void setEntradaSenior(int entradaSenior) {
		this.entradaSenior = entradaSenior;
	}

	/**
	 * Método que devuelve la cantidad de niños
	 * @param entradaNinyo
	 */
	public int getEntradaNinyo() {
		return entradaNinyo;
	}

	/**
	 * Método que establece la cantidad de niños
	 * @@param entradaNinyo
	 */
	public void setEntradaNinyo(int entradaNinyo) {
		this.entradaNinyo = entradaNinyo;
	}

	
	
	/**
	 * Método que devuelve el acceso al parking
	 * @param parking
	 */
	public boolean getParking() {
		return parking;
	}

	/**
	 * Método que establece el acceso al parking
	 * @@param parking
	 */
	public void setParking(boolean parking) {
		this.parking = parking;
	}

	/**
	 * Método que devuelve el acceso preferente a las atracciones
	 * @param accesoPrefente
	 */
	public boolean getAccesoPrefente() {
		return accesoPrefente;
	}

	/**
	 * Método que establece el acceso preferente a las atracciones
	 * @@param accesoPrefente
	 */
	public void setAccesoPrefente(boolean accesoPrefente) {
		this.accesoPrefente = accesoPrefente;
	}

	/**
	 * Método que devuelve el bono comida
	 * @param bonoComida
	 */
	public boolean getBonoComida() {
		return bonoComida;
	}

	/**
	 * Método que establece el bono comida
	 * @param bonoComida
	 */
	public void setBonoComida(boolean bonoComida) {
		this.bonoComida = bonoComida;
	}
	
	/**
	 * Método que devuelve el número de entrada de acceso al parque
	 * @return numeroEntrada
	 */
	public int getNumeroEntrada() {
		return numeroEntrada;
	}
	
	/**
	 * Método que establece la número de entrada de acceso al parque
	 * @param numeroEntrada
	 */
	public void setNumeroEntrada(int numeroEntrada) {
		this.numeroEntrada = numeroEntrada;
	}

	/* Métodos abstractos */
	
	@Override
	public double totalEntrada() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
}
