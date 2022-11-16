package Cecinato_cs2022.Dipendente;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import Cecinato_cs2022.Cliente.Cliente;
import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.DipendenteException.RiparazioneException;

import Cecinato_cs2022.TelevisoreService.Televisore;

/**
 * 
 * <p>
 * <b> CLASSE: Riparazione </b>
 * <p>
 * Questa classe ha lo scopo di definire tutte le caratteristiche di tutte le le
 * riparazioni.
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

public class Riparazione implements Serializable, Comparable<Riparazione> {

	/// ********************************************
	/// ATTRIBUTI
	/// ********************************************

	private static final long serialVersionUID = 1L;
	/**
	 * {@link SimpleDateFormat} instanzia che indica il format della data
	 */
	private static SimpleDateFormat sdf = new SimpleDateFormat(ConstantGlobal.FORMATO_DATA);
	/**
	 * {@link int} instanzia che consente di incrementare l'id di riparazione
	 */
	private static int incrementIdRiparazione = 0;
	/**
	 * {@link String} instanzia che indica il seriale del dipendente
	 */
	private String serialeDipendente;
	/**
	 * {@link int} instanzia che consente l'id di riparazione della vendita
	 */
	private int idRiparazione;
	/**
	 * {@link Date} instanzia che indica la data di richiesta della riparazione
	 */
	private Date dataRichiestaRiparazione;
	/**
	 * {@link Date} instanzia che indica la data di prevista consegna della tv
	 * riparata
	 */
	private Date dataPrevistaConsegna;
	/**
	 * {@link String} instanzia che indica il costo della riparazione
	 */
	private String costoRiparazione;
	/**
	 * {@link Cliente} instanzia che indica il cliente propriatario del televisore
	 */
	private Cliente clienteRiparazione;
	/**
	 * {@link Televisore} instanzia che indica le informazioni della tv riparata
	 */
	private Televisore tvRiparata;
	/**
	 * {@link String} instanzia che indica le informazioni sulla riparazione della
	 * tv
	 */
	private String informazioneRiparazione;

	/**
	 * 
	 * <b> COSTRUTTORE: Riparazione </b>
	 * <p>
	 * Questo è il costruttore della classe Riparazione. <br>
	 * In particolare, tale costrutture avrà tutti i parametri relativi alla
	 * riparazione della tv.<br>
	 * La valorizzazione dei singoli attributi è effettuata attraverso la parola
	 * riservata "this" che specifica il riferimento all'oggetto corrente che invoca
	 * tale costruttore.
	 * <p>
	 * Ogni paramentro passato verrà controllato che non sia nullo o errato. In caso
	 * che lo fosse solleverà un eccezione
	 * 
	 * @param serileDipendente         Variabile di tipo stringa che contiene il
	 *                                 seriale del dipendente che ha effettuato la
	 *                                 riparazione
	 * @param dataRichiestaRiparazione Variabile di tipo stringa che contiene la
	 *                                 data di richiesta della riparazione
	 * @param dataPrevistaConsegna     Variabile di tipo stringa che contiene la
	 *                                 data di consegna della riparazione
	 * 
	 * @param costoRiparazione         Variabile di tipo String che contiene il
	 *                                 costo della riparazione
	 * @param clienteRiparazione       Variabile di tipo Cliente che contiene le
	 *                                 informazioni del cliente proprietario della
	 *                                 tv
	 * @param tvRiparata               Variabile di tipo Televisore che contiene
	 *                                 tutte le informazioni della tv
	 * @param informazioneRiparazione  Variabile di tipo stringa che le informazioni
	 *                                 della riparazione
	 * 
	 * @throws RiparazioneException Sollevata nel caso in cui viene riscontrato
	 *                              qualche errore tra i parametri della riparazione
	 * 
	 * @throws ParseException       Sollevata nel caso in cui il format della data
	 *                              fosse errato
	 */

	public Riparazione(String serileDipendente, String dataRichiestaRiparazione, String dataPrevistaConsegna,
			String costoRiparazione, Cliente clienteRiparazione, Televisore tvRiparata, String informazioneRiparazione)
			throws ParseException, RiparazioneException {
		super();
		if (controlloData(dataRichiestaRiparazione) && controlloData(dataPrevistaConsegna)) {
			if (controlloOrdineDate(sdf.parse(dataRichiestaRiparazione), sdf.parse(dataPrevistaConsegna))) {
				this.dataRichiestaRiparazione = sdf.parse(dataRichiestaRiparazione);
				this.dataPrevistaConsegna = sdf.parse(dataPrevistaConsegna);
				this.idRiparazione = ++incrementIdRiparazione;
				this.serialeDipendente = serileDipendente;
			}
		}
		if (controlloCosto(costoRiparazione)) {
			this.costoRiparazione = costoRiparazione;
		}
		if (controlloCliente(clienteRiparazione)) {
			this.clienteRiparazione = clienteRiparazione;
		}
		if (controlloTv(tvRiparata)) {
			this.tvRiparata = tvRiparata;
		}
		if (controlloDescrizione(informazioneRiparazione)) {
			this.informazioneRiparazione = informazioneRiparazione;
		}
	}

	/**
	 * 
	 * <b> METODO: getDataRichiestaRiparazione</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante la Date contente la data di
	 * richiesta della riparazione
	 * 
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo
	 * dataRichiestaRiparazione, e lo restituiamo al chiamante.
	 * 
	 * @return dataRichiestaRiparazione, Variabile di tipo Date contente la data di
	 *         richiesta della riparazione
	 * 
	 */
	public Date getDataRichiestaRiparazione() {
		return this.dataRichiestaRiparazione;
	}

	/**
	 * 
	 * <b> OPERAZIONE: setDataRichiestaRiparazione</b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire la data di richiesta della
	 * riparazione attraverso il parametro dataRichiestaRiparazione e assegnarla
	 * alla dataRichiestaRiparazione<br>
	 * 
	 * @param dataRichiestaRiparazione Variabile di tipo Date che contiene la data
	 *                                 di richiesta della riparazione
	 * 
	 * 
	 */

	public void setDataRichiestaRiparazione(Date dataRichiestaRiparazione) {
		this.dataRichiestaRiparazione = dataRichiestaRiparazione;
	}

	/**
	 * 
	 * <b> METODO: getDataPrevistaConsegna</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante la Date contente la data di
	 * previa cosegna della riparazione
	 * 
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo
	 * dataPrevistaConsegna, e lo restituiamo al chiamante.
	 * 
	 * @return dataPrevistaConsegna, Variabile di tipo Date contente la data di
	 *         previa consegna della riparazione
	 * 
	 */

	public Date getDataPrevistaConsegna() {
		return this.dataPrevistaConsegna;
	}

	/**
	 * 
	 * <b> OPERAZIONE: setDataPrevistaConsegna</b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire la data di previa consegna della
	 * riparazione attraverso il parametro dataPrevistaConsegna e assegnarla alla
	 * dataPrevistaConsegna<br>
	 * 
	 * @param dataPrevistaConsegna Variabile di tipo Date che contiene la data di
	 *                             previa consegna della riparazione
	 * 
	 * 
	 */

	public void setDataPrevistaConsegna(Date dataPrevistaConsegna) {
		this.dataPrevistaConsegna = dataPrevistaConsegna;
	}

	/**
	 * 
	 * <b> METODO: getCostoRiparazione</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante la String contente il costo
	 * della riparazione del televisore
	 * 
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo
	 * costoRiparazione, e lo restituiamo al chiamante.
	 * 
	 * @return costoRiparazione, Variabile di tipo String contente il costo della
	 *         riparazione
	 * 
	 */

	public String getCostoRiparazione() {
		return this.costoRiparazione;
	}

	/**
	 * 
	 * <b> OPERAZIONE: setCostoRiparazione</b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire il costo della riparazione
	 * attraverso il parametro costoRiparazione e assegnarla a costoRiparazione<br>
	 * 
	 * @param costoRiparazione Variabile di tipo String che contiene il costo della
	 *                         riparazione
	 * 
	 * 
	 */

	public void setCostoRiparazione(String costoRiparazione) {
		this.costoRiparazione = costoRiparazione;
	}

	/**
	 * 
	 * <b> METODO: getClienteRiparazione</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante il Cliente contente le
	 * informazioni del cliente proprietario del televisore
	 * 
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo
	 * clienteRiparazione, e lo restituiamo al chiamante.
	 * 
	 * @return clienteRiparazione, Variabile di tipo Cliente contente le
	 *         informazioni del proprietario della tv
	 * 
	 */

	public Cliente getClienteRiparazione() {
		return this.clienteRiparazione;
	}

	/**
	 * 
	 * <b> OPERAZIONE: setClienteRiparazione</b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire il cliente proprietario del
	 * televisore attraverso il parametro clienteRiparazione e assegnarla a
	 * clienteRiparazione<br>
	 * 
	 * @param clienteRiparazione Variabile di tipo Cliente che contiene le
	 *                           informzioni del cliente che ha effettuato la
	 *                           riparazione
	 * 
	 * 
	 */
	public void setClienteRiparazione(Cliente clienteRiparazione) {
		this.clienteRiparazione = clienteRiparazione;
	}

	/**
	 * 
	 * <b> METODO: getTvRiparata</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante il Televisore contente le
	 * informazioni del televisore da riparare
	 * 
	 * <p>
	 * Per fare ciò, semplicemente, attraverso la parola chiave "this" (riferimento
	 * all'oggetto corrente), ne leggiamo il contenuto dell'attributo tvRiparata, e
	 * lo restituiamo al chiamante.
	 * 
	 * @return tvRiparata, Variabile di tipo Televisore contente le informazioni del
	 *         televisore da riparare
	 * 
	 */

	public Televisore getTvRiparata() {
		return tvRiparata;
	}

	/**
	 * 
	 * <b> OPERAZIONE: setTvRiparata</b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire il televisore da riparare
	 * attraverso il parametro tvRiparatae e assegnarla a tvRiparata<br>
	 * 
	 * @param tvRiparata Variabile di tipo Televisore che contiene le informzioni
	 *                   del televisore da ripare
	 * 
	 * 
	 */

	public void setTvRiparata(Televisore tvRiparata) {
		this.tvRiparata = tvRiparata;
	}

	/**
	 * 
	 * <b> METODO: getInformazioneRiparazione</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante la stringa contente le
	 * informazioni della riparazione del televisore
	 * 
	 * @return informazioneRiparazione, Variabile di tipo String contente le
	 *         informazioni della riparazione
	 * 
	 */

	public String getInformazioneRiparazione() {
		return informazioneRiparazione;
	}

	/**
	 * 
	 * <b> OPERAZIONE: setInformazioneRiparazione</b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire le infomazioni della riparazione
	 * della tv attraverso il parametro informazioneRiparazione e assegnarla a
	 * nformazioneRiparazione<br>
	 * 
	 * @param informazioneRiparazione Variabile di tipo String che contiene le
	 *                                informzioni della riparazione della tv
	 * 
	 * 
	 */
	public void setInformazioneRiparazione(String informazioneRiparazione) {
		this.informazioneRiparazione = informazioneRiparazione;
	}

	/**
	 * 
	 * <b> METODO: getIdRiparazione</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante dell'intero contente il
	 * codice seriale della riparazione del televisore
	 * 
	 * @return idRiparazione, Variabile di tipo int contente il codice seriale della
	 *         riparazione
	 * 
	 */

	public int getIdRiparazione() {
		return idRiparazione;
	}

	/**
	 * 
	 * <b> OPERAZIONE: setIdRiparazione</b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire il codice seriale della riparazione
	 * attraverso il parametro idRiparazione e assegnarla a idRiparazione<br>
	 * 
	 * @param idRiparazione Variabile di tipo int che contiene il codice seriale
	 *                      della riparazione
	 * 
	 */

	public void setIdRiparazione(int idRiparazione) {
		this.idRiparazione = idRiparazione;
	}

	/**
	 * 
	 * <b> METODO: getSerialeDipendente</b>
	 * <p>
	 * Questo metodo consente di ritornare al chiamante la Stringa contente il
	 * codice seriale del dipendente che ha effettuato la riparazione
	 * 
	 * @return serialeDipendente, Variabile di tipo String contente il codice
	 *         seriale del dipendente che ha effettuato la riparazione
	 * 
	 */

	public String getSerialeDipendente() {
		return serialeDipendente;
	}

	/**
	 * 
	 * <b> OPERAZIONE: setSerialeDipendente</b>
	 * <p>
	 * Quest'operazione ha lo scopo di acquisire il codice seriale dell dipendente
	 * attraverso il parametro serialeDipendente e assegnarla a
	 * serialeDipendente<br>
	 * 
	 * @param serialeDipendente Variabile di tipo String che contiene il codice
	 *                          seriale del dipendente
	 * 
	 */

	public void setSerialeDipendente(String serialeDipendente) {
		this.serialeDipendente = serialeDipendente;
	}

	/**
	 * 
	 * <b> OPERAZIONE: controlloTv </b>
	 * <p>
	 * Quest'operazione consente di se la data di richiesta viene conseguita dalla
	 * data di cosegna
	 * 
	 * @param dataRichista, Variabile di tipo Date che contiene la data di richiesta
	 *                      della riparazione
	 * @param dataConsegna, Variabile di tipo Date che contiene la data di previa
	 *                      consegna della riparazione
	 * @return result Variabile boolena che ritorna l'esito del controllo
	 */

	private boolean controlloOrdineDate(Date dataRichista, Date dataConsegna) throws RiparazioneException {
		boolean result = false;
		if (dataRichista.before(dataConsegna)) {
			result = true;
		} else {
			throw new RiparazioneException("la data della richiesta inserita: " + dataRichista
					+ " è superiore alla data data di consegna: " + dataConsegna);
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: controlloData </b>
	 * <p>
	 * Quest'operazione consente di controllare se la data passata rispetta il
	 * formato prefissato dd/mm/aaaa
	 * 
	 * @param data Variabile di tipo String che contiene la data della riparazione
	 * 
	 * @return result Variabile boolena che ritorna l'esito del controllo positivo o
	 *         negativo
	 */

	private boolean controlloData(String data) throws RiparazioneException {
		boolean result = false;
		if (StringUtils.isNotBlank(data) && (data.trim()).matches(ConstantGlobal.REGEX_CONTROLLO_DATA)) {
			result = true;
		} else {
			throw new RiparazioneException("la data inserita: " + data
					+ "non rispetta lo standard richiesto: dd/mm/aaaa oppure sono stati inseriti valori nulli");
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

	private boolean controlloTv(Televisore tv) throws RiparazioneException {
		boolean result = false;
		if (tv != null) {
			if (tv.visualizzaTipologiaTv() != ConstantGlobal.TIPOLOGIA_TV.BASE) {
				result = true;
			} else {
				throw new RiparazioneException("la televisore di tipo base non può essere riparata");
			}
		} else {
			throw new RiparazioneException("la televisore inserita è nulla");
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: controlloCliente </b>
	 * <p>
	 * Quest'operazione consente di controllare se il cliente passato non è nullo
	 * 
	 * @param cliente Variabile di tipo Cliente che contiene le informazioni sul
	 *                cliente proprietario del televisore
	 * 
	 * @return result Variabile boolena che ritorna l'esito del controllo positivo o
	 *         negativo
	 */

	private boolean controlloCliente(Cliente cliente) throws RiparazioneException {
		boolean result = false;
		if (cliente != null) {
			result = true;
		} else {
			throw new RiparazioneException("il cliente inserito è nullo");
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: controlloCosto </b>
	 * <p>
	 * Quest'operazione consente di controllare se il costo della riparazione è
	 * corretto. Esso deve rispettare questo tipo di standard: 1) +10 2) -10 3)
	 * 19.10 4) -19.10 5) .40 6) -.40
	 * 
	 * @param costo Variabile di tipo stringa che coniente il prezzo di riparazione
	 *              del televisore
	 * 
	 * @return result Variabile boolena che ritorna l'esito del controllo
	 */

	private boolean controlloCosto(String costo) throws RiparazioneException {
		boolean result = false;
		if (StringUtils.isNotBlank(costo) && costo.trim().matches(ConstantGlobal.REGEX_CONTROLLO_NUMERI_FLOAT)
				&& Double.valueOf(costo) > 0) {
			result = true;
		} else {
			throw new RiparazioneException("il costo della riparazione inserito: " + costo + " è sbagliato ");
		}
		return result;
	}

	/**
	 * 
	 * <b> OPERAZIONE: controlloDescrizione </b>
	 * <p>
	 * Quest'operazione consente di controllare la correttezza sulla descrizione
	 * dell'informazione della riparazione
	 * 
	 * @param informazioneRiparazione Variabile di tipo String che contiene le
	 *                               informazioni sulla riparazione del televisore
	 * 
	 * 
	 * @return result Variabile boolena che ritorna l'esito del controllo positivo o
	 *         negativo
	 */

	private boolean controlloDescrizione(String informazioneRiparazione) throws RiparazioneException {
		boolean result = false;
		if (StringUtils.isNotBlank(informazioneRiparazione)
				&& StringUtils.isAlphanumericSpace(informazioneRiparazione)) {
			result = true;
		} else {
			throw new RiparazioneException("La diecrizione della riparazione inserita: " + informazioneRiparazione
					+ " è vuota o contiene caratteri speciali");
		}
		return result;
	}

	@Override
	public int compareTo(Riparazione o) {
		return this.idRiparazione - (o.getIdRiparazione());
	}

}
