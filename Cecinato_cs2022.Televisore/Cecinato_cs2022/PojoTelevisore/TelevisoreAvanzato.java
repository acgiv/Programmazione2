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
 * <b> CLASSE: TelevisoreAvanzato </b>
 * <p>
 * Questa classe ha lo scopo di definire tutte le caratteristiche di tutti i
 * televisori di tipoligia avanzata ( che sono una tipologia specifica dei
 * televisori).
 * <p>
 * Si precisa che la corrente classe eredita le operazioni dalla classe
 * TelevisoreMedio
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

public class TelevisoreAvanzato extends TelevisoreMedio implements Serializable {

	/// ********************************************
	/// ATTRIBUTI
	/// ********************************************

	private static final long serialVersionUID = 1L;
	/**
	 * The {@link int} instanzia che indica il numero di smart tv del televisore
	 */
	private int numberSmartTv;
	/**
	 * The {@link int} instanzia indica il numero di hdmi del televisore
	 */
	private int numberHdmi; 
	/// ********************************************
	/// METODI
	/// ********************************************

	/**
	 * 
	 * <b> COSTRUTTORE: TelevisoreAvanzato </b>
	 * <p>
	 * Questo è il costruttore principale della classe TelevisoreAvanzato. <br>
	 * In particolare, tale costrutture avrà un sono paramentro seriale, che
	 * indicherà l'unicità della televisione.<br>
	 * Il seriale passato come parametro verrà controllato se è già presente o
	 * formalemnte corretto.<br>
	 * Se rispetta tutte le conformità allora verrà aggiunto nella lista dei seriali
	 * univoci attraverso la nomenclatura super() e l'oggetto TelevisoreAvanzato
	 * verrà instanziato. Altrimenti genererà un eccezione. Oltre al seriale verrà
	 * settato la tipoliga del televisore, automaticamente.
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

	public TelevisoreAvanzato(String seriale) throws TelevisoreException {
		super(seriale, ConstantGlobal.NUMERO_USB_TV_AVANZATO);
		setTipo(ConstantGlobal.TIPOLOGIA_TV.AVANZATO);
		this.numberSmartTv = ConstantGlobal.NUM_SMART_TV_AVANZATO;
	}

	/**
	 * 
	 * <b> COSTRUTTORE: TelevisoreAvanzato </b>
	 * <p>
	 * Questo è il costruttore principale della classe TelevisoreAvanzato. <br>
	 * Tal costrutture avrà quattro paramentri seriale, numberHdmi, number_usb,
	 * numberSmartTv che indicherà l'unicità della televisione.<br>
	 * Il seriale passato come parametro verrà controllato se è già presente o
	 * formalemnte corretto.<br>
	 * Se rispetta tutte le conformità allora verrà aggiunto nella lista dei seriali
	 * univoci attraverso la nomenclatura super() e l'oggetto TelevisoreAvanzato
	 * verrà instanziato. Altrimenti genererà un eccezione. In oltre al seriale
	 * verrà settato la tipoliga del televisore, automaticamente.
	 * <p>
	 * I parametri numberHdmi, numberUsb, numberSmartTv saranno aggiunti attraverso
	 * metodo add.
	 *
	 * @param seriale       Variabile di tipo stringa che contiene il seriale del
	 *                      televisore inserito dall'utente.
	 * @param numberHdmi    Variabile di tipo stringa che contiene il numero di hdmi
	 *                      del televisore inserito dall'utente.
	 * @param numberUsb     Variabile di tipo stringa che contiene il numero di usb
	 *                      del televisore inserito dall'utente.
	 * @param numberSmartTv Variabile di tipo stringa che contiene il numero di
	 *                      smart tv del televisore inserito dall'utente.
	 * @throws TelevisoreException Sollevata nel caso in cui il seriale del
	 *                             televisore è già esistente o errato
	 * 
	 */

	public TelevisoreAvanzato(String seriale, int numberHdmi, int numberUsb, int numberSmartTv)
			throws TelevisoreException {
		super(seriale, numberUsb);
		setTipo(ConstantGlobal.TIPOLOGIA_TV.AVANZATO);
		addNumberHdmiTv(String.valueOf(numberHdmi));
		addNumberSmartTv(String.valueOf(numberSmartTv));

	}

