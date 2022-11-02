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

public class Dipendente extends AbstractPersona implements Serializable {

	private static final long serialVersionUID = 1L;
	private static final SimpleDateFormat sdf = new SimpleDateFormat(ConstantGlobal.FORMATO_DATA);
	private static int incrementNumeroTv = 0;
	private static Date dataGiorno;
	private static Set<String> elencoCodiceIdentificativo = new TreeSet<String>();
	private Set<Vendita> TvVendute;
	private Set<Riparazione> tvRiparate;
	private int numeroTvVendute;
	private String codiceIdentificativo;
	private String nomeAzienda;
	private String emailAzienda;
	private String numeroTelefonoAziendale; // ( Formato: +99 9999999999 )
	private ConstantGlobal.TIPO_CONTRATTO tipologiaContratto;
	private String ruolo;

	public Dipendente(String codiceIdentificativo) throws PersonaException, DipendenteException {
		if (controlloIdentificativo(codiceIdentificativo)) {
			this.codiceIdentificativo = codiceIdentificativo;
			elencoCodiceIdentificativo.add(codiceIdentificativo);
		}
		this.tvRiparate = new HashSet<Riparazione>();
		this.TvVendute = new HashSet<Vendita>();
	}

	public int getNumeroTvVendute() {
		return numeroTvVendute;
	}

	public String getCodiceIdentificativo() {
		return codiceIdentificativo;
	}

	public void setCodiceIdentificativo(String codiceIdentificativo) {
		this.codiceIdentificativo = codiceIdentificativo;
	}

	public String getNomeAzienda() {
		return nomeAzienda;
	}

	public void setNomeAzienda(String nomeAzienda) {
		this.nomeAzienda = nomeAzienda;
	}

	public String getEmailAzienda() {
		return emailAzienda;
	}

