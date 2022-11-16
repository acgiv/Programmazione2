package Cecinato_cs2022.Dipendente;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import Cecinato_cs2022.Cliente.Cliente;
import Cecinato_cs2022.ClienteException.ClienteException;
import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.ConstantGlobal.ConstantGlobal.TIPO_CONTRATTO;
import Cecinato_cs2022.ControlliGlobal.ControlliGlobal;
import Cecinato_cs2022.DipendenteException.DipendenteException;
import Cecinato_cs2022.DipendenteException.RiparazioneException;
import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;
import Cecinato_cs2022.ExceptionPersona.PersonaException;
import Cecinato_cs2022.Persona.AbstractPersona;
import Cecinato_cs2022.TelevisoreService.Televisore;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 * <p>
 * <b> CLASSE: Dipendente </b>
 * <p>
 * Questa classe ha lo scopo di definire tutte le caratteristiche di tutti i
 * dipendenti.
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

public class Dipendente extends AbstractPersona implements Serializable {

	private static final long serialVersionUID = 1L;

	/// ********************************************
	/// ATTRIBUTI
	/// ********************************************

	/**
	 * {@link SimpleDateFormat} instanzia che indica il formato della forma della
	 * data
	 */
	private static final SimpleDateFormat sdf = new SimpleDateFormat(ConstantGlobal.FORMATO_DATA);

	/**
	 * {@link int} instanzia che verrà utilizzata per incremenate il numero di tv
	 * vendute
	 */
	private static int incrementNumeroTv = 0;
	/**
	 * {@link Date} instanzia che indica la data odierna
	 */
	private static Date dataGiorno;
	/**
	 * {@link Set<String>} instanzia che indica l'elenco del codice identificativo
	 * del dipendente
	 */
	private static Set<String> elencoCodiceIdentificativo = new TreeSet<String>();
	/**
	 * {@link Set<Vendita>} instanzia che indica l'elenco delle tv vendute dal
	 * dipendente
	 */
	private Set<Vendita> TvVendute;
	/**
	 * {@link Set<Riparazione>} instanzia che indica l'elenco delle tv riparare dal
	 * dipendente
	 */
	private Set<Riparazione> tvRiparate;
	/**
	 * {@link int} instanzia che indica il numero di tv riparate
	 */
	private int numeroTvVendute;
	/**
	 * {@link String} instanzia che indica il codice identificativo
	 */
	private String codiceIdentificativo;
	/**
	 * {@link String} instanzia che indica il nome dell'azienda
	 */
	private String nomeAzienda;
	/**
	 * {@link String} instanzia che indica l'email dell'azienda
	 */
	private String emailAzienda;
	/**
	 * {@link String} instanzia che indica il numero telefonico aziendale
	 */
	private String numeroTelefonoAziendale; // ( Formato: +99 9999999999 )
	/**
	 * {@link ConstantGlobal.TIPO_CONTRATTO} instanzia che indica la tipologia di
	 * contratto del dipendente
	 */
	private ConstantGlobal.TIPO_CONTRATTO tipologiaContratto;
	/**
	 * {@link String} instanzia che indica il ruolo del dipendente
	 */
	private String ruolo;

	/**
	 * 
	 * <b> COSTRUTTORE: Dipendente </b>
	 * <p>
	 * Questo è il costruttore della classe Dipedente. <br>
	 * In particolare, tale costrutture avrà un sono paramentro
	 * codiceIdentificativo, che indicherà l'unicità del dipendente.<br>
	 * Il codice identificativo passato come parametro verrà controllato se è già
	 * presente o formalemnte corretto.<br>
	 * Se rispetta tutte le conformità allora verrà aggiunto nella lista dei codici
	 * fiscali univoci attraverso la nomenclatura super() e l'oggetto persona verrà
	 * instanziato. Altrimenti genererà un eccezione. In oltre, ogni singolo
	 * attributo sarà valorizzato con l'apposito metodo add.
	 * 
	 * @param codiceIdentificativo Variabile di tipo stringa che contiene il codice
	 *                             identificativo del dipendente inserito
	 *                             dall'utente.
	 * @throws DipendenteException Sollevata nel caso in cui il codice
	 *                             identificativo del cliente è già esistente o
	 *                             errato
	 * 
	 */

	public Dipendente(String codiceIdentificativo) throws DipendenteException {
		if (controlloIdentificativo(codiceIdentificativo)) {
			this.codiceIdentificativo = codiceIdentificativo;
			elencoCodiceIdentificativo.add(codiceIdentificativo);
		}
		this.tvRiparate = new HashSet<Riparazione>();
		this.TvVendute = new HashSet<Vendita>();
	}

	/**
	 * 
	 * <b> OPERAZIONE: setCodiceFiscale </b>
	 * <p>
	 * Quest'operazione ha lo scopo di settare il codice identificativo del
	 * dipendente attraverso il parametro codiceIdentificativo e assegnarlo al
	 * dipendente<br>
	 * 
	 * @param codiceIdentificativo Variabile di tipo stringa che contiene il codice
	 *                             identificativo del dipendente inserito
	 *                             dall'utente.
	 * 
	 * 
	 */

	private void setCodiceIdentificativo(String codiceIdentificativo) {
		this.codiceIdentificativo = codiceIdentificativo;
	}

	/**
	 * 
	 * <b> OPERAZIONE: getDataGiorno </b>
	 * <p>
	 * Quest'operazione ha lo scopo di ritornare la data del giorno del dipendete
	 * che sta effettuando ne vendite del attraverso il parametro dataGiorno e
	 * assegnarlo al dataGiorno<br>
	 * 
	 * @return dataGiorno Variabile di tipo Date che contiene la data del giorno in
	 *         cui il dipendente effettua la vendita
	 * 
	 * 
	 * 
	 */

	public static Date getDataGiorno() {
		return dataGiorno;
	}

	/**
	 * 
	 * <b> OPERAZIONE: setDataGiorno </b>
	 * <p>
	 * Quest'operazione ha lo scopo di settare la data del giorno del dipendete che
	 * sta effettuando ne vendite del attraverso il parametro dataGiorno e
	 * assegnarlo al dataGiorno<br>
	 * 
	 * @param dataGiorno Variabile di tipo Date che contiene la data del giorno in
	 *                   cui il dipendente effettua la vendita
	 * 
	 * 
	 * 
	 */

