package Cecinato_cs2022.ServicePersona;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;

/**
 * 
 * <p>
 * <b> INTERFACCIA: VisualizzaPersona </b>
 * <p>
 * Quest'interfaccia ha lo scopo rende accessibili tutte le operazioni che
 * permettono di ottenere, quindi visualizzare le singole proprietà della
 * persona.
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

public interface VisualizzaPersona {

	/**
	 * 
	 * <b> OPERAZIONE: VisualizzaNome </b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare il nome della persona
	 * ritornandola.
	 * 
	 * @return String varibile contente il nome della persona
	 * 
	 */

	public String VisualizzaNome();

	/**
	 * 
	 * <b> OPERAZIONE: VisualizzaCognome </b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare il cognome della persona
	 * ritornandola.
	 * 
	 * @return String varibile contente il cognome della persona
	 * 
	 */

	public String VisualizzaCognome();

	/**
	 * 
	 * <b> OPERAZIONE: VisualizzaEta </b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare l' età della persona
	 * ritornandola.
	 * 
	 * @return String varibile contente il cognome della persona
	 * 
	 */

	public int VisualizzaEta();

	/**
	 * 
	 * <b> OPERAZIONE: VisualizzaGenere </b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare il genere della persona
	 * ritornandola.
	 * 
	 * @return String varibile contente il genere della persona
	 * 
	 */

	public ConstantGlobal.GENERE VisualizzaGenere();

	/**
	 * 
	 * <b> OPERAZIONE: VisualizzaDataNascita </b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare la data di nascita della persona
	 * ritornandola.
	 * 
	 * @return String varibile contente la data di nascita della persona
	 * 
	 */

	public String VisualizzaDataNascita();

	/**
	 * 
	 * <b> OPERAZIONE: VisualizzaCitta </b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare la città della persona
	 * ritornandola.
	 * 
	 * @return String varibile contente la città di nascita della persona
	 * 
	 */

	public String VisualizzaCitta();

	/**
	 * 
	 * <b> METODO: visualizzaElencoGenerePersona</b>
	 * <p>
	 * Questo metodo consente di visualizzare tutti i generi della persona
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 */

	public void visualizzaElencoGenerePersona();

}
