package Cecinato_cs2022.ServicePersona;

import Cecinato_cs2022.ExceptionPersona.PersonaException;

/**
 * 
 * <p>
 * <b> INTERFACCIA: AcquisizionePersona</b>
 * <p>
 * Quest'interfaccia ha lo scopo rende accessibili i tutti metodi che permettono
 * di acquisire le propriet� della persona.
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

public interface AcquisizionePersona {

	/**
	 * 
	 * <b> OPERAZIONE: addNome </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire il nome della persona attraverso il
	 * parametro nome e assegnarlo alla persona<br>
	 * Essendo che il nome della persona dovr� necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param nome Variabile di tipo stringa che contiene il nome della persona
	 *             inserito dall'utente.
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * @throws PersonaException Solleva l'eccezione se il nome della persona non �
	 *                          corretto o esiste gi�
	 */

	public boolean addNome(String nome) throws PersonaException;

	/**
	 * 
	 * <b> OPERAZIONE: addCognome </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire il cognome della persona attraverso il
	 * parametro cognome e assegnarlo alla persona<br>
	 * Essendo che il cognome della persona dovr� necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param cognome Variabile di tipo stringa che contiene il cognome della persona
	 *             inserito dall'utente.
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * @throws PersonaException Solleva l'eccezione se il cognome della persona non �
	 *                          corretto o esiste gi�
	 */
	
	public boolean addCognome(String cognome) throws PersonaException;

	/**
	 * 
	 * <b> OPERAZIONE: addEta </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire l'et� della persona attraverso il
	 * parametro et� e assegnarlo alla persona<br>
	 * Essendo che l'et� della persona dovr� necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param eta Variabile di tipo int che contiene l'et� della persona
	 *             inserito dall'utente.
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * @throws PersonaException Solleva l'eccezione se l'et� della persona non �
	 *                          corretto o esiste gi�
	 */
	
	public boolean addEta(int eta) throws PersonaException;

	/**
	 * 
	 * <b> OPERAZIONE: addGenere </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire il genere della persona attraverso il
	 * parametro genere e assegnarlo alla persona<br>
	 * Essendo che il genere della persona dovr� necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param genere Variabile di tipo stringa che contiene il genere della persona
	 *             inserito dall'utente.
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * @throws PersonaException Solleva l'eccezione se il genere della persona non �
	 *                          corretto o esiste gi�
	 */
	
	public boolean addGenere(String genere) throws PersonaException;

	/**
	 * 
	 * <b> OPERAZIONE: addDataNascita </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire la data di nascita della persona attraverso il
	 * parametro genere e assegnarlo alla persona<br>
	 * Essendo che la data di nascita della persona dovr� necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param dataNascita Variabile di tipo stringa che contiene la data di nascita della persona
	 *             inserito dall'utente.
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * @throws PersonaException Solleva l'eccezione se la data di nascita della persona non �
	 *                          corretto o esiste gi�
	 */
	
	public boolean addDataNascita(String dataNascita) throws PersonaException;

	/**
	 * 
	 * <b> OPERAZIONE: addCitta </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire la citt� di nascita della persona attraverso il
	 * parametro citta e assegnarlo alla persona<br>
	 * Essendo che la citt� della persona dovr� necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param citta Variabile di tipo stringa che contiene la citt� della persona
	 *             inserito dall'utente.
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * @throws PersonaException Solleva l'eccezione se la citt� della persona non �
	 *                          corretto o esiste gi�
	 */
	
	public boolean addCitta(String citta) throws PersonaException;

}
