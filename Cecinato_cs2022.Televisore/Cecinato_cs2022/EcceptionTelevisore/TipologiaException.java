package Cecinato_cs2022.EcceptionTelevisore;



public class TipologiaException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public TipologiaException() {
		super("\n" + "|--------------------ERRORE-------------------|\n");
	}

	public String ErrorTipologiaTelevisoreException() {
		return getMessage() + "| La funzionalit� che vuole usare non pu� essere usata per questa Tipologia di Televisore |\n";
	}

}
