package Cecinato_cs2022.EcceptionTelevisore;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;

/**
 * 
 * <p>
 * <b> CLASSE: MinValueException </b>
 * <p>
 * Questa classe ha lo scopo di gestire le eccezioni dovute all'inserimento di
 * un numero minimo di dimensione o componenti della televisione <br>
 * 
 * 
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

public class MinValueException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * <b> COSTRUTTORE: MaxValueException </b> aparametrico
	 * 
	 */
	public MinValueException() {
		super("\n" + "|--------------------ERRORE-------------------|\n");
	}

	/**
	 * 
	 * <b> ECCEZIONE: ErrorMinAltezza</b>
	 * <p>
	 * questa eccezione comunica all'utente di aver inserito l'altezza che è
	 * inferirore <br>
	 * quella limite preimpostata di <b>24.09</b>
	 *
	 * @return stringa contente il messaggio di errore
	 */
	public String ErrorMinAltezza() {
		return getMessage() + "| Hai inserito l'altezza  inferirore al valore limite di: "
				+ ConstantGlobal.ALTEZZA_MINIMA_TV + " |\n";
	}

	/**
	 * 
	 * <b> ECCEZIONE: ErrorMinLarghezza</b>
	 * <p>
	 * questa eccezione comunica all'utente di aver inserito la larghezza che è
	 * inferiore <br>
	 * quella limite preimpostata di <b>44.03</b>
	 * 
	 * @return stringa contente il messaggio di errore
	 **/

	public String ErrorMinLarghezza() {
		return getMessage() + "| Hai inserito la lunghezza inferiore al valore limite "
				+ ConstantGlobal.LARGHEZZA_MINIMA_TV + "|\n";
	}

	/**
	 * 
	 * <b> ECCEZIONE: ErrorMinDiagonale</b>
	 * <p>
	 * questa eccezione comunica all'utente di aver inserito la diagonale che è
	 * inferiore <br>
	 * quella limite preimpostata di <b>50.8</b>
	 * 
	 * @return stringa contente il messaggio di errore
	 **/

	public String ErrorMinDiagonale() {
		return getMessage() + "| Hai inserito la lunghezza della diagonale inferirore al valore limite: "
				+ ConstantGlobal.DIAGONALE_MINIMA_TV + " |\n";
	}

	/**
	 * 
	 * <b> ECCEZIONE: ErrorMinNumeroHdmi</b>
	 * <p>
	 * questa eccezione comunica all'utente di aver inserito il numero di hdmi che
	 * inferiore <br>
	 * 
	 * quello limite preimpostato di <b>0</b>
	 * 
	 * @return stringa contente il messaggio di errore
	 **/
	public String ErrorMinNumeroHdmi() {
		return getMessage() + "| Hai inserito un numero inferiore di hdmi rispetto al valore limite di : "
				+ ConstantGlobal.NUMERO_MINIMO_HDMI + "|\n";
	}

	/**
	 * 
	 * <b> ECCEZIONE: ErrorMaxNumeroUsb</b>
	 * <p>
	 * questa eccezione comunica all'utente di aver inserito il numero di usb che è
	 * inferiore <br>
	 * quello limite preimpostato di <b>0</b>
	 * 
	 * @return stringa contente il messaggio di errore
	 **/
	public String ErrorMinNumeroMinUsb() {
		return getMessage() + "| Hai inserito un numero inferiore di usb rispetto al valore limite di : "
				+ ConstantGlobal.NUMERO_MINIMO_USB + "|\n";
	}

	/**
	 * 
	 * <b> ECCEZIONE: ErrorMaxNumeroSmartTv</b>
	 * <p>
	 * questa eccezione comunica all'utente di aver inserito il numero di smart tv
	 * che è inferiore a <br>
	 * quello limite preimpostato di <b>0</b>
	 * 
	 * @return stringa contente il messaggio di errore
	 **/
	public String ErrorMinNumeroMinSmartTv() {
		return getMessage() + "| Hai inserito un numero inferiore di smart tv rispetto al valore limite di : "
				+ ConstantGlobal.NUMERO_MINIMO_SMART_TV + "|\n";
	}

}
