package uned.daoo.practica.modelo;

import java.util.Date;

public class EntradaBonificada extends Entrada {

	private double totalEntrada;
	
		
		
	private static double ENTRADABONIFICADAADULTOMEDIA = 60;
	private static double ENTRADABONIFICADANINYOMEDIA = ENTRADABONIFICADAADULTOMEDIA/2;
	private static double ENTRADABONIFICADASENIORMEDIA = ENTRADABONIFICADAADULTOMEDIA - (ENTRADABONIFICADAADULTOMEDIA*35/100);
	private static double ENTRADABONIFICADAADULTOALTA = ENTRADABONIFICADAADULTOMEDIA + (ENTRADABONIFICADAADULTOMEDIA*15/100);
	private static double ENTRADABONIFICADANINYOALTA = ENTRADABONIFICADANINYOMEDIA + (ENTRADABONIFICADANINYOMEDIA*15/100);
	private static double ENTRADABONIFICADASENIORALTA = ENTRADABONIFICADASENIORMEDIA + (ENTRADABONIFICADASENIORMEDIA*15/100); 
	private static double ENTRADABONIFICADAADULTOBAJA = ENTRADABONIFICADAADULTOMEDIA - (ENTRADABONIFICADAADULTOMEDIA*15/100);
	private static double ENTRADABONIFICADANINYOBAJA = ENTRADABONIFICADANINYOMEDIA - (ENTRADABONIFICADANINYOMEDIA*15/100);
	private static double ENTRADABONIFICADASENIORBAJA = ENTRADABONIFICADASENIORMEDIA - (ENTRADABONIFICADASENIORMEDIA*15/100);
		 
	/**
	 * Generamos el constructor de la clase EntradaBonificada vacío
	 */
	public EntradaBonificada() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Generamos el constructor de la clase EntradaBonificada 
	 */
	public EntradaBonificada(Date fechaDeEntrada, String temporada, String tipoEntrada, boolean vIP, int entradaAdulto,
			int entradaSenior, int entradaNinyo, boolean parking, boolean accesoPrefente, boolean bonoComida,
			int numeroEntrada) {
		super(fechaDeEntrada, temporada, tipoEntrada, vIP, entradaAdulto, entradaSenior, entradaNinyo, parking, accesoPrefente,
				bonoComida, numeroEntrada);
		// TODO Auto-generated constructor stub
	}

	public double totalEntradaDeTarde() {
		
		if(getTemporada()=="Alta") {
			totalEntrada = (ENTRADABONIFICADAADULTOALTA*getEntradaAdulto()) + (ENTRADABONIFICADANINYOALTA*getEntradaNinyo()) + (ENTRADABONIFICADASENIORALTA*getEntradaSenior());
			return totalEntrada;
		}else if(getTemporada()=="Media") {
			totalEntrada = (ENTRADABONIFICADAADULTOMEDIA*getEntradaAdulto()) + (ENTRADABONIFICADANINYOMEDIA*getEntradaNinyo()) + (ENTRADABONIFICADASENIORMEDIA*getEntradaSenior());
			return totalEntrada;
		}else if(getTemporada()=="Baja") {
			totalEntrada = (ENTRADABONIFICADAADULTOBAJA*getEntradaAdulto()) + (ENTRADABONIFICADANINYOBAJA*getEntradaNinyo()) + (ENTRADABONIFICADASENIORBAJA*getEntradaSenior());
			return totalEntrada;
		}
		return totalEntrada;
	}

	

		
}
