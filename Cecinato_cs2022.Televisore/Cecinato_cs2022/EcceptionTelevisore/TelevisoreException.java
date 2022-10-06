package Cecinato_cs2022.EcceptionTelevisore;


public class TelevisoreException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <b> COSTRUTTORE APARAMETRICO: </b>
	 * 
	 */
	public TelevisoreException() {
		super("\n" + "|--------------------ERRORE-------------------|\n");
	}

	public TelevisoreException(String argv) {
		super(argv);
	}
	
	public String messErrorAddElement(String message) {
		return getMessage() + " | " + message + " è stata gia inserita, non può essere aggiunta |\n";
	}
	
	

	public String messErrorModificaElement(String message) {
		 return getMessage() + " | " + message + " non è stata ancora inserita, devi prima aggiungere|\n";
	}
	
	
	public String messErrorCanellazioneElement(String message) {
		 return getMessage() + " | " + message + "|\n";
	}
	
	
}
