package Cecinato_cs2022.PojoTelevisore;

import java.io.Serializable;
import java.util.Collections;

import org.apache.commons.lang3.StringUtils;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.ConstantGlobal.ConstantGlobal.RISOLUZIONE_TV;
import Cecinato_cs2022.ConstantGlobal.ConstantGlobal.TIPOLOGIA_SCHERMO;
import Cecinato_cs2022.ConstantGlobal.ConstantGlobal.TIPOLOGIA_TV;
import Cecinato_cs2022.ConstantGlobal.MarcheTelevisori;
import Cecinato_cs2022.EcceptionTelevisore.MaxValueException;
import Cecinato_cs2022.EcceptionTelevisore.MinValueException;
import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;

/**
 * 
 * <p>
 * <b> CLASSE: TelevisoreBase </b>
 * <p>
 * Questa classe ha lo scopo di definire tutte le caratteristiche di tutti i
 * televisori di tipoligia base ( che sono una tipologia specifica dei
 * televisori).
 * <p>
 * Si precisa che la corrente classe implementa le operazioni dalla classe
 * astratta AbstractTelevisore, questa classe implementerà tutte le funzionalità
 * non implementate nella classe estesa.
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

public class TelevisoreBase extends AbstractTelevisore implements Serializable {

	/// ********************************************
	/// ATTRIBUTI
	/// ********************************************

	private static final long serialVersionUID = 1L;
	
	/**
	 * il {@link String} instanzia che indica l'unicità del televisore. Esso è composto da 12
	 */
	private String seriale; 
	/**
	 * la {@link MarcheTelevisori} instanzia che indica indica il modello del televisore.
	 */
	private MarcheTelevisori marca; 
	/**
	 * la {@link double} instanzia che indica quanto è alta la televisione.
	 */
	private double altezza; 
	/**
	 * la {@link double} instanzia che indica quanto è larga la televisione.
	 */
	private double larghezza; 
	/**
	 * la {@link double} instanzia che indica la lunghezza della diagonale del televisore.
	 */
	private double diagonale; 
	/**
	 * la {@link RISOLUZIONE_TV} instanzia che indica il tipo di risoluzione che ha il televisore.
	 */
	private ConstantGlobal.RISOLUZIONE_TV risoluzione; 
					
	/**
	 * il {@link TIPOLOGIA_SCHERMO} instanzia che indica la tipologia di shermo del televisore.
	 */
	private ConstantGlobal.TIPOLOGIA_SCHERMO tipoSchermo; 
		
	/**
	 * il {@link TIPOLOGIA_TV} instanzia che indica la tipologia di appartenenza del televisore;
	 */
	private ConstantGlobal.TIPOLOGIA_TV tipo; 

	/// ********************************************
	/// METODI
	/// ********************************************

	/**
	 * 
	 * <b> COSTRUTTORE: TelevisoreBase </b>
	 * <p>
	 * Questo è il costruttore principale della classe TelevisoreBase. <br>
	 * In particolare, tale costrutture avrà un sono paramentro seriale, che
	 * indicherà l'unicità della televisione.<br>
	 * Il seriale passato come parametro verrà controllato se è già presente o
	 * formalemnte corretto.<br>
	 * Se rispetta tutte le conformità allora verrà aggiunto nella lista dei seriali
	 * univoci e l'oggetto televisoreBase verrà instanziato. Altrimenti genererà un
	 * eccezione.
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
	public TelevisoreBase(String seriale) throws TelevisoreException {
		super();
		if (super.controlloSeriale(seriale)) {
			this.seriale = seriale;
			elencoSerialeTv.add(seriale);
		} else {
			throw new TelevisoreException("Il seriale inserito non è corretto o già esistente: " + seriale);
		}
		this.tipo = ConstantGlobal.TIPOLOGIA_TV.BASE;
	}

	protected void setTipo(ConstantGlobal.TIPOLOGIA_TV tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		String stringa = null;
		stringa = String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_BASE, "_"))
				.concat("\n");
		stringa += String.format("| %59s %52s ", ConstantGlobal.TITOLO_TABELLA_BASE, "|\n");
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_BASE, "_"))
				.concat("\n");
		stringa += ConstantGlobal.TABELLA_TV_BASE;
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_BASE, "_"))
				.concat("\n");
		stringa += String.format("| %13s %2s %10s %4s %6s %5s %7s %6s %8s %5s %9s %7s %7s %9s\n", seriale, " | ", marca,
				" | ", altezza, " | ", larghezza, " | ", diagonale, " | ", risoluzione, " | ", tipoSchermo, " | ");
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_BASE, "_"))
				.concat("\n");

		return stringa;
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
	 * Verranno quindi effettuati tre controlli: 1) la marca del televisore deve
	 * essere vuota 3) la marca passata dall'utente deve essere vuota ( se è piena
	 * l'utente deve utilizzare la funzione modifica) 3) la marca inserita è
	 * contenuta nell'elenco delle marche delle tv
	 * 
	 * Se una delle tre condizioni non è verificata farà visualizzare a video il
	 * messaggio di errore
	 * 
	 * 
	 * @param marca Variabile di tipo stringa che contiene la marca del televisore
	 *              inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */
	@Override
	public boolean addMarcaTv(String marca) {
		Boolean result = false;
		try {
			if (this.marca == null) { // controllo se è vuota (condizione necessaria per utilizzare la funzione add)
				if (StringUtils.isEmpty(marca)) {
					throw new NullPointerException();
				} else if (controlloMarca(marca.trim().toUpperCase())) { /// controllo se la marca è presente nella
																			/// lista delle marche
					this.marca = (MarcheTelevisori.valueOf(marca.trim().toUpperCase()));
					result = true;
				} else {
					throw new TelevisoreException();
				}
			} else {
				throw new TelevisoreException();
			}
		} catch (TelevisoreException e) {
			System.err.println(e.messErrorAddElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.MARCA)));
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println("| è stato inserito un valore nullo |");
		}
		return result;
	}

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
	 * Verranno quindi effettuati tre controlli: 1) l'altezza del televisore deve
	 * essere vuota 3) l'altezza passata dall'utente deve essere vuota ( se è piena
	 * l'utente deve utilizzare la funzione modifica) 3) l'altezza inserita deve
	 * essere contenuta tra l' altezza minima e l'altezza massima oppure uguale ad
	 * una delle due.
	 * 
	 * Se una delle tre condizioni non è verificata farà visualizzare a video il
	 * messaggio di errore
	 * 
	 * 
	 * @param altezza Variabile di tipo stringa che contiene l'altezza del
	 *                televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	@Override
	public boolean addAltezzaTv(String altezza) {
		Boolean result = false;
		try {
			if (this.altezza == 0 && StringUtils.isNotBlank(altezza)) { // controllo se è vuota (condizione necessaria
																		// per utilizzare la funzione add)
				altezza = altezza.trim();
				if (controlloParamentriNumericiTv(altezza)) { // controllo se la stringa ha questo tipo di formato 1)
																// 40.30 2) .40 3) -0.40 4) -.49 5) +40 6) -40 7) +50.40
					if (Double.valueOf(altezza) <= ConstantGlobal.ALTEZZA_MASSIMA_TV
							&& Double.valueOf(altezza) >= ConstantGlobal.ALTEZZA_MINIMA_TV) { // controllo se la
																								// dimesione rispetti i
																								// valori minimi e
																								// massimi di default
						this.altezza = Double.valueOf(altezza);
						result = true;
					} else if (Double.valueOf(altezza) < ConstantGlobal.ALTEZZA_MINIMA_TV) {
						throw new MinValueException();
					} else {
						throw new MaxValueException();
					}
				}
			} else {
				throw new TelevisoreException();
			}

		} catch (MinValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMinAltezza());
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.messErrorAddElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.ALTEZZA)));
		} catch (MaxValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMaxAltezza());
		}
		return result;
	}

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
	 * Verranno quindi effettuati tre controlli: 1) la larghezza del televisore deve
	 * essere vuota 3) la larghezza passata dall'utente deve essere vuota ( se è
	 * piena l'utente deve utilizzare la funzione modifica) 3) la larghezza inserita
	 * deve essere contenuta tra la larghezza minima e la larghezza massima oppure
	 * uguale ad una delle due.
	 * 
	 * Se una delle tre condizioni non è verificata farà visualizzare all 'utente il
	 * messaggio di errore
	 * 
	 * 
	 * @param larghezza Variabile di tipo stringa che contiene la larghezza del
	 *                  televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	@Override
	public boolean addLarghezzaTv(String larghezza) {
		Boolean result = false;
		try {
			if (this.larghezza == 0) { // controllo se è vuota (condizione necessaia per utilizzare la funzione add)
				if (StringUtils.isNotBlank(larghezza)) {
					larghezza = larghezza.trim();
					if (controlloParamentriNumericiTv(larghezza)) { // controllo se la stringa ha questo tipo di formato
																	// 1) 40.30 2) .40 3) -0.40 4) -.49 5) +40 6) -40 7)
																	// +50.40
						if (Double.valueOf(larghezza) <= ConstantGlobal.LARGHEZZA_MASSIMA_TV
								&& Double.valueOf(larghezza) >= ConstantGlobal.LARGHEZZA_MINIMA_TV) { // controllo se la
																										// dimesione
																										// rispetti i
																										// valori minimi
																										// e massimi di
																										// default
							this.larghezza = Double.valueOf(larghezza);
							result = true;
						} else if (Double.valueOf(larghezza) < ConstantGlobal.LARGHEZZA_MINIMA_TV) {
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

		} catch (MinValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMinLarghezza());
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.messErrorAddElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.LARGHEZZA)));
		} catch (MaxValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMaxLarghezza());

		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println("E' stato inserito un valore nullo");

		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: addNumberSmartTv</b>
	 * <p>
	 * Questo metodo consente di aggiungere il numero di smart tv del televisore
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata da questo tipo di tipologia.
	 * 
	 * @return result Variabile ti tipo boolean che rappresenta se l'operazione è
	 *         andata a buon fine oppure no.
	 */

	@Override
	public boolean addNumberSmartTv(String numeroSmartTv) {
		Boolean result = false;
		try {
			throw new TelevisoreException();
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.ErrorTipologiaTelevisoreException());
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: addNumberHdmiTv</b>
	 * <p>
	 * Questo metodo consente di aggiungere il numero di hdmi del televisore
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata da questo tipo di tipologia.
	 * 
	 * @return result Variabile ti tipo boolean che rappresenta se l'operazione è
	 *         andata a buon fine oppure no.
	 */

	@Override
	public boolean addNumberHdmiTv(String numeroHdmi) {
		Boolean result = false;
		try {
			throw new TelevisoreException();
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.ErrorTipologiaTelevisoreException());
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: addNumberUsbTv</b>
	 * <p>
	 * Questo metodo consente di aggiungere il numero di usb del televisore
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata da questo tipo di tipologia.
	 * 
	 * @return result Variabile ti tipo boolean che rappresenta se l'operazione è
	 *         andata a buon fine oppure no.
	 */
	@Override
	public boolean addNumberUsbTv(String numeroUsb) {
		Boolean result = false;
		try {
			throw new TelevisoreException();
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.ErrorTipologiaTelevisoreException());
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: addDiagonaleTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire la diagonale del televisore
	 * attraverso il parametro diagonale e assegnarla alla televisione<br>
	 * Essendo che la diagonaledel televisore dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * <p>
	 * Verranno quindi effettuati tre controlli: 1) la diagonale del televisore deve
	 * essere vuota 3) la diagonale passata dall'utente deve essere vuota ( se è
	 * piena l'utente deve utilizzare la funzione modifica) 3) la diagonale inserita
	 * deve essere contenuta tra la diagonale minima e la diagonale massima oppure
	 * uguale ad una delle due.
	 * 
	 * Se una delle tre condizioni non è verificata farà visualizzare all 'utente il
	 * messaggio di errore
	 * 
	 * 
	 * @param diagonale Variabile di tipo stringa che contiene la la diagonale del
	 *                  televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	@Override
	public boolean addDiagonaleTv(String diagonale) {
		Boolean result = false;
		try {
			if (this.diagonale == 0) {
				if (StringUtils.isNotBlank(diagonale)) {// controllo se è vuota (condizione necessaia per utilizzare la
														// funzione add)
					diagonale = diagonale.trim();
					if (controlloParamentriNumericiTv(diagonale)) { // controllo se la stringa ha questo tipo di formato
																	// 1) 40.30 2) .40 3) -0.40 4) -.49 5) +40 6) -40 7)
																	// +50.40
						if (Double.valueOf(diagonale) <= ConstantGlobal.DIAGONALE_MASSIMA_TV
								&& Double.valueOf(diagonale) >= ConstantGlobal.DIAGONALE_MINIMA_TV) {
							this.diagonale = Double.valueOf(diagonale);
							result = true;
						} else if (Double.valueOf(diagonale) < ConstantGlobal.DIAGONALE_MINIMA_TV) {
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

		} catch (MinValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMinDiagonale());
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.messErrorAddElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.DIAGONALE)));
		} catch (MaxValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMaxDiagonale());
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println("E' stato inserito un valore nullo");
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: addRisoluzioneTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire la risoluzione del televisore
	 * attraverso il parametro risoluzione e assegnarla alla televisione<br>
	 * Essendo che la risoluzione del televisore dovrà necessariamente essere
	 * fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Verranno quindi effettuati tre controlli: 1) la risoluzione del televisore
	 * deve essere vuota 3) la risoluzione passata dall'utente deve essere vuota (
	 * se è piena l'utente deve utilizzare la funzione modifica) 3) la risoluzione
	 * inserita è contenuta nell'elenco delle risoluzioni delle tv
	 * 
	 * Se una delle tre condizioni non è verificata farà visualizzare a video il
	 * messaggio di errore
	 * 
	 * 
	 * @param risoluzione Variabile di tipo stringa che contiene la risoluzione del
	 *                    televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	@Override
	public boolean addRisoluzioneTv(String risoluzione) {
		Boolean result = false;
		try {
			if (this.risoluzione == null) { // controllo se è vuota (condizione necessaria per utilizzare la funzione
											// add)
				if (StringUtils.isEmpty(risoluzione)) {
					throw new NullPointerException();
				} else if (controlloRisoluzione(risoluzione.trim().replace(" ", "_").toUpperCase())) { /// controllo se
																										/// la
																										/// risolzione è
																										/// presente
																										/// nella
					/// lista delle risoluzioni
					this.risoluzione = ConstantGlobal.RISOLUZIONE_TV
							.valueOf(risoluzione.trim().replace(" ", "_").toUpperCase());
					result = true;
				} else {
					throw new TelevisoreException();
				}
			} else {
				throw new TelevisoreException();
			}

		} catch (TelevisoreException e) {
			System.err.println(e.messErrorAddElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.RISOLUZIONE)));
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println("| è stato inserito un valore nullo |");
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: addTiposchermoTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire la tipologia dello schermo del
	 * televisore attraverso il parametro tipoSchermo e assegnarla alla
	 * televisione<br>
	 * Essendo che la tipologia dello schermo del televisore dovrà necessariamente
	 * essere fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Verranno quindi effettuati tre controlli: 1) la tipologia dello schermo del
	 * televisore deve essere vuota 3) la la tipologia dello schermo passata
	 * dall'utente deve essere vuota ( se è piena l'utente deve utilizzare la
	 * funzione modifica) 3) la tipologia dello schermo inserita è contenuta
	 * nell'elenco delle risoluzioni delle tv
	 * 
	 * Se una delle tre condizioni non è verificata farà visualizzare a video il
	 * messaggio di errore
	 * 
	 * 
	 * @param tipoSchermo Variabile di tipo stringa che contiene la tipologia dello
	 *                    schermo del televisore inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	@Override
	public boolean addTiposchermoTv(String tipoSchermo) {
		Boolean result = false;
		try {

			if (this.tipoSchermo == null) {
				if (StringUtils.isEmpty(tipoSchermo)) { // controllo se è vuota (condizione necessaria per utilizzare la
														// funzione add)
					throw new NullPointerException();
				} else if (controlloTipologiaSchermo(tipoSchermo.trim().toUpperCase())) { /// controllo se la tipologia
																							/// di schermo è presente
																							/// nella
					/// lista delle tipologie di schermo
					this.tipoSchermo = ConstantGlobal.TIPOLOGIA_SCHERMO.valueOf(tipoSchermo.trim().toUpperCase());
					result = true;
				} else {
					throw new TelevisoreException();
				}

			} else {
				throw new TelevisoreException();
			}

		} catch (TelevisoreException e) {
			System.err.println(e.messErrorAddElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.TIPO_SCHERMO)));
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println("| è stato inserito un valore nullo |");
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: addTelevisoreBase </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire tutte le informazioni di un
	 * televisore base attraverso i parametri marca, altezza, larghezza, diagonale
	 * risoluzione e tipoSchermo ed assegnarli alla televisione<br>
	 * Essendo che i paremetri del televisore dovranno necessariamente essere
	 * forniti dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * I controlli verranno eseguinti nelle chiamate delle funzioni add per le
	 * assegnazione dei parametri elencati precedentemente. Nel caso viene
	 * riscontrato un errore nel controllo di uno o più parametri, verranno mostrati
	 * all'utente sullo schermo gli erroti relativi ai parametri errati.
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
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione.
	 * 
	 * 
	 */

	@Override
	public boolean addTelevisoreBase(String marca, String altezza, String larghezza, String diagonale,
			String risoluzione, String tipoSchermo) {
		return addMarcaTv(marca) && addAltezzaTv(altezza) && addLarghezzaTv(larghezza) && addDiagonaleTv(diagonale)
				&& addRisoluzioneTv(risoluzione) && addTiposchermoTv(tipoSchermo);
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
	 * In oltre quesata funzionalità in questa classe se chiamata, alzerà un
	 * eccezione, perchè non può essere utilizzata da questo tipo di tipologia.
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
		Boolean result = false;
		try {
			throw new TelevisoreException();
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.ErrorTipologiaTelevisoreException());
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: addTelevisoreAvanzato</b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire tutte le informazioni di un
	 * televisore avanzato attraverso i parametri marca, altezza, larghezza,
	 * diagonale risoluzione tipoSchermo, numeroUsb, numeroHdmi, numeroSmartTv ed
	 * assegnarli alla televisione<br>
	 * Essendo che i paremetri del televisore dovranno necessariamente essere
	 * forniti dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * In oltre quesata funzionalità in questa classe se chiamata, alzerà un
	 * eccezione, perchè non può essere utilizzata da questo tipo di tipologia.
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
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione
	 * 
	 */

	@Override
	public boolean addTelevisoreAvanzato(String marca, String altezza, String larghezza, String diagonale,
			String risoluzione, String tipoSchermo, String numeroUsb, String numeroHdmi, String numeroSmartTv) {
		Boolean result = false;
		try {
			throw new TelevisoreException();
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.ErrorTipologiaTelevisoreException());
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: modificaSeriale </b>
	 * <p>
	 * Questo metodo consente di modificare il seriale del televisore
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo seriale, e
	 * controlliamo se non è vuoto.
	 * <p>
	 * Essendo che il seriale del televisore dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza, l'unicità e la correttezza del seriale passato dal utente come
	 * parametro.
	 * <p>
	 * Il valore di ritorno, assumerà il valore true se è stato modificato
	 * altrimenti false. Nel caso in cui il valore dell'attributo seriale è esiste o
	 * sbagliato nel formato prefissato stamperà un eccezione
	 * 
	 * @param seriale Variabile di tipo String che contiene il seriale da assegnare
	 *                al televisore
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione
	 * 
	 * 
	 */

	@Override
	public boolean modificaSeriale(String seriale) {
		Boolean result = false;
		try {
			if (StringUtils.isNotBlank(seriale) && controlloSeriale(seriale.trim())) {
				super.eliminaSeriale(this.seriale);
				this.seriale = seriale;
				result = true;
			} else {
				throw new TelevisoreException();
			}
		} catch (TelevisoreException e) {
			System.err.println("Il seriale inserito non è corretto o già esistente: " + seriale);
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: modificaMarcaTv </b>
	 * <p>
	 * Questo metodo consente di modificare la marca del televisore
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo marca, e
	 * controlliamo se non è vuoto.
	 * <p>
	 * Essendo che la marca del televisore dovrà necessariamente essere fornita
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza della marca passata dal utente come parametro.
	 * <p>
	 * Il valore di ritorno, assumerà il valore true se è stato modificato
	 * altrimenti false. Nel caso in cui il valore dell'attributo marca è vuoto
	 * stamperà un eccezione
	 * 
	 * @param marca Variabile di tipo String che contiene la marca da assegnare al
	 *              televisore
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione andata a buon fine oppure no
	 * 
	 * 
	 */

	@Override
	public boolean modificaMarcaTv(String marca) {
		Boolean result = false;
		try {
			if (this.marca != null) {
				if (StringUtils.isEmpty(marca)) {
					throw new NullPointerException();
				} else if (super.controlloMarca(marca.trim().toUpperCase())) {
					this.marca = MarcheTelevisori.valueOf(marca.trim().toUpperCase());
					result = true;
				}
			} else {
				throw new TelevisoreException();
			}

		} catch (TelevisoreException e) {
			System.err.println(e.messErrorModificaElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.MARCA)));
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println("| è stato inserito un valore nullo |");
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: modificaAltezzaTv </b>
	 * <p>
	 * Questo metodo consente di modificare l'altezza del televisore
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo altezza, e
	 * controlliamo se non è vuoto.
	 * <p>
	 * Essendo che l'altezza del televisore dovrà necessariamente essere fornita
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza dell'altezza passata dal utente come parametro.
	 * <p>
	 * Il valore di ritorno, assumerà il valore true se è stato modificato
	 * altrimenti false. Nel caso in cui il valore dell'attributo altezza è vuoto
	 * stamperà un eccezione
	 * 
	 * @param altezza Variabile di tipo String che contiene l'altezza da assegnare
	 *                al televisore
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione andata a buon fine oppure no
	 * 
	 * 
	 */

	@Override
	public boolean modificaAltezzaTv(String altezza) {
		Boolean result = false;
		try {
			if (this.altezza != 0) {
				if (StringUtils.isNotBlank(altezza)) {
					altezza = altezza.trim();
					if (controlloParamentriNumericiTv(altezza)) {
						if (Double.valueOf(altezza) <= ConstantGlobal.ALTEZZA_MASSIMA_TV
								&& Double.valueOf(altezza) >= ConstantGlobal.ALTEZZA_MINIMA_TV) {
							this.altezza = Double.valueOf(altezza);
							result = true;
						} else if (Double.valueOf(altezza) < ConstantGlobal.ALTEZZA_MINIMA_TV) {
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

		} catch (MinValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMinAltezza());
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.messErrorModificaElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.ALTEZZA)));
		} catch (MaxValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMaxAltezza());

		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println("E' stato inserito un valore nullo");
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: modificaLarghezzaTv </b>
	 * <p>
	 * Questo metodo consente di modificare la larghezza del televisore
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo larghezza, e
	 * controlliamo se non è vuoto.
	 * <p>
	 * Essendo che la larghezza del televisore dovrà necessariamente essere fornita
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza della larghezza passata dal utente come
	 * parametro.
	 * <p>
	 * Il valore di ritorno, assumerà il valore true se è stato modificato
	 * altrimenti false. Nel caso in cui il valore dell'attributo larghezza è vuoto
	 * stamperà un eccezione
	 * 
	 * @param larghezza Variabile di tipo String che contiene la larghezza da
	 *                  assegnare al televisore
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione andata a buon fine oppure no
	 * 
	 * 
	 */

	@Override
	public boolean modificaLarghezzaTv(String larghezza) {
		Boolean result = false;
		try {
			if (this.larghezza != 0) {
				if (StringUtils.isNotBlank(larghezza)) {
					larghezza = larghezza.trim();
					if (controlloParamentriNumericiTv(larghezza)) {
						if (Double.valueOf(larghezza) <= ConstantGlobal.LARGHEZZA_MASSIMA_TV
								&& Double.valueOf(larghezza) >= ConstantGlobal.LARGHEZZA_MINIMA_TV) {
							this.larghezza = Double.valueOf(larghezza);
							result = true;
						} else if (Double.valueOf(larghezza) < ConstantGlobal.LARGHEZZA_MINIMA_TV) {
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

		} catch (MinValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMinLarghezza());
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err
					.println(e.messErrorModificaElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.LARGHEZZA)));
		} catch (MaxValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMaxLarghezza());

		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println("E' stato inserito un valore nullo");
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: modificaNumberHdmiTv</b>
	 * <p>
	 * Questo metodo consente di modificare il numero di hdmi del televisore
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata da questo tipo di tipologia.
	 * 
	 * @return result Variabile ti tipo boolean che rappresenta se l'operazione è
	 *         andata a buon fine oppure no.
	 */

	@Override
	public boolean modificaNumberHdmiTv(String numeroHdmi) {
		Boolean result = false;
		try {
			throw new TelevisoreException();
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.ErrorTipologiaTelevisoreException());
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: modificaNumberUsbTv</b>
	 * <p>
	 * Questo metodo consente di modificare il numero di usb del televisore
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata da questo tipo di tipologia.
	 * 
	 * @return result Variabile ti tipo boolean che rappresenta se l'operazione è
	 *         andata a buon fine oppure no.
	 */
	@Override
	public boolean modificaNumberUsbTv(String numeroUsb) {
		Boolean result = false;
		try {
			System.err.println("| Errore nella visualizzazione |");
			throw new TelevisoreException();
		} catch (TelevisoreException e) {
			System.err.println(e.ErrorTipologiaTelevisoreException());
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: modificaDiagonaleTv </b>
	 * <p>
	 * Questo metodo consente di modificare la diagonale del televisore
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo diagonale, e
	 * controlliamo se non è vuoto.
	 * <p>
	 * Essendo che la diagonale del televisore dovrà necessariamente essere fornita
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza della diagonale passata dal utente come
	 * parametro.
	 * <p>
	 * Il valore di ritorno, assumerà il valore true se è stato modificato
	 * altrimenti false. Nel caso in cui il valore dell'attributo diagonale è vuoto
	 * stamperà un eccezione
	 * 
	 * @param diagonale Variabile di tipo String che contiene la diagonale da
	 *                  assegnare al televisore
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione andata a buon fine oppure no
	 * 
	 * 
	 */

	@Override
	public boolean modificaDiagonaleTv(String diagonale) {
		Boolean result = false;
		try {
			if (this.diagonale != 0) {
				if (StringUtils.isNotBlank(diagonale)) {
					diagonale = diagonale.trim();
					if (super.controlloParamentriNumericiTv(diagonale)) {
						if (Double.valueOf(diagonale) <= ConstantGlobal.DIAGONALE_MASSIMA_TV
								&& Double.valueOf(diagonale) >= ConstantGlobal.DIAGONALE_MINIMA_TV) {
							this.diagonale = Double.valueOf(diagonale);
							result = true;
						} else if (Double.valueOf(diagonale) < ConstantGlobal.DIAGONALE_MINIMA_TV) {
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

		} catch (MinValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMinDiagonale());
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err
					.println(e.messErrorModificaElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.DIAGONALE)));
		} catch (MaxValueException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println(e.ErrorMaxDiagonale());
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |\n");
			System.err.println("E' stato inserito un valore nullo");
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: modificaNumberSmartTv</b>
	 * <p>
	 * Questo metodo consente di modificare il numero di smart tv del televisore
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata da questo tipo di tipologia.
	 * 
	 * @return result Variabile ti tipo boolean che rappresenta se l'operazione è
	 *         andata a buon fine oppure no.
	 */

	@Override
	public boolean modificaNumberSmartTv(String numeroSmartTv) {
		Boolean result = false;
		try {
			throw new TelevisoreException();
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.ErrorTipologiaTelevisoreException());
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: modificaRisoluzioneTv </b>
	 * <p>
	 * Questo metodo consente di modificare la risoluzione del televisore
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo risoluzione, e
	 * controlliamo se non è vuoto.
	 * <p>
	 * Essendo che la risoluzione del televisore dovrà necessariamente essere
	 * fornita dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza della risoluzione passata dal utente
	 * come parametro.
	 * <p>
	 * Il valore di ritorno, assumerà il valore true se è stato modificato
	 * altrimenti false. Nel caso in cui il valore dell'attributo risoluzione è
	 * vuoto stamperà un eccezione
	 * 
	 * @param risoluzione Variabile di tipo String che contiene la risoluzione di
	 *                    schermo di tv da assegnare al televisore
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione andata a buon fine oppure no
	 * 
	 * 
	 */

	public boolean modificaRisoluzioneTv(String risoluzione) {
		Boolean result = false;
		try {
			if (this.risoluzione != null) {
				if (StringUtils.isEmpty(risoluzione)) {
					throw new NullPointerException();
				} else if (controlloRisoluzione(risoluzione.trim().replace(" ", "_").toUpperCase())) {
					this.risoluzione = ConstantGlobal.RISOLUZIONE_TV
							.valueOf(risoluzione.trim().replace(" ", "_").toUpperCase());
					result = true;
				}
			} else {
				throw new TelevisoreException();
			}

		} catch (TelevisoreException e) {
			System.err.println(
					e.messErrorModificaElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.RISOLUZIONE)));
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println("| è stato inserito un valore nullo |");
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: modificaTiposchermoTv </b>
	 * <p>
	 * Questo metodo consente di modificare il tipo di schermo del televisore
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo tipoSchermo, e
	 * controlliamo se non è vuoto.
	 * <p>
	 * Essendo che la tipologia di schermo del televisore dovrà necessariamente
	 * essere fornita dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza della marca passata dal utente come
	 * parametro.
	 * <p>
	 * Il valore di ritorno, assumerà il valore true se è stato modificato
	 * altrimenti false. Nel caso in cui il valore dell'attributo tipoSchermo è
	 * vuoto stamperà un eccezione
	 * 
	 * @param tipoSchermo Variabile di tipo String che contiene la tipologia di
	 *                    schermo di tv da assegnare al televisore
	 * @return result ariabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione andata a buon fine oppure no
	 * 
	 * 
	 */

	@Override
	public boolean modificaTiposchermoTv(String tipoSchermo) {
		Boolean result = false;
		try {
			if (this.tipoSchermo != null) {
				if (StringUtils.isEmpty(tipoSchermo)) {
					throw new NullPointerException();
				} else if (controlloTipologiaSchermo(tipoSchermo.trim().toUpperCase())) {
					this.tipoSchermo = ConstantGlobal.TIPOLOGIA_SCHERMO.valueOf(tipoSchermo.trim().toUpperCase());
					result = true;
				}

			} else {
				throw new TelevisoreException();
			}

		} catch (TelevisoreException e) {
			System.err.println(
					e.messErrorModificaElement(String.valueOf(ConstantGlobal.TIPOLOGIA_OPERAZIONE.TIPO_SCHERMO)));
		} catch (NullPointerException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println("| è stato inserito un valore nullo |");
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: eliminaMarcaTv </b>
	 * <p>
	 * Questo metodo consente di eliminare la marca del televisore
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo marca, e
	 * controlliamo se è vuoto.
	 * <p>
	 * Il valore di ritorno, assumerà il valore true se è stato cancellato
	 * altrimenti false. Nel caso in cui il valore dell'attributo marca è vuoto
	 * alzerà un eccezione
	 * 
	 * 
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione andata a buon fine oppure no.
	 * @throws TelevisoreException Sollevata nel caso in cui la marca del televisore
	 *                             è già nulla
	 * 
	 * 
	 */

	@Override
	public boolean eliminaMarcaTv() throws TelevisoreException {
		Boolean result = false;
		if (this.marca != null) {
			this.marca = null;
			result = true;
		} else {
			throw new TelevisoreException("la marca non può essere cancellata essendo già nulla");
		}
		return result;

	}

	/**
	 * 
	 * <b> METODO: eliminaAltezzaTv </b>
	 * <p>
	 * Questo metodo consente di eliminare l'altezza del televisore
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo altezza, e
	 * controlliamo se è vuoto.
	 * <p>
	 * Il valore di ritorno, assumerà il valore true se è stato cancellato
	 * altrimenti false. Nel caso in cui il valore dell'attributo altezza è vuoto
	 * alzerà un eccezione
	 * 
	 * 
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione andata a buon fine oppure no.
	 * @throws TelevisoreException Sollevata nel caso in cui l'altezza del
	 *                             televisore è già nulla
	 * 
	 * 
	 */
	@Override
	public boolean eliminaAltezzaTv() throws TelevisoreException {
		Boolean result = false;
		if (this.altezza != 0) {
			this.altezza = 0;
			result = true;
		} else {
			throw new TelevisoreException("l'altezza non può essere cancellata essendo già nulla");
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: eliminaLarghezzaTv </b>
	 * <p>
	 * Questo metodo consente di eliminare la larghezza del televisore
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo larghezza, e
	 * controlliamo se è vuoto.
	 * <p>
	 * Il valore di ritorno, assumerà il valore true se è stato cancellato
	 * altrimenti false. Nel caso in cui il valore dell'attributo larghezza è vuoto
	 * alzerà un eccezione
	 * 
	 * 
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione andata a buon fine oppure no.
	 * @throws TelevisoreException Sollevata nel caso in cui la larghezza del
	 *                             televisore è già nulla
	 * 
	 * 
	 */

	@Override
	public boolean eliminaLarghezzaTv() throws TelevisoreException {
		Boolean result = false;
		if (this.larghezza != 0) {
			this.larghezza = 0;
			result = true;
		} else {
			throw new TelevisoreException("la larghezza non può essere cancellata essendo già nulla");
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: eliminaNumberHdmiTv</b>
	 * <p>
	 * Questo metodo consente di eliminare il numero di hdmi del televisore
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata da questo tipo di tipologia.
	 * 
	 * @return result Variabile ti tipo boolean che rappresenta se l'operazione è
	 *         andata a buon fine oppure no.
	 */

	@Override
	public boolean eliminaNumberHdmiTv() {
		Boolean result = false;
		try {
			throw new TelevisoreException();
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.ErrorTipologiaTelevisoreException());
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: eliminaNumberUsbTv</b>
	 * <p>
	 * Questo metodo consente di eliminare il numero di usb del televisore
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata da questo tipo di tipologia.
	 * 
	 * @return result Variabile ti tipo boolean che rappresenta se l'operazione è
	 *         andata a buon fine oppure no.
	 */

	@Override
	public boolean eliminaNumberUsbTv() {
		Boolean result = false;
		try {
			throw new TelevisoreException();
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.ErrorTipologiaTelevisoreException());
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: eliminaDiagonaleTv </b>
	 * <p>
	 * Questo metodo consente di eliminare la diagonale del televisore
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo diagonale, e
	 * controlliamo se è vuoto.
	 * <p>
	 * Il valore di ritorno, assumerà il valore true se è stato cancellato
	 * altrimenti false. Nel caso in cui il valore dell'attributo diagonale è vuoto
	 * alzerà un eccezione
	 * 
	 * 
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione andata a buon fine oppure no.
	 * @throws TelevisoreException Sollevata nel caso in cui la diagonale del
	 *                             televisore è già nulla
	 * 
	 * 
	 */

	@Override
	public boolean eliminaDiagonaleTv() throws TelevisoreException {
		Boolean result = false;
		if (this.diagonale != 0) {
			this.diagonale = 0;
			result = true;
		} else {
			throw new TelevisoreException("la diagonale della tv non può essere cancellata essendo già nulla");
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: eliminaNumberSmartTv</b>
	 * <p>
	 * Questo metodo consente di eliminare il numero di smart Tv del televisore
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata da questo tipo di tipologia.
	 * 
	 * @return result Variabile ti tipo boolean che rappresenta se l'operazione è
	 *         andata a buon fine oppure no.
	 */

	@Override
	public boolean eliminaNumberSmartTv() {
		Boolean result = false;
		try {
			throw new TelevisoreException();
		} catch (TelevisoreException e) {
			System.err.println("| Errore nell'inserimento |");
			System.err.println(e.ErrorTipologiaTelevisoreException());
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: eliminaRisoluzioneTv </b>
	 * <p>
	 * Questo metodo consente di eliminare la risoluzione dello schermo del
	 * televisore
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo risoluzione, e
	 * controlliamo se è vuoto.
	 * <p>
	 * Il valore di ritorno, assumerà il valore true se è stato cancellato
	 * altrimenti false. Nel caso in cui il valore dell'attributo risoluzione è
	 * vuoto alzerà un eccezione
	 * 
	 * 
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione andata a buon fine oppure no.
	 * @throws TelevisoreException Sollevata nel caso in cui la risoluzione del
	 *                             televisore è già nulla
	 * 
	 * 
	 */

	@Override
	public boolean eliminaRisoluzioneTv() throws TelevisoreException {
		Boolean result = false;
		if (this.risoluzione != null) {
			this.risoluzione = null;
			result = true;
		} else {
			throw new TelevisoreException("la risoluzione non può essere cancellata essendo già nulla");
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: eliminaTiposchermoTv </b>
	 * <p>
	 * Questo metodo consente di eliminare il tipo di schermo del televisore
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo tipoSchermo, e
	 * controlliamo se è vuoto.
	 * <p>
	 * Il valore di ritorno, assumerà il valore true se è stato cancellato
	 * altrimenti false. Nel caso in cui l'attributo tipoSchermo è vuoto alzerà un
	 * eccezione
	 * 
	 * 
	 * @return result Variabile ti tipo boolean che rappresenta se l'operazione è
	 *         andata a buon fine oppure no.
	 * @throws TelevisoreException Sollevata nel caso in cui la tipologia di schermo
	 *                             del televisore è già nulla
	 * 
	 * 
	 */

	@Override
	public boolean eliminaTiposchermoTv() throws TelevisoreException {
		Boolean result = false;
		if (this.tipoSchermo != null) {
			this.tipoSchermo = null;
			result = true;
		} else {
			throw new TelevisoreException("Il tipo dello schermo della tv non può essere cancellata essendo già nulla");
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: visualizzaMarca </b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante la marca del televisore.
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo marca, e lo
	 * restituiamo al chiamante.
	 * <p>
	 * Il valore di ritorno, è appunto, l del televisore.
	 * 
	 * 
	 * 
	 * @return marca MarcheTelevisori che rappresenta la marca del televisore.
	 * 
	 * 
	 * 
	 */

	@Override
	public MarcheTelevisori visualizzaMarca() {
		return this.marca;
	}

	/**
	 * 
	 * <b> METODO: visualizzaAltezza </b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante l'altezza massima del
	 * televisore.
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo altezza, e lo
	 * restituiamo al chiamante.
	 * <p>
	 * Il valore di ritorno, è appunto, l'altezza massima del televisore.
	 * 
	 * 
	 * 
	 * @return altezza double che rappresenta l'altezza massima del televisore.
	 * 
	 * 
	 * 
	 */

	@Override
	public double visualizzaAltezza() {
		return this.altezza;
	}

	/**
	 * 
	 * <b> METODO: visualizzaLarghezza </b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante la larghezza massima del
	 * televisore.
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo larghezza, e
	 * lo restituiamo al chiamante.
	 * <p>
	 * Il valore di ritorno, è appunto, la larghezza massima del televisore.
	 * 
	 * 
	 * 
	 * @return larghezza double che rappresenta la larghezza massima del televisore.
	 * 
	 * 
	 * 
	 */

	@Override
	public double visualizzaLarghezza() {
		return this.larghezza;
	}

	/**
	 * 
	 * <b> METODO: visualizzaDiagonale </b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante la lunghezza della diagonale
	 * del televisore.
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo diagonale, e
	 * lo restituiamo al chiamante.
	 * <p>
	 * Il valore di ritorno, è appunto, la lunghezza della diagonale del televisore.
	 * 
	 * 
	 * 
	 * @return diagonale double che rappresenta la lunghezza della diagonale del
	 *         televisore.
	 * 
	 * 
	 * 
	 */
	@Override
	public double visualizzaDiagonale() {
		return this.diagonale;
	}

	/**
	 * 
	 * <b> METODO: visualizzaSeriale </b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante il seriale univoco a cui è
	 * associato il televisore.
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo seriale, e lo
	 * restituiamo al chiamante.
	 * <p>
	 * Il valore di ritorno, è appunto, il seriale univoco del televisore.
	 * 
	 * 
	 * 
	 * @return seriale String che rappresenta il codice univoco associato al
	 *         televisore.
	 * 
	 * 
	 * 
	 */

	@Override
	public String visualizzaSeriale() {
		return this.seriale;
	}

	/**
	 * 
	 * <b> METODO: visualizzaRisoluzione </b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante la risoluzione dello schermo
	 * del televisore.
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo risoluzione, e
	 * lo restituiamo al chiamante.
	 * <p>
	 * Il valore di ritorno, è appunto, la risoluzione dello schermo del televisore.
	 * 
	 * 
	 * 
	 * @return risoluzione RISOLUZIONE_TV che rappresenta la risoluzione dello
	 *         schermo del televisore.
	 * 
	 * 
	 * 
	 */

	@Override
	public RISOLUZIONE_TV visualizzaRisoluzione() {
		return this.risoluzione;
	}

	/**
	 * 
	 * <b> METODO: visualizzaTipologiaTv </b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante la tipologia dello schermo
	 * del televisore.
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo tipoSchermo, e
	 * lo restituiamo al chiamante.
	 * <p>
	 * Il valore di ritorno, è appunto, la tipologia dello schermo del televisore.
	 * 
	 * 
	 * 
	 * @return tipoSchermo TIPOLOGIA_SCHERMO che rappresenta la tipologia dello
	 *         schermo del televisore.
	 * 
	 * 
	 * 
	 */

	@Override
	public TIPOLOGIA_SCHERMO visualizzaTipoSchermo() {
		return this.tipoSchermo;
	}

	/**
	 * 
	 * <b> METODO: visualizzaTipologiaTv </b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante la tipoliogia di televisore.
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo tipo, e lo
	 * restituiamo al chiamante.
	 * <p>
	 * Il valore di ritorno, è appunto, la tipologia del televisore.
	 * 
	 * 
	 * 
	 * @return tipo TIPOLOGIA_TV che rappresenta la tipologia del televisore a cui
	 *         appartiene.
	 * 
	 * 
	 */
	@Override
	public TIPOLOGIA_TV visualizzaTipologiaTv() {
		return this.tipo;
	}

	/**
	 * 
	 * <b> METODO: visualizzaNumeroUsb</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante l'intero contenente il
	 * numero di usb del televisore.
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata da questa tipologia di tv.
	 * 
	 * @return 0, Variabile di tipo int contente il numero di usb appartente al
	 *         televisore.
	 */

	@Override
	public int visualizzaNumeroUsb() {
		try {
			System.err.println("| Errore nella visualizzazione |");
			throw new TelevisoreException();
		} catch (TelevisoreException e) {
			System.err.println(e.ErrorTipologiaTelevisoreException());
		}
		return 0;
	}

	/**
	 * 
	 * <b> METODO: visualizzaNumeroHdmi</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante l'intero contenente il
	 * numero di hdmi del televisore.
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata da questa tipologia di tv.
	 * 
	 * @return 0, Variabile di tipo int contente il numero di hdmi appartente al
	 *         televisore.
	 */

	@Override
	public int visualizzaNumeroHdmi() {
		try {
			System.err.println("| Errore nella visualizzazione |");
			throw new TelevisoreException();
		} catch (TelevisoreException e) {
			System.err.println(e.ErrorTipologiaTelevisoreException());
		}
		return 0;
	}

	/**
	 * 
	 * <b> METODO: visualizzaNumeroSmartTv</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante l'intero contenente il
	 * numero di smart tv del televisore.
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata da questo tipo di tipologia.
	 * 
	 *
	 * @return 0, Variabile di tipo int contente il numero di smart tv appartente al
	 *         televisore.
	 */
	@Override
	public int visualizzaNumeroSmartTv() {
		try {
			System.err.println("| Errore nella visualizzazione |");
			throw new TelevisoreException();
		} catch (TelevisoreException e) {
			System.err.println(e.ErrorTipologiaTelevisoreException());
		}
		return 0;
	}

}
