package Cecinato_cs2022.ServiceCliente;

import Cecinato_cs2022.DipendenteException.DipendenteException;

/**
 * 
 * <p>
 * <b> INTERFACCIA: VisualizzaCliente </b>
 * <p>
 * Quest'interfaccia ha lo scopo rende accessibili tutte le operazioni che
 * permettono di ottenere, quindi visualizzare le singole proprietà del cliente.
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

public interface VisualizzaCliente {

	/**
	 * 
	 * <b> METODO: visualizzaElencoOperazioniPunti</b>
	 * <p>
	 * Questo metodo consente di visualizzare tutte le operazioni dei punti che
	 * possono essere fatti sul cliente
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * @throws DipendenteException genera un eccezione nel caso in cui questo metodo
	 *                             viene utilizzato dal dipendente
	 * 
	 */
	

	public void visualizzaElencoOperazioniPunti() throws DipendenteException;

	/**
	 * 
	 * <b> OPERAZIONE: VisualizzaNomeCartaFedelta </b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare il nome della carta di fedeltà
	 * del cliente, ritornandola.
	 * 
	 * @return varibile stringa contente il nome della carta di fedeltà
	 * 
	 * @throws DipendenteException genera un eccezione nel caso in cui questo metodo
	 *                             viene utilizzato dal dipendente
	 */

	public String VisualizzaNomeCartaFedelta() throws DipendenteException;

	/**
	 * 
	 * <b> OPERAZIONE: VisualizzaPuntiFedeltaAccumulati </b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare i punti di fedeltà della carta
	 * accumulati dal cliente, ritornandola.
	 * 
	 * @return varibile String contente i punti accumulati della carta di fedeltà
	 * 
	 * @throws DipendenteException genera un eccezione nel caso in cui questo metodo
	 *                             viene utilizzato dal dipendente
	 */

	public String VisualizzaPuntiFedeltaAccumulati() throws DipendenteException;

	/**
	 * 
	 * <b> OPERAZIONE: VisualizzaDataInscrizioneTessera </b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare la data di inscrizione della
	 * tessera fedeltà del cliente, ritornandola.
	 * 
	 * @return vairiabile String contenete la data di inscrizione della tessera del
	 *         cliente
	 * 
	 * @throws DipendenteException genera un eccezione nel caso in cui questo metodo
	 *                             viene utilizzato dal dipendente
	 */

	public String VisualizzaDataInscrizioneTessera() throws DipendenteException;

	/**
	 * 
	 * <b> OPERAZIONE: VisualizzaNumeroCartaFedelta </b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare il numero della tessera fedeltà
	 * del cliente, ritornandola.
	 * 
	 * @return Variabile String contente il numero di carta di fedeltà del cliente
	 * 
	 * @throws DipendenteException genera un eccezione nel caso in cui questo metodo
	 *                             viene utilizzato dal dipendente
	 */

	public String VisualizzaNumeroCartaFedelta() throws DipendenteException;

	/**
	 * 
	 * <b> OPERAZIONE: VisualizzaCodiceFiscale </b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare il codice fiscale del cliente,
	 * ritornandola.
	 * 
	 * @return Variabile String contente il il codice fiscale del cliente
	 * @throws DipendenteException genera un eccezione nel caso in cui questo metodo
	 *                             viene utilizzato dal dipendente
	 */

	public String VisualizzaCodiceFiscale() throws DipendenteException;

}
