package Cecinato_cs2022.EcceptionTelevisore;

/**
 * 
 * <p>
 * <b> CLASSE: TelevisoreException </b>
 * <p>
 * Questa classe ha lo scopo di gestire le eccezioni dovute ai metodi e
 * controlli delle televisoni <br>
 * 
 * 
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
public class TelevisoreException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * <b> COSTRUTTORE: TelevisoreException </b> aparametrico
	 * 
	 */
	public TelevisoreException() {
		super("\n" + "|--------------------ERRORE-------------------|\n");
	}

	/**
	 * <b> COSTRUTTORE: TelevisoreException </b> Questa eccezione consente di
	 * comunicare un qualiasi errore passato come paramentro che si è verificato al
	 * televisore.
	 * 
	 * @param argv Variabile di tipo stringa che contiene il messaggio di errore da
	 *             comunicare all'utente.
	 */
	public TelevisoreException(String argv) {
		super(argv);
	}

	/**
	 * 
	 * <b> ECCEZIONE: messErrorAddElement</b>
	 * <p>
	 * questa eccezione comunica all'utente un elemento del televisore è già
	 * esistente e non può essere riaggiunto <br>
	 * 
	 * @param message Variabile di tipo stringa contente il valore dell'operazione
	 *                effettata
	 * 
	 * @return stringa contente il messaggio di errore
	 **/
	public String messErrorAddElement(String message) {
		return getMessage() + " | " + message + " è stata gia inserita, non può essere aggiunta |\n";
	}

	/**
	 * 
	 * <b> ECCEZIONE: messErrorModificaElement</b>
	 * <p>
	 * questa eccezione comunica all'utente un elemento del televisore non è
	 * esistente e non può essere modificato <br>
	 * 
	 * @param message Variabile di tipo stringa contente il valore dell'operazione
	 *                effettata
	 * @return stringa contente il messaggio di errore
	 **/
	public String messErrorModificaElement(String message) {
		return getMessage() + " | " + message + " non è stata ancora inserita, devi prima aggiungere|\n";
	}

	/**
	 * 
	 * <b> ECCEZIONE: messErrorCanellazioneElement</b>
	 * <p>
	 * questa eccezione comunica all'utente un elemento del televisore non può
	 * essere cancellato <br>
	 * 
	 * @param message Variabile di tipo stringa contente il messaggio di errore
	 *                dell'operazione effettuata
	 * 
	 * @return stringa contente il messaggio di errore
	 **/
	public String messErrorCanellazioneElement(String message) {
		return getMessage() + " | " + message + "|\n";
	}

	/**
	 * 
	 * <b> ECCEZIONE: ErrorTipologiaTelevisoreException</b>
	 * <p>
	 * questa eccezione comunica all'utente che un operazione da eseguire sulla tv
	 * non può essere effettata perchè non può essere eseguita su quel tipo
	 * tipologia di tv.<br>
	 * 
	 * 
	 * @return stringa contente il messaggio di errore
	 **/
	public String ErrorTipologiaTelevisoreException() {
		return getMessage()
				+ "| La funzionalità che vuole usare non può essere usata per questa Tipologia di Televisore |\n";
	}
}
