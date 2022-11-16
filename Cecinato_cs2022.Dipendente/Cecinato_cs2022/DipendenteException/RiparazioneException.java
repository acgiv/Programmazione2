package Cecinato_cs2022.DipendenteException;

/**
 * 
 * <p>
 * <b> CLASSE: RiparazioneException </b>
 * <p>
 * Questa classe ha lo scopo di gestire le eccezioni dovute ai metodi e
 * controlli delle riparazioni <br>
 * 
 * @author <i> Alberto Cecinato </i> <br>
 *         Gruppo 79<br>
 *         Matricola: 706576 <br>
 *         Email: <u> cecinatoa@gmail.com </u>
 * 
 * @version 1.0 <br>
 *          Date: 03.11.2022 <br>
 * 
 *
 */

public class RiparazioneException extends Exception {
	
	
	private static final long serialVersionUID = 1L;

	/**
	 * <b> COSTRUTTORE: TelevisoreException </b> aparametrico
	 * 
	 */
	public RiparazioneException() {
		super("\n" + "|--------------------ERRORE-------------------|\n");
	}
	
	/**
	 * <b> COSTRUTTORE: RiparazioneException </b> Questa eccezione consente di
	 * comunicare un qualiasi errore passato come paramentro che si è verificato al
	 * dipendente.
	 * 
	 * @param argv Variabile di tipo stringa che contiene il messaggio di errore da
	 *             comunicare all'utente.
	 */
	
	public RiparazioneException(String argv) {
		super(argv);	
	}
}
