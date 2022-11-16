package Cecinato_cs2022.PojoTelevisore;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.lang3.StringUtils;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.ConstantGlobal.MarcheTelevisori;
import Cecinato_cs2022.DaoTelevisore.DaoTelevisoreImp;
import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;
import Cecinato_cs2022.TelevisoreService.Televisore;

/**
 * 
 * <p>
 * <b> CLASSE: AbstractTelevisore </b>
 * <p>
 * Questa classe astratta ha lo scopo di raggruppare tutte le caratteristiche e
 * i comportamenti comuni a qualsiasi tipo di televisore.
 * <p>
 * Invece, le operazioni previste sono tutte quelle che permettono di acquisire,
 * modificare, visualizzare e e controllare delle informazioni dei televisori.
 * <p>
 * Si precisa che la corrente classe eredita le operazioni dall'interfaccia
 * Televisore, e che è astratta proprio perché, ad alcuni metodi non saranno
 * fornite alcuna implementazione (appunto, rimarranno metodi astratti). Questi
 * metodi verranno sviluppati nelle classi figlie.
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

public abstract class AbstractTelevisore extends DaoTelevisoreImp implements Televisore {

	/// ********************************************
	/// ATTRIBUTI
	/// ********************************************
	protected boolean insertHdmi = false; /// L'Attributo insertHdmi è una variabile di controllo, che serve ad
											/// identificare se gli ingressi hdmi sono stati acquisiti
	protected boolean insertUsb = false; /// L'Attributo insertUsb è una variabile di controllo, che serve ad
											/// identificare se gli ingressi usb sono stati acquisiti
	protected boolean insertSmartTV = false; /// L'Attributo insertSmartTv è una variabile di controllo, che serve ad
												/// identificare se gli smartTv sono stati acquisiti
	protected final static Set<String> elencoSerialeTv = new TreeSet<String>(); /// L'attributo elencoSerialeTv è una
																				/// lista di stringe, consente di
																				/// imagazziare tutti i seriali relativi
																				/// ai televisori

	/// ********************************************
	/// METODI
	/// ********************************************

	/**
	 * 
	 * <b> METODO: visualizzanomiMarcheTv</b>
	 * <p>
	 * Questo metodo consente di visualizzare tutti i nomi delle marche dei
	 * televisori.
	 * <p>
	 * Stamperà a video un elenco puntando di tutte le marche esistenti di
	 * televisori
	 * 
	 * 
	 * @see
	 *      <p>
	 *      Le marche esistenti di tv sono: <br>
	 *      1) samsung<br>
	 *      2) amazon<br>
	 *      3) lg<br>
	 *      ...
	 * 
	 * 
	 */

	public void visualizzanomiMarcheTv() {
		int i = 1;
		System.out.println("Le marche esistenti di tv sono:");
		for (MarcheTelevisori item : MarcheTelevisori.values()) {
			System.out.println(String.valueOf(i).concat(") ").concat(String.valueOf(item)).toLowerCase());
			i += 1;
		}
	}

	/**
	 * 
	 * <b> METODO: visualizzaTipologieSchermoTv</b>
	 * <p>
	 * Questo metodo consente di visualizzare tutte le tipologie di schermo dei
	 * televisori.
	 * <p>
	 * Stamperà a video un elenco puntando di tutte le tipologie di schermo dei
	 * televisori
	 * 
	 * @see
	 *      <p>
	 *      Le tipologie di schermo esistenti sono: <br>
	 *      1) CRT<br>
	 *      2) OLED<br>
	 *      3) QLED<br>
	 *      4) PLASMA
	 * 
	 * 
	 */
	public void visualizzaTipologieSchermoTv() {
		int i = 1;
		System.out.println("Le tipologie di schermo esistenti sono:");
		for (ConstantGlobal.TIPOLOGIA_SCHERMO item : ConstantGlobal.TIPOLOGIA_SCHERMO.values()) {
			System.out.println(String.valueOf(i).concat(") ").concat(String.valueOf(item)).toLowerCase());
			i += 1;
		}
	}

	/**
	 * 
	 * <b> METODO: visualizzaRisoluzioniSchermiTv</b>
	 * <p>
	 * Questo metodo consente di visualizzare tutte le risoluzioni di schermo dei
	 * televisori.
	 * <p>
	 * Stamperà a video un elenco puntando di tutte le risoluzioni di schermo dei
	 * televisori
	 * 
	 * @see
	 *      <p>
	 *      Le risoluzioni degli schermi esistenti sono: <br>
	 *      1) HD<br>
	 *      2) FULL HD<br>
	 *      3) ULTRA HD<br>
	 *      4) TV 8K<br>
	 * 
	 * 
	 */
	public void visualizzaRisoluzioniSchermiTv() {
		int i = 1;
		System.out.println("Le risoluzioni degli schermi esistenti sono:");
		for (ConstantGlobal.RISOLUZIONE_TV item : ConstantGlobal.RISOLUZIONE_TV.values()) {
			System.out.println(
					String.valueOf(i).concat(") ").concat(String.valueOf(item).replace("_", " ")).toLowerCase());
			i += 1;
		}
	}

	/**
	 * 
	 * <b> METODO: controlloMarca</b>
	 * <p>
	 * Questo metodo consente di controllare se la marca è presente nella lista di
	 * marche di televisori.
	 * <p>
	 * Per essere efficace questo metodo servirà passare il paramentro marca di
	 * televisore da controllare. <br>
	 * Se la marca passata verrà trovata oppure no, questa funzione restituira un
	 * valore di riscontro.
	 * <p>
	 * 
	 * @param marca Stringa che rappresenta il nome della marca del televisore.
	 * @return result Attributo booleano che indica se la marca del televisore è
	 *         stata riscontrata oppure no.
	 * @see
	 *      <p>
	 *      true o false
	 * 
	 */

	protected boolean controlloMarca(String marca) {
		boolean result = false;
		for (MarcheTelevisori item : MarcheTelevisori.values()) {
			if (StringUtils.equals(String.valueOf(item), marca)) {
				result = true;
				break;
			}
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: controlloRisoluzione</b>
	 * <p>
	 * Questo metodo consente di controllare se la risoluzione se è presente nella
	 * lista di risoluzioni di televisori.
	 * <p>
	 * Per essere efficace questo metodo servirà passare il paramentro risoluzione
	 * di televisore da controllare. <br>
	 * Se la risoluzione passata verrà trovata oppure no, questa funzione restituira
	 * un valore di riscontro.
	 * <p>
	 * 
	 * @param risoluzione Stringa che rappresenta la risoluzione del televisore.
	 * @return result Attributo booleano che indica se la risoluzione del televisore
	 *         è stata riscontrata oppure no.
	 * @see
	 *      <p>
	 *      true o false
	 *      <p>
	 */
	protected boolean controlloRisoluzione(String risoluzione) {
		boolean result = false;
		for (ConstantGlobal.RISOLUZIONE_TV item : ConstantGlobal.RISOLUZIONE_TV.values()) {
			if (StringUtils.equals(String.valueOf(item), risoluzione)) {
				result = true;
				break;
			}
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: controlloTipologiaSchermo</b>
	 * <p>
	 * Questo metodo consente di controllare se la tipologia dello schermo se è
	 * presente nella lista di tipologie dello schermo del televisore.
	 * <p>
	 * Per essere efficace questo metodo servirà passare il paramentro tipoSchermo
	 * di televisore da controllare. <br>
	 * Se la tiopoligia di schermo passata verrà trovata oppure no, questa funzione
	 * restituira un valore di riscontro.
	 * <p>
	 * 
	 * @param tipoSchermo Stringa che rappresenta la tipologia dello schermo del
	 *                    televisore.
	 * @return result Attributo booleano che indica se la tipoligia dello schermo
	 *         del televisore è stata riscontrata oppure no.
	 * @see
	 *      <p>
	 *      true o false
	 *      <p>
	 */
	protected boolean controlloTipologiaSchermo(String tipoSchermo) {
		boolean result = false;
		for (ConstantGlobal.TIPOLOGIA_SCHERMO item : ConstantGlobal.TIPOLOGIA_SCHERMO.values()) {
			if (StringUtils.equals(String.valueOf(item), (tipoSchermo))) {
				result = true;
				break;
			}
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: controlloSeriale</b>
	 * <p>
	 * Questo metodo consente di controllare se il seriale del televisore è presente
	 * nella lista dei seriali delle tv.
	 * <p>
	 * Per essere efficace questo metodo servirà passare il paramentro seriale del
	 * televisore da controllare. <br>
	 * Se il seriale passato verrà trovato oppure no, questa funzione restituirà un
	 * valore di riscontro. Se il seriale dovesse essere presente riscontrerà false
	 * perchè questo indicherà, che il seriale del televisore non può essere
	 * associato al un televisore nuovo.
	 * <p>
	 * 
	 * @param seriale Stringa che rappresenta un nuovo televisore che si vuole
	 *                serializzare
	 * @return result Attributo booleano che indica se il seriale è già stato
	 *         associato ad un altro televisore esistente.
	 * @see
	 *      <p>
	 *      true o false
	 *      <p>
	 */

	protected boolean controlloSeriale(String seriale) {
		boolean result = true;
		if (StringUtils.isNoneBlank(seriale)
				&& seriale.trim().matches(ConstantGlobal.REGEX_CONTROLLO_SERIALE_TELEVISORE)) {
			Iterator<String> element = elencoSerialeTv.iterator();
			while (element.hasNext()) {
				if (StringUtils.equals(element.next(), seriale.trim()))
					result = false;
			}
		} else if (elencoSerialeTv.isEmpty()
				&& seriale.trim().matches(ConstantGlobal.REGEX_CONTROLLO_SERIALE_TELEVISORE)) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO:n controlloParamentriNumericiTv</b>
	 * <p>
	 * Questo metodo consente di controllare se la stringa inserita contiene dei
	 * numeri, positivi, negativi e decimali
	 * <p>
	 * Per essere efficace questo metodo servirà passare il paramentro numero da
	 * controllare. <br>
	 * Se il numero rispetta questo tipo di sintassi:<br>
	 * <p>
	 * <p>
	 * <ul>
	 * <li>+130.00</li>
	 * <li>-1230.00</li>
	 * <li>120</li>
	 * <li>.30</li>
	 * <li>-.30</li>
	 * </ul>
	 * <p>
	 * <p>
	 * verrà assegnato al valore di ritorno result = true
	 * <p>
	 * 
	 * @param numero Stringa che rappresenta un valore numero che si vuole
	 *               controllare
	 * @return result Attributo booleano che indica se il numero passato rispetta lo
	 *         standard indicato, restituendo true altrimenti restituisce false.
	 * @see
	 *      <p>
	 *      true o false
	 *      <p>
	 */
	protected boolean controlloParamentriNumericiTv(String numero) {
		boolean result = false;
		try {
			numero = numero.replace(" ", "_");
			if (numero.matches(ConstantGlobal.REGEX_CONTROLLO_NUMERI_FLOAT)) {
				result = true;
			} else {
				throw new NumberFormatException();
			}
		} catch (NumberFormatException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println("| Non hai inserito dei valori numerici |\n");
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO:n isInteger</b>
	 * <p>
	 * Questo metodo consente di controllare se la stringa inserita contiene solo
	 * valori interi
	 * <p>
	 * Per essere efficace questo metodo servirà passare il paramentro numerp da
	 * controllare. <br>
	 * <p>
	 * 
	 * @param numero Stringa che rappresenta un valore numererico che si vuole
	 *               controllare
	 * @return result Attributo booleano che indica se il numero passato è intero,
	 *         restituendo true altrimenti restituisce false.
	 * @see
	 *      <p>
	 *      true o false
	 * 
	 */
	protected boolean isInteger(String numero) {
		try {
			Integer.parseInt(numero);
		} catch (NumberFormatException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println("| Non hai inserito dei valori interi |\n");
			return false;
		} catch (NullPointerException e) {
			return false;
		}

		return true;
	}

	/**
	 * 
	 * <b> METODO: eliminaSeriale</b>
	 * <p>
	 * Questo metodo consente di controllare se il seriale del televisore è presente
	 * nella lista dei seriali delle tv.
	 * <p>
	 * Per essere efficace questo metodo servirà passare il paramentro seriale del
	 * televisore da controllare. <br>
	 * Se il seriale passato verrà trovato oppure no, questa funzione restituirà un
	 * valore di riscontro. Se il seriale dovesse essere riscontrato nella lista,
	 * questo verrà cancellato dalla lista e la variabile di riscontro result verrà
	 * impostata a true;
	 * <p>
	 * 
	 * @param seriale Stringa che rappresenta il seriale univoco del televisore
	 * @return result Attributo booleano che indica se il seriale è stato trovato e
	 *         can cellato.
	 * @see
	 *      <p>
	 *      true o false
	 *      <p>
	 */

	protected boolean eliminaSeriale(String seriale) {
		boolean result = false;
		Iterator<String> element = elencoSerialeTv.iterator();
		while (element.hasNext()) {
			if (StringUtils.equals(element.next(), seriale.trim()))
				element.remove();
			result = true;
		}

		return result;
	}

	/**
	 * 
	 * <b> METODO: eliminaSeriale</b>
	 * <p>
	 * Questo metodo consente di controllare se il numeroUsb degli usb del
	 * televisore è di tipo medio o avanzato
	 * <p>
	 * Per essere efficace questo metodo servirà passare il paramentro numeroUsb del
	 * televisore da controllare. <br>
	 * Se il numeroUsb passato corrisponderà al numero degli usb relativi alla
	 * tipologia di appartenenza, verrà assegnato alla variabile di riscontro result
	 * = true;
	 * <p>
	 * 
	 * @param numeroUsb Stringa che rappresenta il seriale univoco del televisore
	 * @return result Attributo booleano che indica se il numeroUsb è stato
	 *         riscontrato assumendo valore true altrimenti false;
	 * @see
	 *      <p>
	 *      true o false
	 *      <p>
	 */
	protected boolean controlloCorrettezzaUsb(String numeroUsb) {
		boolean result = false;
		if (((Integer.valueOf(numeroUsb).equals(ConstantGlobal.NUMERO_USB_TV_MEDIO)
				&& visualizzaTipologiaTv().equals(ConstantGlobal.TIPOLOGIA_TV.MEDIO))
				|| (Integer.valueOf(numeroUsb).equals(ConstantGlobal.NUMERO_USB_TV_AVANZATO)
						&& visualizzaTipologiaTv().equals(ConstantGlobal.TIPOLOGIA_TV.AVANZATO)))
				|| Integer.valueOf(numeroUsb) == ConstantGlobal.NUMERO_MINIMO_USB) {
			result = true;
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: addMarcaTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire la marca del televisore attraverso
	 * il parametro marca e assegnarla alla televisione<br>
	 * Essendo che la marca del televisore dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param marca Variabile di tipo stringa che contiene la marca del televisore
	 *              inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */
	public abstract boolean addMarcaTv(String marca);

	/**
	 * 
	 * <b> OPERAZIONE: addAltezzaTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire l'altezza del televisore attraverso
	 * il parametro altezza e assegnarla alla televisione<br>
	 * Essendo che l'altezza del televisore dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param altezza Variabile di tipo stringa che contiene l'altezza del
	 *                televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	public abstract boolean addAltezzaTv(String altezza);

	/**
	 * 
	 * <b> OPERAZIONE: addLarghezzaTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire la larghezza del televisore
	 * attraverso il parametro larghezza e assegnarla alla televisione<br>
	 * Essendo che la larghezza del televisore dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param larghezza Variabile di tipo stringa che contiene la larghezza del
	 *                  televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */
	public abstract boolean addLarghezzaTv(String larghezza);

	/**
	 * 
	 * <b> OPERAZIONE: addNumberHdmiTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire il numero degli hdmi del televisore
	 * attraverso il parametro numeroHdmi e assegnarla alla televisione<br>
	 * Essendo che il numero degli hdmi del televisore dovrà necessariamente essere
	 * fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param numeroHdmi Variabile di tipo stringa che contiene il numero degli hdmi
	 *                   del televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	public abstract boolean addNumberHdmiTv(String numeroHdmi);

	/**
	 * 
	 * <b> OPERAZIONE: addNumberUsbTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire il numero degli usb del televisore
	 * attraverso il parametro numeroUsb e assegnarla alla televisione<br>
	 * Essendo che il numero degli usb del televisore dovrà necessariamente essere
	 * fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param numeroUsb Variabile di tipo stringa che contiene il numero degli usb
	 *                  del televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	public abstract boolean addNumberUsbTv(String numeroUsb);

	/**
	 * 
	 * <b> OPERAZIONE: addDiagonaleTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire la diagonale del televisore
	 * attraverso il parametro diagonale e assegnarla alla televisione<br>
	 * Essendo che la diagonale del televisore dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param diagonale Variabile di tipo stringa che contiene la diagonale del
	 *                  televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	public abstract boolean addDiagonaleTv(String diagonale);

	/**
	 * 
	 * <b> OPERAZIONE: addNumberSmartTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire il numero degli smart tv del
	 * televisore attraverso il parametro numeroSmartTv e assegnarla alla
	 * televisione<br>
	 * Essendo che il numero degli degli smart tv del televisore dovrà
	 * necessariamente essere fornito dall'utente, dunque, si rendono necessari dei
	 * controlli per verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param numeroSmartTv Variabile di tipo stringa che contiene il numero degli
	 *                      smart tv del televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	public abstract boolean addNumberSmartTv(String numeroSmartTv);

	/**
	 * 
	 * <b> OPERAZIONE: addRisoluzioneTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire la risoluzione del televisore
	 * attraverso il parametro risoluzione e assegnarla alla televisione<br>
	 * Essendo che la diagonale del televisore dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param risoluzione Variabile di tipo stringa che contiene la risoluzione del
	 *                    televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	public abstract boolean addRisoluzioneTv(String risoluzione);

	/**
	 * 
	 * <b> OPERAZIONE: addTiposchermoTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire il tipo dello schermo del
	 * televisore attraverso il parametro tipoSchermo e assegnarlo alla
	 * televisione<br>
	 * Essendo che il tipo dello schermo del televisore dovrà necessariamente essere
	 * fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param tipoSchermo Variabile di tipo stringa che contiene la tipoliga di
	 *                    schermo del televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	public abstract boolean addTiposchermoTv(String tipoSchermo);

	/**
	 * 
	 * <b> OPERAZIONE: addTelevisoreBase </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire tutti i parametri di un televisore
	 * base attraverso i parametri marca, altezza, larghezza, diagonale risoluzione
	 * e tipoSchermo ed assegnarli alla televisione<br>
	 * Essendo che i paremetri del televisore dovranno necessariamente essere
	 * forniti dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @param marca       Variabile di tipo stringa che contiene la marca del
	 *                    televisore inserito dall'utente.
	 * @param altezza     Variabile di tipo stringa che contiene l'altezza del
	 *                    televisore inserito dall'utente.
	 * @param larghezza   Variabile di tipo stringa che contiene la larghezza del
	 *                    televisore inserito dall'utente.
	 * @param diagonale   Variabile di tipo stringa che contiene la diagonale del
	 *                    televisore inserito dall'utente.
	 * @param risoluzione Variabile di tipo stringa che contiene la risoluzione del
	 *                    televisore inserito dall'utente.
	 * @param tipoSchermo Variabile di tipo stringa che contiene il tipo schermo del
	 *                    televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	public abstract boolean addTelevisoreBase(String marca, String altezza, String larghezza, String diagonale,
			String risoluzione, String tipoSchermo);

	/**
	 * 
	 * <b> OPERAZIONE: addTelevisoreMedio </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire tutti i parametri di un televisore
	 * medio attraverso i parametri marca, altezza, larghezza, diagonale risoluzione
	 * tipoSchermo, numeroUsb ed assegnarli alla televisione<br>
	 * Essendo che i paremetri del televisore dovranno necessariamente essere
	 * forniti dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @param marca       Variabile di tipo stringa che contiene la marca del
	 *                    televisore inserito dall'utente.
	 * @param altezza     Variabile di tipo stringa che contiene l'altezza del
	 *                    televisore inserito dall'utente.
	 * @param larghezza   Variabile di tipo stringa che contiene la larghezza del
	 *                    televisore inserito dall'utente.
	 * @param diagonale   Variabile di tipo stringa che contiene la diagonale del
	 *                    televisore inserito dall'utente.
	 * @param risoluzione Variabile di tipo stringa che contiene la risoluzione del
	 *                    televisore inserito dall'utente.
	 * @param tipoSchermo Variabile di tipo stringa che contiene il tipo schermo del
	 *                    televisore inserito dall'utente.
	 * @param numeroUsb   Variabile di tipo stringa che contiene il numero di usb
	 *                    del televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	public abstract boolean addTelevisoreMedio(String marca, String altezza, String larghezza, String diagonale,
			String risoluzione, String tipoSchermo, String numeroUsb);

	/**
	 * 
	 * <b> OPERAZIONE: addTelevisoreAvanzato </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire tutti i parametri di un televisore
	 * avanzato attraverso i parametri marca, altezza, larghezza, diagonale
	 * risoluzione tipoSchermo, numeroUsb, numeroHdmi, numeroSmartTv ed assegnarli
	 * alla televisione<br>
	 * Essendo che i paremetri del televisore dovranno necessariamente essere
	 * forniti dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @param marca         Variabile di tipo stringa che contiene la marca del
	 *                      televisore inserito dall'utente.
	 * @param altezza       Variabile di tipo stringa che contiene l'altezza del
	 *                      televisore inserito dall'utente.
	 * @param larghezza     Variabile di tipo stringa che contiene la larghezza del
	 *                      televisore inserito dall'utente.
	 * @param diagonale     Variabile di tipo stringa che contiene la diagonale del
	 *                      televisore inserito dall'utente.
	 * @param risoluzione   Variabile di tipo stringa che contiene la risoluzione
	 *                      del televisore inserito dall'utente.
	 * @param tipoSchermo   Variabile di tipo stringa che contiene il tipo schermo
	 *                      del televisore inserito dall'utente.
	 * @param numeroUsb     Variabile di tipo stringa che contiene il numero di usb
	 *                      del televisore inserito dall'utente.
	 * @param numeroHdmi    Variabile di tipo stringa che contiene il numero di hdmi
	 *                      del televisore inserito dall'utente.
	 * @param numeroSmartTv Variabile di tipo stringa che contiene il numero di
	 *                      smart tv del televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	public abstract boolean addTelevisoreAvanzato(String marca, String altezza, String larghezza, String diagonale,
			String risoluzione, String tipoSchermo, String numeroUsb, String numeroHdmi, String numeroSmartTv);

	/**
	 * 
	 * <b> OPERAZIONE: modificaSeriale </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare il seriale del televisore
	 * attraverso il parametro seriale e assegnarlo alla televisione<br>
	 * Essendo che il seriale del televisore dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param seriale Variabile di tipo stringa che contiene il seriale del
	 *                televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	public abstract boolean modificaSeriale(String seriale);

	/**
	 * 
	 * <b> OPERAZIONE: modificaMarcaTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare la marca del televisore attraverso
	 * il parametro marca e assegnarla alla televisione<br>
	 * Essendo che la marca del televisore dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param marca Variabile di tipo stringa che contiene la marca del televisore
	 *              inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */
	public abstract boolean modificaMarcaTv(String marca);

	/**
	 * 
	 * <b> OPERAZIONE: modificaAltezzaTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire l'altezza del televisore attraverso
	 * il parametro altezza e assegnarla alla televisione<br>
	 * Essendo che la larghezza del televisore dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param altezza Variabile di tipo stringa che contiene l'altezza del
	 *                televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	public abstract boolean modificaAltezzaTv(String altezza);

	/**
	 * 
	 * <b> OPERAZIONE: modificaLarghezzaTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare la larghezza del televisore
	 * attraverso il parametro larghezza e assegnarla alla televisione<br>
	 * Essendo che la larghezza del televisore dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param larghezza Variabile di tipo stringa che contiene la larghezza del
	 *                  televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */
	public abstract boolean modificaLarghezzaTv(String larghezza);

	/**
	 * 
	 * <b> OPERAZIONE: modificaNumberHdmiTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare il numero degli hdmi del
	 * televisore attraverso il parametro numeroHdmi e assegnarla alla
	 * televisione<br>
	 * Essendo che il numero degli hdmi del televisore dovrà necessariamente essere
	 * fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param numeroHdmi Variabile di tipo stringa che contiene il numero degli hdmi
	 *                   del televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */
	public abstract boolean modificaNumberHdmiTv(String numeroHdmi);

	/**
	 * 
	 * <b> OPERAZIONE: modificaNumberUsbTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare il numero degli usb del televisore
	 * attraverso il parametro numeroUsb e assegnarla alla televisione<br>
	 * Essendo che il numero degli usb del televisore dovrà necessariamente essere
	 * fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param numeroUsb Variabile di tipo stringa che contiene il numero degli usb
	 *                  del televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	public abstract boolean modificaNumberUsbTv(String numeroUsb);

	/**
	 * 
	 * <b> OPERAZIONE: modificaDiagonaleTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare la diagonale del televisore
	 * attraverso il parametro diagonale e assegnarla alla televisione<br>
	 * Essendo che la diagonale del televisore dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param diagonale Variabile di tipo stringa che contiene la diagonale del
	 *                  televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	public abstract boolean modificaDiagonaleTv(String diagonale);

	/**
	 * 
	 * <b> OPERAZIONE: modificaNumberSmartTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare il numero degli smart tv del
	 * televisore attraverso il parametro numeroSmartTv e assegnarla alla
	 * televisione<br>
	 * Essendo che il numero degli degli smart tv del televisore dovrà
	 * necessariamente essere fornito dall'utente, dunque, si rendono necessari dei
	 * controlli per verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param numeroSmartTv Variabile di tipo stringa che contiene il numero degli
	 *                      smart tv del televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	public abstract boolean modificaNumberSmartTv(String numeroSmartTv);

	/**
	 * 
	 * <b> OPERAZIONE: modificaRisoluzioneTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare la risoluzione del televisore
	 * attraverso il parametro risoluzione e assegnarla alla televisione<br>
	 * Essendo che la diagonale del televisore dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param risoluzione Variabile di tipo stringa che contiene la risoluzione del
	 *                    televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	public abstract boolean modificaRisoluzioneTv(String risoluzione);

	/**
	 * 
	 * <b> OPERAZIONE: modificaTiposchermoTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare il tipo dello schermo del
	 * televisore attraverso il parametro tipoSchermo e assegnarlo alla
	 * televisione<br>
	 * Essendo che il tipo dello schermo del televisore dovrà necessariamente essere
	 * fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Maggiori dettagli saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param tipoSchermo Variabile di tipo stringa che contiene la tipoliga di
	 *                    schermo del televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	public abstract boolean modificaTiposchermoTv(String tipoSchermo);

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

	public abstract boolean eliminaMarcaTv() throws TelevisoreException;

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

	public abstract boolean eliminaAltezzaTv() throws TelevisoreException;

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

	public abstract boolean eliminaLarghezzaTv() throws TelevisoreException;

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
	public abstract boolean eliminaNumberHdmiTv();

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

	public abstract boolean eliminaNumberUsbTv();

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

	public abstract boolean eliminaDiagonaleTv() throws TelevisoreException;

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

	public abstract boolean eliminaNumberSmartTv();

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
	public abstract boolean eliminaRisoluzioneTv() throws TelevisoreException;

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
	public abstract boolean eliminaTiposchermoTv() throws TelevisoreException;

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

	public abstract MarcheTelevisori visualizzaMarca();

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

	public abstract double visualizzaAltezza();

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

	public abstract double visualizzaLarghezza();

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

	public abstract double visualizzaDiagonale();

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

	public abstract String visualizzaSeriale();

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

	public abstract ConstantGlobal.RISOLUZIONE_TV visualizzaRisoluzione();

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

	public abstract ConstantGlobal.TIPOLOGIA_SCHERMO visualizzaTipoSchermo();

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

	public abstract ConstantGlobal.TIPOLOGIA_TV visualizzaTipologiaTv();

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

	public abstract int visualizzaNumeroUsb();

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

	public abstract int visualizzaNumeroHdmi();

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

	public abstract int visualizzaNumeroSmartTv();

}
