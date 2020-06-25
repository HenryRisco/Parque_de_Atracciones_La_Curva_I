package uned.daoo.practica.modelo;

import java.util.Date;

/**
 * Clase EntradaFamiliar que representa a una familia compuesta por padre y madre 
 * y dos hijos menores (3 <= x <= 12 años).
 *  
 * @author Henry Risco
 * @version 2019.03.01
 *
 */
public class EntradaFamiliar extends Entrada {

	private double totalEntrada;
	private String parking = "Parking gratuito";
	private String accesoPrefente = "Acceso preferente a las atracciones";
	private String bonoComida = "Bono comida gratuito";
	private static float ENTRADAFAMILIARMEDIA = 200;
	private static float ENTRADAFAMILIARALTA = ENTRADAFAMILIARMEDIA + ((ENTRADAFAMILIARMEDIA*15)/100);
	private static float ENTRADAFAMILIARBAJA = ENTRADAFAMILIARMEDIA - ((ENTRADAFAMILIARMEDIA*15)/100);
	
	/**
	 * Generamos el constructor de la clase EntradaFamiliar vacío
	 */
	public EntradaFamiliar() {
		super();
	}


	/**
	 * Generamos el constructor de la clase EntradaFamiliar 
	 */
	public EntradaFamiliar(Date fechaDeEntrada, String temporada, String tipoEntrada, boolean vIP, int entradaAdulto,
			int entradaSenior, int entradaNinyo, boolean parking, boolean accesoPrefente, boolean bonoComida,
			int numeroEntrada) {
		super(fechaDeEntrada, temporada, tipoEntrada, vIP, entradaAdulto, entradaSenior, entradaNinyo, parking, accesoPrefente,
				bonoComida, numeroEntrada);
		// TODO Auto-generated constructor stub
	}


	/*
	public double totalEntradaFamiliar() {
		
		if(getTemporada()=="Alta") {
			totalEntrada = ENTRADAFAMILIARALTA;;
			return totalEntrada;
		}else if(getTemporada()=="Media") {
			totalEntrada = ENTRADAFAMILIARMEDIA;
			return totalEntrada;
		}else if(getTemporada()=="Baja") {
			totalEntrada = ENTRADAFAMILIARBAJA;
			return totalEntrada;
		}
		return totalEntrada;
	}
*/
	@Override
	public double totalEntrada() {
		
		if(getTemporada()=="Alta") {
			totalEntrada = ENTRADAFAMILIARALTA;;
			//return totalEntrada;
		}else if(getTemporada()=="Media") {
			totalEntrada = ENTRADAFAMILIARMEDIA;
			//return totalEntrada;
		}else if(getTemporada()=="Baja") {
			totalEntrada = ENTRADAFAMILIARBAJA;
			//return totalEntrada;
		}
		return super.totalEntrada();
	}


	@Override
	public String toString() {
		return "EntradaFamiliar [totalEntrada=" + totalEntrada + ", parking=" + parking + ", accesoPrefente="
				+ accesoPrefente + ", bonoComida=" + bonoComida + ", totalEntrada()=" + totalEntrada()
				+ ", getFechaDeEntrada()=" + getFechaDeEntrada() + ", getTemporada()=" + getTemporada()
				+ ", getTipoEntrada()=" + getTipoEntrada() + ", isVIP()=" + isVIP() + ", getEntradaAdulto()="
				+ getEntradaAdulto() + ", getEntradaSenior()=" + getEntradaSenior() + ", getEntradaNinyo()="
				+ getEntradaNinyo() + ", getParking()=" + getParking() + ", getAccesoPrefente()=" + getAccesoPrefente()
				+ ", getBonoComida()=" + getBonoComida() + "]";
	}




	




	




	
	
	
}