	public void setEmailAzienda(String emailAzienda) {
		this.emailAzienda = emailAzienda;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public String getNumeroTelefonoAziendale() {
		return numeroTelefonoAziendale;
	}

	public void setNumeroTelefonoAziendale(String numeroTelefonoAziendale) {
		this.numeroTelefonoAziendale = numeroTelefonoAziendale;
	}

	public ConstantGlobal.TIPO_CONTRATTO getTipologiaContratto() {
		return tipologiaContratto;
	}

	public void setTipologiaContratto(ConstantGlobal.TIPO_CONTRATTO tipologiaContratto) {
		this.tipologiaContratto = tipologiaContratto;
	}

	public static Date getDataGiorno() {
		return dataGiorno;
	}

	public static void setDataGiorno(Date dataGiorno) {
		Dipendente.dataGiorno = dataGiorno;
	}

	@Override
	public String toString() {
		String stringa = null;
		stringa = String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_DIPENDENTE, "_"))
				.concat("\n");
		stringa += String.format("| %110s %10s %121s", ConstantGlobal.TITOLO_TABELLA_DIPENDENTE,
				getCodiceIdentificativo(), "|\n");
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_DIPENDENTE, "_"))
				.concat("\n");
		stringa += ConstantGlobal.TABELLA_DIPENDENTE;
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_DIPENDENTE, "_"))
				.concat("\n");
		stringa += String.format(
				"| %16s %7s %10s %5s %9s %5s %6s %5s %9s %4s %11s %5s %9s %5s %16s %5s %28s %5s %15s %4s %13s %5s %17s %6s \n",
				getCodiceIdentificativo(), " | ", super.VisualizzaNome(), " | ", super.VisualizzaCognome(), " | ",
				super.VisualizzaEta(), " | ", super.getGenere(), " | ", super.getDataNascita(), " | ",
				super.VisualizzaCitta(), " | ", getRuolo(), " | ", getEmailAzienda(), " | ",
				getNumeroTelefonoAziendale(), " | ", getNomeAzienda(), " | ", getTipologiaContratto(), " | ");
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_DIPENDENTE, "_"))
				.concat("\n");
		return stringa;
	}

	private String calcoloEmailAzienda() {
		return (getNome().replace(" ", "").concat(getCognome().replace(" ", "")).concat("@")
				.concat(getNomeAzienda().replace(" ", "")).concat(".com")).toLowerCase();
	}

	public void VisualizzaElencoTipologiaContratto() throws ClienteException {
		int i = 1;
		for (ConstantGlobal.TIPO_CONTRATTO item : ConstantGlobal.TIPO_CONTRATTO.values()) {
			System.out.println(
					String.valueOf(i).concat(") ").concat(String.valueOf(item).replace("_", " ")).toLowerCase());
			i += 1;
		}
	}

	protected boolean controlloIdentificativo(String codiceIdentificativo) throws  DipendenteException {
		boolean result = true;
		if (StringUtils.isNotBlank(codiceIdentificativo)
				&& codiceIdentificativo.trim().matches(ConstantGlobal.REGEX_CONTROLLO_CODICE_IDENTIFICATIVO)) {
			Iterator<String> element = elencoCodiceIdentificativo.iterator();
			while (element.hasNext()) {
				if (StringUtils.equals(element.next(), codiceIdentificativo))
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

	private boolean eliminaIdentificativo() throws DipendenteException{
		boolean result = true;
		Iterator<String> element = elencoCodiceIdentificativo.iterator();
		while (element.hasNext()) {
			if (StringUtils.equals(element.next(), codiceIdentificativo)) {
				element.remove();
			}
		}
		return result;
	}

	@Override
	public boolean addNomeAzienda(String nomeAzienda)  throws DipendenteException, ClienteException {
		boolean result = false;
		if (StringUtils.isNotBlank(nomeAzienda) && StringUtils.isAlphaSpace(nomeAzienda)) {
			if (StringUtils.isEmpty(getNomeAzienda())) {
				setNomeAzienda(ControlliGlobal.upperCaseFirst(nomeAzienda.trim()));
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

	@Override
	public boolean addNumeroTelefonoAziendale(String numeroTelefonoAziendale)  throws DipendenteException, ClienteException {
		boolean result = false;
		if (StringUtils.isNotBlank(numeroTelefonoAziendale)
				&& numeroTelefonoAziendale.trim().matches(ConstantGlobal.REGEX_CONTROLLO_NUMERO_TELEFONO)) {
			if (StringUtils.isEmpty(getNumeroTelefonoAziendale())) {
				setNumeroTelefonoAziendale(numeroTelefonoAziendale.trim());
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

	@Override
	public boolean addtipologiaContratto(String tipologiaContratto)  throws DipendenteException, ClienteException {
		boolean result = false;
		if (StringUtils.isNotBlank(tipologiaContratto)
				&& controlloTipoContratto(tipologiaContratto.trim().replace(" ", "_").toUpperCase())) {
			if (getTipologiaContratto() == null) {
				setTipologiaContratto(ConstantGlobal.TIPO_CONTRATTO
						.valueOf(tipologiaContratto.trim().replace(" ", "_").toUpperCase()));
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

	@Override
	public boolean addEmailAziendale()  throws DipendenteException, ClienteException {
		boolean result = false;
		if (StringUtils.isEmpty(getEmailAzienda())) {
			if (StringUtils.isNotBlank(getNome()) && StringUtils.isNotBlank(getCognome())
					&& StringUtils.isNotBlank(getNomeAzienda())) {
				setEmailAzienda(calcoloEmailAzienda());
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

	@Override
	public boolean addRuolo(String ruolo)  throws DipendenteException, ClienteException {
		boolean result = false;
		if (StringUtils.isNotBlank(ruolo) && StringUtils.isAlphaSpace(ruolo)) {
			if (StringUtils.isEmpty(getRuolo())) {
				setRuolo(ControlliGlobal.upperCaseFirst(ruolo.trim()));
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

	@Override
	public boolean modificaNomeAzienda(String nomeAzienda) throws DipendenteException, ClienteException {
		boolean result = false;
		if (StringUtils.isNotBlank(nomeAzienda) && StringUtils.isAlphaSpace(nomeAzienda)) {
			if (StringUtils.isNotBlank(getNomeAzienda())) {
				setNomeAzienda(ControlliGlobal.upperCaseFirst(nomeAzienda.trim()));
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

	@Override
	public boolean modificaNumeroTelefonoAziendale(String numeroTelefonoAziendale) throws DipendenteException, ClienteException {
		boolean result = false;
		if (StringUtils.isNotBlank(numeroTelefonoAziendale)
				&& numeroTelefonoAziendale.trim().matches(ConstantGlobal.REGEX_CONTROLLO_NUMERO_TELEFONO)) {
			if (StringUtils.isNotBlank(getNumeroTelefonoAziendale())) {
				setNumeroTelefonoAziendale(numeroTelefonoAziendale.trim());
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

	@Override
	public boolean modificatipologiaContratto(String tipologiaContratto) throws DipendenteException, ClienteException {
		boolean result = false;

		if (StringUtils.isNotBlank(tipologiaContratto)
				&& controlloTipoContratto(tipologiaContratto.trim().replace(" ", "_").toUpperCase())) {
			if (getTipologiaContratto() != null) {
				setTipologiaContratto(ConstantGlobal.TIPO_CONTRATTO
						.valueOf(tipologiaContratto.trim().replace(" ", "_").toUpperCase()));
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

	@Override
	public boolean modificaCodiceIdentificativo(String codiceIdentificativo) throws DipendenteException, ClienteException {
		boolean result = false;
		if (controlloIdentificativo(codiceIdentificativo.trim())) {
			eliminaIdentificativo();
			setCodiceIdentificativo(codiceIdentificativo);
			elencoCodiceIdentificativo.add(codiceIdentificativo);
			result = true;
		}
		return result;
	}

	@Override
	public boolean modificaEmailAziendale() throws DipendenteException, ClienteException {
		boolean result = false;
		if (StringUtils.isNotBlank(getEmailAzienda())) {
			if (StringUtils.isNotBlank(getNome()) && StringUtils.isNotBlank(getCognome())
					&& StringUtils.isNotBlank(getNomeAzienda())) {
				if (StringUtils.equals(emailAzienda, getEmailAzienda())) {
					setEmailAzienda(calcoloEmailAzienda());
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

	@Override
	public boolean modificaRuolo(String ruolo) throws DipendenteException, ClienteException {
		boolean result = false;
		if (StringUtils.isNotBlank(ruolo) && StringUtils.isAlphaSpace(ruolo)) {
			if (StringUtils.isNotBlank(getRuolo())) {
				setRuolo(ControlliGlobal.upperCaseFirst(ruolo.trim().replace(" ", "_")));
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

	@Override
	public boolean eliminaNomeAzienda() throws DipendenteException, ClienteException {
		boolean result = false;
		if (StringUtils.isNotBlank(getNomeAzienda())) {
			setNomeAzienda(null);
			result = true;
		} else {
			throw new DipendenteException(
					"errore, non può essere cancellato il numero di telefono aziendale del dipendente perchè non è stata ancora inserita");
		}

		return result;
	}

	@Override
	public boolean eliminaNumeroTelefonoAziendale() throws DipendenteException, ClienteException {
		boolean result = false;
		if (StringUtils.isNotBlank(getNumeroTelefonoAziendale())) {
			setNumeroTelefonoAziendale(null);
			result = true;
		} else {
			throw new DipendenteException(
					"errore, non può essere cancellato il numero di telefono aziendale del dipendente perchè non è stata ancora inserita");
		}

		return result;
	}

	@Override
	public boolean eliminatipologiaContratto() throws DipendenteException,ClienteException {
		boolean result = false;
		if (getTipologiaContratto() != null) {
			setTipologiaContratto(null);
			result = true;
		} else {
			throw new DipendenteException(
					"errore, non può essere cancellata la tipologia del contratto del dipendente perchè non è stata ancora inserita");
		}

		return result;
	}

	@Override
	public boolean eliminaRuolo() throws DipendenteException, ClienteException {
		boolean result = false;
		if (StringUtils.isNotBlank(getRuolo())) {
			setRuolo(null);
			result = true;
		} else {
			throw new DipendenteException(
					"errore, non può essere cancellato il ruolo del dipendente perchè non è stato ancora inserito");
		}

		return result;
	}

	@Override
	public boolean eliminaEmailAziendale() throws DipendenteException, ClienteException {
		boolean result = false;
		if (StringUtils.isNotBlank(getEmailAzienda())) {
			setEmailAzienda(null);
			result = true;
		} else {
			throw new DipendenteException(
					"errore, non può essere cancellata l'email del dipendente perchè non è stata ancora inserita");
		}

		return result;
	}

	@Override
	public String visualizzaCodiceIdentificativoDipendete() throws ClienteException{
		return getCodiceIdentificativo();
	}

	@Override
	public String visualizzaNomeAziendaDipendente() throws ClienteException {
		return getNomeAzienda();
	}

	@Override
	public String visualizzaEmailAziendaleDipendente() throws ClienteException {
		return getEmailAzienda();
	}

	@Override
	public String visualizzaNumeroTelefonoAziendaleDipendente() throws ClienteException {
		return getNumeroTelefonoAziendale();
	}

	@Override
	public TIPO_CONTRATTO visualizzatipologiaContrattoDipendente() throws ClienteException{
		return getTipologiaContratto();
	}

	@Override
	public String visualizzaRuoloDipendente() throws ClienteException {
		return getRuolo();
	}

	@Override
	public boolean addNomeCartaFedelta(String nomeCartaFedelta) throws ClienteException, DipendenteException{
		throw new DipendenteException ("Questa funzionalità non può essere usata per il Dipendente");
	}

	@Override
	public boolean addPuntiFedeltaAccumulati(String puntiFedelta) throws ClienteException, DipendenteException {
		throw new DipendenteException ("Questa funzionalità non può essere usata per il Dipendente");
	}

	@Override
	public boolean addDataInscrizioneTessera(String dataInscrizioneTessera) throws ClienteException, DipendenteException {
		throw new DipendenteException ("Questa funzionalità non può essere usata per il Dipendente");
	}

	@Override
	public boolean addNumeroCartaFedelta() throws ClienteException, DipendenteException {
		throw new DipendenteException ("Questa funzionalità non può essere usata per il Dipendente");
	}

	@Override
	public void visualizzaElencoOperazioniPunti() throws DipendenteException {
		throw new DipendenteException("Questa funzionalità non può essere usata per il Dipendente");
	}

	@Override
	public String VisualizzaNomeCartaFedelta() throws DipendenteException {
		throw new DipendenteException("Questa funzionalità non può essere usata per il Dipendente");
	}

	@Override
	public String VisualizzaPuntiFedeltaAccumulati() throws DipendenteException {
		throw new DipendenteException("Questa funzionalità non può essere usata per il Dipendente");
	}

	@Override
	public String VisualizzaDataInscrizioneTessera() throws DipendenteException {
		throw new DipendenteException("Questa funzionalità non può essere usata per il Dipendente");
	}

	@Override
	public String VisualizzaNumeroCartaFedelta() throws DipendenteException {
		throw new DipendenteException("Questa funzionalità non può essere usata per il Dipendente");
	}

	@Override
	public String VisualizzaCodiceFiscale() throws DipendenteException {
		throw new DipendenteException("Questa funzionalità non può essere usata per il Dipendente");
	}

	@Override
	public boolean eliminaNomeCartaFedelta() throws DipendenteException {
		throw new DipendenteException("Questa funzionalità non può essere usata per il Dipendente");
	}

	@Override
	public boolean eliminaPuntiAccumulati()  throws DipendenteException {
		throw new DipendenteException("Questa funzionalità non può essere usata per il Dipendente");
	}

	@Override
	public boolean eliminaDataInscrizioneTessera()  throws DipendenteException {
		throw new DipendenteException("Questa funzionalità non può essere usata per il Dipendente");
	}

	@Override
	public boolean eliminaNumeroCartaFedelta()  throws DipendenteException {
		throw new DipendenteException("Questa funzionalità non può essere usata per il Dipendente");
	}

	@Override
	public boolean modificaNomeCartaFedelta(String nomeCartaFedelta) throws ClienteException, DipendenteException {
		throw new DipendenteException("Questa funzionalità non può essere usata per il Dipendente");
	}

	@Override
	public boolean modificaPuntiFedeltaAccumulati(String puntiFedelta,
			ConstantGlobal.OPERAZIONE_PUNTI_FEDELTA operazione) throws ClienteException, DipendenteException {
		throw new DipendenteException("Questa funzionalità non può essere usata per il Dipendente");
	}

	@Override
	public boolean modificaDataInscrizioneTessera(String dataInscrizioneTessera) throws ClienteException, DipendenteException {
		throw new DipendenteException("Questa funzionalità non può essere usata per il Dipendente");
	}

	@Override
	public boolean modificaNumeroCartaFedelta() throws ClienteException, DipendenteException {
		throw new DipendenteException("Questa funzionalità non può essere usata per il Dipendente");
	}

	@Override
	public boolean modificaCodiceFiscale(String codiceFiscale) throws ClienteException, DipendenteException {
		throw new DipendenteException("Questa funzionalità non può essere usata per il Dipendente");
	}

	private boolean controllo_data_vendita() throws ParseException, PersonaException {
		boolean result = false;
		if (dataGiorno == null) {
			dataGiorno=	java.sql.Date.valueOf(LocalDate.now());
			result = true;
		} else if (StringUtils.equals(sdf.format(dataGiorno), sdf.format(java.sql.Date.valueOf(LocalDate.now())))) {
			if (this.numeroTvVendute < ConstantGlobal.NUMERO_MASSIMO_TV_VENDUTE) {
				result = true;
			}else {
				throw new PersonaException("errore, il dipendente "+this.codiceIdentificativo+" ha superato il numero di vendite giornaliere");
			}
		} else {
			dataGiorno=	java.sql.Date.valueOf(LocalDate.now());
			this.numeroTvVendute = 0;
			result = true;
		}
		return result;
	}

	public boolean vendiTv(Televisore tv, Cliente cliente, String prezzoVendita) throws PersonaException, TelevisoreException {
		boolean result = false;
		try {
			if (controllo_data_vendita()) {
				TvVendute.add(new Vendita(this.getCodiceIdentificativo(), prezzoVendita, tv, sdf.format(dataGiorno),
						 cliente));
				this.numeroTvVendute = ++incrementNumeroTv;
			}
		} catch (ParseException e) {
			System.err.println(e.getMessage());
		}
		return result;

	}

	public boolean riparaTv(String dataRichiestaRiparazione, String dataPrevistaConsegna, String costoRiparazione,
			Cliente clienteRiparazione, Televisore tvRiparata, String informazioneRiparazione)
			throws  ParseException, RiparazioneException,ClienteException  {
		boolean result = false;
		Riparazione ripara = new Riparazione(codiceIdentificativo, dataRichiestaRiparazione, dataPrevistaConsegna, costoRiparazione,
				( clienteRiparazione), tvRiparata, informazioneRiparazione);
		this.tvRiparate.add(ripara);
		result = true;
		return result;

	}

	@Override
	public Set<Riparazione> visualizzaElencoTvRiparate() throws ClienteException {
		return tvRiparate;
	}

	@Override
	public Set<Vendita> visualizzaElencoTvVendute() throws ClienteException {
		return TvVendute;
	}

}
