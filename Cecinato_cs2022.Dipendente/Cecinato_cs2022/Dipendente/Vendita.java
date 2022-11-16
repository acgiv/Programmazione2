package Cecinato_cs2022.Dipendente;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import Cecinato_cs2022.Cliente.Cliente;
import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;
import Cecinato_cs2022.ExceptionPersona.PersonaException;
import Cecinato_cs2022.TelevisoreService.Televisore;

/**
 * 
 * <p>
 * <b> CLASSE: Vendita </b>
 * <p>
 * Questa classe ha lo scopo di definire tutte le caratteristiche di tutte le
 * vendite.
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

public class Vendita implements Serializable, Comparable<Object> {

	/// ********************************************
	/// ATTRIBUTI
	/// ********************************************

	private static final long serialVersionUID = 1L;
	/**
	 * {@link SimpleDateFormat} instanzia che indica il format della data
	 */
	private static final SimpleDateFormat sdf = new SimpleDateFormat(ConstantGlobal.FORMATO_DATA);
	/**
	 * {@link int} instanzia che indica l'id dell'ultima fatturazione effettuata
	 */
	private static int numeroIdFattura;
	/**
	 * {@link int} instanzia che consente di incrementare il numero di fattura
	 */
	private static int incrementNumeroFattrura = 0;
	/**
	 * {@link String} instanzia che indica il codice identificativo del dipendente
	 */
	private String idDipendente;
	/**
	 * {@link String} instanzia che indica il prezzo di vendita
	 */
	private String prezzoVedita;
	/**
	 * {@link Televisore} instanzia che indica la tv venduta
	 */
	private Televisore tv;
	/**
	 * {@link Date} instanzia che indica la data di vendita
	 */
	private Date dataVendita;
	/**
	 * {@link Cliente} instanzia che indica il cliente che acquista il televisore
	 */
	private Cliente cliente;
	/**
	 * {@link int} instanzia che indica il codice di fatturazione
	 */
	private int idFattura;

	/**
	 * 
	 * <b> COSTRUTTORE: Vendita </b>
	 * <p>
	 * Questo è il costruttore della classe Vendita. <br>
	 * In particolare, tale costrutture avrà tutti i parametri relativi alla vendita
	 * della tv.<br>
	 * La valorizzazione dei singoli attributi è effettuata attraverso la parola
	 * riservata "this" che specifica il riferimento all'oggetto corrente che invoca
	 * tale costruttore.
	 * <p>
	 * Ogni paramentro passato verrà controllato che non sia nullo o errato. In caso
	 * che lo fosse solleverà un eccezione
	 * 
	 * @param idDipendente Variabile di tipo stringa che contiene l'ìd del
	 *                     dipendente che sta effettuando la vendit
	 * @param prezzoVedita Variabile di tipo stringa che contiene il prezzo di
	 *                     vendita del televisore
	 * @param tv           Variabile di tipo Televisore che contiene le informazioni
	 *                     delle tv vendute
	 * @param dataVendita  Variabile di tipo String che contiene la data di quando è
	 *                     stata effettuata la vendita
	 * @param cliente      Variabile di tipo stringa che contiene le informazioni
	 *                     del cliente
	 * 
	 * @throws PersonaException             Sollevata nel caso in cui il cliente
	 *                                      fosse nullo
	 * 
	 * @throws TelevisoreException Sollevata nel caso in cui il televisore fosse
	 *                                      nullo
	 * 
	 * @throws ParseException               Sollevata nel caso in cui il format
	 *                                      della data fosse errato
	 */

	public Vendita(String idDipendente, String prezzoVedita, Televisore tv, String dataVendita, Cliente cliente)
			throws ParseException, TelevisoreException, PersonaException {
		super();
		this.idDipendente = idDipendente;
		if (controlloPrezzo(prezzoVedita) && controlloTv(tv) && controlloCliente(cliente)
				&& controlloData(dataVendita)) {
			this.prezzoVedita = prezzoVedita;
			this.tv = tv;
			this.dataVendita = sdf.parse(dataVendita);
			this.cliente = cliente;
			numeroIdFattura = ++incrementNumeroFattrura;
			this.idFattura = numeroIdFattura;
		}
	}

	/**
	 * 
	 * <b> METODO: getIdDipendente</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante la Stringa contente il id
	 * del dipendente
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo idDipendente,
	 * e lo restituiamo al chiamante.
	 * 
	 * @return idDipendente, Variabile di tipo String contente l'id del dipendente
	 *         che ha effettuato la vendita
	 * 
	 */

	public String getIdDipendente() {
		return this.idDipendente;
	}
	/**
	 * 
	 * <b> OPERAZIONE: setIdDipendente </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire l'id del dipendente che sta effettuando la vendita
	 * attraverso il parametro idDipendente e assegnarla all' idDipendente<br>
	 * 
	 * @param idDipendente Variabile di tipo String che contiene l'id del dipendente
	 * 
	 * 
	 */
	public void setIdDipendente(String idDipendente) {
		this.idDipendente = idDipendente;
	}

	/**
	 * 
	 * <b> METODO: getPrezzoVedita</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante la Stringa contente il
	 * prezzo di vendita del televisore
	 * 
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo prezzoVedita,
	 * e lo restituiamo al chiamante.
	 * 
	 * @return prezzoVedita, Variabile di tipo String contente il prezzo di vendita
	 *         del televisore che ha effettuato la vendita
	 * 
	 */
	public String getPrezzoVedita() {
		return this.prezzoVedita;
	}
	/**
	 * 
	 * <b> OPERAZIONE: setPrezzoVedita </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire il prezzo di vendita della  tv che il cliente sta acquistando
	 * attraverso il parametro prezzoVedita e assegnarla alla prezzoVedita<br>
	 * 
	 * @param prezzoVedita Variabile di tipo String che contiene il prezzo della vendita
	 * 
	 * 
	 */
	public void setPrezzoVedita(String prezzoVedita) {
		this.prezzoVedita = prezzoVedita;
	}

	/**
	 * 
	 * <b> METODO: getPrezzoVedita</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante la Stringa contente la tv
	 * venduta al cliente
	 * 
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo tv, e lo
	 * restituiamo al chiamante.
	 * 
	 * @return tv, Variabile di tipo Televisore contente le informzioni della tv
	 *         venduta
	 * 
	 */
	public Televisore getTv() {
		return this.tv;
	}
	
	/**
	 * 
	 * <b> OPERAZIONE: setTv </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire la tv che il cliente sta acquistando
	 * attraverso il parametro tv e assegnarla alla tv<br>
	 * 
	 * @param tv  Variabile di tipo Televisore che contiene le informazioni sulla tv
	 * 
	 * 
	 */

	public void setTv(Televisore tv) {
		this.tv = tv;
	}

	/**
	 * 
	 * <b> METODO: getDataVendita</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante di tipo Date contente la
	 * data di vendita della tv
	 * 
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo dataVendita, e
	 * lo restituiamo al chiamante.
	 * 
	 * @return dataVendita, Variabile di tipo Date contente la data di vendita del
	 *         televisore
	 * 
	 */

	public Date getDataVendita() {
		return this.dataVendita;
	}
	
	/**
	 * 
	 * <b> OPERAZIONE: setDataVendita </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire la data di vendita del televisore
	 * attraverso il parametro dataVendita e assegnarla alla dataVendita<br>
	 * 
	 * @param dataVendita  Variabile di tipo Date che contiene la data di vendita del televisore
	 * 
	 * 
	 */

	public void setDataVendita(Date dataVendita) {
		this.dataVendita = dataVendita;
	}

	/**
	 * 
	 * <b> METODO: getCliente</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante il Cliente contente le
	 * informazioni del cliente che acquistato il televisore
	 * 
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo cliente, e lo
	 * restituiamo al chiamante.
	 * 
	 * @return cliente, Variabile di tipo Cliente contente le informazioni del
	 *         cliente che ha effettuato la vendita
	 * 
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * 
	 * <b> OPERAZIONE: setCliente </b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire il cliente che ha acquistato il televisore
	 * attraverso il parametro cliente e assegnarla al cliente<br>
	 * 
	 * @param cliente  Variabile di tipo Cliente che contiene le informazioni del cliente
	 * 
	 * 
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * 
	 * <b> METODO: getIdFattura</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante l'intero contente il codice
	 * di fatturazione della vendita
	 * 
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo idFattura, e
	 * lo restituiamo al chiamante.
	 * 
	 * @return idFattura, Variabile di tipo int contente l'id di fatturazione
	 * 
	 */
	public int getIdFattura() {
		return idFattura;
	}
	
	/**
	 * 
	 * <b> OPERAZIONE: controlloData </b>
	 * <p>
	 * Quest'operazione consente di controllare se la data passata rispetta il formato prefissato
	 *  dd/mm/aaaa
	 * @param data Variabile di tipo String che contiene la data di vendita
	 * 
	 * @return result Variabile boolena che ritorna l'esito del controllo positivo o negativo
	 */

	private boolean controlloData(String data) {
		boolean result = false;
		try {
			if (StringUtils.isNotBlank(data) && (data.trim()).matches(ConstantGlobal.REGEX_CONTROLLO_DATA)) {
				result = true;
			} else {
				throw new PersonaException();
			}
		} catch (NullPointerException e) {
			System.err.println("E' stato inserito un valore nullo");
		} catch (PersonaException e) {
			System.err.println("Errore nell'inserimento della data, hai inserito carateri errati o nulli");
		}
		return result;
	}
	/**
	 * 
	 * <b> OPERAZIONE: controlloCliente </b>
	 * <p>
	 * Quest'operazione consente di controllare se il cliente passato non è nullo
	 * 
	 * @param cliente Variabile di tipo Cliente che contiene le informazioni sul cliente
	 * 
	 * @return result Variabile boolena che ritorna l'esito del controllo positivo o negativo
	 */

	private boolean controlloCliente(Cliente cliente) throws PersonaException {
		boolean result = false;
		if (cliente != null) {
			result = true;
		} else {
			throw new PersonaException("il cliente inserito è nullo");
		}
		return result;
	}
	
	/**
	 * 
	 * <b> OPERAZIONE: controlloTv </b>
	 * <p>
	 * Quest'operazione consente di controllare se la tv passata non è nulla
	 * 
	 * @param tv Variabile di tipo Televisore che contiene le informazioni sulla tv
	 * 
	 * @return result Variabile boolena che ritorna l'esito del controllo
	 */

	private boolean controlloTv(Televisore tv) throws TelevisoreException {
		boolean result = false;
		if (tv != null) {
			result = true;
		} else {
			throw new TelevisoreException("la televisore inserita è nulla");
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: controlloPrezzo </b>
	 * <p>
	 * Quest'operazione consente di controllare se il prezzo di vendita è corretto.
	 * Esso deve rispettare questo tipo di standard:
	 * 1) +10 2) -10 3) 19.10 4) -19.10 5) .40 6) -.40 
	 * 
	 * @param prezzo Variabile di tipo stringa che coniente il prezzo di vendita del televisore
	 * 
	 * @return result Variabile boolena che ritorna l'esito del controllo
	 */

	
	private boolean controlloPrezzo(String prezzo) throws TelevisoreException {
		boolean result = false;
		if (StringUtils.isNotBlank(prezzo) && prezzo.trim().matches(ConstantGlobal.REGEX_CONTROLLO_NUMERI_FLOAT)
				&& Double.valueOf(prezzo) > 0) {  /// il prezzo di vendita non può essere negativo
			result = true;
		}
		return result;
	}

	@Override
	public int compareTo(Object o) {
		return this.idFattura - ((Vendita) o).getIdFattura();
	}

}
