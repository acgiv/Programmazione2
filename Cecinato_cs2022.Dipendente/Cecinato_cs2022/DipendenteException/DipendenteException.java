package Cecinato_cs2022.DipendenteException;

/**
 * 
 * <p>
 * <b> CLASSE: DipendenteException </b>
 * <p>
 * Questa classe ha lo scopo di gestire le eccezioni dovute ai metodi e
 * controlli dei dipendenti <br>
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

public class DipendenteException extends Exception {
	
	
	private static final long serialVersionUID = 1L;

	/**
	 * <b> COSTRUTTORE: DipendenteException </b> aparametrico
	 * 
	 */
	public DipendenteException() {
		super("\n" + "|--------------------ERRORE-------------------|\n");
	}

	
	/**
	 * <b> COSTRUTTORE: DipendenteException </b> Questa eccezione consente di
	 * comunicare un qualiasi errore passato come paramentro che si è verificato al
	 * dipendente.
	 * 
	 * @param argv Variabile di tipo stringa che contiene il messaggio di errore da
	 *             comunicare all'utente.
	 */
	public DipendenteException(String argv) {
		super(argv);	
	}
}
