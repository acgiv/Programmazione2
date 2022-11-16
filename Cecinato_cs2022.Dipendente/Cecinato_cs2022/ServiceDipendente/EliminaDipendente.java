package Cecinato_cs2022.ServiceDipendente;

import Cecinato_cs2022.ClienteException.ClienteException;
import Cecinato_cs2022.DipendenteException.DipendenteException;

/**
 * 
 * <p>
 * <b> INTERFACCIA: EliminaDipendente </b>
 * <p>
 * Quest'interfaccia ha lo scopo rende accessibili i tutti metodi che permettono
 * di eliminare le proprietà del dipendente, precedentemente acquisiti.
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

public interface EliminaDipendente {

	/**
	 * 
	 * <b> OPERAZIONE: eliminaNomeAzienda </b>
	 * <p>
	 * Quest'operazione ha lo scopo di eliminare il nome dell'azienda del dipendente.
	 *
	 * 
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws DipendenteException genera un errore nel caso in cui il valore del
	 *                            nome dell'azienda del dipendente è già vuoto
	 * @throws ClienteException Solleva l'eccezione se il cliente utilizza
	 *                             questo metodo                            
	 */
	
	
	public boolean eliminaNomeAzienda() throws DipendenteException, ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE:eliminaEmailAziendale </b>
	 * <p>
	 * Quest'operazione ha lo scopo di eliminare l'email aziendale del dipendente.
	 *
	 * 
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws DipendenteException genera un errore nel caso in cui il valore dell'
	 *                            email aziendale del dipendente è già vuoto
	 * @throws ClienteException Solleva l'eccezione se il cliente utilizza
	 *                             questo metodo                            
	 */
	
	
	public boolean eliminaEmailAziendale() throws DipendenteException, ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE:eliminaNumeroTelefonoAziendale </b>
	 * <p>
	 * Quest'operazione ha lo scopo di eliminare il numero telefionico aziendale del dipendente.
	 *
	 * 
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws DipendenteException genera un errore nel caso in cui il valore del
	 *                       numero telefonico adiendale del dipendente è già vuoto
	 * @throws ClienteException Solleva l'eccezione se il cliente utilizza
	 *                             questo metodo                            
	 */
	
	public boolean eliminaNumeroTelefonoAziendale() throws DipendenteException, ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: eliminatipologiaContratto </b>
	 * <p>
	 * Quest'operazione ha lo scopo di eliminarela tipologia di contratto del dipendente.
	 *
	 * 
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws DipendenteException genera un errore nel caso in cui il valore della
	 *                       tipologia di contratto del dipendente è già vuoto
	 * @throws ClienteException Solleva l'eccezione se il cliente utilizza
	 *                             questo metodo                            
	 */
	
	public boolean eliminatipologiaContratto() throws DipendenteException, ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: eliminaRuolo </b>
	 * <p>
	 * Quest'operazione ha lo scopo di eliminare il ruolo del dipendente.
	 *
	 * 
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws DipendenteException genera un errore nel caso in cui il valore del
	 *                       ruolo del dipendente all'inerno dell'azienda  è già vuoto
	 * @throws ClienteException Solleva l'eccezione se il cliente utilizza
	 *                             questo metodo                            
	 */
	
	public boolean eliminaRuolo() throws DipendenteException, ClienteException;
}
