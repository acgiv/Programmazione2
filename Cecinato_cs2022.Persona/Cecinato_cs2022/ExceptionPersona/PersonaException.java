package Cecinato_cs2022.ExceptionPersona;

/**
 * 
 * <p>
 * <b> CLASSE: PersonaException </b>
 * <p>
 * Questa classe ha lo scopo di gestire le eccezioni dovute ai metodi e
 * controlli della persona <br>
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

public class PersonaException extends Exception {

	private static final long serialVersionUID = 1L;
	
	/**
	 * <b> COSTRUTTORE: PersonaException </b> aparametrico
	 * 
	 */
	public PersonaException() {
		super("\n" + "|--------------------ERRORE-------------------|\n");
	}
	
	/**
	 * <b> COSTRUTTORE: PersonaException </b> Questa eccezione consente di
	 * comunicare un qualiasi errore passato come paramentro che si è verificato alla
	 * persona.
	 * 
	 * @param message Variabile di tipo stringa che contiene il messaggio di errore da
	 *             comunicare all'utente.
	 */
	
	public PersonaException (String message){
		super(message);
	}



}
