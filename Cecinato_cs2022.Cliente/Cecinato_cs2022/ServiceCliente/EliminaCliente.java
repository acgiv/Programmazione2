package Cecinato_cs2022.ServiceCliente;

import Cecinato_cs2022.ClienteException.ClienteException;
import Cecinato_cs2022.DipendenteException.DipendenteException;

/**
 * 
 * <p>
 * <b> INTERFACCIA: EliminaCliente </b>
 * <p>
 * Quest'interfaccia ha lo scopo rende accessibili i tutti metodi che permettono
 * di eliminare le proprietà del cliente, precedentemente acquisiti.
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

public interface EliminaCliente {
	
	/**
	 * 
	 * <b> OPERAZIONE: eliminaNomeCartaFedelta </b>
	 * <p>
	 * Quest'operazione ha lo scopo di eliminare il nome della carta del cliente.
	 *
	 * 
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws  ClienteException genera un errore nel caso in cui il valore del
	 *                             nome della carta di fedeltà è già vuoto
	 * @throws DipendenteException Solleva l'eccezione se il dipendente utilizza
	 *                             questo metodo                            
	 */
	
	public boolean eliminaNomeCartaFedelta()  throws ClienteException, DipendenteException ;

	/**
	 * 
	 * <b> OPERAZIONE: eliminaPuntiAccumulati </b>
	 * <p>
	 * Quest'operazione ha lo scopo di eliminare i punti accumulati del cliente.
	 *
	 * 
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws  ClienteException genera un errore nel caso in cui il valore dei
	 *                            punti  della carta di fedeltà è già vuoto
	 * @throws DipendenteException Solleva l'eccezione se il dipendente utilizza
	 *                             questo metodo                            
	 */
	
	public boolean eliminaPuntiAccumulati()  throws ClienteException, DipendenteException ;

	/**
	 * 
	 * <b> OPERAZIONE: eliminaDataInscrizioneTessera </b>
	 * <p>
	 * Quest'operazione ha lo scopo di eliminare la data della tessera del cliente.
	 *
	 * 
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws  ClienteException genera un errore nel caso in cui il valore della
	 *                            data  della carta di fedeltà è già vuoto
	 * @throws DipendenteException Solleva l'eccezione se il dipendente utilizza
	 *                             questo metodo                            
	 */
	
	public boolean eliminaDataInscrizioneTessera() throws ClienteException, DipendenteException ;

	/**
	 * 
	 * <b> OPERAZIONE: eliminaNumeroCartaFedelta </b>
	 * <p>
	 * Quest'operazione ha lo scopo di eliminare il numero della carta di fedeltà del cliente.
	 *
	 * 
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws  ClienteException genera un errore nel caso in cui il valore del
	 *                            numero della carta di fedeltà è già vuoto
	 * @throws DipendenteException Solleva l'eccezione se il dipendente utilizza
	 *                             questo metodo                            
	 */
	
	public boolean eliminaNumeroCartaFedelta() throws ClienteException, DipendenteException ;

}
