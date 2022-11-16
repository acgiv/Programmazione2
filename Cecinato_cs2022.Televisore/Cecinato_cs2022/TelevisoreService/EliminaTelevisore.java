package Cecinato_cs2022.TelevisoreService;

import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;

/**
 * 
 * <p>
 * <b> INTERFACCIA: EliminaTelevisore </b>
 * <p>
 * Quest'interfaccia ha lo scopo rende accessibili i tutti metodi che permettono
 * di eliminare le proprietà del televisore, precedentemente acquisiti.
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
public interface EliminaTelevisore {
	/**
	 * 
	 * <b> OPERAZIONE: eliminaMarcaTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di eliminare la marca del televisore.
	 *
	 * 
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws TelevisoreException genera un errore nel caso in cui il valore della
	 *                             marca è già vuoto
	 */
	public boolean eliminaMarcaTv() throws TelevisoreException;

	/**
	 * 
	 * <b> OPERAZIONE: eliminaAltezzaTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di eliminare l' altezza del televisore.
	 *
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws TelevisoreException genera un errore nel caso in cui il valore dell'
	 *                             altezza è già vuoto
	 */
	public boolean eliminaAltezzaTv() throws TelevisoreException;

	/**
	 * 
	 * <b> OPERAZIONE: eliminaLarghezzaTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di eliminare la larghezza del televisore.
	 *
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws TelevisoreException genera un errore nel caso in cui il valore della
	 *                             larghezza è già vuoto
	 */
	public boolean eliminaLarghezzaTv() throws TelevisoreException;

	/**
	 * 
	 * <b> OPERAZIONE: eliminaNumberHdmiTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di eliminare il numero di hdmi del televisore.
	 *
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 */
	public boolean eliminaNumberHdmiTv();

	/**
	 * 
	 * <b> OPERAZIONE: eliminaNumberUsbTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di eliminare il numero dei usb del televisore.
	 *
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 */

	public boolean eliminaNumberUsbTv();

	/**
	 * 
	 * <b> OPERAZIONE: eliminaDiagonaleTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di eliminare la diagonale del televisore.
	 *
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws TelevisoreException genera un errore nel caso in cui il valore dalla
	 *                             diagonale del televisore è già vuoto
	 */
	public boolean eliminaDiagonaleTv() throws TelevisoreException;

	/**
	 * 
	 * <b> OPERAZIONE: eliminaNumberSmartTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di eliminare il numero degli smart tv del
	 * televisore.
	 *
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 */
	public boolean eliminaNumberSmartTv();

	/**
	 * 
	 * <b> OPERAZIONE: eliminaRisoluzioneTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di eliminare la risoluzione del televisore.
	 *
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws TelevisoreException genera un errore nel caso in cui il valore dalla
	 *                             risoluzione del televisore è già vuoto
	 */
	public boolean eliminaRisoluzioneTv() throws TelevisoreException;

	/**
	 * 
	 * <b> OPERAZIONE: eliminaTiposchermoTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di eliminare il tipo di schermo del televisore.
	 *
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws TelevisoreException genera un errore nel caso in cui il valore del
	 *                             tipo di schermo del televisore è già vuoto
	 */
	public boolean eliminaTiposchermoTv() throws TelevisoreException;
}
