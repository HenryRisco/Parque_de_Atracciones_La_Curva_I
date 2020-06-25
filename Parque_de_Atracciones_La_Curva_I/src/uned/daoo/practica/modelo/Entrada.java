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
	 * Generamos el constructor de la clase Entrada vac�o
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
	 * M�todo que devuelve la fecha de entrada y la hora de acceso al parque
	 * @param fechaDeEntrada
	 */
	public Date getFechaDeEntrada() {
		return fechaDeEntrada;
	}
	
	/**
	 * M�todo que establece la fecha de entrada y la hora de acceso al parque
	 * @@param fechaDeEntrada
	 */
	public void setFechaDeEntrada(Date fechaDeEntrada) {
		this.fechaDeEntrada = fechaDeEntrada;
	}

	/**
	 * M�todo que devuelve la temporada de acceso al parque
	 * @param temporada
	 */
	public String getTemporada() {
		return temporada;
	}

	/**
	 * M�todo que establece la temporada de acceso al parque
	 * @@param temporada
	 */
	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}
	
	/**
	 * M�todo que devuelve el tipo de entrada de acceso al parque
	 * @return
	 */
	public String getTipoEntrada() {
		return tipoEntrada;
	}

	/**
	 * M�todo ue establece el tipo de entrada de acceso al parque
	 * @param tipoEntrada
	 */
	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	/**
	 * M�todo que devuelve si tiene el acceso VIP al parque
	 * @param VIP
	 */
	public boolean isVIP() {
		return VIP;
	}

	/**
	 * M�todo que establece si tiene el acceso VIP al parque
	 * @@param VIP
	 */
	public void setVIP(boolean vIP) {
		VIP = vIP;
	}

	/**
	 * M�todo que devuelve la cantidad de adultos
	 * @param entradaAdulto
	 */
	public int getEntradaAdulto() {
		return entradaAdulto;
	}

	/**
	 * M�todo que establece la cantidad de adultos
	 * @@param entradaAdulto
	 */
	public void setEntradaAdulto(int entradaAdulto) {
		this.entradaAdulto = entradaAdulto;
	}

	/**
	 * M�todo que devuelve la cantidad de seniors
	 * @param entradaSenior
	 */
	public int getEntradaSenior() {
		return entradaSenior;
	}

	/**
	 * M�todo que establece la cantidad de seniors
	 * @@param entradaSenior
	 */
	public void setEntradaSenior(int entradaSenior) {
		this.entradaSenior = entradaSenior;
	}

	/**
	 * M�todo que devuelve la cantidad de ni�os
	 * @param entradaNinyo
	 */
	public int getEntradaNinyo() {
		return entradaNinyo;
	}

	/**
	 * M�todo que establece la cantidad de ni�os
	 * @@param entradaNinyo
	 */
	public void setEntradaNinyo(int entradaNinyo) {
		this.entradaNinyo = entradaNinyo;
	}

	
	
	/**
	 * M�todo que devuelve el acceso al parking
	 * @param parking
	 */
	public boolean getParking() {
		return parking;
	}

	/**
	 * M�todo que establece el acceso al parking
	 * @@param parking
	 */
	public void setParking(boolean parking) {
		this.parking = parking;
	}

	/**
	 * M�todo que devuelve el acceso preferente a las atracciones
	 * @param accesoPrefente
	 */
	public boolean getAccesoPrefente() {
		return accesoPrefente;
	}

	/**
	 * M�todo que establece el acceso preferente a las atracciones
	 * @@param accesoPrefente
	 */
	public void setAccesoPrefente(boolean accesoPrefente) {
		this.accesoPrefente = accesoPrefente;
	}

	/**
	 * M�todo que devuelve el bono comida
	 * @param bonoComida
	 */
	public boolean getBonoComida() {
		return bonoComida;
	}

	/**
	 * M�todo que establece el bono comida
	 * @param bonoComida
	 */
	public void setBonoComida(boolean bonoComida) {
		this.bonoComida = bonoComida;
	}
	
	/**
	 * M�todo que devuelve el n�mero de entrada de acceso al parque
	 * @return numeroEntrada
	 */
	public int getNumeroEntrada() {
		return numeroEntrada;
	}
	
	/**
	 * M�todo que establece la n�mero de entrada de acceso al parque
	 * @param numeroEntrada
	 */
	public void setNumeroEntrada(int numeroEntrada) {
		this.numeroEntrada = numeroEntrada;
	}

	/* M�todos abstractos */
	
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
