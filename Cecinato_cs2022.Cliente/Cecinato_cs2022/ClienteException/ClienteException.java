package Cecinato_cs2022.ClienteException;

/**
 * 
 * <p>
 * <b> CLASSE: ClienteException </b>
 * <p>
 * Questa classe ha lo scopo di gestire le eccezioni dovute ai metodi e
 * controlli del cliente <br>
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

public class ClienteException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * <b> COSTRUTTORE: ClienteException </b> aparametrico
	 * 
	 */

	public ClienteException() {
		super("\n" + "|--------------------ERRORE-------------------|\n");
	}

	/**
	 * <b> COSTRUTTORE: ClienteException </b> Questa eccezione consente di
	 * comunicare un qualiasi errore passato come paramentro che si è verificato al
	 * cliente.
	 * 
	 * @param argv Variabile di tipo stringa che contiene il messaggio di errore da
	 *             comunicare all'utente.
	 */
	public ClienteException(String argv) {
		super(argv);
	}

	/**
	 * 
	 * <b> ECCEZIONE: ExceptionMetodo</b>
	 * <p>
	 * questa eccezione comunica all'utente che un operazione da eseguire sul cliente
	 * non può essere effettata perchè non può essere eseguita.<br>
	 * 
	 * 
	 * @return stringa contente il messaggio di errore
	 **/
	
	public String ExceptionMetodo() {
		return getMessage() + "questa funzione non può essere usata per il cliente";
	}
}
