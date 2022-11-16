package Cecinato_cs2022.ServiceDipendente;

import java.util.Set;

import Cecinato_cs2022.ClienteException.ClienteException;
import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.Dipendente.Riparazione;
import Cecinato_cs2022.Dipendente.Vendita;

/**
 * 
 * <p>
 * <b> INTERFACCIA: VisualizzaDipendete </b>
 * <p>
 * Quest'interfaccia ha lo scopo rende accessibili tutte le operazioni che
 * permettono di ottenere, quindi visualizzare le singole proprietà del
 * dipendente.
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

public interface VisualizzaDipendete {

	/**
	 * 
	 * <b> METODO: VisualizzaElencoTipologiaContratto</b>
	 * <p>
	 * Questo metodo consente di visualizzare tutte le operazioni dei punti che
	 * possono essere fatti sul dipendente
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * @throws ClienteException genera un eccezione nel caso in cui questo metodo
	 *                          viene utilizzato dal cliente
	 * 
	 */

	public void VisualizzaElencoTipologiaContratto() throws ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: visualizzaCodiceIdentificativoDipendete </b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare il codice identiticativo del
	 * dipendente, ritornandola.
	 * 
	 * @return String varibile contente il condice identificativo del dipendente
	 * @throws ClienteException genera un eccezione nel caso in cui questo metodo
	 *                          viene utilizzato dal cliente
	 */

	public String visualizzaCodiceIdentificativoDipendete() throws ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: visualizzaNomeAziendaDipendente </b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare  il nome dell'azienda del
	 * dipendente, ritornandola.
	 * 
	 * @return String varibile contente il nome dell'azienda dove lavora il dipendente
	 * 
	 * @throws ClienteException genera un eccezione nel caso in cui questo metodo
	 *                          viene utilizzato dal cliente
	 */

	public String visualizzaNomeAziendaDipendente() throws ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: visualizzaEmailAziendaleDipendente </b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare il l'email aziendale del
	 * dipendente, ritornandola.
	 * 
	 * @return String varibaile contente l'email aziendale del dipendente
	 * 
	 * @throws ClienteException genera un eccezione nel caso in cui questo metodo
	 *                          viene utilizzato dal cliente
	 */

	public String visualizzaEmailAziendaleDipendente() throws ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: visualizzaEmailAziendaleDipendente </b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare il l'email aziendale del
	 * dipendente, ritornandola.
	 * 
	 * @return String varibaile contente il numero telefono aziendale del dipendente
	 * @throws ClienteException genera un eccezione nel caso in cui questo metodo
	 *                          viene utilizzato dal cliente
	 */

	public String visualizzaNumeroTelefonoAziendaleDipendente() throws ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: visualizzatipologiaContrattoDipendente </b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare la tipologia di contratto del
	 * dipendente, ritornandola.
	 * 
	 * @return String varibile contente la tipologia di contratto del dipendente
	 * @throws ClienteException genera un eccezione nel caso in cui questo metodo
	 *                          viene utilizzato dal cliente
	 */

	public ConstantGlobal.TIPO_CONTRATTO visualizzatipologiaContrattoDipendente() throws ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: visualizzaRuoloDipendente </b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare il ruolo del dipendente,
	 * ritornandola.
	 * 
	 * @return String varibile contente il ruolo del dipendente
	 * @throws ClienteException genera un eccezione nel caso in cui questo metodo
	 *                          viene utilizzato dal cliente
	 */

	public String visualizzaRuoloDipendente() throws ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: visualizzaElencoTvRiparate </b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare una lista di tv riparate,
	 * ritornandola.
	 *
	 * @return Set varibile contente le ripazioni che ha effettuato il dipendente
	 * @throws ClienteException genera un eccezione nel caso in cui questo metodo
	 *                          viene utilizzato dal cliente
	 */

	public Set<Riparazione> visualizzaElencoTvRiparate() throws ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: visualizzaElencoTvVendute </b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare una lista di tv vendute,
	 * ritornandola.
	 * 
	 * 
	 * @return Set varibile contente le vendite che ha effettuato il dipendente
	 * @throws ClienteException genera un eccezione nel caso in cui questo metodo
	 *                          viene utilizzato dal cliente
	 */

	public Set<Vendita> visualizzaElencoTvVendute() throws ClienteException;

}
