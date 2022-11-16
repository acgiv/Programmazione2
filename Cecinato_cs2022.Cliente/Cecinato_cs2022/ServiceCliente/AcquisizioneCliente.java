package Cecinato_cs2022.ServiceCliente;

import Cecinato_cs2022.ClienteException.ClienteException;
import Cecinato_cs2022.DipendenteException.DipendenteException;

/**
 * 
 * <p>
 * <b> INTERFACCIA: AcquisizioneCliente </b>
 * <p>
 * Quest'interfaccia ha lo scopo rende accessibili i tutti metodi che permettono
 * di acquisire le proprietà del cliente.
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


public interface AcquisizioneCliente {

	/**
	 * 
	 * <b> OPERAZIONE: addNomeCartaFedelta </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire il nome della carta di fedeltà del
	 * cliente attraverso il parametro nomeCartaFedelta e assegnarlo al cliente<br>
	 * Essendo che il nome della carta del cliente dovrà necessariamente essere
	 * fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param nomeCartaFedelta Variabile di tipo stringa che contiene il nome della
	 *                         carta di fedeltà del cliente inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * @throws ClienteException    Solleva l'eccezione se il nome della carta di
	 *                             fedeltà è errato o è stato già inserito
	 * 
	 * @throws DipendenteException Solleva l'eccezione se il dipendente utilizza
	 *                             questo metodo
	 */

	public boolean addNomeCartaFedelta(String nomeCartaFedelta) throws ClienteException, DipendenteException;

	/**
	 * 
	 * <b> OPERAZIONE: addPuntiFedeltaAccumulati </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire i punti della carta di fedeltà del
	 * cliente attraverso il parametro puntiFedelta e assegnarlo al cliente<br>
	 * Essendo che i punti della carta del cliente dovrnno necessariamente essere
	 * forniti dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param puntiFedelta Variabile di tipo stringa che contiene il i punti carta
	 *                     di fedeltà del cliente inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * @throws ClienteException    Solleva l'eccezione se i punti della carta di
	 *                             fedeltà sono errati o è sono stati già inseriti
	 * 
	 * @throws DipendenteException Solleva l'eccezione se il dipendente utilizza
	 *                             questo metodo
	 */

	public boolean addPuntiFedeltaAccumulati(String puntiFedelta) throws ClienteException, DipendenteException;

	/**
	 * 
	 * <b> OPERAZIONE: addDataInscrizioneTessera </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire la data di inscrizione della carta di fedeltà del
	 * cliente attraverso il parametro dataInscrizioneTessera e assegnarlo al cliente<br>
	 * Essendo che la data della carta del cliente deve necessariamente essere
	 * fornita dall'utente, dunque, si rende necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param dataInscrizioneTessera Variabile di tipo stringa che contiene la data di inscrizione della carta
	 *                     di fedeltà del cliente inserita dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * @throws ClienteException    Solleva l'eccezione se la data della carta di
	 *                             fedeltà è errata o è già inserita
	 * 
	 * @throws DipendenteException Solleva l'eccezione se il dipendente utilizza
	 *                             questo metodo
	 */
	
	public boolean addDataInscrizioneTessera(String dataInscrizioneTessera)
			throws ClienteException, DipendenteException;

	/**
	 * 
	 * <b> OPERAZIONE: addNumeroCartaFedelta </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire il numero della carta di fedeltà del cliente.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * @throws ClienteException    Solleva L'eccezione se il numero della carta di
	 *                             fedeltà già inserita o ha avuto problemi nella generazione
	 * 
	 * @throws DipendenteException Solleva l'eccezione se il dipendente utilizza
	 *                             questo metodo
	 */
	
	
	public boolean addNumeroCartaFedelta() throws ClienteException, DipendenteException;
}
