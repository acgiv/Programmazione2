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

	public String messErrorAddElement(String message) {
		return getMessage() + " | " + message + " � stata gia popolata, non pu� essere aggiunta |\n";
	}
}
