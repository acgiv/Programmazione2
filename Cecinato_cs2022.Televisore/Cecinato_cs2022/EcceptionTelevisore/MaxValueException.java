package Cecinato_cs2022.EcceptionTelevisore;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;

/**
 * 
 * <p>
 * <b> CLASSE: MaxValueException </b>
 * <p>
 * Questa classe ha lo scopo di gestire le eccezioni dovute all'inserimento di
 * un numero massimo di dimensione o componenti della televisione <br>
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

public class MaxValueException extends Exception {
	private static final long serialVersionUID = 1L;

	/**
	 * <b> COSTRUTTORE: MaxValueException </b> aparametrico
	 * 
	 */
	public MaxValueException() {
		super("\n" + "|--------------------ERRORE-------------------|\n");
	}

	/**
	 * 
	 * <b> ECCEZIONE: ErrorMaxAltezza</b>
	 * <p>
	 * questa eccezione comunica all'utente di aver inserito l'altezza che supera
	 * <br>
	 * quella limite preimpostata di <b>124.05</b>
	 * 
	 * @return stringa contente il messaggio di errore
	 */
	public String ErrorMaxAltezza() {
		return getMessage() + "| Hai inserito l'altezza superiore al valore limite di: "
				+ ConstantGlobal.ALTEZZA_MASSIMA_TV + " |\n";
	}

	/**
	 * 
	 * <b> ECCEZIONE: ErrorMaxLarghezza</b>
	 * <p>
	 * questa eccezione comunica all'utente di aver inserito la larghezza che supera
	 * <br>
	 * quella limite preimpostata di <b>221.35</b>
	 * 
	 * @return stringa contente il messaggio di errore
	 **/

	public String ErrorMaxLarghezza() {
		return getMessage() + "| Hai inserito la lunghezza della tv superiore al valore limite di: "
				+ ConstantGlobal.LARGHEZZA_MASSIMA_TV + " |\n";
	}

	/**
	 * 
	 * <b> ECCEZIONE: ErrorMaxDiagonale</b>
	 * <p>
	 * questa eccezione comunica all'utente di aver inserito la diagonale che supera
	 * <br>
	 * quella limite preimpostata di <b>254.0</b>
	 * 
	 * @return stringa contente il messaggio di errore
	 **/
	public String ErrorMaxDiagonale() {
		return getMessage() + "| Hai inserito la lunghezza della diagonale superiore al valore limite di: "
				+ ConstantGlobal.DIAGONALE_MASSIMA_TV + " |\n";
	}

	/**
	 * 
	 * <b> ECCEZIONE: ErrorMaxNumeroHdmi</b>
	 * <p>
	 * questa eccezione comunica all'utente di aver inserito il numero di hdmi che
	 * supera <br>
	 * 
	 * quello limite preimpostato di <b>1</b>
	 * 
	 * @return stringa contente il messaggio di errore
	 **/
	public String ErrorMaxNumeroHdmi() {
		return getMessage() + "| Hai inserito un numero di hdmi superiore al valore limite  |\n";
	}

	/**
	 * 
	 * <b> ECCEZIONE: ErrorMaxNumeroUsb</b>
	 * <p>
	 * questa eccezione comunica all'utente di aver inserito il numero di usb che
	 * supera <br>
	 * quello limite preimpostato di <b>1</b> nel caso della tipologia di tv media,
	 * di <b>2</b> per la tipoligia di tv avanzata
	 * 
	 * @return stringa contente il messaggio di errore
	 **/
	public String ErrorMaxNumeroUsb() {
		return getMessage() + "| Hai inserito un numero di usb superiore al valore limite  |\n";
	}

	/**
	 * 
	 * <b> ECCEZIONE: ErrorMaxNumeroSmartTv</b>
	 * <p>
	 * questa eccezione comunica all'utente di aver inserito il numero di smart tv
	 * che supera <br>
	 * quello limite preimpostato di <b>1</b>
	 * 
	 * @return stringa contente il messaggio di errore
	 **/
	public String ErrorMaxNumeroSmartTv() {
		return getMessage() + "| Hai inserito un numero di smart tv superiore al valore limite  |\n";
	}
}
