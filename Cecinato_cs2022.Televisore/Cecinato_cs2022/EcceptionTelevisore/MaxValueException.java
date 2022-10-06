package Cecinato_cs2022.EcceptionTelevisore;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;

public class MaxValueException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MaxValueException() {
		super("\n" + "|--------------------ERRORE-------------------|\n");
	}

	public String ErrorMaxAltezza() {
		return getMessage() + "| Hai inserito l'altezza superiore al valore limite di: " + ConstantGlobal.ALTEZZA_MASSIMA_TV +" |\n";
	}
	
	public String ErrorMaxLarghezza() {
		return getMessage() + "| Hai inserito la lunghezza della tv superiore al valore limite di: " + ConstantGlobal.LARGHEZZA_MASSIMA_TV + " |\n";
	}
	
	public String ErrorMaxDiagonale() {
		return getMessage() + "| Hai inserito la lunghezza della diagonale superiore al valore limite di: " + ConstantGlobal.DIAGONALE_MASSIMA_TV + " |\n" ;
	}
	
	public String ErrorMaxNumeroHdmi() {
		return getMessage() + "| Hai inserito un numero di hdmI superiore al valore limite  |\n";	
	}
	
	public String ErrorMaxNumeroUsb() {
		return getMessage() + "| Hai inserito un numero di usb superiore al valore limite  |\n";	
	}
	
	public String ErrorMaxNumeroSmartTv() {
		return getMessage() + "| Hai inserito un numero di smart tv superiore al valore limite  |\n";	
	}
}
