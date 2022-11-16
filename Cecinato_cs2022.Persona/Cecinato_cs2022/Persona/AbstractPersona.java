package Cecinato_cs2022.Persona;

import java.text.ParseException;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;
import Cecinato_cs2022.Cliente.Cliente;
import Cecinato_cs2022.ClienteException.ClienteException;
import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.ControlliGlobal.ControlliGlobal;
import Cecinato_cs2022.Dipendente.Riparazione;
import Cecinato_cs2022.Dipendente.Vendita;
import Cecinato_cs2022.DipendenteException.DipendenteException;
import Cecinato_cs2022.DipendenteException.RiparazioneException;
import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;
import Cecinato_cs2022.ExceptionPersona.PersonaException;
import Cecinato_cs2022.ServicePersona.Persona;
import Cecinato_cs2022.TelevisoreService.Televisore;

/**
 * 
 * <p>
 * <b> CLASSE: AbstractPersona </b>
 * <p>
 * Questa classe astratta ha lo scopo di raggruppare tutte le caratteristiche e
 * i comportamenti comuni delle persone.
 * <p>
 * Invece, le operazioni previste sono tutte quelle che permettono di acquisire,
 * modificare, visualizzare e e controllare delle informazioni delle persone.
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

public abstract class AbstractPersona implements Persona {

	/// ********************************************
	/// ATTRIBUTI
	/// ********************************************

	private static final long serialVersionUID = 1L;

	/**
	 * il {@link String} instanzia che indica il nome del cliente.
	 */
	private String nome;
	/**
	 * il {@link String} instanzia che indica il cognome del cliente.
	 */
	private String cognome;
	/**
	 * l' {@link int} instanzia che indica l'età del cliente.
	 */
	private int eta;

	/**
	 * l' {@link ConstantGlobal.GENERE} instanzia che indica il gernere del cliente.
	 */
	private ConstantGlobal.GENERE genere;

	/**
	 * la {@link String} instanzia che indica la data del cliente.
	 */
	private String dataNascita; // il formato sarà 01/02/2022
	/**
	 * la {@link String} instanzia che indica la città del cliente.
	 */
	private String citta;

	/**
	 * 
	 * <b> COSTRUTTORE: AbstractPersona </b>
	 * <p>
	 * Questo è il costruttore della classe AbstractPersona <br>
	 * In particolare, tale costrutture è un costruttore aparamentrico .<br>
	 * In oltre, ogni singolo attributo sarà valorizzato con l'apposito metodo add.
	 * 
	 */

	public AbstractPersona() {
		super();
	}

	/**
	 * 
	 * <b> COSTRUTTORE: AbstractPersona </b>
	 * <p>
	 * Questo è il costruttore della classe AbstractPersona <br>
	 * Tale costruttore consente di assegnare tutti i parametri di una persona.<br>
	 * In oltre, ogni singolo attributo sarà valorizzato con l'apposito metodo add.
	 * <br>
	 * Nel caso in cui i parametri sono errati mostrerà all'utente il messaggio di
	 * errore relativo al parametro che a sollevato l'eccezione.
	 * <p>
	 * Essendo che i paremetri della persona dovranno necessariamente essere forniti
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * 
	 * @param nome        Variabile di tipo stringa che contiene il nome della
	 *                    persona inserito dall'utente.
	 * @param cognome     Variabile di tipo stringa che contiene il cognome della
	 *                    persona inserito dall'utente.
	 * @param eta         Variabile di tipo int che contiene l'età della persona
	 *                    inserito dall'utente.
	 * @param genere      Variabile di tipo stringa che contiene il genere della
	 *                    persona inserito dall'utente.
	 * @param dataNascita Variabile di tipo stringa che contiene la data della
	 *                    persona inserita dall'utente.
	 * @param citta       Variabile di tipo stringa che contiene la città di nascita
	 *                    della persona inserita dall'utente.
	 */

	public AbstractPersona(String nome, String cognome, int eta, String genere, String dataNascita, String citta) {
		super();
		try {
			addNome(nome);
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
		try {
			addCognome(cognome);
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
		try {
			addEta(eta);
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
		try {
			addGenere(genere);
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
		try {
			addDataNascita(dataNascita);
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
		try {
			addCitta(citta);
		} catch (PersonaException e) {
			System.err.println(e.getMessage());
		}
	}

	/**
	 * 
	 * <b> OPERAZIONE: controlloGenere </b>
	 * <p>
	 * Quest'operazione consente di controllare se il genere inserito
	 * dall'utente è uguale ad un elemento presente nell'enumerazione di
	 * GENERE
	 * 
	 * @param genere Variabile di tipo stringa che contiene il genere
	 *                      della persona da controllare,
	 * 
	 * @return result Variabile boolena che ritorna se il codice fiscale è corretto
	 *         ed non esiste già
	 */
	
	protected final boolean controlloGenere(String genere) {
		boolean result = false;
		for (ConstantGlobal.GENERE item : ConstantGlobal.GENERE.values()) {
			if (StringUtils.equals(String.valueOf(item), genere)) {
				result = true;
				break;
			}
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: controlloTipoContratto </b>
	 * <p>
	 * Quest'operazione consente di controllare se il tipo di contratto inserito
	 * dall'utente è uguale ad un elemento presente nell'enumerazione di
	 * TIPOLOGIA_CONTRATTO
	 * 
	 * @param tipoContratto Variabile di tipo stringa che contiene la tipologia
	 *                      di cotratto del dipendente da controllare,
	 * 
	 * @return result Variabile boolena che ritorna se il codice fiscale è corretto
	 *         ed non esiste già
	 */

	protected final boolean controlloTipoContratto(String tipoContratto) {
		boolean result = false;
		for (ConstantGlobal.TIPO_CONTRATTO item : ConstantGlobal.TIPO_CONTRATTO.values()) {
			if (StringUtils.equals(String.valueOf(item), tipoContratto)) {
				result = true;
				break;
			}
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: VisualizzaNome</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante la Stringa contente il nome
	 * della persona.
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo nome, e lo
	 * restituiamo al chiamante.
	 * 
	 * @return nome, Variabile di tipo String contente il nome della persona.
	 */

	public String VisualizzaNome() {
		return this.nome;
	}

	/**
	 * 
	 * <b> METODO: VisualizzaCognome</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante la Stringa contente il
	 * cognome della persona.
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo cognome, e lo
	 * restituiamo al chiamante.
	 * 
	 * @return cognome, Variabile di tipo String contente il cognome della persona.
	 */
	public String VisualizzaCognome() {
		return this.cognome;
	}

	/**
	 * 
	 * <b> METODO: VisualizzaEta</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante l'intero contente l'età
	 * della persona.
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo eta, e lo
	 * restituiamo al chiamante.
	 * 
	 * @return eta, Variabile di tipo int contente l'età della persona.
	 */

	public int VisualizzaEta() {
		return this.eta;
	}

	/**
	 * 
	 * <b> METODO: VisualizzaGenere</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante il GENERE contente il genere
	 * della persona.
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo genere, e lo
	 * restituiamo al chiamante.
	 * 
	 * @return genere, Variabile di tipo GENERE contente il genere della persona.
	 */

	public ConstantGlobal.GENERE VisualizzaGenere() {
		return this.genere;
	}

	/**
	 * 
	 * <b> METODO: VisualizzaDataNascita</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante la Stringa contente la di
	 * nascita della persona.
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo dataNascita, e
	 * lo restituiamo al chiamante.
	 * 
	 * @return dataNascita, Variabile di tipo String contente la data di nascita
	 *         della persona.
	 */

	public String VisualizzaDataNascita() {
		return this.dataNascita;
	}

	/**
	 * 
	 * <b> METODO: VisualizzaCitta</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante la Stringa contente la città
	 * della persona.
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo città, e lo
	 * restituiamo al chiamante.
	 * 
	 * @return dataNascita, Variabile di tipo String contente la città di nascita
	 *         della persona.
	 */

	public String VisualizzaCitta() {
		return this.citta;
	}

	/**
	 * 
	 * <b> METODO: visualizzaElencoGenerePersona</b>
	 * <p>
	 * Questo metodo consente di far visualizzare l'elenco del tipo di genere delle
	 * persone
	 * 
	 */

	public void visualizzaElencoGenerePersona() {
		int i = 0;
		System.out.println("L'elenco dei generi :");
		for (ConstantGlobal.GENERE item : ConstantGlobal.GENERE.values()) {
			System.out.println(String.valueOf(i).concat(") ").concat(String.valueOf(item)).toLowerCase());
			i += 1;
		}
	}

	/**
	 * 
	 * <b> OPERAZIONE: addNome </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire il nome della persona attraverso il
	 * parametro nome e assegnarla alla persona<br>
	 * Essendo che il nome della persona dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * <p>
	 * Verranno quindi effettuati due controlli: 1) il nome deve essere vuoto ( se è
	 * piena l'utente deve utilizzare la funzione modifica) 2) il valore contenuto
	 * nel paramentro nome contiene solo stringhe
	 * 
	 * @param nome Variabile di tipo stringa che contiene il nome della persona
	 *             inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	public boolean addNome(String nome) throws PersonaException {
		boolean result = false;
		if (StringUtils.isNotBlank(nome) && StringUtils.isAlphaSpace(nome)) {
			if (StringUtils.isEmpty(this.nome)) {
				nome = ControlliGlobal.upperCaseFirst(nome.trim());
				this.nome = nome;
				result = true;
			} else {
				throw new PersonaException(
						"errore, non può essere aggiunto il nome della persona perchè è gia presente");
			}
		} else {
			throw new PersonaException("Errore nell'inserimento del nome");
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: addCognome </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire il cognome della persona attraverso
	 * il parametro cognome e assegnarla alla persona<br>
	 * Essendo che il cognome della persona dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * <p>
	 * Verranno quindi effettuati due controlli: 1) il cognome deve essere vuoto (
	 * se è piena l'utente deve utilizzare la funzione modifica) 2) il valore
	 * contenuto nel paramentro nome contiene solo stringhe
	 * 
	 * @param cognome Variabile di tipo stringa che contiene il cognome della
	 *                persona inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	public boolean addCognome(String cognome) throws PersonaException {
		boolean result = false;
		if (StringUtils.isNotBlank(cognome) && StringUtils.isAlphaSpace(cognome)) {
			if (StringUtils.isEmpty(this.cognome)) {
				cognome = ControlliGlobal.upperCaseFirst(cognome.trim());
				this.cognome = cognome;
				result = true;
			} else {
				throw new PersonaException(
						"errore, non può essere aggiunto il cognome della persona perchè è gia presente");
			}
		} else {
			throw new PersonaException("Errore nell'inserimento del cognome");
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: addEta </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire l'età della persona attraverso il
	 * parametro eta e assegnarla alla persona<br>
	 * Essendo che l'età della persona dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * <p>
	 * Verranno quindi effettuati due controlli: 1) l'età deve essere vuoto ( se è
	 * piena l'utente deve utilizzare la funzione modifica) 2) il valore contenuto
	 * nel paramentro eta contiene solo un intero compreso tra 16 e 150 (range di
	 * età)
	 * 
	 * @param eta Variabile di tipo int che contiene l'età della persona inserito
	 *            dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	public boolean addEta(int eta) throws PersonaException {
		boolean result = false;
		if (this.eta == 0) {
			if (eta >= ConstantGlobal.ETA_MINIMA_CLIENTE && eta <= ConstantGlobal.ETA_MASSIMA_CLIENTE) {
				this.eta = eta;
				result = true;
			} else {
				throw new PersonaException("Errore nell'inserimento dell'età");
			}
		} else {
			throw new PersonaException("Errore non può essere aggiunta l'età della persona perchè è gia presente");
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: addGenere </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire il genere della persona attraverso
	 * il parametro genere e assegnarla alla persona<br>
	 * Essendo che il genere della persona dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * <p>
	 * Verranno quindi effettuati tre controlli: 1) il genere deve essere vuoto ( se
	 * è piena l'utente deve utilizzare la funzione modifica) 2) il valore contenuto
	 * nel paramentro genere contiene solo stringhe 3) il genere deve appartenere ad
	 * un elemento dell'ENUM GENERE
	 * 
	 * @param genere Variabile di tipo stringa che contiene il genere della persona
	 *               inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	public boolean addGenere(String genere) throws PersonaException {
		boolean result = false;
		if (StringUtils.isNotBlank(genere) && controlloGenere(genere.toUpperCase())) {
			if (this.genere == null) {
				this.genere = ConstantGlobal.GENERE.valueOf(genere.toUpperCase());
				result = true;
			} else {
				throw new PersonaException(
						"errore, non può essere aggiunta il genere della persona perchè è gia presente");
			}
		} else {
			throw new PersonaException("Errore nell'inserimento del genere della persona");
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: addDataNascita </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire la data di nascita della persona
	 * attraverso il parametro dataNascita e assegnarla alla persona<br>
	 * Essendo che la data di nascita della persona dovrà necessariamente essere
	 * fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Verranno quindi effettuati due controlli: 1)la data di nascita deve essere
	 * vuota ( se è piena l'utente deve utilizzare la funzione modifica) 2) il
	 * valore contenuto nel paramentro dataNascita rispetta questo formato
	 * dd/mm/aaaa
	 * 
	 * @param dataNascita Variabile di tipo stringa che contiene la data di nascita
	 *                    della persona inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	public boolean addDataNascita(String dataNascita) throws PersonaException {
		boolean result = false;
		if (StringUtils.isNotBlank(dataNascita) && dataNascita.trim().matches(ConstantGlobal.REGEX_CONTROLLO_DATA)) {
			if (StringUtils.isEmpty(this.dataNascita)) {
				this.dataNascita = dataNascita.trim();
				result = true;
			} else {
				throw new PersonaException(
						"errore, non può essere aggiunta la data della persona perchè è gia presente");
			}
		} else {
			throw new PersonaException("Errore nell'inserimento della data");
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: addCitta </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire la città di nascita della persona
	 * attraverso il parametro citta e assegnarla alla persona<br>
	 * Essendo che la citta della persona dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * <p>
	 * Verranno quindi effettuati due controlli: 1)la citta di nascita deve essere
	 * vuota ( se è piena l'utente deve utilizzare la funzione modifica) 2) il
	 * valore contenuto nel paramentro deve essere una stringa
	 * 
	 * @param citta Variabile di tipo stringa che contiene la città di nascita della
	 *              persona inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	public boolean addCitta(String citta) throws PersonaException {
		boolean result = false;

		if (StringUtils.isAlphaSpace(citta) && StringUtils.isNotBlank(citta)) {
			if (StringUtils.isEmpty(this.citta)) {
				this.citta = ControlliGlobal.upperCaseFirst(citta.trim());
				result = true;
			} else {
				throw new PersonaException(
						"errore, non può essere aggiunta la citta della persona perchè è gia presente");
			}
		} else {
			throw new PersonaException("Errore nell'inserimento del della città");
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: modificaNome </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare il nome della persona attraverso
	 * il parametro nome e assegnato all' AbstactPersona <br>
	 * Essendo che il nome della persona dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza. Verranno quindi effettuati due controlli: 1)il
	 * nome deve essere piena ( se è vuota l'utente deve utilizzare la funzione
	 * madd) 2) il valore contenuto nel paramentro nome deve essere una stringa
	 * 
	 * 
	 * @param nome Variabile di tipo stringa che contiene il nome della persona.
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione.
	 * 
	 * 
	 */

	public boolean modificaNome(String nome) throws PersonaException {
		boolean result = false;
		if (StringUtils.isAlphaSpace(nome) && StringUtils.isNotBlank(nome)) {
			if (StringUtils.isNotBlank(this.nome)) {
				this.nome = ControlliGlobal.upperCaseFirst(nome.trim());
				result = true;
			} else {
				throw new PersonaException(
						"errore, non può essere modificato il nome della persona perchè è stato ancora inserito");
			}
		} else {
			throw new PersonaException("Errore nell'inserimento del nome");
		}
		return result;

	}

	/**
	 * 
	 * <b> OPERAZIONE: modificaCognome </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare il cognome della persona
	 * attraverso il parametro cognome e assegnato all' AbstactPersona <br>
	 * Essendo che il cognome della persona dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza. Verranno quindi effettuati due controlli: 1)il
	 * cognome deve essere piena ( se è vuota l'utente deve utilizzare la funzione
	 * add) 2) il valore contenuto nel paramentro cognome deve essere una stringa
	 * 
	 * 
	 * @param cognome Variabile di tipo stringa che contiene il cognome della
	 *                persona.
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione.
	 * 
	 * 
	 */

	public boolean modificaCognome(String cognome) throws PersonaException {
		boolean result = false;
		if (StringUtils.isAlphaSpace(cognome) && StringUtils.isNotBlank(cognome)) {
			if (StringUtils.isNotBlank(this.cognome)) {
				this.cognome = ControlliGlobal.upperCaseFirst(cognome.trim());
				result = true;
			} else {
				throw new PersonaException(
						"errore, non può essere modificato il cognome della persona perchè  non è stato ancora inserito");
			}
		} else {
			throw new PersonaException("Errore nell'inserimento del cognome");
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: modificaEta </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare l'età della persona attraverso il
	 * parametro eta e assegnato all' AbstactPersona <br>
	 * Essendo che l'età della persona dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza. Verranno quindi effettuati due controlli: 1)
	 * l'età non deve essere =0 ( se è vuota l'utente deve utilizzare la funzione
	 * add) 2) il valore contenuto nel paramentro età deve essere un intero e
	 * compreso tra 16 e 150
	 * 
	 * 
	 * @param eta Variabile di tipo stringa che contiene l'età della persona.
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione.
	 * 
	 * 
	 */

	public boolean modificaEta(int eta) throws PersonaException {
		boolean result = false;
		if (this.eta != 0) {
			if (eta >= ConstantGlobal.ETA_MINIMA_CLIENTE && eta <= ConstantGlobal.ETA_MASSIMA_CLIENTE) {
				this.eta = eta;
				result = true;
			} else {
				throw new PersonaException("Errore nell'inserimento dell'età");
			}
		} else {
			throw new PersonaException(
					"Errore non può essere modificata l'età della persona perchè non è stato ancora inserita");
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: modificaGenere </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare il genere persona attraverso il
	 * parametro genere e assegnato all' AbstactPersona <br>
	 * Essendo che il genere della persona dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza. Verranno quindi effettuati due controlli: 1) il
	 * genere non deve essere nullo ( se è vuota l'utente deve utilizzare la
	 * funzione add) 2) il valore contenuto nel paramentro deve deve essere una
	 * stringa e deve appartenere all'enum GENERE
	 * 
	 * 
	 * @param genere Variabile di tipo stringa che contiene il genere della persona.
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione.
	 * 
	 * 
	 */

	public boolean modificaGenere(String genere) throws PersonaException {
		boolean result = false;
		if (StringUtils.isNotBlank((String) genere) && controlloGenere(genere.trim())) {
			if (this.genere != null) {
				this.genere = ConstantGlobal.GENERE.valueOf(genere.trim());
				result = true;
			} else {
				throw new PersonaException(
						"errore, non può essere modificato il genere della persona perchè non è stato ancora inserito");
			}
		} else {
			throw new PersonaException("Errore nell'inserimento del genere della persona");
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: modificaDataNascita </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare la data di nascita della persona
	 * attraverso il parametro dataNascita e assegnato all' AbstactPersona <br>
	 * Essendo che la data di nascita della persona dovrà necessariamente essere
	 * fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza. Verranno quindi effettuati due
	 * controlli: 1)la data di nascita non deve essere nulla ( se è vuota l'utente
	 * deve utilizzare la funzione add) 2) il valore contenuto nel paramentro
	 * dataNascita deve essere una stringa
	 * 
	 * 
	 * @param dataNascita Variabile di tipo stringa che contiene la data di nascita
	 *                    della persona.
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione.
	 * 
	 * 
	 */

	public boolean modificaDataNascita(String dataNascita) throws PersonaException {
		boolean result = false;
		if (StringUtils.isNotBlank(dataNascita) && dataNascita.trim().matches(ConstantGlobal.REGEX_CONTROLLO_DATA)) {
			if (StringUtils.isNotBlank(this.dataNascita)) {
				this.dataNascita = dataNascita.trim();
				result = true;
			} else {
				throw new PersonaException(
						"errore, non può essere modificata la data di nascita della persona perchè non è stata ancora inserita");
			}
		} else {
			throw new PersonaException("Errore nell'inserimento della data");
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: modificaCitta </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare la città di nascita della persona
	 * attraverso il parametro città e assegnato all' AbstactPersona <br>
	 * Essendo che la città della persona dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza. Verranno quindi effettuati due controlli: 1)la
	 * città non deve essere nulla ( se è vuota l'utente deve utilizzare la funzione
	 * add) 2) il valore contenuto nel paramentro città deve essere una stringa
	 * 
	 * 
	 * @param citta Variabile di tipo stringa che contiene la città della persona.
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione.
	 * 
	 * 
	 */

	public boolean modificaCitta(String citta) throws PersonaException {
		boolean result = false;
		try {
			if (StringUtils.isAlphaSpace(citta) && StringUtils.isNotBlank(citta)) {
				if (this.citta != null) {
					this.citta = ControlliGlobal.upperCaseFirst(citta.trim());
					result = true;
				} else {
					throw new PersonaException(
							"errore, non può essere modificata la città della persona perchè non è stata ancora inserita");
				}
			} else {
				throw new PersonaException("Errore nell'inserimento del della città");
			}
		} catch (NullPointerException e) {
			System.err.println("E' stato inserito un valore nullo");
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: eliminaNome </b>
	 * <p>
	 * Questo metodo consente di eliminare il nome della persona
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo nome, e
	 * controlliamo se è vuoto.
	 * <p>
	 * Il valore di ritorno, assumerà il valore true se è stato cancellato
	 * altrimenti false. Nel caso in cui il valore dell'attributo nome è vuoto
	 * alzerà un eccezione
	 * 
	 * 
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione andata a buon fine oppure no
	 * 
	 * 
	 */

	public boolean eliminaNome() throws PersonaException {
		boolean result = false;
		if (StringUtils.isNotBlank(this.nome)) {
			this.nome = null;
			result = true;
		} else {
			throw new PersonaException(
					"errore, non può essere cancellato il nome della persona perchè è stato ancora inserito");
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: eliminaCognome </b>
	 * <p>
	 * Questo metodo consente di eliminare il cognome della persona
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo cognome, e
	 * controlliamo se è vuoto.
	 * <p>
	 * Il valore di ritorno, assumerà il valore true se è stato cancellato
	 * altrimenti false. Nel caso in cui il valore dell'attributo cognome è vuoto
	 * alzerà un eccezione
	 * 
	 * 
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione andata a buon fine oppure no
	 * 
	 * 
	 */

	public boolean eliminaCognome() throws PersonaException {
		boolean result = false;
		if (StringUtils.isNotBlank(this.cognome)) {
			this.cognome = null;
			result = true;
		} else {
			throw new PersonaException(
					"errore, non può essere cancellato il cognome della persona perchè  non è stato ancora inserito");
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: eliminaCognome </b>
	 * <p>
	 * Questo metodo consente di eliminare l' età della persona
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo eta, e
	 * controlliamo se è vuoto.
	 * <p>
	 * Il valore di ritorno, assumerà il valore true se è stato cancellato
	 * altrimenti false. Nel caso in cui il valore dell'attributo eta è vuoto alzerà
	 * un eccezione
	 * 
	 * 
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione andata a buon fine oppure no
	 * 
	 * 
	 */

	public boolean eliminaEta() throws PersonaException {
		boolean result = false;
		if (this.eta != 0) {
			this.eta = 0;
			result = true;
		} else {
			throw new PersonaException(
					"Errore non può essere cancellata l'età della persona perchè non è stato ancora inserita");
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: eliminaGenere </b>
	 * <p>
	 * Questo metodo consente di eliminare il genere della persona
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo genere, e
	 * controlliamo se è vuoto.
	 * <p>
	 * Il valore di ritorno, assumerà il valore true se è stato cancellato
	 * altrimenti false. Nel caso in cui il valore dell'attributo genere è vuoto
	 * alzerà un eccezione
	 * 
	 * 
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione andata a buon fine oppure no
	 * 
	 * 
	 */

	public boolean eliminaGenere() throws PersonaException {
		boolean result = false;
		if (this.genere != null) {
			this.genere = null;
			result = true;
		} else {
			throw new PersonaException(
					"errore, non può essere cancellato il genere della persona perchè non è stato ancora inserito");
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: eliminaDataNascita </b>
	 * <p>
	 * Questo metodo consente di eliminare la data di nascita della persona
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo dataNascita, e
	 * controlliamo se è vuoto.
	 * <p>
	 * Il valore di ritorno, assumerà il valore true se è stato cancellato
	 * altrimenti false. Nel caso in cui il valore dell'attributo dataNascita è
	 * vuoto alzerà un eccezione
	 * 
	 * 
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione andata a buon fine oppure no
	 * 
	 * 
	 */

	public boolean eliminaDataNascita() throws PersonaException {
		boolean result = false;
		if (StringUtils.isNotBlank(this.dataNascita)) {
			this.dataNascita = null;
			result = true;
		} else {
			throw new PersonaException(
					"errore, non può essere cancellata la data di nascita della persona perchè non è stata ancora inserita");
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: eliminaCitta </b>
	 * <p>
	 * Questo metodo consente di eliminare la città di nascita della persona
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo citta, e
	 * controlliamo se è vuoto.
	 * <p>
	 * Il valore di ritorno, assumerà il valore true se è stato cancellato
	 * altrimenti false. Nel caso in cui il valore dell'attributo citta è vuoto
	 * alzerà un eccezione
	 * 
	 * 
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione andata a buon fine oppure no
	 * 
	 * 
	 */

	public boolean eliminaCitta() throws PersonaException {
		boolean result = false;
		if (StringUtils.isNotBlank(this.citta)) {
			this.citta = null;
			result = true;
		} else {
			throw new PersonaException(
					"errore, non può essere cancellata la città della persona perchè non è stata ancora inserita");
		}

		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: addNomeAzienda </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire il nome dell' azienda dove lavora
	 * il dipendente attraverso il parametro nomeAzienda e assegnarlo al
	 * dipendete<br>
	 * Essendo che il nome dell'azienda del dipendente dovrà necessariamente essere
	 * fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 *
	 * 
	 * 
	 * 
	 * @param nomeAzienda Variabile di tipo stringa che contiene il nome
	 *                    dell'aizenda dove lavora il dipendente inserito
	 *                    dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * @throws DipendenteException Solleva l'eccezione se il nome dell'azienda è
	 *                             errato o è stato già inserito
	 * 
	 * @throws ClienteException    Solleva l'eccezione se il cliente utilizza questo
	 *                             metodo
	 */

	public abstract boolean addNomeAzienda(String nomeAzienda) throws DipendenteException, ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: addEmailAziendale </b>
	 * <p>
	 * Quest'operazione ha lo scopo di generare l'email aziendale attraverso 3
	 * informazioni essenzioni: 1) il nome del dipendente 2) l'azienda in cui lavora
	 * il dipendente 3) il cognome del dipendnete
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 *
	 * 
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * @throws DipendenteException Solleva l'eccezione uno o più di uno dei tre
	 *                             paramentri precedentemente elencati non è
	 *                             presente oppure è stata gia inserita
	 * 
	 * @throws ClienteException    Solleva l'eccezione se il cliente utilizza questo
	 *                             metodo
	 */

	public abstract boolean addEmailAziendale() throws DipendenteException, ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: addNumeroTelefonoAziendale </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire il numero di telefono del
	 * dipendente attraverso il parametro numeroTelefonoAziendale e assegnarlo al
	 * dipendete<br>
	 * Essendo che il numero di telefono del dipedente dovrà necessariamente essere
	 * fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 *
	 * 
	 * 
	 * 
	 * @param numeroTelefonoAziendale Variabile di tipo stringa che contiene il
	 *                                numero del dipendente d inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * @throws DipendenteException Solleva l'eccezione se il numero del dipendente è
	 *                             errato o è stato già inserito
	 * 
	 * @throws ClienteException    Solleva l'eccezione se il cliente utilizza questo
	 *                             metodo
	 */

	public abstract boolean addNumeroTelefonoAziendale(String numeroTelefonoAziendale)
			throws DipendenteException, ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: addtipologiaContratto </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire la tipologia di contratto del
	 * dipendente attraverso il parametro tipologiaContratto e assegnarla al
	 * dipendete<br>
	 * Essendo che la tipologia di contratto del dipedente dovrà necessariamente
	 * essere fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 *
	 * 
	 * 
	 * 
	 * @param tipologiaContratto Variabile di tipo stringa che contiene la tipologia
	 *                           di contratto del dipendente d inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * @throws DipendenteException Solleva l'eccezione se la tipologia di contratti
	 *                             del dipendente è errata o è stata già inserita
	 * 
	 * @throws ClienteException    Solleva l'eccezione se il cliente utilizza questo
	 *                             metodo
	 */

	public abstract boolean addtipologiaContratto(String tipologiaContratto)
			throws DipendenteException, ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: addRuolo </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire lil ruolo del dipendente attraverso
	 * il parametro ruolo e assegnarla al dipendete<br>
	 * Essendo che il ruolo del dipedente dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 *
	 * 
	 * @param ruolo Variabile di tipo stringa che contiene il ruolo del dipendente
	 *              ed inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * @throws DipendenteException Solleva l'eccezione se il ruolo del dipendente è
	 *                             errato o è stata già inserito
	 * 
	 * @throws ClienteException    Solleva l'eccezione se il cliente utilizza questo
	 *                             metodo
	 */

	public abstract boolean addRuolo(String ruolo) throws DipendenteException, ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: modificaNomeAzienda </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare il nome dell' azienda del
	 * dipendente attraverso il parametro nomeAzienda e assegnarlo al dipendente<br>
	 * Essendo che il nome della carta di fedeltà del dipendente dovrà
	 * necessariamente essere fornito dall'utente, dunque, si rendono necessari dei
	 * controlli per verificarne l'esattezza e la correttezza.
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 *
	 * 
	 * 
	 * @param nomeAzienda Variabile di tipo stringa che contiene il nome
	 *                    dell'azienda del dipendente inserito dall'utente
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws DipendenteException genera un errore nel caso in cui il valore
	 *                             dell'azienda del dipendente è vuoto
	 * @throws ClienteException    Solleva l'eccezione se il cliente utilizza questo
	 *                             metodo
	 */

	public abstract boolean modificaNomeAzienda(String nomeAzienda) throws DipendenteException, ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: modificaEmailAziendale </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare l'email del dipendente.
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 *
	 * 
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws DipendenteException genera un errore nel caso in cui il valore
	 *                             dell'email del dipendente è vuoto
	 * @throws ClienteException    Solleva l'eccezione se il cliente utilizza questo
	 *                             metodo
	 */

	public abstract boolean modificaEmailAziendale() throws DipendenteException, ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: modificaNumeroTelefonoAziendale </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare il numero di telefono del
	 * dipendente attraverso il parametro numeroTelefonoAziendale e assegnarlo al
	 * dipendente<br>
	 * Essendo che il numero di telefono del dipendete dovrà necessariamente essere
	 * fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 *
	 * 
	 * 
	 * @param numeroTelefonoAziendale Variabile di tipo stringa che contiene il
	 *                                numero di telefono del dipendente inserito
	 *                                dall'utente
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws DipendenteException genera un errore nel caso in cui il valore
	 *                             dell'azienda del dipendente è vuoto
	 * @throws ClienteException    Solleva l'eccezione se il cliente utilizza questo
	 *                             metodo
	 */

	public abstract boolean modificaNumeroTelefonoAziendale(String numeroTelefonoAziendale)
			throws DipendenteException, ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: modificatipologiaContratto </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare la tipologia di contratto del
	 * dipendente attraverso il parametro tipologiaContratto e assegnarlo al
	 * dipendente<br>
	 * Essendo che la tipologia del contratto del dipendete dovrà necessariamente
	 * essere fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 *
	 * 
	 * 
	 * @param tipologiaContratto Variabile di tipo stringa che contiene la tipologia
	 *                           di contratto del dipendente inserito dall'utente
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws DipendenteException genera un errore nel caso in cui il valore della
	 *                             tipologia di contratto del dipendente è vuoto
	 * @throws ClienteException    Solleva l'eccezione se il cliente utilizza questo
	 *                             metodo
	 */

	public abstract boolean modificatipologiaContratto(String tipologiaContratto)
			throws DipendenteException, ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: modificaCodiceIdentificativo </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare il codice identidicativo del
	 * dipendente attraverso il parametro codiceIdentificativo e assegnarlo al
	 * dipendente<br>
	 * Essendo che la tipologia del contratto del dipendete dovrà necessariamente
	 * essere fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 *
	 * 
	 * 
	 * @param codiceIdentificativo Variabile di tipo stringa che contiene il codice
	 *                             identificativo del dipendente inserito
	 *                             dall'utente
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws DipendenteException genera un errore nel caso in cui il valore del
	 *                             codice identificativo del dipendente è vuoto
	 *                             oppure èsiste già
	 * @throws ClienteException    Solleva l'eccezione se il cliente utilizza questo
	 *                             metodo
	 */

	public abstract boolean modificaCodiceIdentificativo(String codiceIdentificativo)
			throws DipendenteException, ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: modificaRuolo </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare il ruolo del dipendente attraverso
	 * il parametro ruolo e assegnarlo al dipendente<br>
	 * Essendo che il ruolo del dipendete dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param ruolo Variabile di tipo stringa che contiene il ruolo del dipendente
	 *              inserito dall'utente
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws DipendenteException genera un errore nel caso in cui il valore ruolo
	 *                             del dipendente è vuoto
	 * @throws ClienteException    Solleva l'eccezione se il cliente utilizza questo
	 *                             metodo
	 */

	public abstract boolean modificaRuolo(String ruolo) throws DipendenteException, ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: eliminaNomeAzienda </b>
	 * <p>
	 * Quest'operazione ha lo scopo di eliminare il nome dell'azienda del
	 * dipendente.
	 *
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws DipendenteException genera un errore nel caso in cui il valore del
	 *                             nome dell'azienda del dipendente è già vuoto
	 * @throws ClienteException    Solleva l'eccezione se il cliente utilizza questo
	 *                             metodo
	 */

	public abstract boolean eliminaNomeAzienda() throws DipendenteException, ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE:eliminaEmailAziendale </b>
	 * <p>
	 * Quest'operazione ha lo scopo di eliminare l'email aziendale del dipendente.
	 *
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws DipendenteException genera un errore nel caso in cui il valore dell'
	 *                             email aziendale del dipendente è già vuoto
	 * @throws ClienteException    Solleva l'eccezione se il cliente utilizza questo
	 *                             metodo
	 */

	public abstract boolean eliminaEmailAziendale() throws DipendenteException, ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE:eliminaNumeroTelefonoAziendale </b>
	 * <p>
	 * Quest'operazione ha lo scopo di eliminare il numero telefionico aziendale del
	 * dipendente.
	 *
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws DipendenteException genera un errore nel caso in cui il valore del
	 *                             numero telefonico adiendale del dipendente è già
	 *                             vuoto
	 * @throws ClienteException    Solleva l'eccezione se il cliente utilizza questo
	 *                             metodo
	 */

	public abstract boolean eliminaNumeroTelefonoAziendale() throws DipendenteException, ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: eliminatipologiaContratto </b>
	 * <p>
	 * Quest'operazione ha lo scopo di eliminarela tipologia di contratto del
	 * dipendente.
	 *
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws DipendenteException genera un errore nel caso in cui il valore della
	 *                             tipologia di contratto del dipendente è già vuoto
	 * @throws ClienteException    Solleva l'eccezione se il cliente utilizza questo
	 *                             metodo
	 */

	public abstract boolean eliminatipologiaContratto() throws DipendenteException, ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: eliminaRuolo </b>
	 * <p>
	 * Quest'operazione ha lo scopo di eliminare il ruolo del dipendente.
	 *
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws DipendenteException genera un errore nel caso in cui il valore del
	 *                             ruolo del dipendente all'inerno dell'azienda è
	 *                             già vuoto
	 * @throws ClienteException    Solleva l'eccezione se il cliente utilizza questo
	 *                             metodo
	 */

	public abstract boolean eliminaRuolo() throws DipendenteException, ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: visualizzaCodiceIdentificativoDipendete </b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare il codice identiticativo del
	 * dipendente, ritornandola.
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 * 
	 * @return String varibile contente il condice identificativo del dipendente
	 * @throws ClienteException genera un eccezione nel caso in cui questo metodo
	 *                          viene utilizzato dal cliente
	 */

	public abstract String visualizzaCodiceIdentificativoDipendete() throws ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: visualizzaNomeAziendaDipendente </b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare il nome dell'azienda del
	 * dipendente, ritornandola.
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 * 
	 * @return String varibile contente il nome dell'azienda dove lavora il
	 *         dipendente
	 * 
	 * @throws ClienteException genera un eccezione nel caso in cui questo metodo
	 *                          viene utilizzato dal cliente
	 */

	public abstract String visualizzaNomeAziendaDipendente() throws ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: visualizzaEmailAziendaleDipendente </b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare il l'email aziendale del
	 * dipendente, ritornandola.
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 * 
	 * @return String varibaile contente l'email aziendale del dipendente
	 * 
	 * @throws ClienteException genera un eccezione nel caso in cui questo metodo
	 *                          viene utilizzato dal cliente
	 */

	public abstract String visualizzaEmailAziendaleDipendente() throws ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: visualizzaEmailAziendaleDipendente </b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare il l'email aziendale del
	 * dipendente, ritornandola.
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 * 
	 * @return String varibaile contente il numero telefono aziendale del dipendente
	 * @throws ClienteException genera un eccezione nel caso in cui questo metodo
	 *                          viene utilizzato dal cliente
	 */

	public abstract String visualizzaNumeroTelefonoAziendaleDipendente() throws ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: visualizzatipologiaContrattoDipendente </b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare la tipologia di contratto del
	 * dipendente, ritornandola.
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 * 
	 * @return String varibile contente la tipologia di contratto del dipendente
	 * @throws ClienteException genera un eccezione nel caso in cui questo metodo
	 *                          viene utilizzato dal cliente
	 */

	public abstract ConstantGlobal.TIPO_CONTRATTO visualizzatipologiaContrattoDipendente() throws ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: visualizzaRuoloDipendente </b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare il ruolo del dipendente,
	 * ritornandola.
	 * 
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 * 
	 * @return String varibile contente il ruolo del dipendente
	 * @throws ClienteException genera un eccezione nel caso in cui questo metodo
	 *                          viene utilizzato dal cliente
	 */

	public abstract String visualizzaRuoloDipendente() throws ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: visualizzaElencoTvRiparate</b>
	 * <p>
	 * Questo metodo consente di visualizzare l'elenco delle tv riparate.
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 * 
	 * @return Set varibile contente le ripazrioni che ha effettuato il dipendente
	 * @throws ClienteException genera un eccezione nel caso in cui questo metodo
	 *                          viene utilizzato dal cliente
	 */

	public abstract Set<Riparazione> visualizzaElencoTvRiparate() throws ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: visualizzaElencoTvVendute</b>
	 * <p>
	 * Questo metodo consente di visualizzare l'elenco delle tv vendute.
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @return Set varibile contente le vendite che ha effettuato il dipendente
	 * @throws ClienteException genera un eccezione nel caso in cui questo metodo
	 *                          viene utilizzato dal cliente
	 */

	public abstract Set<Vendita> visualizzaElencoTvVendute() throws ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: addNomeCartaFedelta</b>
	 * <p>
	 * Questo metodo consente di acquisire il nome della carta di fedeltà del
	 * cliente
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @param nomeCartaFedelta Variabile di tipo stringa che contiene il nome della
	 *                         carta di fedeltà del cliente inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * @throws ClienteException    Solleva l'eccezione se il nome della carta di
	 *                             fedeltà è errato o è stato già inserito
	 * 
	 * @throws DipendenteException Solleva l'eccezione se il dipendente utilizza
	 *                             questo metodo
	 */

	public abstract boolean addNomeCartaFedelta(String nomeCartaFedelta) throws ClienteException, DipendenteException;

	/**
	 * 
	 * <b> OPERAZIONE: addPuntiFedeltaAccumulati</b>
	 * <p>
	 * Questo metodo consente di acquisire i punti della carta carta di fedeltà del
	 * cliente
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @param puntiFedelta Variabile di tipo stringa che contiene il i punti carta
	 *                     di fedeltà del cliente inserito dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * @throws ClienteException    Solleva l'eccezione se i punti della carta di
	 *                             fedeltà sono errati o è sono stati già inseriti
	 * 
	 * @throws DipendenteException Solleva l'eccezione se il dipendente utilizza
	 *                             questo metodo
	 */

	public abstract boolean addPuntiFedeltaAccumulati(String puntiFedelta) throws ClienteException, DipendenteException;

	/**
	 * 
	 * <b> OPERAZIONE: addDataInscrizioneTessera</b>
	 * <p>
	 * Questo metodo consente di acquisire la data di inscrizione carta di fedeltà
	 * del cliente
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @param dataInscrizioneTessera Variabile di tipo stringa che contiene la data
	 *                               di inscrizione della carta di fedeltà del
	 *                               cliente inserita dall'utente.
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * @throws ClienteException    Solleva l'eccezione se la data della carta di
	 *                             fedeltà è errata o è già inserita
	 * 
	 * @throws DipendenteException Solleva l'eccezione se il dipendente utilizza
	 *                             questo metodo
	 */

	public abstract boolean addDataInscrizioneTessera(String dataInscrizioneTessera)
			throws ClienteException, DipendenteException;

	/**
	 * 
	 * <b> OPERAZIONE: addNumeroCartaFedelta</b>
	 * <p>
	 * Questo metodo consente di acquisire il numero di carta di fedeltà del cliente
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * @throws ClienteException    Solleva L'eccezione se il numero della carta di
	 *                             fedeltà già inserita o ha avuto problemi nella
	 *                             generazione
	 * 
	 * @throws DipendenteException Solleva l'eccezione se il dipendente utilizza
	 *                             questo metodo
	 */

	public abstract boolean addNumeroCartaFedelta() throws ClienteException, DipendenteException;

	/**
	 * 
	 * <b> OPERAZIONE: VisualizzaElencoTipologiaContratto</b>
	 * <p>
	 * Questo metodo consente di visualizzare l'elenco delle tipologia di contratto
	 * del dipendente
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 * 
	 * @throws ClienteException genera un eccezione nel caso in cui questo metodo
	 *                          viene utilizzato dal cliente
	 * 
	 */

	public abstract void VisualizzaElencoTipologiaContratto() throws ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: visualizzaElencoOperazioniPunti</b>
	 * <p>
	 * Questo metodo consente di visualizzare l'elenco delle operazioni della carta
	 * di fedeltà del cliente
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 * 
	 * @throws DipendenteException genera un eccezione nel caso in cui questo metodo
	 *                             viene utilizzato dal dipendente
	 * 
	 */

	public abstract void visualizzaElencoOperazioniPunti() throws DipendenteException;

	/**
	 * 
	 * <b> OPERAZIONE: VisualizzaNomeCartaFedelta</b>
	 * <p>
	 * Questo metodo consente di visualizzare il nome della carta di fedeltà del
	 * cliente
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 * 
	 * @return varibile stringa contente il nome della carta di fedeltà
	 * 
	 * @throws DipendenteException genera un eccezione nel caso in cui questo metodo
	 *                             viene utilizzato dal dipendente
	 */

	public abstract String VisualizzaNomeCartaFedelta() throws DipendenteException;

	/**
	 * 
	 * <b> OPERAZIONE: VisualizzaPuntiFedeltaAccumulati</b>
	 * <p>
	 * Questo metodo consente di visualizzare i punti della carta di fedeltà del
	 * cliente
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 * 
	 * @return vairiabile String contenete la data di inscrizione della tessera del
	 *         cliente
	 * 
	 * @throws DipendenteException genera un eccezione nel caso in cui questo metodo
	 *                             viene utilizzato dal dipendente
	 */

	public abstract String VisualizzaPuntiFedeltaAccumulati() throws DipendenteException;

	/**
	 * 
	 * <b> OPERAZIONE: VisualizzaDataInscrizioneTessera</b>
	 * <p>
	 * Questo metodo consente di visualizzare il numero della carta di fedeltà del
	 * cliente
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 * 
	 * @return vairiabile String contenete la data di inscrizione della tessera del
	 *         cliente
	 * 
	 * @throws DipendenteException genera un eccezione nel caso in cui questo metodo
	 *                             viene utilizzato dal dipendente
	 */

	public abstract String VisualizzaDataInscrizioneTessera() throws DipendenteException;

	/**
	 * 
	 * <b> OPERAZIONE: VisualizzaNumeroCartaFedelta</b>
	 * <p>
	 * Questo metodo consente di visualizzare il numero della carta di fedeltà del
	 * cliente
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @return Variabile String contente il numero di carta di fedeltà del cliente
	 * 
	 * @throws DipendenteException genera un eccezione nel caso in cui questo metodo
	 *                             viene utilizzato dal dipendente
	 */

	public abstract String VisualizzaNumeroCartaFedelta() throws DipendenteException;

	/**
	 * 
	 * <b> OPERAZIONE: VisualizzaCodiceFiscale</b>
	 * <p>
	 * Questo metodo consente di visualizzare il codice fiscale del cliente
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @return Variabile String contente il il codice fiscale del cliente
	 * 
	 * @throws DipendenteException genera un eccezione nel caso in cui questo metodo
	 *                             viene utilizzato dal dipendente
	 */

	public abstract String VisualizzaCodiceFiscale() throws DipendenteException;

	/**
	 * 
	 * <b> OPERAZIONE: eliminaNomeCartaFedelta</b>
	 * <p>
	 * Questo metodo consente di eliminare i nomi della carta di fedeltà del cliente
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws ClienteException    genera un errore nel caso in cui il valore del
	 *                             nome della carta di fedeltà è già vuoto
	 * @throws DipendenteException Solleva l'eccezione se il dipendente utilizza
	 *                             questo metodo
	 */

	public abstract boolean eliminaNomeCartaFedelta() throws ClienteException, DipendenteException;

	/**
	 * 
	 * <b> OPERAZIONE: eliminaPuntiAccumulati</b>
	 * <p>
	 * Questo metodo consente di eliminare i punti della carta di fedeltà del
	 * cliente
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws ClienteException    genera un errore nel caso in cui il valore dei
	 *                             punti della carta di fedeltà è già vuoto
	 * @throws DipendenteException Solleva l'eccezione se il dipendente utilizza
	 *                             questo metodo
	 */

	public abstract boolean eliminaPuntiAccumulati() throws ClienteException, DipendenteException;

	/**
	 * 
	 * <b> OPERAZIONE: eliminaDataInscrizioneTessera</b>
	 * <p>
	 * Questo metodo consente di eliminare la data di inscrizione della carta di
	 * fedeltà del cliente
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws ClienteException    genera un errore nel caso in cui il valore della
	 *                             data della carta di fedeltà è già vuoto
	 * @throws DipendenteException Solleva l'eccezione se il dipendente utilizza
	 *                             questo metodo
	 */

	public abstract boolean eliminaDataInscrizioneTessera() throws ClienteException, DipendenteException;

	/**
	 * 
	 * <b> OPERAZIONE: eliminaNumeroCartaFedelta</b>
	 * <p>
	 * Questo metodo consente di eliminare il nome della carta di fedeltà del
	 * cliente
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws ClienteException    genera un errore nel caso in cui il valore del
	 *                             numero della carta di fedeltà è già vuoto
	 * @throws DipendenteException Solleva l'eccezione se il dipendente utilizza
	 *                             questo metodo
	 */
	public abstract boolean eliminaNumeroCartaFedelta() throws ClienteException, DipendenteException;

	/**
	 * 
	 * <b> OPERAZIONE: modificaNomeCartaFedelta</b>
	 * <p>
	 * Questo metodo consente di modificare il nome della carta di fedeltà del
	 * cliente
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 * 
	 * 
	 * @param nomeCartaFedelta Variabile di tipo stringa che contiene il nome della
	 *                         carta di fedeltà del cliente inserito dall'utente
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws ClienteException    genera un errore nel caso in cui il valore della
	 *                             data della carta di fedeltà è già vuoto
	 * @throws DipendenteException Solleva l'eccezione se il dipendente utilizza
	 *                             questo metodo
	 */
	public abstract boolean modificaNomeCartaFedelta(String nomeCartaFedelta)
			throws ClienteException, DipendenteException;

	/**
	 * 
	 * <b> OPERAZIONE: modificaPuntiFedeltaAccumulati</b>
	 * <p>
	 * Questo metodo consente di modificare i punti della carta di fedeltà del
	 * cliente
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 * 
	 * @param puntiFedelta Variabile di tipo stringa che contiene i punti della
	 *                     carta di fedeltà del cliente inserito dall'utente
	 * @param operazione   Variabile di tipo OPERAZIONE_PUNTI_FEDELTA che contiente
	 *                     l'operazione da effetturare sui punti del cliente
	 *                     inseriti dall'utente
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * @throws ClienteException    genera un errore nel caso in cui il valore della
	 *                             data della carta di fedeltà è già vuoto
	 * @throws DipendenteException Solleva l'eccezione se il dipendente utilizza
	 *                             questo metodo
	 */
	public abstract boolean modificaPuntiFedeltaAccumulati(String puntiFedelta,
			ConstantGlobal.OPERAZIONE_PUNTI_FEDELTA operazione) throws ClienteException, DipendenteException;

	/**
	 * 
	 * <b> OPERAZIONE: modificaDataInscrizioneTessera</b>
	 * <p>
	 * Questo metodo consente di modificare la data di inscrizione della tessera di
	 * fedeltà del cliente
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 * 
	 * @param dataInscrizioneTessera Variabile di tipo stringa che contiene la data
	 *                               di inscrizione della carta di fedeltà del
	 *                               cliente inserito dall'utente
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * @throws ClienteException    genera un errore nel caso in cui il valore della
	 *                             data della carta di fedeltà è già vuoto
	 * @throws DipendenteException Solleva l'eccezione se il dipendente utilizza
	 *                             questo metodo
	 */

	public abstract boolean modificaDataInscrizioneTessera(String dataInscrizioneTessera)
			throws ClienteException, DipendenteException;

	/**
	 * 
	 * <b> OPERAZIONE: riparaTv</b>
	 * <p>
	 * Questo metodo consente di riparare un televisore
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 * 
	 * @param dataRichiestaRiparazione Variabile di tipo String che contiente la
	 *                                 data di inizio riparazione del televisore
	 *                                 inserita dall'utente
	 * 
	 * @param dataPrevistaConsegna     Variabile di tipo String che contiente la
	 *                                 data di fine riparazione del televisore
	 *                                 inserita dall'utente
	 * 
	 * @param costoRiparazione         Variabile di tipo String che contiente il
	 *                                 costo della riparazione inserito dall'utente
	 * @param tvRiparata               Variabile di tipo Televisore che contiene la
	 *                                 tv da del cliente da riparare inserita
	 *                                 dall'utente
	 * @param clienteRiparazione       Variabile di tipo Cliente che contiene il
	 *                                 cliente che porta il televisore da riparare
	 *                                 inserito dall'utente
	 * @param informazioneRiparazione  Variabile di tipo String che contiente le
	 *                                 informazioni di riparazione del televisore
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * @throws ParseException       solleva un' eccezione nel caso in la data non
	 *                              viene correttamente parsializzata (non si
	 *                              rispetta il format della data impostato)
	 *
	 * @throws RiparazioneException solleva un 'eccezione nel caso in cui c'è stata
	 *                              qualche errore nella riparazione
	 * @throws ClienteException     Solleva l'eccezione se il cliente utilizza
	 *                              questo metodo
	 */

	public abstract boolean riparaTv(String dataRichiestaRiparazione, String dataPrevistaConsegna,
			String costoRiparazione, Cliente clienteRiparazione, Televisore tvRiparata, String informazioneRiparazione)
			throws ParseException, RiparazioneException, ClienteException;

	/**
	 * 
	 * <b> OPERAZIONE: vendiTv</b>
	 * <p>
	 * Questo metodo consente di vendere un televisore
	 * <p>
	 * Questo metodo verrà implementato nelle classi figlie. Maggiori dettagli
	 * saranno forniti al momento dell'implementazione.
	 * 
	 * @param tv            Variabile di tipo Televisore che contiene la tv da
	 *                      vedere al cliente inserita dall'utente
	 * @param cliente       Variabile di tipo Cliente che contiene il cliente che
	 *                      acquista il televisore inserito dall'utente
	 * @param PrezzoVendita Variabile di tipo String che contiente il prezzo di
	 *                      vendita del televisore
	 * 
	 * @return Variabile ti tipo boolean che rappresenta se l'operazione è andata a
	 *         buon fine oppure no.
	 */

	public abstract boolean vendiTv(Televisore tv, Cliente cliente, String PrezzoVendita)
			throws PersonaException, TelevisoreException, DipendenteException;

}
