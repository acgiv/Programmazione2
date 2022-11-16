package Cecinato_cs2022.TelevisoreService;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.ConstantGlobal.MarcheTelevisori;

/**
* 
* <p>
* <b> INTERFACCIA: VisualizzaTv </b>
* <p>
* Quest'interfaccia ha lo scopo rende accessibili tutte le operazioni che permettono di ottenere, quindi visualizzare le singole proprietà del Televisore.

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

public interface VisualizzaTv {
	/**
	 * 
	 * <b> METODO: visualizzanomiMarcheTv</b>
	 * <p>
	 * Questo metodo consente di visualizzare tutti i nomi delle marche dei
	 * televisori.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 */
	public void visualizzanomiMarcheTv();

	/**
	 * 
	 * <b> METODO: visualizzaTipologieSchermoTv</b>
	 * <p>
	 * Questo metodo consente di visualizzare tutte le tipologie di schermo dei
	 * televisori.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 */
	public void visualizzaTipologieSchermoTv();

	/**
	 * 
	 * <b> METODO: visualizzaRisoluzioniSchermiTv</b>
	 * <p>
	 * Questo metodo consente di visualizzare tutte le risoluzioni di schermo dei
	 * televisori.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 */
	public void visualizzaRisoluzioniSchermiTv();

	/**
	 * 
	 * <b> OPERAZIONE: visualizzaMarca </b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare la marca del televisore,
	 * ritornandola.
	 *
	 * 
	 * @return Variabile di tipo MarcheTelevisori che contiene il valore della marca
	 *         del televisore.
	 * 
	 */
	public MarcheTelevisori visualizzaMarca();

	/**
	 * 
	 * <b> OPERAZIONE: visualizzaAltezza </b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare l'altezza del televisore,
	 * ritornandola.
	 *
	 * 
	 * @return Variabile di tipo double che contiene il valore dell'altezza del
	 *         televisore. .
	 */
	public double visualizzaAltezza();

	/**
	 * 
	 * <b> OPERAZIONE: visualizzaLarghezza</b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare la larghezza del televisore,
	 * ritornandola.
	 *
	 * 
	 * @return Variabile di tipo double che contiene il valore della larghezza del
	 *         televisore.
	 * 
	 */

	public double visualizzaLarghezza();

	/**
	 * 
	 * <b> OPERAZIONE: visualizzaDiagonale</b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare la diagonale del televisore,
	 * ritornandola.
	 *
	 * 
	 * @return Variabile di tipo double che contiene il valore della diagonale del
	 *         televisore.
	 * 
	 */
	public double visualizzaDiagonale();

	/**
	 * 
	 * <b> OPERAZIONE: visualizzaSeriale</b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare il seriale del televisore,
	 * ritornandola.
	 *
	 * 
	 * @return Variabile di tipo String che contiene il valore del seriale del
	 *         televisore.
	 * 
	 */
	public String visualizzaSeriale();

	/**
	 * 
	 * <b> OPERAZIONE: visualizzaRisoluzione</b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare la risoluzione del televisore,
	 * ritornandola.
	 *
	 * 
	 * @return Variabile di tipo RISOLUZIONE_TV che contiene il valore della
	 *         risoluzione del televisore.
	 * 
	 */
	public ConstantGlobal.RISOLUZIONE_TV visualizzaRisoluzione();

	/**
	 * 
	 * <b> OPERAZIONE: visualizzaTipoSchermo</b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare la tipologia di schermo del
	 * televisore, ritornandola.
	 *
	 * 
	 * @return Variabile di tipo TIPOLOGIA_SCHERMO che contiene il valore della
	 *         tipologia di schermo del televisore.
	 * 
	 */
	public ConstantGlobal.TIPOLOGIA_SCHERMO visualizzaTipoSchermo();

	/**
	 * 
	 * <b> OPERAZIONE: visualizzaTipologiaTv</b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare la tipologia del televisore,
	 * ritornandola.
	 *
	 * 
	 * @return Variabile di tipo TIPOLOGIA_TV che contiene il valore della tipologia
	 *         del televisore.
	 * 
	 */
	public ConstantGlobal.TIPOLOGIA_TV visualizzaTipologiaTv();

	/**
	 * 
	 * <b> OPERAZIONE: visualizzaNumeroUsb</b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare il numero di usb del televisore,
	 * ritornandola.
	 *
	 * 
	 * @return Variabile di tipo int che contiene il valore del numero di usb del
	 *         televisore.
	 * 
	 */
	public int visualizzaNumeroUsb();

	/**
	 * 
	 * <b> OPERAZIONE: visualizzaNumeroHdmi</b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare il numero di hdmi del
	 * televisore, ritornandola.
	 *
	 * 
	 * @return Variabile di tipo int che contiene il valore del numero di hdmi del
	 *         televisore.
	 * 
	 */
	public int visualizzaNumeroHdmi();

	/**
	 * 
	 * <b> OPERAZIONE: visualizzaNumeroSmartTv</b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare il numero di smart tv del
	 * televisore, ritornandola.
	 *
	 * 
	 * @return Variabile di tipo int che contiene il valore del numero di smart tv
	 *         del televisore.
	 * 
	 */
	public int visualizzaNumeroSmartTv();

}
