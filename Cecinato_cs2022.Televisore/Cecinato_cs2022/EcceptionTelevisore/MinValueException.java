package Cecinato_cs2022.EcceptionTelevisore;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;

public class MinValueException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <b> COSTRUTTORE APARAMETRICO: </b>
	 * 
	 */
	public MinValueException() {
		super("\n" + "|--------------------ERRORE-------------------|\n");
	}

	public String ErrorMinAltezza() {
		return getMessage() + "| Hai inserito l'altezza  inferirore al valore limite di: " + ConstantGlobal.ALTEZZA_MINIMA_TV + " |\n";
	}
	
	public String ErrorMinLarghezza() {
		return getMessage() + "| Hai inserito la lunghezza inferiore al valore limite " + ConstantGlobal.LARGHEZZA_MINIMA_TV + "|\n";
	}
	
	public String ErrorMinDiagonale() {
		return getMessage() + "| Hai inserito la lunghezza della diagonale inferirore al valore limite: " + ConstantGlobal.DIAGONALE_MINIMA_TV + " |\n";
	}

	public String ErrorMinNumeroHdmi() {
		return getMessage() + "| Hai inserito un numero inferiore di hdmi rispetto al valore limite di : " + ConstantGlobal.NUMERO_MINIMO_HDMI + "|\n";
	}
	
	public String ErrorMinNumeroMinUsb() {
		return getMessage() + "| Hai inserito un numero inferiore di usb rispetto al valore limite di : " + ConstantGlobal.NUMERO_MINIMO_USB + "|\n";
	}
	
	public String ErrorMinNumeroMinSmartTv() {
		return getMessage() + "| Hai inserito un numero inferiore di smart tv rispetto al valore limite di : " + ConstantGlobal.NUMERO_MINIMO_SMART_TV + "|\n";
	}

}
