package Cecinato_cs2022.ServiceCliente;

import Cecinato_cs2022.ClienteException.ClienteException;
import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.DipendenteException.DipendenteException;

/**
 * 
 * <p>
 * <b> INTERFACCIA: ModificaCliente </b>
 * <p>
 * Quest'interfaccia ha lo scopo rende accessibili i tutti metodi che permettono
 * di modificare le proprietà del cliente, precedentemente acquisiti.
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

public interface ModificaCliente {

	/**
	 * 
	 * <b> OPERAZIONE: modificaNomeCartaFedelta </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare il nome della carta di fedeltà del
	 * cliente attraverso il parametro nomeCartaFedelta e assegnarlo al cliente<br>
	 * Essendo che il nome della carta di fedeltà del cliente dovrà necessariamente
	 * essere fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @param nomeCartaFedelta Variabile di tipo stringa che contiene il nome della
	 *                         carta di fedeltà del cliente inserito dall'utente
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws ClienteException    genera un errore nel caso in cui il valore della
	 *                             data della carta di fedeltà è già vuoto
	 * @throws DipendenteException Solleva l'eccezione se il dipendente utilizza
	 *                             questo metodo
	 */

	public boolean modificaNomeCartaFedelta(String nomeCartaFedelta) throws ClienteException, DipendenteException;

	/**
	 * 
	 * <b> OPERAZIONE: modificaPuntiFedeltaAccumulati </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare i punti della carta di fedeltà del
	 * cliente attraverso il parametro puntiFedelta e si ha anche la possibilità di
	 * scegliere l'oerazione da compiere sui punti attraverso il paramentro
	 * operazione. Essendo che i punti e l'operazione della carta di fedeltà del
	 * cliente dovanno necessariamente essere forniti dall'utente, dunque, si
	 * rendono necessari dei controlli per verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @param puntiFedelta Variabile di tipo stringa che contiene i punti della
	 *                     carta di fedeltà del cliente inserito dall'utente
	 * @param operazione   Variabile di tipo OPERAZIONE_PUNTI_FEDELTA che contiente
	 *                     l'operazione da effetturare sui punti del cliente
	 *                     inseriti dall'utente
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws ClienteException    genera un errore nel caso in cui il valore della
	 *                             data della carta di fedeltà è già vuoto
	 * @throws DipendenteException Solleva l'eccezione se il dipendente utilizza
	 *                             questo metodo
	 */

	public boolean modificaPuntiFedeltaAccumulati(String puntiFedelta,
			ConstantGlobal.OPERAZIONE_PUNTI_FEDELTA operazione) throws ClienteException, DipendenteException;

	/**
	 * 
	 * <b> OPERAZIONE: modificaDataInscrizioneTessera </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare la data di inscrizione della carta
	 * di fedeltà del cliente attraverso il parametro dataInscrizioneTessera e
	 * assegnarlo al cliente<br>
	 * Essendo che la data della carta di fedeltà del cliente dovrà necessariamente
	 * essere fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @param dataInscrizioneTessera Variabile di tipo stringa che contiene la data
	 *                               di inscrizione della carta di fedeltà del
	 *                               cliente inserito dall'utente
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws ClienteException    genera un errore nel caso in cui il valore della
	 *                             data della carta di fedeltà è già vuoto
	 * @throws DipendenteException Solleva l'eccezione se il dipendente utilizza
	 *                             questo metodo
	 */

	public boolean modificaDataInscrizioneTessera(String dataInscrizioneTessera)
			throws ClienteException, DipendenteException;

	/**
	 * 
	 * <b> OPERAZIONE: modificaNumeroCartaFedelta </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare il numero della carta di i di
	 * fedeltà del cliente
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws ClienteException    genera un errore nel caso in cui il valore del
	 *                             numero carta di fedeltà è vuoto oppure c'è stato
	 *                             un errore nella generazione del numero
	 * @throws DipendenteException Solleva l'eccezione se il dipendente utilizza
	 *                             questo metodo
	 */

	public boolean modificaNumeroCartaFedelta() throws ClienteException, DipendenteException;

	/**
	 * 
	 * <b> OPERAZIONE: modificaCodiceFiscale </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare il codice fiscale del cliente
	 * attraverso il parametro codiceFiscale e assegnarlo al cliente<br>
	 * Essendo che il codice fiscale del cliente dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param codiceFiscale Variabile di tipo stringa che contiene il codice fiscale del
	 *                 cliente inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws ClienteException    genera un errore nel caso in cui il valore del
	 *                             codice fiscale sia sbagliato.
	 * @throws DipendenteException Solleva l'eccezione se il dipendente utilizza
	 *                             questo metodo
	 */
	
	public boolean modificaCodiceFiscale(String codiceFiscale) throws ClienteException, DipendenteException;

}