	public static void setDataGiorno(Date dataGiorno) {
		Dipendente.dataGiorno = dataGiorno;
	}

	@Override
	public String toString() {
		String stringa = null;
		stringa = String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_DIPENDENTE, "_"))
				.concat("\n");
		stringa += String.format("| %110s %10s %121s", ConstantGlobal.TITOLO_TABELLA_DIPENDENTE,
				this.codiceIdentificativo, "|\n");
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_DIPENDENTE, "_"))
				.concat("\n");
		stringa += ConstantGlobal.TABELLA_DIPENDENTE;
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_DIPENDENTE, "_"))
				.concat("\n");
		stringa += String.format(
				"| %16s %7s %10s %5s %9s %5s %6s %5s %9s %4s %11s %5s %9s %5s %16s %5s %28s %5s %15s %4s %13s %5s %17s %6s \n",
				this.codiceIdentificativo, " | ", super.VisualizzaNome(), " | ", super.VisualizzaCognome(), " | ",
				super.VisualizzaEta(), " | ", super.VisualizzaGenere(), " | ", VisualizzaDataNascita(), " | ",
				super.VisualizzaCitta(), " | ", this.ruolo, " | ", this.emailAzienda, " | ",
				this.numeroTelefonoAziendale, " | ", this.nomeAzienda, " | ", this.tipologiaContratto, " | ");
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_DIPENDENTE, "_"))
				.concat("\n");
		return stringa;
	}

	/**
	 * 
	 * <b> OPERAZIONE: calcoloEmailAzienda</b>
	 * <p>
	 * Questa operazione consente di concatenare più stringhe per generare l'email
	 * aziendale. l'email azienale è formata da: nome.cognome@nomeAzienda.com. Per
	 * ottenere le informazioni che servono per comporre l'email del dipendete ci
	 * serviamo del metodo visualizza.
	 * 
	 * @return Stringa contente l'email aziendale del dipendente
	 * 
	 * 
	 */

	private String calcoloEmailAzienda() {
		return (super.VisualizzaNome().replace(" ", "").concat(super.VisualizzaCognome().replace(" ", "")).concat("@")
				.concat(this.nomeAzienda.replace(" ", "")).concat(".com")).toLowerCase();
	}

	/**
	 * 
	 * <b> METODO: VisualizzaElencoTipologiaContratto</b>
	 * <p>
	 * Questo metodo consente di far visualizzare l'elenco delle tipologie di
	 * contratto che possono avedere i dipendenti
	 * 
	 */

	public void VisualizzaElencoTipologiaContratto() throws ClienteException {
		int i = 1;
		for (ConstantGlobal.TIPO_CONTRATTO item : ConstantGlobal.TIPO_CONTRATTO.values()) {
			System.out.println(
					String.valueOf(i).concat(") ").concat(String.valueOf(item).replace("_", " ")).toLowerCase());
			i += 1;
		}
	}

	/**
	 * 
	 * <b> METODO: controlloIdentificativo </b>
	 * <p>
	 * Questo metodo consente di controllare la corretteza codice identificativo e
	 * riscontrare se è prensente nell'elenco dei codici identificativi instanziati.
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo
	 * codiceIdentificativo, e controlliamo se è presente nella lista di codici
	 * identificativi instanziati.
	 * <p>
	 * Il valore di ritorno, assumerà il valore true non è stato trovato nell'elenco
	 * 
	 * 
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione sulla corretta e unicità del codice
	 *         identificativo
	 * 
	 * 
	 */

	protected boolean controlloIdentificativo(String codiceIdentificativo) throws DipendenteException {
		boolean result = true;
		if (StringUtils.isNotBlank(codiceIdentificativo)
				/// controlla la correttezza del codice identificativo alfanumerico lungo 10
				&& codiceIdentificativo.trim().matches(ConstantGlobal.REGEX_CONTROLLO_CODICE_IDENTIFICATIVO)) {
			Iterator<String> element = elencoCodiceIdentificativo.iterator();
			while (element.hasNext()) {
				if (StringUtils.equals(element.next(), codiceIdentificativo)) /// controlla che l'identificativo è
																				/// presente
					result = false;
			}
			if (!result) {
				throw new DipendenteException("Il codice Identificativo esiste già");
			}
		} else {
			throw new DipendenteException("Il codice Identificativo è errato");
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: eliminaIdentificativo </b>
	 * <p>
	 * Questo metodo consente di eliminare il codice identificativo dall'elenco dei
	 * codici identificativi instanziati.
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo
	 * codiceIdentificativo, e controlliamo se è presente nella lista di codici
	 * identificativi instanziati.
	 * <p>
	 * Il valore di ritorno, assumerà il valore true se è stato cancellato
	 * 
	 * 
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione andata a buon fine oppure no
	 * 
	 * 
	 */

	private boolean eliminaIdentificativo() throws DipendenteException {
		boolean result = true;
		Iterator<String> element = elencoCodiceIdentificativo.iterator();
		while (element.hasNext()) {
			if (StringUtils.equals(element.next(), codiceIdentificativo)) {
				element.remove();
			}
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: addNomeAzienda </b>
	 * <p>
	 * Quest'operazione ha lo scopo di aggiungere il nome dell'azienda del
	 * dipendente attraverso il parametro nomeAzienda e assegnarlo se corretto al
	 * nomeAzienda <br>
	 * Essendo che il nome dell'azienda del dipendente dovrà necessariamente essere
	 * fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * il nome dell'azienda per essere aggiunta deve essere vuoto (in tal caso si
	 * utilizzi il metodo modifica) ed deve contenere solo stringhe.
	 * 
	 * 
	 * @param nomeAzienda Variabile di tipo stringa che contiene il nome
	 *                    dell'azienda del dipendente
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	@Override
	public boolean addNomeAzienda(String nomeAzienda) throws DipendenteException, ClienteException {
		boolean result = false;
		if (StringUtils.isNotBlank(nomeAzienda) && StringUtils.isAlphaSpace(nomeAzienda)) {
			if (StringUtils.isEmpty(this.nomeAzienda)) {
				this.nomeAzienda = ControlliGlobal.upperCaseFirst(nomeAzienda.trim());
				result = true;
			} else {
				throw new DipendenteException(
						"errore, non può essere aggiunto il nome dell'azienda del dipendente perchè  è stato già inserito");
			}
		} else {
			throw new DipendenteException("Errore nell'inserimento del nome dell 'azienda dove lavora il dipendente");
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: addNumeroTelefonoAziendale </b>
	 * <p>
	 * Quest'operazione ha lo scopo di aggiungere il numero di telefono del
	 * dipendente attraverso il parametro numeroTelefonoAziendale e assegnarlo se
	 * corretto al numeroTelefonoAziendale <br>
	 * Essendo cheil numero di contratto del dipendente dovrà necessariamente essere
	 * fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * il numeroTelefonoAziendale per essere modificata deve essere vuoto (in tal
	 * caso si utilizzi il metodo modifica) ed deve rispettare il formato telefonico
	 * prefedito <i><u>+39 3085645678</u></i> .
	 * 
	 * 
	 * @param numeroTelefonoAziendale Variabile di tipo stringa che contiene la il
	 *                                numero telefonico del dipendente
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	@Override
	public boolean addNumeroTelefonoAziendale(String numeroTelefonoAziendale)
			throws DipendenteException, ClienteException {
		boolean result = false;
		if (StringUtils.isNotBlank(numeroTelefonoAziendale)
				&& numeroTelefonoAziendale.trim().matches(ConstantGlobal.REGEX_CONTROLLO_NUMERO_TELEFONO)) {
			if (StringUtils.isEmpty(this.numeroTelefonoAziendale)) {
				this.numeroTelefonoAziendale = numeroTelefonoAziendale.trim();
				result = true;
			} else {
				throw new DipendenteException(
						"errore, non può essere aggiunto il numero di telefono del dipendente perchè è stato già inserito");
			}
		} else {
			throw new DipendenteException("Errore nell'inserimento del numero di telefono del dipendente");
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: addtipologiaContratto </b>
	 * <p>
	 * Quest'operazione ha lo scopo di aggiungere la tipologia di contratto del
	 * dipendente attraverso il parametro tipologiaContratto e assegnarla alla
	 * tipologiaContratto <br>
	 * Essendo che la tipologia di contratto del dipendente dovrà necessariamente
	 * essere fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * La tipologia per essere modificata deve essere vuota (in tal caso si utilizzi
	 * il metodo modifica) ed deve essere riscontrata tra i contratti prensenti in
	 * ConstantGlobal.TIPO_CONTRATTO
	 * 
	 * 
	 * @param tipologiaContratto Variabile di tipo stringa che contiene la tipologia
	 *                           di contratto del dipendente
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	@Override
	public boolean addtipologiaContratto(String tipologiaContratto) throws DipendenteException, ClienteException {
		boolean result = false;
		if (StringUtils.isNotBlank(tipologiaContratto)
				&& controlloTipoContratto(tipologiaContratto.trim().replace(" ", "_").toUpperCase())) {
			if (this.tipologiaContratto == null) {
				this.tipologiaContratto = ConstantGlobal.TIPO_CONTRATTO
						.valueOf(tipologiaContratto.trim().replace(" ", "_").toUpperCase());
				result = true;
			} else {
				throw new DipendenteException(
						"errore, non può essere aggiunto il tipo di contratto del dipendente perchè  è stato già inserito");
			}
		} else {
			throw new DipendenteException("Errore nell'inserimento del tipo di contratto del dipendente");
		}
		return result;
	}

	/**
	 * 
	 * <b> addEmailAziendale</b>
	 * <p>
	 * Questo metodo consente di generare l'indirizzo di posta elettronica del
	 * dipendente.
	 * <p>
	 * L'indirizzo email verrà generato dal sistema in base ai dati precedentemente
	 * forniti dall'utente, quali: nome, cognome, e nome dell'azienda in cui lavora
	 * il dipedente. <br>
	 * Dunque, questo metodo concatena questi parametri per generare una email del
	 * tipo <i><u>nome.cognome@nomeAzienda.com</u></i> .
	 * <p>
	 * In oltre questo metodo può essere utilizzato se l'attributo emailAzienda è
	 * vuoto (se non lo fosse se non lo fosse in tal caso si utilizzi il metodo
	 * modifica)
	 * 
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 */

	@Override
	public boolean addEmailAziendale() throws DipendenteException, ClienteException {
		boolean result = false;
		if (StringUtils.isEmpty(this.emailAzienda)) {
			/// controllo che il nome, cognome e nomeAziendale non siano vuoti
			if (StringUtils.isNotBlank(super.VisualizzaNome()) && StringUtils.isNotBlank(super.VisualizzaCognome())
					&& StringUtils.isNotBlank(this.nomeAzienda)) {
				this.emailAzienda = calcoloEmailAzienda(); /// chiamo il metodo che mi genera l'email
				result = true;
			} else {
				throw new DipendenteException(
						"errore, l'email non può essere creata se manca uno di questi campi:\n1) NOME DEL DIPENDETE \n2)COGNOME DEL DIPENTE  \n3) IL NOME DELL'AZIENDA A CUI LAVORA");
			}
		} else {
			throw new DipendenteException(
					"errore, non può essere aggiunta l'email del dipendente perchè  è stata già inserita");
		}

		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: addRuolo </b>
	 * <p>
	 * Quest'operazione ha lo scopo di aggiungere il ruolo del dipendente attraverso
	 * il parametro ruolo e assegnarlo se corretto al ruolo <br>
	 * Essendo che il ruolo del dipendente dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza.
	 * <p>
	 * il ruolo per essere aggiunto non deve essere vuoto (in tal caso si utilizzi
	 * il metodo modifica) ed deve contenere sono stringhe
	 * 
	 * 
	 * @param ruolo Variabile di tipo stringa che contiene il ruolo del dipendente
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	@Override
	public boolean addRuolo(String ruolo) throws DipendenteException, ClienteException {
		boolean result = false;
		if (StringUtils.isNotBlank(ruolo) && StringUtils.isAlphaSpace(ruolo)) {
			if (StringUtils.isEmpty(this.ruolo)) {
				this.ruolo = ControlliGlobal.upperCaseFirst(ruolo.trim());
				result = true;
			} else {
				throw new DipendenteException(
						"errore, non può essere aggiunto il ruolo del dipendente  perchè è stato già inserito");
			}
		} else {
			throw new DipendenteException("Errore nell'inserimento del ruolo del dipendente");
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: modificaNomeAzienda </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare il nome dell'azienda del
	 * dipendente attraverso il parametro nomeAzienda e assegnarlo se corretto al
	 * nomeAzienda <br>
	 * Essendo che il nome dell'azienda del dipendente dovrà necessariamente essere
	 * fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * il nomeAzienda per essere modificata non deve essere vuota (in tal caso si
	 * utilizzi il metodo add) ed deve contenere sono stringhe
	 * 
	 * 
	 * @param nomeAzienda Variabile di tipo stringa che contiene il nome
	 *                    dell'azienda del dipendente
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	@Override
	public boolean modificaNomeAzienda(String nomeAzienda) throws DipendenteException, ClienteException {
		boolean result = false;
		if (StringUtils.isNotBlank(nomeAzienda) && StringUtils.isAlphaSpace(nomeAzienda)) {
			if (StringUtils.isNotBlank(this.nomeAzienda)) {
				this.nomeAzienda = ControlliGlobal.upperCaseFirst(nomeAzienda.trim());
				result = true;
			} else {
				throw new DipendenteException(
						"errore, non può essere modificato il nome della azienda dove lavora del dipendente perchè  non è stato ancora inserito");
			}
		} else {
			throw new DipendenteException("Errore nell'inserimento del nome dell' azienda dove lavora il dipendente");
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: modificaNumeroTelefonoAziendale </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare il numero di telefono del
	 * dipendente attraverso il parametro numeroTelefonoAziendale e assegnarlo se
	 * corretto al numeroTelefonoAziendale <br>
	 * Essendo cheil numero di contratto del dipendente dovrà necessariamente essere
	 * fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * il numeroTelefonoAziendale per essere modificata non deve essere vuoto (in
	 * tal caso si utilizzi il metodo add) ed deve rispettare il formato telefonico
	 * prefedito <i><u>+39 3085645678</u></i> .
	 * 
	 * 
	 * @param numeroTelefonoAziendale Variabile di tipo stringa che contiene la il
	 *                                numero telefonico del dipendente
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	@Override
	public boolean modificaNumeroTelefonoAziendale(String numeroTelefonoAziendale)
			throws DipendenteException, ClienteException {
		boolean result = false;
		if (StringUtils.isNotBlank(numeroTelefonoAziendale)
				&& numeroTelefonoAziendale.trim().matches(ConstantGlobal.REGEX_CONTROLLO_NUMERO_TELEFONO)) {
			if (StringUtils.isNotBlank(this.numeroTelefonoAziendale)) {
				this.numeroTelefonoAziendale = numeroTelefonoAziendale.trim();
				result = true;
			} else {
				throw new DipendenteException(
						"errore, non può essere modificato il numero di telefono del dipendente perchè non è stato ancora inserito");
			}
		} else {
			throw new DipendenteException("Errore nell'inserimento del numero di telefono del dipendente");
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: modificatipologiaContratto </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare la tipologia di contratto del
	 * dipendente attraverso il parametro tipologiaContratto e assegnarla alla
	 * tipologiaContratto <br>
	 * Essendo che la tipologia di contratto del dipendente dovrà necessariamente
	 * essere fornito dall'utente, dunque, si rendono necessari dei controlli per
	 * verificarne l'esattezza e la correttezza.
	 * <p>
	 * La tipologia per essere modificata non deve essere vuota (in tal caso si
	 * utilizzi il metodo add) ed deve essere riscontrata tra i contratti prensenti
	 * in ConstantGlobal.TIPO_CONTRATTO
	 * 
	 * 
	 * @param tipologiaContratto Variabile di tipo stringa che contiene la tipologia
	 *                           di contratto del dipendente
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	@Override
	public boolean modificatipologiaContratto(String tipologiaContratto) throws DipendenteException, ClienteException {
		boolean result = false;

		if (StringUtils.isNotBlank(tipologiaContratto)
				&& controlloTipoContratto(tipologiaContratto.trim().replace(" ", "_").toUpperCase())) {
			if (this.tipologiaContratto != null) {
				this.tipologiaContratto = ConstantGlobal.TIPO_CONTRATTO
						.valueOf(tipologiaContratto.trim().replace(" ", "_").toUpperCase());
				result = true;
			} else {
				throw new DipendenteException(
						"errore, non può essere modificato il tipo di contratto del dipendente perchè non è stato ancora inserito");
			}
		} else {
			throw new DipendenteException("Errore nell'inserimento il tipo di contratto del dipendente");
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: modificaCodiceFiscale</b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare il il codice identificativo del
	 * dipendente attraverso il parametro codiceIdentificativo e assegnarla al
	 * dipendente<br>
	 * Essendo che il codice identificativo dovrà necessariamente essere fornito
	 * dall'utente, dunque, si rendono necessari dei controlli per verificarne
	 * l'esattezza e la correttezza e l'unicità.
	 * 
	 * 
	 * @param codiceIdentificativo Variabile di tipo stringa che contiene la data il
	 *                             codice idenficativo del dipendente
	 * @return result Variabile ti tipo boolean che rappresenta se l'operazione è
	 *         andata a buon fine oppure no.
	 */

	@Override
	public boolean modificaCodiceIdentificativo(String codiceIdentificativo)
			throws DipendenteException, ClienteException {
		boolean result = false;
		if (controlloIdentificativo(codiceIdentificativo.trim())) { /// controllo se il codice identidicativo è
																	/// prensente nella lista di codici identidicativi
																	/// instanziati. In oltre controlla la correttezza
			eliminaIdentificativo(); /// se è presente lo elimina
			setCodiceIdentificativo(codiceIdentificativo); /// cambia il codice identificativo con quello nuovo
			elencoCodiceIdentificativo.add(codiceIdentificativo); /// aggiunge il nuovo codice nell'elenco di codici
																	/// identificativi instanziati
			result = true;
		}
		return result;
	}

	/**
	 * 
	 * <b> modificaEmailAziendale</b>
	 * <p>
	 * Questo metodo consente di generare l'indirizzo di posta elettronica del
	 * dipendente.
	 * <p>
	 * L'indirizzo email verrà generato dal sistema in base ai dati precedentemente
	 * forniti dall'utente, quali: nome, cognome, e nome dell'azienda in cui lavora
	 * il dipedente. <br>
	 * Dunque, questo metodo concatena questi parametri per generare una email del
	 * tipo <i><u>nome.cognome@nomeAzienda.com</u></i> .
	 * <p>
	 * In oltre questo metodo può essere utilizzato se l'attributo emailAzienda non
	 * è vuoto
	 * 
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 */

	@Override
	public boolean modificaEmailAziendale() throws DipendenteException, ClienteException {
		boolean result = false;
		if (StringUtils.isNotBlank(this.emailAzienda)) {
			/// controllo che gli attributi nome cognome ed Azienda non siano vuoti
			if (StringUtils.isNotBlank(super.VisualizzaNome()) && StringUtils.isNotBlank(super.VisualizzaCognome())
					&& StringUtils.isNotBlank(this.nomeAzienda)) {
				if (StringUtils.equals(emailAzienda, this.emailAzienda)) {
					this.emailAzienda = calcoloEmailAzienda(); /// chiama il metodo che crea l'email azienale
					result = true;
				} else {
					throw new DipendenteException(
							"la email non può essere modificata essendo che è la stessa che è gia presente");
				}
			} else {
				throw new DipendenteException(
						"errore, l'email non può essere modificata se manca uno di questi campi:\n1) NOME DEL DIPENDETE \n2)COGNOME DEL DIPENTE  \n3) IL NOME DELL'AZIENDA A CUI LAVORA");
			}
		} else {
			throw new DipendenteException(
					"errore, non può essere modificata l'email del dipendente perchè non è stata inserita");
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: modificaRuolo </b>
	 * <p>
	 * Quest'operazione ha lo scopo di modificare il ruolo del dipendente attraverso
	 * il parametro ruolo e assegnarla al ruolo<br>
	 * Essendo il ruolo dovrà necessariamente essere fornito dall'utente, dunque, si
	 * rendono necessari dei controlli per verificarne l'esattezza e la correttezza.
	 * <p>
	 * Questo metodo per essere utilizzato, il ruolo non deve essere vuoto.
	 * 
	 * 
	 * @param ruolo Variabile di tipo stringa che contiene il ruolo del dipendete
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * 
	 */

	@Override
	public boolean modificaRuolo(String ruolo) throws DipendenteException, ClienteException {
		boolean result = false;
		if (StringUtils.isNotBlank(ruolo) && StringUtils.isAlphaSpace(ruolo)) {
			if (StringUtils.isNotBlank(this.ruolo)) {
				this.ruolo = ControlliGlobal.upperCaseFirst(ruolo.trim().replace(" ", "_"));
				result = true;
			} else {
				throw new DipendenteException(
						"errore, non può essere modificato il ruolo del dipendente  perchè  non è stato ancora inserito");
			}
		} else {
			throw new DipendenteException("Errore nell'inserimento del ruolo del dipendente");
		}
		return result;
	}

	/**
	 * 
	 * <b> METODO: eliminaNomeAzienda </b>
	 * <p>
	 * Questo metodo consente di eliminare il nome dell'azienda del del dipendente
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo nomeAzienda, e
	 * controlliamo se è vuoto.
	 * <p>
	 * Il valore di ritorno, assumerà il valore true se è stato cancellato
	 * altrimenti false. Nel caso in cui il valore dell'attributo nomeAzienda è
	 * vuoto alzerà un eccezione
	 * 
	 * 
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione andata a buon fine oppure no
	 * 
	 * 
	 */

	@Override
	public boolean eliminaNomeAzienda() throws DipendenteException, ClienteException {
		boolean result = false;
		if (StringUtils.isNotBlank(this.nomeAzienda)) {
			this.nomeAzienda = null;
			result = true;
		} else {
			throw new DipendenteException(
					"errore, non può essere cancellato il numero di telefono aziendale del dipendente perchè non è stata ancora inserita");
		}

		return result;
	}

	/**
	 * 
	 * <b> METODO: eliminaNumeroTelefonoAziendale </b>
	 * <p>
	 * Questo metodo consente di eliminare il numero di telefono del del dipendente
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo
	 * numeroTelefonoAziendale, e controlliamo se è vuoto.
	 * <p>
	 * Il valore di ritorno, assumerà il valore true se è stato cancellato
	 * altrimenti false. Nel caso in cui il valore dell'attributo
	 * numeroTelefonoAziendale è vuoto alzerà un eccezione
	 * 
	 * 
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione andata a buon fine oppure no
	 * 
	 * 
	 */

	@Override
	public boolean eliminaNumeroTelefonoAziendale() throws DipendenteException, ClienteException {
		boolean result = false;
		if (StringUtils.isNotBlank(this.numeroTelefonoAziendale)) {
			this.numeroTelefonoAziendale = null;
			result = true;
		} else {
			throw new DipendenteException(
					"errore, non può essere cancellato il numero di telefono aziendale del dipendente perchè non è stata ancora inserita");
		}

		return result;
	}

	/**
	 * 
	 * <b> METODO: eliminatipologiaContratto </b>
	 * <p>
	 * Questo metodo consente di eliminare la tipologia di contratto del dipendente
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo
	 * tipologiaContratto, e controlliamo se è vuoto.
	 * <p>
	 * Il valore di ritorno, assumerà il valore true se è stato cancellato
	 * altrimenti false. Nel caso in cui il valore dell'attributo tipologiaContratto
	 * è vuoto alzerà un eccezione
	 * 
	 * 
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione andata a buon fine oppure no
	 * 
	 * 
	 */

	@Override
	public boolean eliminatipologiaContratto() throws DipendenteException, ClienteException {
		boolean result = false;
		if (this.tipologiaContratto != null) {
			this.tipologiaContratto = null;
			result = true;
		} else {
			throw new DipendenteException(
					"errore, non può essere cancellata la tipologia del contratto del dipendente perchè non è stata ancora inserita");
		}

		return result;
	}

	/**
	 * 
	 * <b> METODO: eliminaRuolo </b>
	 * <p>
	 * Questo metodo consente di eliminare ruolo del dipendente
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo ruolo, e
	 * controlliamo se è vuoto.
	 * <p>
	 * Il valore di ritorno, assumerà il valore true se è stato cancellato
	 * altrimenti false. Nel caso in cui il valore dell'attributo ruolo è vuoto
	 * alzerà un eccezione
	 * 
	 * 
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione andata a buon fine oppure no
	 * 
	 * 
	 */

	@Override
	public boolean eliminaRuolo() throws DipendenteException, ClienteException {
		boolean result = false;
		if (StringUtils.isNotBlank(this.ruolo)) {
			this.ruolo = null;
			result = true;
		} else {
			throw new DipendenteException(
					"errore, non può essere cancellato il ruolo del dipendente perchè non è stato ancora inserito");
		}

		return result;
	}

	/**
	 * 
	 * <b> METODO: eliminaEmailAziendale </b>
	 * <p>
	 * Questo metodo consente di eliminare l'email azienale del dipendente
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo emailAzienda,
	 * e controlliamo se è vuoto.
	 * <p>
	 * Il valore di ritorno, assumerà il valore true se è stato cancellato
	 * altrimenti false. Nel caso in cui il valore dell'attributo emailAzienda è
	 * vuoto alzerà un eccezione
	 * 
	 * 
	 * @return result Variabile di tipo boolean che contiene l'esito positivo o
	 *         negativo dell'operazione andata a buon fine oppure no
	 * 
	 * 
	 */

	@Override
	public boolean eliminaEmailAziendale() throws DipendenteException, ClienteException {
		boolean result = false;
		if (StringUtils.isNotBlank(this.emailAzienda)) {
			this.emailAzienda = null;
			result = true;
		} else {
			throw new DipendenteException(
					"errore, non può essere cancellata l'email del dipendente perchè non è stata ancora inserita");
		}

		return result;
	}

	/**
	 * 
	 * <b> METODO: visualizzaCodiceIdentificativoDipendete</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante la Stringa contente il
	 * codice identificativo del dipendente
	 * 
	 * 
	 * @return codiceIdentificativo, Variabile di tipo String contenete il codice
	 *         identificativo del dipendente
	 */

	@Override
	public String visualizzaCodiceIdentificativoDipendete() throws ClienteException {
		return this.codiceIdentificativo;
	}

	/**
	 * 
	 * <b> METODO: visualizzaNomeAziendaDipendente</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante la Stringa contente il nome
	 * dell'azienda dove lavora il dipendente
	 * 
	 * 
	 * @return emailAzienda, Variabile di tipo String email
	 */

	@Override
	public String visualizzaNomeAziendaDipendente() throws ClienteException {
		return this.nomeAzienda;
	}

	/**
	 * 
	 * <b> METODO: visualizzaEmailAziendaleDipendente</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante la Stringa contente l'email
	 * aziendale del dipendente
	 * 
	 * 
	 * @return emailAzienda, Variabile di tipo String contente l'email del
	 *         dipendente
	 */

	@Override
	public String visualizzaEmailAziendaleDipendente() throws ClienteException {
		return this.emailAzienda;
	}

	/**
	 * 
	 * <b> METODO: visualizzaNumeroTelefonoAziendaleDipendente</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante la Stringa contente il
	 * numero di telefono aziendale del dipendente
	 * 
	 * 
	 * @return numeroTelefonoAziendale, Variabile di tipo String contenente il
	 *         numero telefonico aziendale del dipendente
	 */

	@Override
	public String visualizzaNumeroTelefonoAziendaleDipendente() throws ClienteException {
		return this.numeroTelefonoAziendale;
	}

	/**
	 * 
	 * <b> METODO: visualizzatipologiaContrattoDipendente</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante la Stringa contente il la
	 * tipologia di contratto del dipendente
	 * 
	 * 
	 * @return tipologiaContratto, Variabile di tipo TIPO_CONTRATTO contenente la
	 *         tipologia di contratto del dipendente
	 */

	@Override
	public TIPO_CONTRATTO visualizzatipologiaContrattoDipendente() throws ClienteException {
		return this.tipologiaContratto;
	}

	/**
	 * 
	 * <b> METODO: visualizzaRuoloDipendente</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante la Stringa contenente il
	 * ruolo del dipendente
	 *
	 * 
	 * @return ruolo, Variabile di tipo String contente il ruolo del dipendente
	 */

	@Override
	public String visualizzaRuoloDipendente() throws ClienteException {
		return this.ruolo;
	}

	/**
	 * 
	 * <b> METODO: addNomeCartaFedelta</b>
	 * <p>
	 * Questo metodo consente di aggiunere il nome della carta di fedeltà del
	 * cliente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * no
	 */

	@Override
	public boolean addNomeCartaFedelta(String nomeCartaFedelta) throws ClienteException, DipendenteException {
		throw new DipendenteException("Questa funzionalità non può essere usata per il Dipendente");
	}

	/**
	 * 
	 * <b> METODO: ddPuntiFedeltaAccumulati</b>
	 * <p>
	 * Questo metodo consente di aggiunere i punti della carta di fedeltò del
	 * cliente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * no
	 */

	@Override
	public boolean addPuntiFedeltaAccumulati(String puntiFedelta) throws ClienteException, DipendenteException {
		throw new DipendenteException("Questa funzionalità non può essere usata per il Dipendente");
	}

	/**
	 * 
	 * <b> METODO: addDataInscrizioneTessera</b>
	 * <p>
	 * Questo metodo consente di aggiunere la data di inscrizione della carta di
	 * fedeltà
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * no
	 */

	@Override
	public boolean addDataInscrizioneTessera(String dataInscrizioneTessera)
			throws ClienteException, DipendenteException {
		throw new DipendenteException("Questa funzionalità non può essere usata per il Dipendente");
	}

	/**
	 * 
	 * <b> METODO: addNumeroCartaFedelta</b>
	 * <p>
	 * Questo metodo consente di aggiunere il numero della carta di fedeltà
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * no
	 */

	@Override
	public boolean addNumeroCartaFedelta() throws ClienteException, DipendenteException {
		throw new DipendenteException("Questa funzionalità non può essere usata per il Dipendente");
	}

	/**
	 * 
	 * <b> METODO: visualizzaElencoOperazioniPunti</b>
	 * <p>
	 * Questo metodo consente di visualizzare l'elenco delle operazioni dei punti
	 * sulla carta di fedeltà del cliente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * no
	 */

	@Override
	public void visualizzaElencoOperazioniPunti() throws DipendenteException {
		throw new DipendenteException("Questa funzionalità non può essere usata per il Dipendente");
	}

	/**
	 * 
	 * <b> METODO: VisualizzaNomeCartaFedelta</b>
	 * <p>
	 * Questo metodo consente di visualizzare nome della carta di fedeltà del
	 * cliente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * no
	 */

	@Override
	public String VisualizzaNomeCartaFedelta() throws DipendenteException {
		throw new DipendenteException("Questa funzionalità non può essere usata per il Dipendente");
	}

	/**
	 * 
	 * <b> METODO: VisualizzaPuntiFedeltaAccumulati</b>
	 * <p>
	 * Questo metodo consente di visualizzare i punti della tessera del cliente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * no
	 */

	@Override
	public String VisualizzaPuntiFedeltaAccumulati() throws DipendenteException {
		throw new DipendenteException("Questa funzionalità non può essere usata per il Dipendente");
	}

	/**
	 * 
	 * <b> METODO: VisualizzaDataInscrizioneTessera</b>
	 * <p>
	 * Questo metodo consente di visualizzare la data di inscrizione della tessera
	 * del cliente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * no
	 */

	@Override
	public String VisualizzaDataInscrizioneTessera() throws DipendenteException {
		throw new DipendenteException("Questa funzionalità non può essere usata per il Dipendente");
	}

	/**
	 * 
	 * <b> METODO: VisualizzaNumeroCartaFedelta</b>
	 * <p>
	 * Questo metodo consente di visualizzare il numero della carta di fedeltà del
	 * cliente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * no
	 */

	@Override
	public String VisualizzaNumeroCartaFedelta() throws DipendenteException {
		throw new DipendenteException("Questa funzionalità non può essere usata per il Dipendente");
	}

	/**
	 * 
	 * <b> METODO: VisualizzaCodiceFiscale</b>
	 * <p>
	 * Questo metodo consente di visualizzare il codice fiscale del cliente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * no
	 */

	@Override
	public String VisualizzaCodiceFiscale() throws DipendenteException {
		throw new DipendenteException("Questa funzionalità non può essere usata per il Dipendente");
	}

	/**
	 * 
	 * <b> METODO: eliminaNomeCartaFedelta</b>
	 * <p>
	 * Questo metodo consente di eliminare il nome della carta di fedeltà del
	 * cliente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * no
	 */

	@Override
	public boolean eliminaNomeCartaFedelta() throws DipendenteException {
		throw new DipendenteException("Questa funzionalità non può essere usata per il Dipendente");
	}

	/**
	 * 
	 * <b> METODO: eliminaPuntiAccumulati</b>
	 * <p>
	 * Questo metodo consente di eliminare i punti della carta di fedeltà del
	 * cliente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata dal dipendente
	 */

	@Override
	public boolean eliminaPuntiAccumulati() throws DipendenteException {
		throw new DipendenteException("Questa funzionalità non può essere usata per il Dipendente");
	}

	/**
	 * 
	 * <b> METODO: eliminaDataInscrizioneTessera</b>
	 * <p>
	 * Questo metodo consente di eliminare la data d di inscrizione ella carta di
	 * fedeltà del cliente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata dal dipendente
	 */

	@Override
	public boolean eliminaDataInscrizioneTessera() throws DipendenteException {
		throw new DipendenteException("Questa funzionalità non può essere usata per il Dipendente");
	}

	/**
	 * 
	 * <b> METODO: eliminaNumeroCartaFedelta</b>
	 * <p>
	 * Questo metodo consente di eliminare il numero della carta di fedeltà del
	 * cliente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata dal dipendente
	 */

	@Override
	public boolean eliminaNumeroCartaFedelta() throws DipendenteException {
		throw new DipendenteException("Questa funzionalità non può essere usata per il Dipendente");
	}

	/**
	 * 
	 * <b> METODO: modificaPuntiFedeltaAccumulati</b>
	 * <p>
	 * Questo metodo consente di modificare i punti della carta di fedeltà del
	 * cliente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata dal dipendente
	 * 
	 */

	@Override
	public boolean modificaNomeCartaFedelta(String nomeCartaFedelta) throws ClienteException, DipendenteException {
		throw new DipendenteException("Questa funzionalità non può essere usata per il Dipendente");
	}

	/**
	 * 
	 * <b> METODO: modificaPuntiFedeltaAccumulati</b>
	 * <p>
	 * Questo metodo consente di modificare i punti della carta di fedeltà del
	 * cliente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata dal dipendente
	 * 
	 */

	@Override
	public boolean modificaPuntiFedeltaAccumulati(String puntiFedelta,
			ConstantGlobal.OPERAZIONE_PUNTI_FEDELTA operazione) throws ClienteException, DipendenteException {
		throw new DipendenteException("Questa funzionalità non può essere usata per il Dipendente");
	}

	/**
	 * 
	 * <b> METODO: modificaDataInscrizioneTessera</b>
	 * <p>
	 * Questo metodo consente di modificare il numero di carta di fedeltà del
	 * cliente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata dal dipendente
	 * 
	 */

	@Override
	public boolean modificaDataInscrizioneTessera(String dataInscrizioneTessera)
			throws ClienteException, DipendenteException {
		throw new DipendenteException("Questa funzionalità non può essere usata per il Dipendente");
	}

	/**
	 * 
	 * <b> METODO: modificaNumeroCartaFedelta</b>
	 * <p>
	 * Questo metodo consente di modificare il numero di carta di fedeltà del
	 * cliente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata dal dipendente
	 * 
	 * @return result Variabile ti tipo boolean che rappresenta se l'operazione è
	 *         andata a buon fine oppure no.
	 */

	@Override
	public boolean modificaNumeroCartaFedelta() throws ClienteException, DipendenteException {
		throw new DipendenteException("Questa funzionalità non può essere usata per il Dipendente");
	}

	/**
	 * 
	 * <b> METODO: modificaCodiceFiscale</b>
	 * <p>
	 * Questo metodo consente di modificare il codice fiscale del cliente
	 * <p>
	 * Questa funzionalità in questa classe se chiamata, alzerà un eccezione, perchè
	 * non può essere utilizzata dal dipendente
	 * 
	 * @return result Variabile ti tipo boolean che rappresenta se l'operazione è
	 *         andata a buon fine oppure no.
	 */

	@Override
	public boolean modificaCodiceFiscale(String codiceFiscale) throws ClienteException, DipendenteException {
		throw new DipendenteException("Questa funzionalità non può essere usata per il Dipendente");
	}

	/**
	 * 
	 * <b> OPERAZIONE: controllo_data_vendita </b>
	 * <p>
	 * Questo consente di controllare la data di vendita del televisore. Nel caso in
	 * cui il dipendente superi il numero di vedite giornaliere alzerà un eccezione.
	 * Se il programma ogni giorno che viene avviato resetta il contatore delle tv
	 * vendute e setta la data con il giorno corrente
	 * 
	 * 
	 * @throws ParseException      Sollevata nel caso in cui la parse della data è
	 *                             errato
	 * @throws DipendenteException Sollevata nel caso in cui il dipendente ha
	 *                             superato il numero di vendite giornaliere
	 */

	private boolean controllo_data_vendita() throws ParseException, DipendenteException {
		boolean result = false;
		if (dataGiorno == null) { /// se non è stata mai effettuata una vendita setta la data = al giorno corrente
			dataGiorno = java.sql.Date.valueOf(LocalDate.now());

			result = true;

			/// controllo se la data di vendita è la stessa del giorno correten
		} else if (StringUtils.equals(sdf.format(dataGiorno), sdf.format(java.sql.Date.valueOf(LocalDate.now())))) {
			if (this.numeroTvVendute < ConstantGlobal.NUMERO_MASSIMO_TV_VENDUTE) { /// controllo il numero massimo di tv
																					/// che possono essere vendute
				result = true;
			} else {
				throw new DipendenteException("errore, il dipendente " + this.codiceIdentificativo
						+ " ha superato il numero di vendite giornaliere");
			}
		} else {
			/// se la data è diversa da quella corrente viene impostata uguale a quella
			/// odierna
			dataGiorno = java.sql.Date.valueOf(LocalDate.now());
			this.numeroTvVendute = 0; /// viene resettato il contatore
			result = true;
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: vendiTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di vendere un televisore al un cliente. Questa
	 * operazione tre paramtri: 1) il televisore da vedere 2) il cliente e che
	 * acquista 3) il prezzo di vendita del cliente. Essendo che i parametri
	 * dovranno necessariamente essere forniti dall'utente, dunque, si rendono
	 * necessari dei controlli per verificarne l'esattezza e la correttezza. Questo
	 * metodo controlla che le tv vendute non superino il numero massimo consente al
	 * giorno dal dipendente. Dopo aver fatto ciò viene instaziato l'oggetto vendita
	 * che controllera che tutti i parementri passati siano corretti. Nel caso non
	 * lo fossero alzerà un eccezione.
	 *
	 * 
	 * 
	 * @param tv            Variabile di tipo Televisore che contiene la tv da
	 *                      vedere al cliente inserita dall'utente
	 * @param cliente       Variabile di tipo Cliente che contiene il cliente che
	 *                      acquista il televisore inserito dall'utente
	 * @param prezzoVendita Variabile di tipo String che contiente il prezzo di
	 *                      vendita del televisore
	 * 
	 * @return Variabile di tipo boolean che contiene l'esito positivo o negativo
	 *         dell'operazione.
	 * 
	 * @throws PersonaException    solleva un' eccezione nel caso in cui il cliente
	 *                             passato non è corretto
	 *
	 * @throws DipendenteException solleva un 'eccezione nel caso in cui si supera
	 *                             il numero di vendite di tv consiente
	 * @throws TelevisoreException Solleva l'eccezione se il televisore passato
	 *                             dall'utente è vuoto o errato
	 */

	public boolean vendiTv(Televisore tv, Cliente cliente, String prezzoVendita)
			throws PersonaException, TelevisoreException, DipendenteException {
		boolean result = false;
		try {
			if (controllo_data_vendita()) { /// controllo la data di vendita e il numero di tv vendute in quel
											/// determinato giorno dal dipendente
				TvVendute.add(
						new Vendita(this.codiceIdentificativo, prezzoVendita, tv, sdf.format(dataGiorno), cliente));
				this.numeroTvVendute = ++incrementNumeroTv; /// incrementa la tv venduta di 1
			}
		} catch (ParseException e) {
			System.err.println(e.getMessage());
		}
		return result;

	}

	/**
	 * 
	 * <b> OPERAZIONE: riparaTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di riparare un televisore di un cliente.I
	 * parametri dovranno necessariamente essere forniti dall'utente, dunque, si
	 * rendono necessari dei controlli per verificarne l'esattezza e la correttezza.
	 * Questo metodo consente di chiamare internemente il mentodo ripara che
	 * controllera la correttenza e l'esattezza dei paramenti passati. Nel caso
	 * siano errati alzerà un eccezione relativo al paramentro errato.
	 * 
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

	public boolean riparaTv(String dataRichiestaRiparazione, String dataPrevistaConsegna, String costoRiparazione,
			Cliente clienteRiparazione, Televisore tvRiparata, String informazioneRiparazione)
			throws ParseException, RiparazioneException, ClienteException {
		boolean result = false;
		Riparazione ripara = new Riparazione(codiceIdentificativo, dataRichiestaRiparazione, dataPrevistaConsegna,
				costoRiparazione, (clienteRiparazione), tvRiparata, informazioneRiparazione);
		this.tvRiparate.add(ripara);
		result = true;
		return result;

	}

	/**
	 * 
	 * <b> OPERAZIONE: visualizzaElencoTvRiparate </b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare una lista di tv riparate,
	 * ritornandola.
	 *
	 * @return tvRiparate lista contente le ripazioni che ha effettuato il
	 *         dipendente
	 * @throws ClienteException genera un eccezione nel caso in cui questo metodo
	 *
	 */

	@Override
	public Set<Riparazione> visualizzaElencoTvRiparate() throws ClienteException {
		return tvRiparate;
	}

	/**
	 * 
	 * <b> OPERAZIONE: visualizzaElencoTvVendute </b>
	 * <p>
	 * Quest'operazione ha lo scopo di visualizzare una lista di tv vendute,
	 * ritornandola.
	 * 
	 * 
	 * @return TvVendute lista varibile contente le vendite che ha effettuato il
	 *         dipendente
	 * @throws ClienteException genera un eccezione nel caso in cui questo metodo
	 *                          viene utilizzato dal cliente
	 */

	@Override
	public Set<Vendita> visualizzaElencoTvVendute() throws ClienteException {
		return TvVendute;
	}

}
