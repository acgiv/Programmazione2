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

	

}
