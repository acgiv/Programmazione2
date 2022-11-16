package Cecinato_cs2022.ServicePersona;

import Cecinato_cs2022.ExceptionPersona.PersonaException;

/**
 * 
 * <p>
 * <b> INTERFACCIA: EliminaPersona </b>
 * <p>
 * Quest'interfaccia ha lo scopo rende accessibili i tutti metodi che permettono
 * di eliminare le proprietà della persona, precedentemente acquisiti.
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

public interface EliminaPersona {

	/**
	 * 
	 * <b> OPERAZIONE: eliminaNome </b>
	 * <p>
	 * Quest'operazione ha lo scopo di eliminare il nome della persona.
	 *
	 * 
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws PersonaException genera un errore nel caso in cui il valore del nome
	 *                          della persona è già vuoto
	 * 
	 */

	public boolean eliminaNome() throws PersonaException;

	/**
	 * 
	 * <b> OPERAZIONE: eliminaCognome </b>
	 * <p>
	 * Quest'operazione ha lo scopo di eliminare il cognome della persona.
	 *
	 * 
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws PersonaException genera un errore nel caso in cui il valore del
	 *                          cognome della persona è già vuoto
	 * 
	 */

	public boolean eliminaCognome() throws PersonaException;

	/**
	 * 
	 * <b> OPERAZIONE: eliminaEta </b>
	 * <p>
	 * Quest'operazione ha lo scopo di eliminare l'età della persona.
	 *
	 * 
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws PersonaException genera un errore nel caso in cui il valore dell' età
	 *                          della persona è già vuoto
	 * 
	 */

	public boolean eliminaEta() throws PersonaException;

	/**
	 * 
	 * <b> OPERAZIONE: eliminaGenere </b>
	 * <p>
	 * Quest'operazione ha lo scopo di eliminare il genere della persona.
	 *
	 * 
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws PersonaException genera un errore nel caso in cui il valore del
	 *                          genere della persona è già vuoto
	 * 
	 */

	public boolean eliminaGenere() throws PersonaException;

	/**
	 * 
	 * <b> OPERAZIONE: eliminaDataNascita </b>
	 * <p>
	 * Quest'operazione ha lo scopo di eliminare la data di nascita della persona.
	 *
	 * 
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws PersonaException genera un errore nel caso in cui il valore della data di nascita
	 *                           della persona è già vuoto
	 * 
	 */
	
	public boolean eliminaDataNascita() throws PersonaException;

	/**
	 * 
	 * <b> OPERAZIONE: eliminaCitta </b>
	 * <p>
	 * Quest'operazione ha lo scopo di eliminare lla città della persona.
	 *
	 * 
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws PersonaException genera un errore nel caso in cui il valore della città
	 *                           della persona è già vuoto
	 * 
	 */
	
	public boolean eliminaCitta() throws PersonaException;

}
