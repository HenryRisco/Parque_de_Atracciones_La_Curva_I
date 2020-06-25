package uned.daoo.practica.modelo;

import java.util.Date;

/**
 * Clase EntradaDiaLaborable que representa a las personas que acceden al parque 
 * y sus acompañantes.
 *  
 * @author Henry Risco
 * @version 2019.03.01
 *
 */
public class EntradaDiaLaborable extends Entrada  {

	private double totalEntrada;
	
	private static double DIALABORABLEADULTOMEDIA = 40;
	private static double DIALABORABLENINYOMEDIA = DIALABORABLEADULTOMEDIA/2;
	private static double DIALABORABLESENIORMEDIA = DIALABORABLEADULTOMEDIA - (DIALABORABLEADULTOMEDIA*35/100);
	private static double DIALABORABLEADULTOALTA = DIALABORABLEADULTOMEDIA + (DIALABORABLEADULTOMEDIA*15/100);
	private static double DIALABORABLENINYOALTA = DIALABORABLENINYOMEDIA + (DIALABORABLENINYOMEDIA*15/100);
	private static double DIALABORABLESENIORALTA = DIALABORABLESENIORMEDIA + (DIALABORABLESENIORMEDIA*15/100); 
	private static double DIALABORABLEADULTOBAJA = DIALABORABLEADULTOMEDIA - (DIALABORABLEADULTOMEDIA*15/100);
	private static double DIALABORABLENINYOBAJA = DIALABORABLENINYOMEDIA - (DIALABORABLENINYOMEDIA*15/100);
	private static double DIALABORABLESENIORBAJA = DIALABORABLESENIORMEDIA - (DIALABORABLESENIORMEDIA*15/100);
	
	

	public EntradaDiaLaborable() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Generamos el constructor de la clase EntradaDiaLaborable 
	 */
	public EntradaDiaLaborable(Date fechaDeEntrada, String temporada, String tipoEntrada, boolean vIP,
			int entradaAdulto, int entradaSenior, int entradaNinyo, boolean parking, boolean accesoPrefente,
			boolean bonoComida, int numeroEntrada) {
		super(fechaDeEntrada, temporada, tipoEntrada, vIP, entradaAdulto, entradaSenior, entradaNinyo, parking, accesoPrefente,
				bonoComida, numeroEntrada);
		// TODO Auto-generated constructor stub
	}

	public double totalEntrada() {
		
		if(getTemporada()=="Alta") {
			totalEntrada = (DIALABORABLEADULTOALTA*getEntradaAdulto()) + (DIALABORABLENINYOALTA*getEntradaNinyo()) + (DIALABORABLESENIORALTA*getEntradaSenior());
			return totalEntrada;
		}else if(getTemporada()=="Media") {
			totalEntrada = (DIALABORABLEADULTOMEDIA*getEntradaAdulto()) + (DIALABORABLENINYOMEDIA*getEntradaNinyo()) + (DIALABORABLESENIORMEDIA*getEntradaSenior());
			return totalEntrada;
		}else if(getTemporada()=="Baja") {
			totalEntrada = (DIALABORABLEADULTOBAJA*getEntradaAdulto()) + (DIALABORABLENINYOBAJA*getEntradaNinyo()) + (DIALABORABLESENIORBAJA*getEntradaSenior());
			return totalEntrada;
		}
		return totalEntrada;
	}

	@Override
	public String toString() {
		return "EntradaDiaLaborable [totalEntrada=" + totalEntrada + ", totalEntrada()=" + totalEntrada()
				+ ", getFechaDeEntrada()=" + getFechaDeEntrada() + ", getTemporada()=" + getTemporada()
				+ ", getTipoEntrada()=" + getTipoEntrada() + ", isVIP()=" + isVIP() + ", getEntradaAdulto()="
				+ getEntradaAdulto() + ", getEntradaSenior()=" + getEntradaSenior() + ", getEntradaNinyo()="
				+ getEntradaNinyo() + ", getParking()=" + getParking() + ", getAccesoPrefente()=" + getAccesoPrefente()
				+ ", getBonoComida()=" + getBonoComida() + "]";
	}

	
	

	
}
