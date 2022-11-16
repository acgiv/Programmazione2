package Cecinato_cs2022.ServiceDipendente;


import Cecinato_cs2022.ClienteException.ClienteException;
import Cecinato_cs2022.DipendenteException.DipendenteException;

/**
 * 
 * <p>
 * <b> INTERFACCIA: ModificaDipendente </b>
 * <p>
 * Quest'interfaccia ha lo scopo rende accessibili i tutti metodi che permettono
 * di modificare le proprietà del dipendente, precedentemente acquisiti.
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

public interface ModificaDipendente {
	
	/**
	 * 
	 * <b> OPERAZIONE: modificaNomeAzienda </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare il nome dell' azienda del
	 * dipendente attraverso il parametro nomeAzienda e assegnarlo al dipendente<br>
	 * Essendo che il nome della carta di fedeltà del dipendente dovrà necessariamente
	 * essere fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @param nomeAzienda Variabile di tipo stringa che contiene il nome dell'azienda
	 *                         del dipendente inserito dall'utente
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws DipendenteException genera un errore nel caso in cui il valore dell'azienda del dipendente è
	 *                               vuoto
	 * @throws ClienteException Solleva l'eccezione se il cliente utilizza
	 *                             questo metodo
	 */

	public boolean modificaNomeAzienda(String nomeAzienda)  throws DipendenteException, ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: modificaEmailAziendale </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare l'email del
	 * dipendente.
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws DipendenteException genera un errore nel caso in cui il valore dell'email del dipendente è
	 *                               vuoto
	 * @throws ClienteException Solleva l'eccezione se il cliente utilizza
	 *                             questo metodo
	 */
	
	public boolean modificaEmailAziendale() throws DipendenteException, ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: modificaNumeroTelefonoAziendale </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare il numero di telefono del
	 * dipendente attraverso il parametro numeroTelefonoAziendale e assegnarlo al dipendente<br>
	 * Essendo che  il numero di telefono del dipendete dovrà necessariamente
	 * essere fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @param numeroTelefonoAziendale Variabile di tipo stringa che contiene il numero di telefono 
	 *                         del dipendente inserito dall'utente
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws DipendenteException genera un errore nel caso in cui il valore dell'azienda del dipendente è
	 *                               vuoto
	 * @throws ClienteException Solleva l'eccezione se il cliente utilizza
	 *                             questo metodo
	 */
	
	public boolean modificaNumeroTelefonoAziendale(String numeroTelefonoAziendale) throws DipendenteException, ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: modificatipologiaContratto </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare la tipologia di contratto del
	 * dipendente attraverso il parametro tipologiaContratto e assegnarlo al dipendente<br>
	 * Essendo che la tipologia del contratto del dipendete dovrà necessariamente
	 * essere fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @param tipologiaContratto Variabile di tipo stringa che contiene la tipologia di contratto
	 *                         del dipendente inserito dall'utente
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws DipendenteException genera un errore nel caso in cui il valore della tipologia di contratto del dipendente è
	 *                               vuoto
	 * @throws ClienteException Solleva l'eccezione se il cliente utilizza
	 *                             questo metodo
	 */
	
	public boolean modificatipologiaContratto(String tipologiaContratto) throws DipendenteException, ClienteException;
	
	/**
	 * 
	 * <b> OPERAZIONE: modificaCodiceIdentificativo </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare il codice identidicativo del
	 * dipendente attraverso il parametro codiceIdentificativo e assegnarlo al dipendente<br>
	 * Essendo che la tipologia del contratto del dipendete dovrà necessariamente
	 * essere fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @param codiceIdentificativo Variabile di tipo stringa che contiene il codice identificativo
	 *                         del dipendente inserito dall'utente
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws DipendenteException genera un errore nel caso in cui il valore del codice identificativo del dipendente è
	 *                               vuoto oppure èsiste già
	 * @throws ClienteException Solleva l'eccezione se il cliente utilizza
	 *                             questo metodo
	 */
	
	public boolean modificaCodiceIdentificativo(String codiceIdentificativo) throws DipendenteException, ClienteException;
	
	/**
	 * 
	 * <b> OPERAZIONE: modificaRuolo </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare il ruolo del
	 * dipendente attraverso il parametro ruolo e assegnarlo al dipendente<br>
	 * Essendo che il ruolo del dipendete dovrà necessariamente
	 * essere fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @param ruolo Variabile di tipo stringa che contiene il ruolo
	 *                         del dipendente inserito dall'utente
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws DipendenteException genera un errore nel caso in cui il valore ruolo del dipendente è
	 *                               vuoto 
	 * @throws ClienteException Solleva l'eccezione se il cliente utilizza
	 *                             questo metodo
	 */
	
	public boolean modificaRuolo( String ruolo) throws DipendenteException, ClienteException;
}
