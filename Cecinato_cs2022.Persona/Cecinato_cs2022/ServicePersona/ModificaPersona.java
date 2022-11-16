package Cecinato_cs2022.ServicePersona;

import Cecinato_cs2022.ExceptionPersona.PersonaException;

/**
 * 
 * <p>
 * <b> INTERFACCIA: ModificaPersona </b>
 * <p>
 * Quest'interfaccia ha lo scopo rende accessibili i tutti metodi che permettono
 * di modificare le propriet� della persona, precedentemente acquisiti.
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

public interface ModificaPersona {
	
	/**
	 * 
	 * <b> OPERAZIONE: modificaNome </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare il nome del
	 * cliente attraverso il parametro nome e assegnarlo al cliente<br>
	 * Essendo che il nome della persona dovr� necessariamente
	 * essere fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @param nome Variabile di tipo stringa che contiene il nome
	 *                         della persona inserito dall'utente
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws PersonaException genera un errore nel caso in cui il valore del nome della persona �
	 *                               vuoto o errato
	 */
	
	
    public boolean modificaNome( String nome)throws PersonaException;
	
	/**
	 * 
	 * <b> OPERAZIONE: modificaCognome </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare il cognome del
	 * cliente attraverso il parametro cognome e assegnarlo al cliente<br>
	 * Essendo che il cognome della persona dovr� necessariamente
	 * essere fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @param cognome Variabile di tipo stringa che contiene il cognome
	 *                         della persona inserito dall'utente
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws PersonaException genera un errore nel caso in cui il valore del cognome della persona �
	 *                               vuoto o errato
	 */
    
	public boolean modificaCognome( String cognome)throws PersonaException;
	
	/**
	 * 
	 * <b> OPERAZIONE: modificaEta </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare l'et� del
	 * cliente attraverso il parametro et� e assegnarlo al cliente<br>
	 * Essendo che l'et� della persona dovr� necessariamente
	 * essere fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @param eta Variabile di tipo int che contiene l'et�
	 *                         della persona inserito dall'utente
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws PersonaException genera un errore nel caso in cui il valore dell'et� della persona �
	 *                               vuoto o errato
	 */
	
	public boolean modificaEta( int eta) throws PersonaException;
	
	/**
	 * 
	 * <b> OPERAZIONE: modificaGenere </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare il genere del
	 * cliente attraverso il parametro genere e assegnarlo al cliente<br>
	 * Essendo che il genere della persona dovr� necessariamente
	 * essere fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @param genere Variabile di tipo stringa che contiene il genere
	 *                         della persona inserito dall'utente
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws PersonaException genera un errore nel caso in cui il valore del genere della persona �
	 *                               vuoto o errato
	 */
	
	public boolean modificaGenere( String genere) throws PersonaException;
	
	/**
	 * 
	 * <b> OPERAZIONE: modificaDataNascita </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare la data di nascita del
	 * cliente attraverso il parametro dataNascita e assegnarlo al cliente<br>
	 * Essendo che la data di nascita della persona dovr� necessariamente
	 * essere fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @param dataNascita Variabile di tipo stringa che contiene la data di nascita
	 *                         della persona inserito dall'utente
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws PersonaException genera un errore nel caso in cui il valore della data di nascita della persona �
	 *                               vuoto o errato
	 */
	
	public boolean modificaDataNascita( String dataNascita) throws PersonaException;
	
	/**
	 * 
	 * <b> OPERAZIONE: modificaCitta </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare la citt� del
	 * cliente attraverso il parametro citta e assegnarlo al cliente<br>
	 * Essendo che la citt� della persona dovr� necessariamente
	 * essere fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @param citta Variabile di tipo stringa che contiene la citt�
	 *                         della persona inserito dall'utente
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws PersonaException genera un errore nel caso in cui il valore della citt� della persona �
	 *                               vuoto o errato
	 */
	
	public boolean modificaCitta(String citta) throws PersonaException;
	

}
