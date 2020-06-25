package uned.daoo.practica.modelo;

import java.util.Date;

public class EntradaGeneral extends Entrada {

	private double totalEntrada;
		
	private static double ENTRADAGENERALADULTOMEDIA = 60;
	private static double ENTRADAGENERALNINYOMEDIA = ENTRADAGENERALADULTOMEDIA/2;
	private static double ENTRADAGENERALSENIORMEDIA = ENTRADAGENERALADULTOMEDIA - (ENTRADAGENERALADULTOMEDIA*35/100);
	private static double ENTRADAGENERALADULTOALTA = ENTRADAGENERALADULTOMEDIA + (ENTRADAGENERALADULTOMEDIA*15/100);
	private static double ENTRADAGENERALNINYOALTA = ENTRADAGENERALNINYOMEDIA + (ENTRADAGENERALNINYOMEDIA*15/100);
	private static double ENTRADAGENERALSENIORALTA = ENTRADAGENERALSENIORMEDIA + (ENTRADAGENERALSENIORMEDIA*15/100); 
	private static double ENTRADAGENERALADULTOBAJA = ENTRADAGENERALADULTOMEDIA - (ENTRADAGENERALADULTOMEDIA*15/100);
	private static double ENTRADAGENERALNINYOBAJA = ENTRADAGENERALNINYOMEDIA - (ENTRADAGENERALNINYOMEDIA*15/100);
	private static double ENTRADAGENERALSENIORBAJA = ENTRADAGENERALSENIORMEDIA - (ENTRADAGENERALSENIORMEDIA*15/100);
		 
	
	public EntradaGeneral() {
			super();
			// TODO Auto-generated constructor stub
		}
	
	/**
	 * Generamos el constructor de la clase EntradaGeneral 
	 */
	public EntradaGeneral(Date fechaDeEntrada, String temporada, String tipoEntrada, boolean vIP, int entradaAdulto,
			int entradaSenior, int entradaNinyo, boolean parking, boolean accesoPrefente, boolean bonoComida,
			int numeroEntrada) {
		super(fechaDeEntrada, temporada, tipoEntrada, vIP, entradaAdulto, entradaSenior, entradaNinyo, parking, accesoPrefente,
				bonoComida, numeroEntrada);
		// TODO Auto-generated constructor stub
	}

	public double totalEntradaDeTarde() {
		
		if(getTemporada()=="Alta") {
			totalEntrada = (ENTRADAGENERALADULTOALTA*getEntradaAdulto()) + (ENTRADAGENERALNINYOALTA*getEntradaNinyo()) + (ENTRADAGENERALSENIORALTA*getEntradaSenior());
			return totalEntrada;
		}else if(getTemporada()=="Media") {
			totalEntrada = (ENTRADAGENERALADULTOMEDIA*getEntradaAdulto()) + (ENTRADAGENERALNINYOMEDIA*getEntradaNinyo()) + (ENTRADAGENERALSENIORMEDIA*getEntradaSenior());
			return totalEntrada;
		}else if(getTemporada()=="Baja") {
			totalEntrada = (ENTRADAGENERALADULTOBAJA*getEntradaAdulto()) + (ENTRADAGENERALNINYOBAJA*getEntradaNinyo()) + (ENTRADAGENERALSENIORBAJA*getEntradaSenior());
			return totalEntrada;
		}
		return totalEntrada;
	}

	@Override
	public String toString() {
		return "EntradaGeneral [totalEntrada=" + totalEntrada + ", totalEntradaDeTarde()=" + totalEntradaDeTarde()
				+ ", getFechaDeEntrada()=" + getFechaDeEntrada() + ", getTemporada()=" + getTemporada()
				+ ", getTipoEntrada()=" + getTipoEntrada() + ", isVIP()=" + isVIP() + ", getEntradaAdulto()="
				+ getEntradaAdulto() + ", getEntradaSenior()=" + getEntradaSenior() + ", getEntradaNinyo()="
				+ getEntradaNinyo() + ", getParking()=" + getParking() + ", getAccesoPrefente()=" + getAccesoPrefente()
				+ ", getBonoComida()=" + getBonoComida() + ", totalEntrada()=" + totalEntrada() + "]";
	}
	
	
	
}
