package uned.daoo.practica.modelo;

import java.util.Date;

public class EntradaDeTarde extends Entrada {

	private double totalEntrada;
		
	private static double ENTRADADETARDEADULTOMEDIA = 30;
	private static double ENTRADADETARDENINYOMEDIA = ENTRADADETARDEADULTOMEDIA/2;
	private static double ENTRADADETARDESENIORMEDIA = ENTRADADETARDEADULTOMEDIA - (ENTRADADETARDEADULTOMEDIA*35/100);
	private static double ENTRADADETARDEADULTOALTA = ENTRADADETARDEADULTOMEDIA + (ENTRADADETARDEADULTOMEDIA*15/100);
	private static double ENTRADADETARDENINYOALTA = ENTRADADETARDENINYOMEDIA + (ENTRADADETARDENINYOMEDIA*15/100);
	private static double ENTRADADETARDESENIORALTA = ENTRADADETARDESENIORMEDIA + (ENTRADADETARDESENIORMEDIA*15/100); 
	private static double ENTRADADETARDEADULTOBAJA = ENTRADADETARDEADULTOMEDIA - (ENTRADADETARDEADULTOMEDIA*15/100);
	private static double ENTRADADETARDENINYOBAJA = ENTRADADETARDENINYOMEDIA - (ENTRADADETARDENINYOMEDIA*15/100);
	private static double ENTRADADETARDESENIORBAJA = ENTRADADETARDESENIORMEDIA - (ENTRADADETARDESENIORMEDIA*15/100);
		 
	
	public EntradaDeTarde() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Generamos el constructor de la clase EntradaDeTarde 
	 */
	public EntradaDeTarde(Date fechaDeEntrada, String temporada, String tipoEntrada, boolean vIP, int entradaAdulto,
			int entradaSenior, int entradaNinyo, boolean parking, boolean accesoPrefente, boolean bonoComida,
			int numeroEntrada) {
		super(fechaDeEntrada, temporada, tipoEntrada, vIP, entradaAdulto, entradaSenior, entradaNinyo, parking, accesoPrefente,
				bonoComida, numeroEntrada);
		// TODO Auto-generated constructor stub
	}

	public double totalEntrada() {
		
		if(getTemporada()=="Alta") {
			totalEntrada = (ENTRADADETARDEADULTOALTA*getEntradaAdulto()) + (ENTRADADETARDENINYOALTA*getEntradaNinyo()) + (ENTRADADETARDESENIORALTA*getEntradaSenior());
			return totalEntrada;
		}else if(getTemporada()=="Media") {
			totalEntrada = (ENTRADADETARDEADULTOMEDIA*getEntradaAdulto()) + (ENTRADADETARDENINYOMEDIA*getEntradaNinyo()) + (ENTRADADETARDESENIORMEDIA*getEntradaSenior());
			return totalEntrada;
		}else if(getTemporada()=="Baja") {
			totalEntrada = (ENTRADADETARDEADULTOBAJA*getEntradaAdulto()) + (ENTRADADETARDENINYOBAJA*getEntradaNinyo()) + (ENTRADADETARDESENIORBAJA*getEntradaSenior());
			return totalEntrada;
		}
		return totalEntrada;
	}

	@Override
	public String toString() {
		return "EntradaDeTarde [totalEntrada=" + totalEntrada + ", totalEntrada()=" + totalEntrada()
				+ ", getFechaDeEntrada()=" + getFechaDeEntrada() + ", getTemporada()=" + getTemporada()
				+ ", getTipoEntrada()=" + getTipoEntrada() + ", isVIP()=" + isVIP() + ", getEntradaAdulto()="
				+ getEntradaAdulto() + ", getEntradaSenior()=" + getEntradaSenior() + ", getEntradaNinyo()="
				+ getEntradaNinyo() + ", getParking()=" + getParking() + ", getAccesoPrefente()=" + getAccesoPrefente()
				+ ", getBonoComida()=" + getBonoComida() + "]";
	}


	


	


	
	
	
}
