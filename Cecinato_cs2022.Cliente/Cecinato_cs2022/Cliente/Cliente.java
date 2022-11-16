package Cecinato_cs2022.Cliente;

import java.io.Serializable;
import java.math.BigInteger;
import java.text.ParseException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.lang3.StringUtils;

import Cecinato_cs2022.ClienteException.ClienteException;
import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.ConstantGlobal.ConstantGlobal.TIPO_CONTRATTO;
import Cecinato_cs2022.ControlliGlobal.ControlliGlobal;
import Cecinato_cs2022.Dipendente.Riparazione;
import Cecinato_cs2022.Dipendente.Vendita;
import Cecinato_cs2022.DipendenteException.DipendenteException;
import Cecinato_cs2022.DipendenteException.RiparazioneException;
import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;
import Cecinato_cs2022.ExceptionPersona.PersonaException;
import Cecinato_cs2022.Persona.AbstractPersona;
import Cecinato_cs2022.TelevisoreService.Televisore;

/**
 * 
 * <p>
 * <b> CLASSE: Cliente </b>
 * <p>
 * Questa classe ha lo scopo di definire tutte le caratteristiche di tutti i
 * clienti.
 * <p>
 * Si precisa che la corrente classe implementa le operazioni dalla classe
 * astratta AbstractPersona, questa classe implementerà tutte le funzionalità
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


public class Cliente extends AbstractPersona implements Serializable {

	/// ********************************************
	/// ATTRIBUTI
	/// ********************************************

	private static final long serialVersionUID = 1L;
	/**
	 * il {@link String} instanzia che indica il codice fiscale del cliente.
	 */
	private String codiceFiscale;

	/**
	 * il {@link String} instanzia che indica il nome della carta di fedeltà del
	 * cliente.
	 */
	private String nomeCartaFedelta;
	/**
	 * il {@link String} instanzia che indica i punti di fedeltà del cliente.
	 */
	private String puntiFedelta;
	/**
	 * la {@link String} instanzia che indica la data di inscrizione della tessera
	 * del cliente.
	 */
	private String dataInscrizioneTessera;
	/**
	 * il {@link String} instanzia che indica il nome della carta di fedeltà del
	 * cliente.
	 */
	private String numeroCartaFedelta;
	/**
	 * il {@link BigInteger} instanzia che indica il numero massimo del numero della
	 * carta del cliente.
	 */
	private static BigInteger maxLimit = new BigInteger(ConstantGlobal.LUNGHEZZA_MASSIMA_NUMERO_CARTA_FEDELTA);
	/**
	 * il {@link BigInteger} instanzia che indica il numero minimo del numero della
	 * carta del cliente.
	 */
	private static BigInteger minLimit = new BigInteger(ConstantGlobal.LUNGHEZZA_MINIMA_NUMERO_CARTA_FEDELTA);
	/**
	 * l' {@link Set<String>} instanzia che contiente l'elenco di codici fiscali dei
	 * clienti instanziati.
	 */
	protected static Set<String> elencoCodiceFiscale = new TreeSet<String>();

	/**
	 * il {@link Set<String>} instanzia che contiente l'elenco numero delle carte
	 * generate generate.
	 */
	static private Set<String> NumeroCarteCreate = new HashSet<String>();

	/**
	 * 
	 * <b> COSTRUTTORE: Cliente </b>
	 * <p>
	 * Questo è il costruttore della classe Cliente. <br>
	 * In particolare, tale costrutture avrà un sono paramentro codiceFiscale, che
	 * indicherà l'unicità del cliente.<br>
	 * Il codice fiscale passato come parametro verrà controllato se è già presente
	 * o formalemnte corretto.<br>
	 * Se rispetta tutte le conformità allora verrà aggiunto nella lista dei codici
	 * fiscali univoci attraverso la nomenclatura super() e l'oggetto persona verrà
	 * instanziato. Altrimenti genererà un eccezione. In oltre, ogni singolo
	 * attributo sarà valorizzato con l'apposito metodo add. La valorizzazione dei
	 * singoli attributi è effettuata attraverso la parola riservata "this" che
	 * specifica il riferimento all'oggetto corrente che invoca tale costruttore.
	 * 
	 * @param CodiceFiscale Variabile di tipo stringa che contiene il codice fiscale
	 *                      del cliente inserito dall'utente.
	 * @throws PersonaException Sollevata nel caso in cui il codice fiscale del
	 *                          cliente è già esistente o errato
	 * 
	 */

	public Cliente(String CodiceFiscale) throws PersonaException {
		super();
		if (controlloCodiceFiscale(CodiceFiscale)) {
			this.codiceFiscale = CodiceFiscale;
			elencoCodiceFiscale.add(codiceFiscale);
		}
	}

	/**
	 * 
	 * <b> OPERAZIONE: setCodiceFiscale </b>
	 * <p>
	 * Quest'operazione ha lo scopo di settare il codice fiscale del cliente
	 * attraverso il parametro codiceFiscale e assegnarla al cliente<br>
	 * 
	 * @param codiceFiscale Variabile di tipo stringa che contiene il codice fiscale
	 *                      del cliente inserito dall'utente.
	 * 
	 * 
	 */

	private void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	@Override
	public String toString() {
		String stringa = null;
		try {

			stringa = String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_CLIENTE, "_"))
					.concat("\n");
			stringa += String.format("| %110s %10s %93s", ConstantGlobal.TITOLO_TABELLA_CLIENTE, this.codiceFiscale,
					"|\n");
			stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_CLIENTE, "_"))
					.concat("\n");
			stringa += ConstantGlobal.TABELLA_CLIENTE;
			stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_CLIENTE, "_"))
					.concat("\n");

			stringa += String.format(
					"| %18s %5s %10s %5s %9s %5s %6s %5s %9s %4s %11s %5s %9s %5s %20s %6s %17s %10s %13s %5s %12s %11s \n",
					VisualizzaCodiceFiscale(), " | ", super.VisualizzaNome(), " | ", super.VisualizzaCognome(), " | ",
					super.VisualizzaEta(), " | ", super.VisualizzaGenere(), " | ", super.VisualizzaDataNascita(), " | ",
					super.VisualizzaCitta(), " | ", VisualizzaNomeCartaFedelta(), " | ",
					VisualizzaDataInscrizioneTessera(), " | ", VisualizzaNumeroCartaFedelta(), " | ",
					VisualizzaPuntiFedeltaAccumulati(), " | ");

			stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_CLIENTE, "_"))
					.concat("\n");
		} catch (DipendenteException e) {
			System.err.println();
		}
		return stringa;
	}

	/**
	 * 
	 * <b> OPERAZIONE: controlloCodiceFiscale </b>
	 * <p>
	 * Quest'operazione consente di controllare se il codice fiscale corretto e che
	 * non sia già presente nella lista di seriali.<br>
	 * Il codice fiscale deve rispettare questo formato AAAAAA00A00A0000 dove le "A"
	 * sono i caratteri e "0" somo i numeri. In oltre la stringa del codice fiscale
	 * deve essere di 16 caratteri.
	 * 
	 * @param codiceFiscale Variabile di tipo stringa che contiene il codice fiscale
	 *                      del cliente da controllare,
	 * 
	 * @return result Variabile boolena che ritorna se il codice fiscale è corretto
	 *         ed non esiste già
	 */

	protected boolean controlloCodiceFiscale(String codiceFiscale) throws PersonaException {
		boolean result = true;
		if (StringUtils.isNotBlank(codiceFiscale)
				&& codiceFiscale.matches(ConstantGlobal.REGEX_CONTROLLO_CODICE_FISCALE)) { // controllo correttezza
																							// formato
			Iterator<String> element = elencoCodiceFiscale.iterator();
			while (element.hasNext()) {
				if (StringUtils.equals(element.next(), codiceFiscale)) // controllo se è presente nella lista
					result = false;
			}
			if (!result) {
				throw new PersonaException("Il codice fiscale esiste già");
			}
		} else {
			throw new PersonaException("Il codice fiscale è errato");
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: controlloNumeroCartafedelta </b>
	 * <p>
	 * Quest'operazione consente ci controllare se il il numero di carta di fedeltà
	 * non sia gia presente nella lista dei numero delle carte fedeltà.
	 * 
	 * 
	 * @param numeroCarta Variabile di tipo stringa che contiene numero di carta di
	 *                    fedeltà del cliente da controllare,
	 * 
	 * @return result Variabile boolena che ritorna se il numero di carta di fedeltà
	 *         esiste già
	 */

	final boolean controlloNumeroCartafedelta(String numeroCarta) {
		boolean result = true;
		if (StringUtils.isNotBlank(numeroCarta)) {
			Iterator<String> element = NumeroCarteCreate.iterator();
			while (element.hasNext()) {
				if (StringUtils.equals(element.next(), numeroCarta)) /// controlla sei il numero di carta di fedeltà è
																		/// presente nella lista di numeri di carte
					result = false;
			}
			if (result) {
				NumeroCarteCreate.add(numeroCarta); /// se nella lista il numero della carta non è presente, viene
													/// aggiunto il numero della carta passata
			}
		} else {
			NumeroCarteCreate.add(numeroCarta); /// se la lista è vuota, viene aggiunto il numero della carta passata
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: generaNumeroCartafedelta</b>
	 * <p>
	 * Quest'operazione consente di generare il numero della carta di fedeltà. il
	 * numero di carta sarà compreso tra 100000000000 e 99999999999;
	 *
	 * 
	 * @return result Variabile stringa contente il numero di carta generata
	 *         randomicamente.
	 */

	private String generaNumeroCartafedelta() {
		Random rn = new Random();
		boolean result = false;
		BigInteger bigInteger = maxLimit.subtract(minLimit); /// imposto il range
		int len = maxLimit.bitLength();
		BigInteger res = null;
		do {
			res = new BigInteger(len, rn);
			if (res.compareTo(minLimit) < 0)
				res = res.add(minLimit);
			if (res.compareTo(bigInteger) >= 0)
				res = res.mod(bigInteger).add(minLimit);
			result = controlloNumeroCartafedelta(String.valueOf(res)); /// controllo se il numero generato è gia
																		/// presente
		} while (result == false);
		return String.valueOf(res);
	}

	/**
	 * 
	 * <b> METODO: eliminaCodiceFiscale </b>
	 * <p>
	 * Questo metodo consente di eliminare il codice fiscale dall'elenco dei codici
	 * fiscali instanziati.
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo codiceFiscale,
	 * e controlliamo se è presente nella lista di codici fiscali instanziati.
	 * <p>
	 * Il valore di ritorno, assumerà il valore true se è stato cancellato
	 * 
	 * 
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione andata a buon fine oppure no
	 * 
	 * 
	 */

	private boolean eliminaCodiceFiscale() throws PersonaException {
		boolean result = false;
		Iterator<String> element = elencoCodiceFiscale.iterator();
		while (element.hasNext()) {
			if (StringUtils.equals(element.next(), this.codiceFiscale)) {
				element.remove();
				result = true;

			}
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: visualizzaElencoOperazioniPunti</b>
	 * <p>
	 * Questo metodo consente di far visualizzare l'elenco delle operazioni che si
	 * possono fare sui punti di fedeltà
	 * 
	 */

	public void visualizzaElencoOperazioniPunti() throws DipendenteException {
		int i = 1;
		for (ConstantGlobal.OPERAZIONE_PUNTI_FEDELTA item : ConstantGlobal.OPERAZIONE_PUNTI_FEDELTA.values()) {
			System.out.println(String.valueOf(i).concat(") ").concat(String.valueOf(item)).toLowerCase());
			i += 1;
		}
	}

	/**
	 * 
	 * <b> OPERAZIONE: addNomeCartaFedelta </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire il nome della carta di fedeltà del
	 * cliente attraverso il parametro nomeCartaFedelta e assegnarla al cliente<br>
	 * Essendo che il nome della carta del cliente dovrà necessariamente essere
	 * fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Verranno quindi effettuati due controlli: 1) il nome della carta di fedeltà
	 * deve essere vuoto ( se è piena l'utente deve utilizzare la funzione modifica)
	 * 2) il valore contenuto nel paramentro nomeCartaFedeltà contiene solo stringhe
	 * 
	 * @param nomeCartaFedelta Variabile di tipo stringa che contiene il nome della
	 *                         carta di fedeltà del cliente inserito dall'utente.
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	@Override
	public boolean addNomeCartaFedelta(String nomeCartaFedelta) throws ClienteException, DipendenteException {
		boolean result = false;
		if (StringUtils.isNotBlank(nomeCartaFedelta) && StringUtils.isAlphaSpace(nomeCartaFedelta)) {
			if (StringUtils.isEmpty(this.nomeCartaFedelta)) {
				this.nomeCartaFedelta = ControlliGlobal.upperCaseFirst(nomeCartaFedelta.trim());
				result = true;
			} else {
				throw new ClienteException(
						"errore, non può essere aggiunto il nome della carta di fedeltà del cliente perchè  è stato già inserito");
			}
		} else {
			throw new ClienteException("Errore nell'inserimento del nome della carta di fedeltà del cliente ");
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: addPuntiFedeltaAccumulati </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire i punti di fedeltà del cliente
	 * attraverso il parametro puntiFedelta e assegnarla al cliente<br>
	 * Essendo che i punti di fedeltà del cliente dovrà necessariamente essere
	 * fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Verranno quindi effettuati tre controlli: 1) il punti di fedeltà deve essere
	 * vuoto ( se è piena l'utente deve utilizzare la funzione modifica) 2) il
	 * valore contenuto nel paramentro puntiFedelta è un numero intero ed è maggiore
	 * di 0
	 * 
	 * @param puntiFedelta Variabile di tipo stringa che contiene i punti della
	 *                     carta di fedeltà del cliente inseriti dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	@Override
	public boolean addPuntiFedeltaAccumulati(String puntiFedelta) throws ClienteException, DipendenteException {
		boolean result = false;
		if (StringUtils.isNotBlank(puntiFedelta)
				&& puntiFedelta.trim().matches(ConstantGlobal.REGEX_CONTROLLO_INTERO)) {
			if (StringUtils.isEmpty(this.puntiFedelta)) {
				if (ConstantGlobal.NUMERO_MASSIMO_PUNTI_AGGIUNTI >= Long.valueOf(puntiFedelta.trim())) {
					this.puntiFedelta = puntiFedelta.trim();
					result = true;
				} else {
					throw new ClienteException(
							"errore, non possono essere aggiunti  i punti fedeltà del cliente perchè i punti inseriti superano il valore massimo di: "
									+ ConstantGlobal.NUMERO_MASSIMO_PUNTI_AGGIUNTI);
				}
			} else {
				throw new ClienteException(
						"errore, non possono essere aggiunti  i punti fedeltà del cliente perchè sono stati già inseriti");
			}
		} else {
			throw new ClienteException("Errore nell'inserimento dei punti fedeltà cliente ");
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: addDataInscrizioneTessera </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire la data di inscrizione del cliente
	 * attraverso il parametro dataInscrizioneTessera e assegnarla al cliente<br>
	 * Essendo che  la data di inscrizione del cliente dovrà necessariamente essere
	 * fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Verranno quindi effettuati tre controlli: 1) la data di inscrizione deve essere
	 * vuoto ( se è piena l'utente deve utilizzare la funzione modifica) 2) il
	 * valore contenuto nel paramentro dataInscrizioneTessera ha questo tipo di formato gg/mm/aaaa
	 * 
	 * 
	 * @param dataInscrizioneTessera Variabile di tipo stringa che contiene la data di inscrizione della carta
	 *                     carta di fedeltà del cliente inseriti dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */
	
	@Override
	public boolean addDataInscrizioneTessera(String dataInscrizioneTessera)
			throws ClienteException, DipendenteException {
		boolean result = false;
		if (StringUtils.isNoneBlank(dataInscrizioneTessera)
				&& dataInscrizioneTessera.trim().matches(ConstantGlobal.REGEX_CONTROLLO_DATA)) {
			if (StringUtils.isEmpty(this.dataInscrizioneTessera)) {
				this.dataInscrizioneTessera = dataInscrizioneTessera.trim();
				result = true;
			} else {
				throw new ClienteException(
						"errore, non può essere aggiunta la data di inscrizione della tessera del cliente perchè  è stata già inserita");
			}
		} else {
			throw new ClienteException(
					"Errore nell'inserimento della data di inscrizione della carta di fedeltà del cliente ");
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: addNumeroCartaFedelta</b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire il nome della carta di fedeltà del
	 * cliente. I Questo metodo consente di generare randomicamente il numero della
	 * carta di fedeltà
	 * 
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione.
	 * 
	 * 
	 */

	@Override
	public boolean addNumeroCartaFedelta() throws ClienteException, DipendenteException {
		boolean result = false;
		if (this.numeroCartaFedelta == null) {
			this.numeroCartaFedelta = generaNumeroCartafedelta();
			result = true;
		} else {
			throw new ClienteException(
					"errore, non può essere aggiunto il numero della carta di fedeltà del cliente perchè  è stato già inserito");
		}
		return result;

	}

	/**
	 * 
	 * <b> METODO: VisualizzaNomeCartaFedelta</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante la Stringa contente il nome
	 * della carta di fedeltà del cliente.
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo
	 * nomeCartaFedelta, e lo restituiamo al chiamante.
	 * 
	 * @return nomeCartaFedelta, Variabile di tipo String contente il nome della
	 *         carta di fedeltà appartente al cliente.
	 */

	@Override
	public String VisualizzaNomeCartaFedelta() throws DipendenteException {
		return this.nomeCartaFedelta;

	}

	/**
	 * 
	 * <b> METODO: VisualizzaPuntiFedeltaAccumulati</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante la Stringa contente i punti
	 * della carta di fedeltà del cliente.
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo puntiFedelta,
	 * e lo restituiamo al chiamante.
	 * 
	 * @return puntiFedelta, Variabile di tipo String contente i punti della carta
	 *         di fedeltà appartente al cliente.
	 */

	@Override
	public String VisualizzaPuntiFedeltaAccumulati() throws DipendenteException {
		return this.puntiFedelta;
	}

	/**
	 * 
	 * <b> METODO: VisualizzaDataInscrizioneTessera</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante la Stringa contente la da
	 * data di inscrizione del cliente.
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo
	 * dataInscrizioneTessera, e lo restituiamo al chiamante.
	 * 
	 * @return dataInscrizioneTessera, Variabile di tipo String contente la data di
	 *         inscrizione appartente al cliente.
	 */

	@Override
	public String VisualizzaDataInscrizioneTessera() throws DipendenteException {
		return this.dataInscrizioneTessera;
	}

	/**
	 * 
	 * <b> METODO: VisualizzaNumeroCartaFedelta</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante la Stringa contente il
	 * numero di carta di fedeltà del cliente.
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo
	 * numeroCartaFedelta, e lo restituiamo al chiamante.
	 * 
	 * @return numeroCartaFedelta, Variabile di tipo String contente il numero della
	 *         carta di fedeltà appartente al cliente.
	 */

	@Override
	public String VisualizzaNumeroCartaFedelta() throws DipendenteException {
		return this.numeroCartaFedelta;

	}

	/**
	 * 
	 * <b> METODO: VisualizzaCodiceFiscale</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante la Stringa contente il
	 * codice fiscale del cliente.
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo codiceFiscale, e lo restituiamo al chiamante.
	 * 
	 * @return codiceFiscale, Variabile di tipo String contente il codice fiscale
	 *         appartente al cliente.
	 */

	@Override
	public String VisualizzaCodiceFiscale() throws DipendenteException {
		return this.codiceFiscale;
	}

	/**
	 * 
	 * <b> METODO: eliminaNomeCartaFedelta </b>
	 * <p>
	 * Questo metodo consente di eliminare i punti accumulati del nome del cliente
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo
	 * nomeCartaFedelta, e controlliamo se è vuoto.
	 * <p>
	 * Il valore di ritorno, assumerà il valore true se è stato cancellato
	 * altrimenti false. Nel caso in cui il valore dell'attributo nomeCartaFedelta è
	 * vuoto alzerà un eccezione
	 * 
	 * 
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione andata a buon fine oppure no
	 * 
	 * 
	 */

	@Override
	public boolean eliminaNomeCartaFedelta() throws ClienteException, DipendenteException {
		boolean result = false;
		if (StringUtils.isNotBlank(this.nomeCartaFedelta)) {
			this.nomeCartaFedelta = null;
			result = true;
		} else {
			throw new ClienteException(
					"errore, non può essere cancellato il nome della carta fedeltà del cliente perchè non è stato ancora inserito");
		}

		return result;

	}

	/**
	 * 
	 * <b> METODO: eliminaPuntiAccumulati </b>
	 * <p>
	 * Questo metodo consente di eliminare i punti accumulati della tessera del
	 * cliente
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo puntiFedelta,
	 * e controlliamo se è vuoto.
	 * <p>
	 * Il valore di ritorno, assumerà il valore true se è stato cancellato
	 * altrimenti false. Nel caso in cui il valore dell'attributo puntiFedelta è
	 * vuoto alzerà un eccezione
	 * 
	 * 
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione andata a buon fine oppure no
	 * 
	 * 
	 */

	@Override
	public boolean eliminaPuntiAccumulati() throws ClienteException, DipendenteException {
		boolean result = false;
		if (StringUtils.isNotBlank(this.puntiFedelta)) {
			this.puntiFedelta = null;
			result = true;
		} else {
			throw new ClienteException(
					"errore, non possono essere cancellatii punti accumulati del cliente perchè non sono stati ancora inseriti");
		}

		return result;

	}

	/**
	 * 
	 * <b> METODO: eliminaDataInscrizioneTessera </b>
	 * <p>
	 * Questo metodo consente di eliminare la data di inscrizione della tessera del
	 * cliente
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo
	 * dataInscrizioneTessera, e controlliamo se è vuoto.
	 * <p>
	 * Il valore di ritorno, assumerà il valore true se è stato cancellato
	 * altrimenti false. Nel caso in cui il valore dell'attributo
	 * dataInscrizioneTessera è vuoto alzerà un eccezione
	 * 
	 * 
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione andata a buon fine oppure no
	 * 
	 * 
	 */

	@Override
	public boolean eliminaDataInscrizioneTessera() throws ClienteException, DipendenteException {
		boolean result = false;
		if (StringUtils.isNotBlank(this.dataInscrizioneTessera)) {
			this.dataInscrizioneTessera = null;
			result = true;
		} else {
			throw new ClienteException(
					"errore, non può essere cancellata la data di inscrizione della tessera  del cliente perchè non è stata ancora inserita");
		}

		return result;

	}

	/**
	 * 
	 * <b> METODO: eliminaNumeroCartaFedelta </b>
	 * <p>
	 * Questo metodo consente di eliminare il numero di carta di fedeltà del cliente
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo
	 * numeroCartaFedelta, e controlliamo se è vuoto.
	 * <p>
	 * Il valore di ritorno, assumerà il valore true se è stato cancellato
	 * altrimenti false. Nel caso in cui il valore dell'attributo numeroCartaFedelta
	 * è vuoto alzerà un eccezione
	 * 
	 * 
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione andata a buon fine oppure no
	 * 
	 * 
	 */

	@Override
	public boolean eliminaNumeroCartaFedelta() throws ClienteException, DipendenteException {
		boolean result = false;
		if (this.numeroCartaFedelta != null) {
			Iterator<String> element = NumeroCarteCreate.iterator();
			while (element.hasNext()) {
				if (element.next().equals(this.numeroCartaFedelta)) {
					element.remove();
				}

			}
			this.numeroCartaFedelta = null;
			result = true;
		} else {
			throw new ClienteException(
					"errore, non può essere cancellato il numero della carta fedeltà del cliente perchè non è stato ancora inserito");
		}
		return result;

	}

	/**
	 * 
	 * <b> OPERAZIONE: modificaNomeCartaFedelta </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare il nome della carta di fedeltà del
	 * cliente attraverso il parametro nomeCartaFedelta e assegnato al cliente <br>
	 * Essendo che il nome della carta di fedelta del cliente dovrà necessariamente
	 * essere fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * 
	 * 
	 * @param nomeCartaFedelta Variabile di tipo stringa che contiene il nome della
	 *                         carta di fedeltà cliente inserito dall'utente.
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione.
	 * 
	 * 
	 */

	@Override
	public boolean modificaNomeCartaFedelta(String nomeCartaFedelta) throws ClienteException, DipendenteException {
		boolean result = false;
		if (StringUtils.isNotBlank(this.nomeCartaFedelta) && StringUtils.isAlphaSpace(nomeCartaFedelta)) {
			this.nomeCartaFedelta = ControlliGlobal.upperCaseFirst(nomeCartaFedelta.trim());
			result = true;
		} else {
			throw new ClienteException(
					"errore, non può essere aggiunto il numero della carta di fedeltà del cliente perchè  è stato già inserito");
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: modificaPuntiFedeltaAccumulati </b>
	 * <p>
	 * Questo metodo consente di modificare i punti fedeltà puntiFedelta cliente. Si
	 * possono fare 3 tipi di operazioni sui punti di fedeltà: 1) aggiungere 2)
	 * sottrarre 3) sostituire i punti con altri
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo puntiFedelta,
	 * e l'operazione da effetture.
	 * <p>
	 * Essendo che sia i punti di fedeltà che le operazioni da effetturare sui punti
	 * del cliente, dovranno essere necessariamente forniti dall'utente, dunque, si
	 * rendono necessari dei controlli per verificarne l'esattezza e la correttezza
	 * di questi passatti dall' utente come parametro.
	 * <p>
	 * Il valore di ritorno, assumerà il valore true se è stato modificato
	 * altrimenti false. Nel caso in cui il valore dell'attributo punti fedeltà o
	 * operazione è vuoto stampando un eccezione
	 * 
	 * @param puntiFedelta Variabile di tipo String che contiene i punti fedeltà da
	 *                     assegnare al cliente
	 * @param operazione   Variabile di tipo OPERAZIONE_PUNTI_FEDELTA che contiene
	 *                     l'operazione da effetture sul cliente
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione andata a buon fine oppure no
	 * 
	 * 
	 */

	@Override
	public boolean modificaPuntiFedeltaAccumulati(String puntiFedelta,
			ConstantGlobal.OPERAZIONE_PUNTI_FEDELTA operazione) throws ClienteException, DipendenteException {
		boolean result = false;
		if (StringUtils.isNotBlank(puntiFedelta)
				&& puntiFedelta.trim().matches(ConstantGlobal.REGEX_CONTROLLO_INTERO)) { /// controllo la correttezza
																							/// dei punti di fedeltà
			if (this.puntiFedelta != null) {
				switch (operazione) {
				case AGGIUNGI:
					if (ConstantGlobal.NUMERO_MASSIMO_PUNTI_AGGIUNTI >= Long.valueOf(puntiFedelta.trim())) {
						Long somma = Long.valueOf(this.puntiFedelta) + Long.valueOf(puntiFedelta.trim());
						this.puntiFedelta = String.valueOf(somma);
						result = true;
					} else {
						throw new ClienteException(
								"errore, non possono essere aggiunti  i punti fedeltà del cliente perchè i punti inseriti superano il valore massimo di: "
										+ ConstantGlobal.NUMERO_MASSIMO_PUNTI_AGGIUNTI);
					}
					break;
				case SOSTITUISCI:
					if (ConstantGlobal.NUMERO_MASSIMO_PUNTI_AGGIUNTI >= Long.valueOf(puntiFedelta.trim())) {
						this.puntiFedelta = puntiFedelta.trim();
						result = true;
					} else {
						throw new ClienteException(
								"errore, non possono essere aggiunti  i punti fedeltà del cliente perchè i punti inseriti superano il valore massimo di: "
										+ ConstantGlobal.NUMERO_MASSIMO_PUNTI_AGGIUNTI);
					}
					break;
				case SOTTRAI:
					if (Long.valueOf(this.puntiFedelta) > Long.valueOf(puntiFedelta.trim())) {
						Long sottrai = Long.valueOf(this.puntiFedelta) - Long.valueOf(puntiFedelta.trim());
						this.puntiFedelta = String.valueOf(sottrai);
						result = true;
					} else {
						throw new ClienteException(
								"errore, non possono essere sottratti  i punti fedeltà del cliente perchè i punti accumulati sono minori rispetto a quelli da sottrarre");

					}
					break;
				}
			} else {
				throw new ClienteException(
						"errore, non possono essere modificati  i punti fedeltà del cliente perchè non sono stati ancora inseriti");
			}
		} else {
			throw new ClienteException("Errore nell'inserimento dei punti fedeltà cliente ");
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: modificaDataInscrizioneTessera </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare la data di inscrizione della
	 * tessera di fedeltà attraverso il parametro dataInscrizioneTessera e
	 * assegnarla al cliente<br>
	 * Essendo che la data di inscrizione del cliente dovrà necessariamente essere
	 * fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * La data di cliente deve rispettare il formato dd/mm/aaaa
	 * 
	 * 
	 * @param dataInscrizioneTessera Variabile di tipo stringa che contiene la data
	 *                               di inscrizione della tessera del cliente
	 *                               inserita dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	@Override
	public boolean modificaDataInscrizioneTessera(String dataInscrizioneTessera)
			throws ClienteException, DipendenteException {
		boolean result = false;
		if (StringUtils.isNotBlank(dataInscrizioneTessera)
				&& dataInscrizioneTessera.trim().matches(ConstantGlobal.REGEX_CONTROLLO_DATA)) { /// controllo la
																									/// correttezza
																									/// della data
																									/// dd/mm/aaaa
			if (StringUtils.isNotBlank(this.dataInscrizioneTessera)) {
				this.dataInscrizioneTessera = dataInscrizioneTessera.trim();
				result = true;
			} else {
				throw new ClienteException(
						"errore, non può essere modificata la data di inscrizione della tessera del cliente perchè non è stata ancora inserita");
			}
		} else {
			throw new ClienteException(
					"Errore nell'inserimento della data di inscrizione della carta di fedeltà del cliente ");
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: modificaNumeroCartaFedelta </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare il numero di carta di fedeltà del
	 * cliente. Questo metodo genera automaticamente il numero di carta di fedeltà e
	 * controlla che non esiste sta.
	 * 
	 * 
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione.
	 * 
	 * 
	 */

	@Override
	public boolean modificaNumeroCartaFedelta() throws ClienteException, DipendenteException {
		boolean result = false;
		if (StringUtils.isNotBlank(this.numeroCartaFedelta)) { /// controlla che non è vuoto il numero di carta
			try {
				eliminaNumeroCartaFedelta();
				addNumeroCartaFedelta(); /// aggiunge e genera un nuovo numero di carta
			} catch (ClienteException | DipendenteException e) {
				System.err.println(e.getMessage());
			}
			result = true;
		} else {
			throw new ClienteException(
					"errore, non può essere modificato il numero della carta di fedeltà del cliente perchè  è non stato ancora inserito");
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: modificaCodiceFiscale</b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare il il codice fiscale del cliente
	 * attraverso il parametro codiceFiscale e assegnarla al cliente<br>
	 * Essendo che il codice fiscale dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * 
	 * 
	 * @return result Variabile ti tipo boolean che rappresenta se l'operazione è
	 *         andata a buon fine oppure no.
	 */

	@Override
	public boolean modificaCodiceFiscale(String codiceFiscale) throws ClienteException, DipendenteException {
		boolean result = false;
		try {
			if (controlloCodiceFiscale(codiceFiscale.trim())) { /// controlla la correttezza e se esiste già il codice
																/// fiscale
				eliminaCodiceFiscale();
				setCodiceFiscale(codiceFiscale.trim());
				elencoCodiceFiscale.add(codiceFiscale.trim());
				result = true;
			}
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: addNomeAzienda</b>
	 * <p>
	 * Questo metodo consente di aggiungere il nome dell'azienda del dipendente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata dal cliente
	 * 
	 * @return result Variabile ti tipo boolean che rappresenta se l'operazione è
	 *         andata a buon fine oppure no.
	 */

	@Override
	public boolean addNomeAzienda(String nomeAzienda) throws DipendenteException, ClienteException {
		throw new ClienteException("questa funzionalità non può essere usata per il Cliente");
	}

	/**
	 * 
	 * <b> METODO: addNumeroTelefonoAziendale</b>
	 * <p>
	 * Questo metodo consente di aggiungere il numero di telefono del dipendente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata dal cliente
	 * 
	 * @return result Variabile ti tipo boolean che rappresenta se l'operazione è
	 *         andata a buon fine oppure no.
	 */

	@Override
	public boolean addNumeroTelefonoAziendale(String numeroTelefonoAziendale)
			throws DipendenteException, ClienteException {
		throw new ClienteException("questa funzionalità non può essere usata per il Cliente");
	}

	/**
	 * 
	 * <b> METODO: addtipologiaContratto</b>
	 * <p>
	 * Questo metodo consente di aggiungere la tipologia di contratto del dipendente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata dal cliente
	 * 
	 * @return result Variabile ti tipo boolean che rappresenta se l'operazione è
	 *         andata a buon fine oppure no.
	 */

	@Override
	public boolean addtipologiaContratto(String tipologiaContratto) throws DipendenteException, ClienteException {
		throw new ClienteException("questa funzionalità non può essere usata per il Cliente");
	}

	/**
	 * 
	 * <b> METODO: eliminaNomeAzienda</b>
	 * <p>
	 * Questo metodo consente di eliminare il nome del'azienda del dipendente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata dal cliente
	 * 
	 * @return result Variabile ti tipo boolean che rappresenta se l'operazione è
	 *         andata a buon fine oppure no.
	 */

	@Override
	public boolean eliminaNomeAzienda() throws DipendenteException, ClienteException {
		throw new ClienteException("questa funzionalità non può essere usata per il Cliente");
	}

	/**
	 * 
	 * <b> METODO: eliminaNumeroTelefonoAziendale</b>
	 * <p>
	 * Questo metodo consente di eliminare il numero di telefono aziendale del
	 * dipendente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata dal cliente
	 * 
	 * @return result Variabile ti tipo boolean che rappresenta se l'operazione è
	 *         andata a buon fine oppure no.
	 */

	@Override
	public boolean eliminaNumeroTelefonoAziendale() throws DipendenteException, ClienteException {
		throw new ClienteException("questa funzionalità non può essere usata per il Cliente");
	}

	/**
	 * 
	 * <b> METODO: eliminatipologiaContratto</b>
	 * <p>
	 * Questo metodo consente di eliminare la tipologia di contratto del dipendente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata dal cliente
	 * 
	 * @return result Variabile ti tipo boolean che rappresenta se l'operazione è
	 *         andata a buon fine oppure no.
	 */

	@Override
	public boolean eliminatipologiaContratto() throws DipendenteException, ClienteException {
		throw new ClienteException("questa funzionalità non può essere usata per il Cliente");
	}

	/**
	 * 
	 * <b> METODO: modificaNomeAzienda</b>
	 * <p>
	 * Questo metodo consente di modificare il nome dell'azienda del dipendente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata dal cliente
	 * 
	 * @return result Variabile ti tipo boolean che rappresenta se l'operazione è
	 *         andata a buon fine oppure no.
	 */

	@Override
	public boolean modificaNomeAzienda(String nomeAzienda) throws DipendenteException, ClienteException {
		throw new ClienteException("questa funzionalità non può essere usata per il Cliente");
	}

	/**
	 * 
	 * <b> METODO: modificaNumeroTelefonoAziendale</b>
	 * <p>
	 * Questo metodo consente di modificare il numero di telefono aziendale del
	 * dipendente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata dal cliente
	 * 
	 * @return result Variabile ti tipo boolean che rappresenta se l'operazione è
	 *         andata a buon fine oppure no.
	 */

	@Override
	public boolean modificaNumeroTelefonoAziendale(String numeroTelefonoAziendale)
			throws DipendenteException, ClienteException {
		throw new ClienteException("questa funzionalità non può essere usata per il Cliente");
	}

	/**
	 * 
	 * <b> METODO: modificatipologiaContratto</b>
	 * <p>
	 * Questo metodo consente di modificare la tipologia di contratto del dipendente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata dal cliente
	 * 
	 * @return result Variabile ti tipo boolean che rappresenta se l'operazione è
	 *         andata a buon fine oppure no.
	 */

	@Override
	public boolean modificatipologiaContratto(String tipologiaContratto) throws DipendenteException, ClienteException {
		throw new ClienteException("questa funzionalità non può essere usata per il Cliente");
	}

	/**
	 * 
	 * <b> METODO: modificaCodiceIdentificativo</b>
	 * <p>
	 * Questo metodo consente di modificare il codice identificativo del dipendente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata dal cliente
	 * 
	 * @return result Variabile ti tipo boolean che rappresenta se l'operazione è
	 *         andata a buon fine oppure no.
	 */

	@Override
	public boolean modificaCodiceIdentificativo(String codiceIdentificativo)
			throws DipendenteException, ClienteException {
		throw new ClienteException("questa funzionalità non può essere usata per il Cliente");
	}

	/**
	 * 
	 * <b> METODO: addRuolo</b>
	 * <p>
	 * Questo metodo consente di aggiungere ìl ruolo del dipendente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata dal cliente
	 * 
	 * @return result Variabile ti tipo boolean che rappresenta se l'operazione è
	 *         andata a buon fine oppure no.
	 */

	@Override
	public boolean addRuolo(String ruolo) throws DipendenteException, ClienteException {
		throw new ClienteException("questa funzionalità non può essere usata per il Cliente");
	}

	/**
	 * 
	 * <b> METODO: addEmailAziendale</b>
	 * <p>
	 * Questo metodo consente di aggiungere l'email aziendale del dipendente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata dal cliente
	 * 
	 * @return result Variabile ti tipo boolean che rappresenta se l'operazione è
	 *         andata a buon fine oppure no.
	 */

	@Override
	public boolean addEmailAziendale() throws DipendenteException, ClienteException {
		throw new ClienteException("questa funzionalità non può essere usata per il Cliente");
	}

	/**
	 * 
	 * <b> METODO: modificaEmailAziendale</b>
	 * <p>
	 * Questo metodo consente di modificare l'email aziendale del dipendente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata dal cliente
	 * 
	 * @return result Variabile ti tipo boolean che rappresenta se l'operazione è
	 *         andata a buon fine oppure no.
	 */

	@Override
	public boolean modificaEmailAziendale() throws DipendenteException, ClienteException {
		throw new ClienteException("questa funzionalità non può essere usata per il Cliente");
	}

	/**
	 * 
	 * <b> METODO: eliminaEmailAziendale</b>
	 * <p>
	 * Questo metodo consente di eliminare l'email del dipendente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata dal cliente
	 * 
	 * @return result Variabile ti tipo boolean che rappresenta se l'operazione è
	 *         andata a buon fine oppure no.
	 */

	@Override
	public boolean eliminaEmailAziendale() throws DipendenteException, ClienteException {
		throw new ClienteException("questa funzionalità non può essere usata per il Cliente");
	}

	/**
	 * 
	 * <b> METODO: eliminaRuolo</b>
	 * <p>
	 * Questo metodo consente di eliminare il ruolo del dipendente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata dal cliente
	 * 
	 * @return result Variabile ti tipo boolean che rappresenta se l'operazione è
	 *         andata a buon fine oppure no.
	 */

	@Override
	public boolean eliminaRuolo() throws DipendenteException, ClienteException {
		throw new ClienteException("questa funzionalità non può essere usata per il Cliente");
	}

	/**
	 * 
	 * <b> METODO: modificaRuolo</b>
	 * <p>
	 * Questo metodo consente di modificare il ruolo del dipendente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata dal cliente

	 */

	@Override
	public boolean modificaRuolo(String ruolo) throws DipendenteException, ClienteException {
		throw new ClienteException("questa funzionalità non può essere usata per il Cliente");
	}

	/**
	 * 
	 * <b> METODO: VisualizzaElencoTipologiaContratto</b>
	 * <p>
	 * Questo metodo consente di visualizzare l'elenco delle tipologie di contratti
	 * del dipendente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata dal cliente
	 * 
	 */

	@Override
	public void VisualizzaElencoTipologiaContratto() throws ClienteException {
		throw new ClienteException("questa funzionalità non può essere usata per il Cliente");
	}

	/**
	 * 
	 * <b> METODO: visualizzaCodiceIdentificativoDipendete</b>
	 * <p>
	 * Questo metodo consente di visualizzare il codice identificativo del
	 * dipendente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata dal cliente

	 */

	@Override
	public String visualizzaCodiceIdentificativoDipendete() throws ClienteException {
		throw new ClienteException("questa funzionalità non può essere usata per il Cliente");
	}

	/**
	 * 
	 * <b> METODO: visualizzaNomeAziendaDipendente</b>
	 * <p>
	 * Questo metodo consente di visualizzare il nome dell'azienda del dipendente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata dal cliente
	 * 

	 */

	@Override
	public String visualizzaNomeAziendaDipendente() throws ClienteException {
		throw new ClienteException("questa funzionalità non può essere usata per il Cliente");
	}

	/**
	 * 
	 * <b> METODO: visualizzaEmailAziendaleDipendente</b>
	 * <p>
	 * Questo metodo consente di visualizzare l'email aziendale del dipendente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata dal cliente
	 * 

	 */

	@Override
	public String visualizzaEmailAziendaleDipendente() throws ClienteException {
		throw new ClienteException("questa funzionalità non può essere usata per il Cliente");
	}

	/**
	 * 
	 * <b> METODO: visualizzaNumeroTelefonoAziendaleDipendente</b>
	 * <p>
	 * Questo metodo consente di visualizzare il numero di telefono del dipendente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata dal cliente
	 * 
	 */

	@Override
	public String visualizzaNumeroTelefonoAziendaleDipendente() throws ClienteException {
		throw new ClienteException("questa funzionalità non può essere usata per il Cliente");
	}

	/**
	 * 
	 * <b> METODO: visualizzatipologiaContrattoDipendente</b>
	 * <p>
	 * Questo metodo consente di visualizzare la tipologia di contratto del
	 * dipendente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata dal cliente

	 */

	@Override
	public TIPO_CONTRATTO visualizzatipologiaContrattoDipendente() throws ClienteException {
		throw new ClienteException("questa funzionalità non può essere usata per il Cliente");
	}

	/**
	 * 
	 * <b> METODO: visualizzaRuoloDipendente</b>
	 * <p>
	 * Questo metodo consente di visualizzare il ruolo del dipendente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata dal cliente
	 * 

	 */

	@Override
	public String visualizzaRuoloDipendente() throws ClienteException {
		throw new ClienteException("questa funzionalità non può essere usata per il Cliente");
	}

	/**
	 * 
	 * <b> METODO: visualizzaElencoTvRiparate</b>
	 * <p>
	 * Questo metodo consente di visualizzare l'elenco di televisori riparate
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata dal cliente
	 * 
	 */

	@Override
	public Set<Riparazione> visualizzaElencoTvRiparate() throws ClienteException {
		throw new ClienteException("questa funzionalità non può essere usata per il Cliente");
	}

	/**
	 * 
	 * <b> METODO: visualizzaElencoTvVendute</b>
	 * <p>
	 * Questo metodo consente di visualizzare l'elenco di televisori venduti
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata dal cliente
	 * 
	 * @return lista contente lw vwendite delle televisioni
	 * */

	@Override
	public Set<Vendita> visualizzaElencoTvVendute() throws ClienteException {
		throw new ClienteException("questa funzionalità non può essere usata per il Cliente");
	}

	/**
	 * 
	 * <b> METODO: vendiTv</b>
	 * <p>
	 * Questo metodo consente di vendere un televisore
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata dal cliente
	 * 
	 * @return result Variabile ti tipo boolean che rappresenta se l'operazione è
	 *         andata a buon fine oppure no.
	 */

	@Override
	public boolean vendiTv(Televisore tv, Cliente cliente, String PrezzoVendita)
			throws PersonaException, TelevisoreException, DipendenteException {
		throw new PersonaException("questa funzionalità non può essere usata per il Cliente");
	}

	/**
	 * 
	 * <b> METODO: riparaTv</b>
	 * <p>
	 * Questo metodo consente di riparare un televisore
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata dal cliente
	 * 
	 * @return result Variabile ti tipo boolean che rappresenta se l'operazione è
	 *         andata a buon fine oppure no.
	 */

	@Override
	public boolean riparaTv(String dataRichiestaRiparazione, String dataPrevistaConsegna, String costoRiparazione,
			Cliente clienteRiparazione, Televisore tvRiparata, String informazioneRiparazione)
			throws ParseException, RiparazioneException, ClienteException {
		throw new ClienteException("questa funzionalità non può essere usata per il Cliente");
	}

}
