package Cecinato_cs2022.PojoTelevisore;

import java.io.Serializable;
import java.util.Collections;

import org.apache.commons.lang3.StringUtils;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.EcceptionTelevisore.MaxValueException;
import Cecinato_cs2022.EcceptionTelevisore.MinValueException;
import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;

/**
 * 
 * <p>
 * <b> CLASSE: TelevisoreMedio </b>
 * <p>
 * Questa classe ha lo scopo di definire tutte le caratteristiche di tutti i
 * televisori di tipoligia media ( che sono una tipologia specifica dei
 * televisori).
 * <p>
 * Si precisa che la corrente classe eredita le operazioni dalla classe
 * TelevisoreBase
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

public class TelevisoreMedio extends TelevisoreBase implements Serializable {

	/// ********************************************
	/// ATTRIBUTI
	/// ********************************************

	private static final long serialVersionUID = 1L;
	/**
	 * il {@link int} instanzia che indica il numero di usb del televisore
	 */
	private int numberUsb; 

	/// ********************************************
	/// METODI
	/// ********************************************

	/**
	 * 
	 * <b> COSTRUTTORE: TelevisoreMedio </b>
	 * <p>
	 * Questo è il costruttore principale della classe TelevisoreMedio. <br>
	 * In particolare, tale costrutture avrà un sono paramentro seriale, che
	 * indicherà l'unicità della televisione.<br>
	 * Il seriale passato come parametro verrà controllato se è già presente o
	 * formalemnte corretto.<br>
	 * Se rispetta tutte le conformità allora verrà aggiunto nella lista dei seriali
	 * univoci attraverso la nomenclatura super() e l'oggetto televisoreMedio verrà
	 * instanziato. Altrimenti genererà un eccezione. Oltre al seriale verrà settato
	 * la tipoliga del televisore, automaticamente.
	 * <p>
	 * In oltre, ogni singolo attributo sarà valorizzato con l'apposito metodo add.
	 * La valorizzazione dei singoli attributi è effettuata attraverso la parola
	 * riservata "this" che specifica il riferimento all'oggetto corrente che invoca
	 * tale costruttore.
	 * 
	 * @param seriale Variabile di tipo stringa che contiene il seriale del
	 *                televisore inserito dall'utente.
	 * @throws TelevisoreException Sollevata nel caso in cui il seriale del
	 *                             televisore è già esistente o errato
	 * 
	 */

	public TelevisoreMedio(String seriale) throws TelevisoreException {
		super(seriale);
		setTipo(ConstantGlobal.TIPOLOGIA_TV.MEDIO); /// imposta la tipologia di televisore inizializzata
		this.numberUsb = ConstantGlobal.NUMERO_USB_TV_MEDIO;
	}

	/**
	 * 
	 * <b> COSTRUTTORE: TelevisoreMedio </b>
	 * <p>
	 * Questo è il costruttore principale della classe TelevisoreMedio. <br>
	 * In particolare, tale costrutture avrà due paramentri seriale che indicherà
	 * l'unicità della televisione e il numeroUsb.<br>
	 * Il seriale e il numeroUsb passato come parametro verrà controllato se è già
	 * presente o formalemnte corretto.<br>
	 * Se rispetta tutte le conformità allora verrà aggiunto nella lista dei seriali
	 * univoci attraverso la nomenclatura super() e l'oggetto televisoreMedio verrà
	 * instanziato. Altrimenti genererà un eccezione. Oltre al seriale verrà settato
	 * la tipoliga del televisore, automaticamente.
	 * <p>
	 * In oltre, ogni singolo attributo sarà valorizzato con l'apposito metodo add.
	 * La valorizzazione dei singoli attributi è effettuata attraverso la parola
	 * riservata "this" che specifica il riferimento all'oggetto corrente che invoca
	 * tale costruttore.
	 * 
	 * @param seriale Variabile di tipo stringa che contiene il seriale del
	 *                televisore inserito dall'utente.
	 * @param numberUsb Variabile di tipo int che contiene il numero di usb del
	 *                televisore inserito dall'utente.
	 * @throws TelevisoreException Sollevata nel caso in cui il seriale del
	 *                             televisore è già esistente o errato
	 * 
	 */

	public TelevisoreMedio(String seriale, int numberUsb) throws TelevisoreException {
		super(seriale);
		setTipo(ConstantGlobal.TIPOLOGIA_TV.MEDIO);
		this.numberUsb = numberUsb;
	}

	@Override
	public String toString() {
		String stringa;
		stringa = String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_MEDIA, "_"))
				.concat("\n");
		stringa += String.format("| %73s %55s ", ConstantGlobal.TITOLO_TABELLA_MEDIO, "|\n");
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_MEDIA, "_"))
				.concat("\n");
		stringa += ConstantGlobal.TABELLA_TV_MEDIO;
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_MEDIA, "_"))
				.concat("\n");
		stringa += String.format("| %13s %2s %10s %4s %6s %5s %7s %6s %8s %5s %9s %7s %7s %9s %6s %9s\n",
				super.visualizzaSeriale(), " | ", super.visualizzaMarca(), " | ", super.visualizzaAltezza(), " | ",
				super.visualizzaLarghezza(), " | ", super.visualizzaDiagonale(), " | ", super.visualizzaRisoluzione(),
				" | ", super.visualizzaTipoSchermo(), " | ", this.numberUsb, " | ");
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_MEDIA, "_"))
				.concat("\n");

		return stringa;
	}

	/**
	 * 
	 * <b> OPERAZIONE: addNumberUsbTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire il numero di usb del televisore
	 * attraverso il parametro numeroUsb e assegnarla alla televisione<br>
	 * Essendo che il numero di usb del televisore dovrà necessariamente essere
	 * fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Verranno quindi effettuati due controlli: 1) insertUsb deve essere false (se
	 * è true l'utente deve utilizzare la funzione modifica) 2) il numero di usb
	 * inserito deve essere contenuto uguale ad 0 o al numero massimo di usb (numero
	 * massimo varia in base alla tipologia) 3) controllo se la stringa passata come
	 * parametro non è un numero
	 * 
	 * Se una delle tre condizioni non è verificata farà visualizzare a video il
	 * messaggio di errore
	 * 
	 * 
	 * @param numeroUsb Variabile di tipo stringa che contiene il numero di usb del
	 *                  televisore inserito dall'utente.
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	@Override
	public boolean addNumberUsbTv(String numeroUsb) {
		Boolean result = false;
		try {
			if (!insertUsb) {
				if (StringUtils.isNotBlank(numeroUsb)) { // controllo se è false (condizione necessaria per utilizzare
															// la funzione add)
					numeroUsb = numeroUsb.trim();
					if (super.controlloParamentriNumericiTv(numeroUsb)) {
						if (super.isInteger(numeroUsb)) {
							if (super.controlloCorrettezzaUsb(numeroUsb)) {
								this.numberUsb = Integer.valueOf(numeroUsb);
								insertUsb = true;
								result = true;
							} else if (Integer.valueOf(numeroUsb) < 0) {
								throw new MinValueException();
							} else {
								throw new MaxValueException();
							}
						}
					}
				} else {
					throw new NullPointerException();
				}
			} else {
				throw new TelevisoreException();
			}
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.messErrorAddElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.NUMERO_USB)));
		} catch (MaxValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMaxNumeroUsb());
		} catch (MinValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMinNumeroMinUsb());
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println("E' stato inserito un valore nullo");
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: addTelevisoreMedio </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire tutte le informazioni di un
	 * televisore medio attraverso i parametri marca, altezza, larghezza, diagonale
	 * risoluzione tipoSchermo, numeroUsb ed assegnarli alla televisione<br>
	 * Essendo che i paremetri del televisore dovranno necessariamente essere
	 * forniti dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * I controlli verranno eseguinti nelle chiamate delle funzioni add per le
	 * assegnazione dei parametri elencati precedentemente. Nel caso viene
	 * riscontrato un errore nel controllo di uno o più parametri, verranno mostrati
	 * all'utente sullo schermo gli erroti relativi ai parametri errati.
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
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione.
	 * 
	 * 
	 */

	@Override
	public boolean addTelevisoreMedio(String marca, String altezza, String larghezza, String diagonale,
			String risoluzione, String tipoSchermo, String numeroUsb) {
		return addTelevisoreBase(marca, altezza, larghezza, diagonale, risoluzione, tipoSchermo)
				&& addNumberUsbTv(numeroUsb);
	}

	/**
	 * 
	 * <b> OPERAZIONE: modificaNumberUsbTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire il numero di usb del televisore
	 * attraverso il parametro numeroUsb e assegnarla alla televisione<br>
	 * Essendo che il numero di usb del televisore dovrà necessariamente essere
	 * fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Verranno quindi effettuati tre controlli: 1) insertUsb deve essere true (se è
	 * false l'utente deve utilizzare la funzione add) 2) il numero di usb inserito
	 * deve essere  uguale ad 0 o al numero massimo di usb (numero massimo
	 * varia in base alla tipologia) 3) controllo se la stringa passata come
	 * parametro non è un numero
	 * 
	 * Se una delle tre condizioni non è verificata farà visualizzare a video il
	 * messaggio di errore
	 * 
	 * 
	 * @param numeroUsb Variabile di tipo stringa che contiene il numero di usb del
	 *                  televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	@Override
	public boolean modificaNumberUsbTv(String numeroUsb) {
		Boolean result = false;
		try {
			if (insertUsb) {
				if (StringUtils.isNotBlank(numeroUsb)) {
					numeroUsb = numeroUsb.trim();
					if (super.controlloParamentriNumericiTv(numeroUsb)) {
						if (super.isInteger(numeroUsb)) {
							if (super.controlloCorrettezzaUsb(numeroUsb)) {
								this.numberUsb = Integer.valueOf(numeroUsb);
								result = true;
							}
						} else if (Integer.valueOf(numeroUsb) < 0) {
							throw new MinValueException();
						} else {
							throw new MaxValueException();
						}
					}
				} else {
					throw new NullPointerException();
				}
			} else {
				throw new TelevisoreException();
			}
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(
					e.messErrorModificaElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.NUMERO_USB)));
		} catch (MaxValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMaxNumeroUsb());
		} catch (MinValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMinNumeroMinUsb());
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println("E' stato inserito un valore nullo");
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: eliminaNumberUsbTv </b>
	 * <p>
	 * Questo metodo consente di eliminare il numero di usb dello schermo del
	 * televisore
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo numberUsb, e
	 * controlliamo se è vuoto.
	 * <p>
	 * Il valore di ritorno, assumerà il valore true se è stato cancellato
	 * altrimenti false. Nel caso in cui il valore dell'attributo numberUsb è vuoto
	 * alzerà un eccezione
	 * 
	 * 
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione andata a buon fine oppure no
	 * 
	 * 
	 */

	@Override
	public boolean eliminaNumberUsbTv() {
		Boolean result = false;
		try {
			if (super.insertUsb) {
				this.numberUsb = ConstantGlobal.NUMERO_MINIMO_USB;
				result = true;
			} else {
				throw new TelevisoreException();
			}
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.messErrorCanellazioneElement(
					"non è possibile cancellare , il numero di usb non è mai stato aggiunto"));
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: visualizzaNumeroUsb</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante l'intero contenente il
	 * numero di usb del televisore.
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo numberUsb, e
	 * lo restituiamo al chiamante.
	 * 
	 * @return numberUsb, Variabile di tipo int contente il numero di usb appartente
	 *         al televisore.
	 */

	@Override
	public int visualizzaNumeroUsb() {
		return this.numberUsb;
	}
}
