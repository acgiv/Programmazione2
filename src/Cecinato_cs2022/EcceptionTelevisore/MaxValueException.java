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
}