	@Override
	public String toString() {
		String stringa;
		stringa = String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_AVANZATA_TV, "_"))
				.concat("\n");
		stringa += String.format("| %94s %75s ", ConstantGlobal.TITOLO_TABELLA_TV_AVANZATO, "|\n");
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_AVANZATA_TV, "_"))
				.concat("\n");
		stringa += ConstantGlobal.TABELLA_TV_AVANZATO;
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_AVANZATA_TV, "_"))
				.concat("\n");
		stringa += String.format(
				"| %13s %2s %10s %4s %6s %5s %7s %6s %8s %5s %9s %7s %7s %9s %6s %9s %7s %10s %10s %10s\n",
				super.visualizzaSeriale(), " | ", super.visualizzaMarca(), " | ", super.visualizzaAltezza(), " | ",
				super.visualizzaLarghezza(), " | ", super.visualizzaDiagonale(), " | ", super.visualizzaRisoluzione(),
				" | ", super.visualizzaTipoSchermo(), " | ", super.visualizzaNumeroUsb(), " | ", visualizzaNumeroHdmi(),
				" | ", visualizzaNumeroSmartTv(), " | ");
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_AVANZATA_TV, "_"))
				.concat("\n");

		return stringa;
	}

	/**
	 * 
	 * <b> OPERAZIONE: addNumberHdmiTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire il numero di hdmi del televisore
	 * attraverso il parametro numeroHdmi e assegnarla alla televisione<br>
	 * Essendo che il numero di hdmi del televisore dovrà necessariamente essere
	 * fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Verranno quindi effettuati due controlli: 1) insertHdmi deve essere false (se
	 * è true l'utente deve utilizzare la funzione modifica) 2) il numero di hdmi
	 * inserito deve essere contenuto uguale ad 0 o al numero massimo di hdmi 3)
	 * controllo se la stringa passata come parametro non è un numero
	 * 
	 * Se una delle tre condizioni non è verificata farà visualizzare a video il
	 * messaggio di errore
	 * 
	 * 
	 * @param numeroHdmi Variabile di tipo stringa che contiene il numero di hdmi
	 *                   del televisore inserito dall'utente.
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione.
	 * 
	 * 
	 */

	@Override
	public boolean addNumberHdmiTv(String numeroHdmi) {
		Boolean result = false;
		try {
			if (!insertHdmi) {
				if (StringUtils.isNoneBlank(numeroHdmi)) {
					numeroHdmi = numeroHdmi.trim();
					if (controlloParamentriNumericiTv(numeroHdmi)) {
						if (super.isInteger(numeroHdmi)) {
							if (Integer.valueOf(numeroHdmi.trim()) == ConstantGlobal.NUM_HDMI_TV_AVANZATO) {
								this.numberHdmi = Integer.valueOf(numeroHdmi);
								insertHdmi = true;
								result = true;
							} else if (Integer.valueOf(numeroHdmi) < 0) {
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
			System.err.println(e.messErrorAddElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.NUMERO_HDMI)));
		} catch (MaxValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMaxNumeroHdmi());
		} catch (MinValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMinNumeroHdmi());
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println("E' stato inserito un valore nullo");
		}
		return result;

	}

	/**
	 * 
	 * <b> OPERAZIONE: addNumberSmartTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire il numero di smart tv del
	 * televisore attraverso il parametro numeroSmartTv e assegnarla alla
	 * televisione<br>
	 * Essendo che il numero di smart tv del televisore dovrà necessariamente essere
	 * fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Verranno quindi effettuati due controlli: 1) insertSmartTV deve essere false
	 * (se è true l'utente deve utilizzare la funzione modifica) 2) il numero di
	 * smart tv inserito deve essere contenuto uguale ad 0 o al numero massimo di
	 * smart tv 3) controllo se la stringa passata come parametro non è un numero
	 * 
	 * Se una delle tre condizioni non è verificata farà visualizzare a video il
	 * messaggio di errore
	 * 
	 * 
	 * @param numeroSmartTv Variabile di tipo stringa che contiene il numero di
	 *                      smart tv del televisore inserito dall'utente.
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione.
	 * 
	 * 
	 */

	@Override
	public boolean addNumberSmartTv(String numeroSmartTv) {
		Boolean result = false;
		try {
			if (!insertSmartTV) {
				if (StringUtils.isNotBlank(numeroSmartTv)) {
					numeroSmartTv = numeroSmartTv.trim();
					if (controlloParamentriNumericiTv(numeroSmartTv)) {
						if (isInteger(numeroSmartTv)) {
							if (Integer.valueOf(numeroSmartTv) == ConstantGlobal.NUM_SMART_TV_AVANZATO) {
								this.numberSmartTv = Integer.valueOf(numeroSmartTv);
								insertSmartTV = true;
								result = true;
							} else if (Integer.valueOf(numeroSmartTv) < 0) {
								throw new MinValueException();
							} else {
								throw new MaxValueException();
							}
							result = true;
						}
					}
				} else {
					throw new NullPointerException();
				}
			} else {
				throw new TelevisoreException();
			}

		} catch (MinValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMinNumeroMinSmartTv());
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(
					e.messErrorAddElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.NUMERO_SMART_TV)));
		} catch (MaxValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMaxNumeroSmartTv());
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println("E' stato inserito un valore nullo");
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: addTelevisoreAvanzato</b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire tutti i dati del televisore
	 * attraverso i parametri, marca, altezza, larghezza, diagonale, risoluzione,
	 * tipoSchermo, numeroUsb, numeroHdmi, numeroSmartTv e assegnarli alla
	 * televisione<br>
	 * Essendo che i parametri del televisore dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
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
	 * @param tipoSchermo   Variabile di tipo stringa che contiene la tipologia di
	 *                      schermo del televisore inserito dall'utente.
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

	@Override
	public boolean addTelevisoreAvanzato(String marca, String altezza, String larghezza, String diagonale,
			String risoluzione, String tipoSchermo, String numeroUsb, String numeroHdmi, String numeroSmartTv) {
		return super.addTelevisoreMedio(marca, altezza, larghezza, diagonale, risoluzione, tipoSchermo, numeroUsb)
				&& addNumberHdmiTv(numeroHdmi) && addNumberSmartTv(numeroSmartTv);
	}

	/**
	 * 
	 * <b> OPERAZIONE: modificaNumberHdmiTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare il numero di hdmi del televisore
	 * attraverso il parametro numeroHdmi e assegnarla alla televisione<br>
	 * Essendo che il numero di hdmi del televisore dovrà necessariamente essere
	 * fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Verranno quindi effettuati tre controlli: 1) insertHdmi deve essere true (se
	 * è false l'utente deve utilizzare la funzione add) 2) il numero di hdmi
	 * inserito deve essere uguale ad 0 o al numero massimo di hdmi 3) controllo se
	 * la stringa passata come parametro non è un numero
	 * 
	 * Se una delle tre condizioni non è verificata farà visualizzare a video il
	 * messaggio di errore
	 * 
	 * 
	 * @param numeroHdmi Variabile di tipo stringa che contiene il numero di hdmi
	 *                   del televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	@Override
	public boolean modificaNumberHdmiTv(String numeroHdmi) {
		Boolean result = false;
		try {
			if (insertHdmi) {
				if (StringUtils.isNotBlank(numeroHdmi)) {
					numeroHdmi = numeroHdmi.trim();
					if (super.controlloParamentriNumericiTv(numeroHdmi)) {
						if (super.isInteger(numeroHdmi)) {
							if (Integer.valueOf(numeroHdmi) <= ConstantGlobal.NUM_HDMI_TV_AVANZATO
									&& Integer.valueOf(numeroHdmi) >= ConstantGlobal.NUMERO_MINIMO_HDMI) {
								this.numberHdmi = Integer.valueOf(numeroHdmi);
								result = true;
							} else if (Integer.valueOf(numeroHdmi) < 0) {
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
			System.err.println(
					e.messErrorModificaElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.NUMERO_HDMI)));
		} catch (MaxValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMaxNumeroHdmi());
		} catch (MinValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMinNumeroHdmi());
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println("E' stato inserito un valore nullo");
		}
		return result;

	}

	/**
	 * 
	 * <b> OPERAZIONE: modificaNumberSmartTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare il numero di smart tv del
	 * televisore attraverso il parametro numeroSmartTv e assegnarla alla
	 * televisione<br>
	 * Essendo che il numero di smart tv del televisore dovrà necessariamente essere
	 * fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Verranno quindi effettuati tre controlli: 1) insertSmartTV deve essere true
	 * (se è false l'utente deve utilizzare la funzione add) 2) il numero di smart
	 * tv inserito deve essere uguale ad 0 o al numero massimo di smart tv 3)
	 * controllo se la stringa passata come parametro non è un numero
	 * 
	 * Se una delle tre condizioni non è verificata farà visualizzare a video il
	 * messaggio di errore
	 * 
	 * 
	 * @param numeroSmartTv Variabile di tipo stringa che contiene il numero di
	 *                      smart tv del televisore inserito dall'utente.
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione.
	 * 
	 * 
	 */

	@Override
	public boolean modificaNumberSmartTv(String numeroSmartTv) {
		Boolean result = false;
		try {
			if (insertSmartTV) {
				if (StringUtils.isNotBlank(numeroSmartTv)) {
					numeroSmartTv = numeroSmartTv.trim();
					if (super.isInteger(numeroSmartTv)) {
						if (Integer.valueOf(numeroSmartTv) <= ConstantGlobal.NUM_SMART_TV_AVANZATO
								&& Integer.valueOf(numeroSmartTv) >= ConstantGlobal.NUMERO_MINIMO_SMART_TV) {
							this.numberSmartTv = Integer.valueOf(numeroSmartTv);
							result = true;
						} else if (Integer.valueOf(numeroSmartTv) < 0) {
							throw new MinValueException();
						} else {
							throw new MaxValueException();
						}
						result = true;
					}
				} else {
					throw new NullPointerException();
				}
			} else {
				throw new TelevisoreException();
			}

		} catch (MinValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMinNumeroMinSmartTv());
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(
					e.messErrorModificaElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.NUMERO_SMART_TV)));
		} catch (MaxValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMaxNumeroSmartTv());
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println("E' stato inserito un valore nullo");
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: eliminaNumberHdmiTv </b>
	 * <p>
	 * Questo metodo consente di eliminare il numero di hdmi dello schermo del
	 * televisore
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo numberHdmi, e
	 * controlliamo se è vuoto.
	 * <p>
	 * Il valore di ritorno, assumerà il valore true se è stato cancellato
	 * altrimenti false. Nel caso in cui il valore dell'attributo numberHdmi è vuoto
	 * alzerà un eccezione
	 * 
	 * 
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione andata a buon fine oppure no
	 * 
	 * 
	 */

	@Override
	public boolean eliminaNumberHdmiTv() {
		Boolean result = false;
		try {
			if (super.insertHdmi) {
				this.numberHdmi = ConstantGlobal.NUMERO_MINIMO_HDMI;
				result = true;
			} else {
				throw new TelevisoreException();
			}
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.messErrorCanellazioneElement(
					"non è possibile cancellare, il numero di hdmi non è mai stato aggiunto"));
		}
		return result;

	}

	/**
	 * 
	 * <b> METODO: eliminaNumberSmartTv </b>
	 * <p>
	 * Questo metodo consente di eliminare il numero di smart tv dello schermo del
	 * televisore
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo numberSmartTv,
	 * e controlliamo se è vuoto.
	 * <p>
	 * Il valore di ritorno, assumerà il valore true se è stato cancellato
	 * altrimenti false. Nel caso in cui il valore dell'attributo numberSmartTv è
	 * vuoto alzerà un eccezione
	 * 
	 * 
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione andata a buon fine oppure no
	 * 
	 * 
	 */

	@Override
	public boolean eliminaNumberSmartTv() {
		Boolean result = false;
		try {
			if (super.insertSmartTV) {
				this.numberSmartTv = ConstantGlobal.NUMERO_MINIMO_SMART_TV;
				result = true;
			} else {
				throw new TelevisoreException();
			}
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.messErrorCanellazioneElement(
					"il numero dello smart  non può essere cancellata essendo già nulla "));
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: visualizzaNumeroHdmi</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante l'intero contenente il
	 * numero di hdmi del televisore.
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo numberHdmi, e
	 * lo restituiamo al chiamante.
	 * 
	 * @return numberHdmi, Variabile di tipo int contente il numero di hdmi
	 *         appartente al televisore.
	 */

	public int visualizzaNumeroHdmi() {
		return numberHdmi;
	}

	/**
	 * 
	 * <b> METODO: visualizzaNumeroSmartTv</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante l'intero contenente il
	 * numero di smart tv del televisore.
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo numberSmartTv,
	 * e lo restituiamo al chiamante.
	 * 
	 * @return numberSmartTv, Variabile di tipo int contente il numero di smart tv
	 *         appartente al televisore.
	 */

	public int visualizzaNumeroSmartTv() {
		return this.numberSmartTv;
	}

}
