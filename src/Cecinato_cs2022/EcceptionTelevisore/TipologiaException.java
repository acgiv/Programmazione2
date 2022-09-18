package Cecinato_cs2022.EcceptionTelevisore;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;

public class TipologiaException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public TipologiaException() {
		super("\n" + "|--------------------ERRORE-------------------|\n");
	}

	public String ErrorTipologiaTelevisoreException() {
		return getMessage() + "| La funzionalità che vuole usare non può essere usata per questa Tipologia di Televisore |\n";
	}

}
