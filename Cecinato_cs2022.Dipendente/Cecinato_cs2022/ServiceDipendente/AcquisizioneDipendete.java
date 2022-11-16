package Cecinato_cs2022.ServiceDipendente;

import Cecinato_cs2022.ClienteException.ClienteException;
import Cecinato_cs2022.DipendenteException.DipendenteException;

/**
 * 
 * <p>
 * <b> INTERFACCIA: AcquisizioneDipendete</b>
 * <p>
 * Quest'interfaccia ha lo scopo rende accessibili i tutti metodi che permettono
 * di acquisire le proprietà del dipendente.
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

public interface AcquisizioneDipendete {

	/**
	 * 
	 * <b> OPERAZIONE: addNomeAzienda </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire il nome dell' azienda dove lavora
	 * il dipendente attraverso il parametro nomeAzienda e assegnarlo al
	 * dipendete<br>
	 * Essendo che il nome dell'azienda del dipendente dovrà necessariamente essere
	 * fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param nomeAzienda Variabile di tipo stringa che contiene il nome
	 *                    dell'aizenda dove lavora il dipendente inserito
	 *                    dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * @throws DipendenteException Solleva l'eccezione se il nome dell'azienda è
	 *                             errato o è stato già inserito
	 * 
	 * @throws ClienteException    Solleva l'eccezione se il cliente utilizza questo
	 *                             metodo
	 */

	public boolean addNomeAzienda(String nomeAzienda) throws DipendenteException, ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: addEmailAziendale </b>
	 * <p>
	 * Quest'operazione ha lo scopo di generare l'email aziendale attraverso 3
	 * informazioni essenzioni: 1) il nome del dipendente 2) l'azienda in cui lavora
	 * il dipendente 3) il cognome del dipendnete
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * @throws DipendenteException Solleva l'eccezione uno o più di uno dei tre
	 *                             paramentri precedentemente elencati non è
	 *                             presente oppure è stata gia inserita
	 * 
	 * @throws ClienteException    Solleva l'eccezione se il cliente utilizza questo
	 *                             metodo
	 */

	public boolean addEmailAziendale() throws DipendenteException, ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: addNumeroTelefonoAziendale </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire il numero di telefono del
	 * dipendente attraverso il parametro numeroTelefonoAziendale e assegnarlo al
	 * dipendete<br>
	 * Essendo che il numero di telefono del dipedente dovrà necessariamente essere
	 * fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param numeroTelefonoAziendale Variabile di tipo stringa che contiene il
	 *                                numero del dipendente d inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * @throws DipendenteException Solleva l'eccezione se il numero del dipendente è
	 *                             errato o è stato già inserito
	 * 
	 * @throws ClienteException    Solleva l'eccezione se il cliente utilizza questo
	 *                             metodo
	 */

	public boolean addNumeroTelefonoAziendale(String numeroTelefonoAziendale)
			throws DipendenteException, ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: addtipologiaContratto </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire la tipologia di contratto del
	 * dipendente attraverso il parametro tipologiaContratto e assegnarla al
	 * dipendete<br>
	 * Essendo che la tipologia di contratto del dipedente dovrà necessariamente
	 * essere fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param tipologiaContratto Variabile di tipo stringa che contiene la tipologia
	 *                           di contratto del dipendente d inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * @throws DipendenteException Solleva l'eccezione se la tipologia di contratti
	 *                             del dipendente è errata o è stata già inserita
	 * 
	 * @throws ClienteException    Solleva l'eccezione se il cliente utilizza questo
	 *                             metodo
	 */

	public boolean addtipologiaContratto(String tipologiaContratto) throws DipendenteException, ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: addRuolo </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire lil ruolo del dipendente attraverso
	 * il parametro ruolo e assegnarla al dipendete<br>
	 * Essendo che il ruolo del dipedente dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param ruolo Variabile di tipo stringa che contiene il ruolo del dipendente ed
	 *             inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * @throws DipendenteException Solleva l'eccezione se il ruolo del dipendente è
	 *                             errato o è stata già inserito
	 * 
	 * @throws ClienteException    Solleva l'eccezione se il cliente utilizza questo
	 *                             metodo
	 */

	public boolean addRuolo(String ruolo) throws DipendenteException, ClienteException;
}
