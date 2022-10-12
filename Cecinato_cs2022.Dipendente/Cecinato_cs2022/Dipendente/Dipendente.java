package Cecinato_cs2022.Dipendente;

import java.text.ParseException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import Cecinato_cs2022.Cliente.Cliente;
import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.ConstantGlobal.ConstantGlobal.TIPO_CONTRATTO;
import Cecinato_cs2022.DipendenteException.DipendenteException;
import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;
import Cecinato_cs2022.ExceptionPersona.PersonaException;
import Cecinato_cs2022.Persona.AbstractPersona;
import Cecinato_cs2022.TelevisoreService.Televisore;
import org.apache.commons.lang3.StringUtils;

public class Dipendente extends AbstractPersona {

	private int numeroTvVendute;
	private static int incrementNumeroTv = 0;
	private String codiceIdentificativo;
	private String nomeAzienda;
	private String emailAzienda;
	private String numeroTelefonoAziendale; // ( Formato: +99 9999999999 )
	private ConstantGlobal.TIPO_CONTRATTO tipologiaContratto;
	private String ruolo;
	protected static Set<String> elencoCodiceIdentificativo = new TreeSet<String>();
	private Set<Vendita> TvVendute = new TreeSet<Vendita>();
	private Set<Riparazione> TvRiprarate = new TreeSet<Riparazione>();

	public Dipendente(String codiceIdentificativo) throws PersonaException {
		if (controlloIdentificativo(codiceIdentificativo)) {
			this.codiceIdentificativo = codiceIdentificativo;
			elencoCodiceIdentificativo.add(codiceIdentificativo);
		}
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
	
	

	@Override
	public String toString() {
		String stringa = null;
		stringa = String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_DIPENDENTE, "_")).concat("\n");
		stringa += String.format("| %110s %107s ", ConstantGlobal.TITOLO_TABELLA_DIPENDENTE, "|\n");
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_DIPENDENTE, "_"))
				.concat("\n");
		stringa += ConstantGlobal.TABELLA_DIPENDENTE;
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_DIPENDENTE, "_"))
				.concat("\n");
		stringa += String.format("| %10s %5s %9s %5s %6s %5s %9s %4s %11s %5s %9s %5s %16s %5s %28s %5s %15s %4s %13s %5s %17s %6s \n", super.VisualizzaNome(), " | ",
				super.VisualizzaCognome(), " | ", super.VisualizzaEta(), " | ", super.getGenere(), " | ", super.getDataNascita(), " | ", super.VisualizzaCitta(), " | ", getRuolo(), " | ",getEmailAzienda(),
				" | ",getNumeroTelefonoAziendale()," | ",getNomeAzienda()," | ",getTipologiaContratto()," | ");
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_DIPENDENTE, "_")).concat("\n");
		return stringa;
	}

	private String calcoloEmailAzienda() {
		return getNome().replace(" ", "").concat(getCognome().replace(" ", "")).concat("@").concat(getNomeAzienda().replace(" ", "")).concat(".com");

	}

	protected boolean controlloIdentificativo(String codiceIdentificativo) throws PersonaException {
		boolean result = true;
		if (StringUtils.isNotBlank(codiceIdentificativo) && codiceIdentificativo.trim().matches(ConstantGlobal.REGEX_CONTROLLO_CODICE_IDENTIFICATIVO)) {
			Iterator<String> element = elencoCodiceIdentificativo.iterator();
			while (element.hasNext()) {
				if (StringUtils.equals(element.next(), codiceIdentificativo) )
					result = false;
			}
			if (!result) {
				throw new PersonaException("Il codice Identificativo esiste già");
			}
		} else {
			throw new PersonaException("Il codice Identificativo è errato");
		}
		return result;
	}
	

	private boolean eliminaIdentificativo() throws PersonaException {
		boolean result = true;
		Iterator<String> element = elencoCodiceIdentificativo.iterator();
		while (element.hasNext()) {
			if (StringUtils.equals(element.next() , codiceIdentificativo)) {
				element.remove();
			}
		}
		return result;
	}

	@Override
	public boolean addNomeAzienda(String nomeAzienda) throws PersonaException {
		boolean result = false;
			if (StringUtils.isNotBlank(nomeAzienda) && StringUtils.isAlphaSpace(nomeAzienda)) {
				if (StringUtils.isEmpty(getNomeAzienda())) {
					setNomeAzienda(super.upperCaseFirst(nomeAzienda.trim()));
					result = true;
				} else {
					throw new PersonaException(
							"errore, non può essere aggiunto il nome dell'azienda del dipendente perchè  è stato già inserito");
				}
			} else {
				throw new PersonaException("Errore nell'inserimento del nome dell 'azienda dove lavora il dipendente");
			}
		return result;
	}

	@Override
	public boolean addNumeroTelefonoAziendale(String numeroTelefonoAziendale) throws PersonaException {
		boolean result = false;
			if (StringUtils.isNotBlank(numeroTelefonoAziendale) && numeroTelefonoAziendale.trim().matches(ConstantGlobal.REGEX_CONTROLLO_NUMERO_TELEFONO)) {
				if (StringUtils.isEmpty(getNumeroTelefonoAziendale())) {
					setNumeroTelefonoAziendale(numeroTelefonoAziendale.trim());
					result = true;
				} else {
					throw new PersonaException(
							"errore, non può essere aggiunto il numero di telefono del dipendente perchè è stato già inserito");
				}
			} else {
				throw new PersonaException("Errore nell'inserimento del numero di telefono del dipendente");
			}
		return result;
	}

	
	@Override
	public boolean addtipologiaContratto(String tipologiaContratto) throws PersonaException {
		boolean result = false;
			if (StringUtils.isNotBlank(tipologiaContratto) && controlloTipoContratto(tipologiaContratto)) {
				if (getTipologiaContratto() == null ) {
					setTipologiaContratto(ConstantGlobal.TIPO_CONTRATTO.valueOf(tipologiaContratto.trim()));
					result = true;
				} else {
					throw new PersonaException(
							"errore, non può essere aggiunto il tipo di contratto del dipendente perchè  è stato già inserito");
				}
			} else {
				throw new PersonaException("Errore nell'inserimento del tipo di contratto del dipendente");
			}
		return result;
	}

	
	@Override
	public boolean addEmailAziendale() throws PersonaException {
		boolean result = false;
		if (StringUtils.isEmpty(getEmailAzienda())) {
			if (StringUtils.isNotBlank(getNome()) && StringUtils.isNotBlank(getCognome()) && StringUtils.isNotBlank(getNomeAzienda())) {
				setEmailAzienda(calcoloEmailAzienda());
				result = true;
			} else {
				throw new PersonaException(
						"errore, l'email non può essere creata se manca uno di questi campi:\n1) NOME DEL DIPENDETE \n2)COGNOME DEL DIPENTE  \n3) IL NOME DELL'AZIENDA A CUI LAVORA");
			}
		} else {
			throw new PersonaException(
					"errore, non può essere aggiunta l'email del dipendente perchè  è stata già inserita");
		}

		return result;
	}

	
	@Override
	public boolean addRuolo(String ruolo) throws PersonaException {
		boolean result = false;
			if (StringUtils.isNotBlank(ruolo) && StringUtils.isAlphaSpace(ruolo)) {
				if (StringUtils.isEmpty(getRuolo())) {
					setRuolo(super.upperCaseFirst(ruolo.trim()));
					result = true;
				} else {
					throw new PersonaException(
							"errore, non può essere aggiunto il ruolo del dipendente  perchè è stato già inserito");
				}
			} else {
				throw new PersonaException("Errore nell'inserimento del ruolo del dipendente");
			}
		return result;
	}

	
	@Override
	public boolean modificaNomeAzienda(String nomeAzienda) throws PersonaException {
		boolean result = false;
			if (StringUtils.isNotBlank(nomeAzienda) && StringUtils.isAlphaSpace(nomeAzienda)) {
				if (StringUtils.isNotBlank(getNomeAzienda())) {
					setNomeAzienda(super.upperCaseFirst(nomeAzienda.trim()));
					result = true;
				} else {
					throw new PersonaException(
							"errore, non può essere modificato il nome della azienda dove lavora del dipendente perchè  non è stato ancora inserito");
				}
			} else {
				throw new PersonaException("Errore nell'inserimento del nome dell' azienda dove lavora il dipendente");
			}
		return result;
	}

	
	@Override
	public boolean modificaNumeroTelefonoAziendale(String numeroTelefonoAziendale) throws PersonaException {
		boolean result = false;
			if (StringUtils.isNotBlank(numeroTelefonoAziendale) && numeroTelefonoAziendale.trim().matches(ConstantGlobal.REGEX_CONTROLLO_NUMERO_TELEFONO)){
				if (StringUtils.isNotBlank(getNumeroTelefonoAziendale())) { 
					setNumeroTelefonoAziendale(numeroTelefonoAziendale.trim());
					result = true;
				} else {
					throw new PersonaException(
							"errore, non può essere modificato il numero di telefono del dipendente perchè non è stato ancora inserito");
				}
			} else {
				throw new PersonaException("Errore nell'inserimento del numero di telefono del dipendente");
			}
		return result;
	}

	
	@Override
	public boolean modificatipologiaContratto(String tipologiaContratto) throws PersonaException {
		boolean result = false;

			if (StringUtils.isNotBlank(tipologiaContratto) && controlloTipoContratto(tipologiaContratto.trim())) {
				if (getTipologiaContratto()!=null) {
					setTipologiaContratto(ConstantGlobal.TIPO_CONTRATTO.valueOf(tipologiaContratto.trim()));
					result = true;
				} else {
					throw new PersonaException(
							"errore, non può essere modificato il tipo di contratto del dipendente perchè non è stato ancora inserito");
				}
			} else {
				throw new PersonaException("Errore nell'inserimento il tipo di contratto del dipendente");
			}
		return result;
	}

	
	@Override
	public boolean modificaCodiceIdentificativo(String codiceIdentificativo) throws PersonaException {
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
	public boolean modificaEmailAziendale() throws PersonaException {
		boolean result = false;
		if (StringUtils.isNotBlank(getEmailAzienda())){
			if (StringUtils.isNotBlank(getNome())&& StringUtils.isNotBlank(getCognome()) && StringUtils.isNotBlank(getNomeAzienda())) {
				if (StringUtils.equals(emailAzienda, getEmailAzienda())) {
					setEmailAzienda(calcoloEmailAzienda());
					result = true;
				} else {
					throw new PersonaException(
							"la email non può essere modificata essendo che è la stessa che è gia presente");
				}
			} else {
				throw new PersonaException(
						"errore, l'email non può essere modificata se manca uno di questi campi:\n1) NOME DEL DIPENDETE \n2)COGNOME DEL DIPENTE  \n3) IL NOME DELL'AZIENDA A CUI LAVORA");
			}
		} else {
			throw new PersonaException(
					"errore, non può essere modificata l'email del dipendente perchè non è stata inserita");
		}
		return result;
	}

	@Override
	public boolean modificaRuolo(String ruolo) throws PersonaException {
		boolean result = false;
			if (StringUtils.isNotBlank(ruolo) && StringUtils.isAlphaSpace(ruolo)) {
				if (StringUtils.isNotBlank(getRuolo())) {
					setRuolo(super.upperCaseFirst(ruolo.trim()));
					result = true;
				} else {
					throw new PersonaException(
							"errore, non può essere modificato il ruolo del dipendente  perchè  non è stato ancora inserito");
				}
			} else {
				throw new PersonaException("Errore nell'inserimento del ruolo del dipendente");
			}
		return result;
	}

	@Override
	public boolean eliminaNomeAzienda() throws PersonaException {
		boolean result = false;
		if (StringUtils.isNotBlank(getNomeAzienda())) {
			setNomeAzienda(null);
			result = true;
		} else {
			throw new PersonaException(
					"errore, non può essere cancellato il numero di telefono aziendale del dipendente perchè non è stata ancora inserita");
		}

		return result;
	}

	
	@Override
	public boolean eliminaNumeroTelefonoAziendale() throws PersonaException {
		boolean result = false;
		if (StringUtils.isNotBlank(getNumeroTelefonoAziendale())) {
			setNumeroTelefonoAziendale(null);
			result = true;
		} else {
			throw new PersonaException(
					"errore, non può essere cancellato il numero di telefono aziendale del dipendente perchè non è stata ancora inserita");
		}

		return result;
	}

	
	@Override
	public boolean eliminatipologiaContratto() throws PersonaException {
		boolean result = false;
		if (getTipologiaContratto() != null) {
			setTipologiaContratto(null);
			result = true;
		} else {
			throw new PersonaException(
					"errore, non può essere cancellata la tipologia del contratto del dipendente perchè non è stata ancora inserita");
		}

		return result;
	}

	
	@Override
	public boolean eliminaRuolo() throws PersonaException {
		boolean result = false;
		if (StringUtils.isNotBlank(getRuolo())) {
			setRuolo(null);
			result = true;
		} else {
			throw new PersonaException(
					"errore, non può essere cancellato il ruolo del dipendente perchè non è stato ancora inserito");
		}

		return result;
	}

	
	@Override
	public boolean eliminaEmailAziendale() throws PersonaException {
		boolean result = false;
		if (StringUtils.isNotBlank(getEmailAzienda())) {
			setEmailAzienda(null);
			result = true;
		} else {
			throw new PersonaException(
					"errore, non può essere cancellata l'email del dipendente perchè non è stata ancora inserita");
		}

		return result;
	}

	
	@Override
	public String visualizzaCodiceIdentificativoDipendete() throws PersonaException {
		return getCodiceIdentificativo();
	}

	
	@Override
	public String visualizzaNomeAziendaDipendente() throws PersonaException {
		return getNomeAzienda();
	}

	
	@Override
	public String visualizzaEmailAziendaleDipendente() throws PersonaException {
		return getEmailAzienda();
	}

	
	@Override
	public String visualizzaNumeroTelefonoAziendaleDipendente() throws PersonaException {
		return getNumeroTelefonoAziendale();
	}

	
	@Override
	public TIPO_CONTRATTO visualizzatipologiaContrattoDipendente() throws PersonaException {
		return getTipologiaContratto();
	}

	
	@Override
	public String visualizzaRuoloDipendente() throws PersonaException {
		return getRuolo();
	}

	
	@Override
	public boolean addNomeCartaFedelta(String nomeCartaFedelta) throws PersonaException {
		throw new PersonaException("Questa funzionalità non può essere usata per il Dipendente");
	}

	
	@Override
	public boolean addPuntiFedeltaAccumulati(String puntiFedelta) throws PersonaException {
		throw new PersonaException("Questa funzionalità non può essere usata per il Dipendente");
	}

	
	@Override
	public boolean addDataInscrizioneTessera(String dataInscrizioneTessera) throws PersonaException {
		throw new PersonaException("Questa funzionalità non può essere usata per il Dipendente");
	}

	@Override
	public boolean addNumeroCartaFedelta() throws PersonaException {
		throw new PersonaException("Questa funzionalità non può essere usata per il Dipendente");
	}

	
	@Override
	public String VisualizzaNomeCartaFedelta() throws PersonaException {
		throw new PersonaException("Questa funzionalità non può essere usata per il Dipendente");
	}

	
	@Override
	public String VisualizzaPuntiFedeltaAccumulati() throws PersonaException {
		throw new PersonaException("Questa funzionalità non può essere usata per il Dipendente");
	}

	
	@Override
	public String VisualizzaDataInscrizioneTessera() throws PersonaException {
		throw new PersonaException("Questa funzionalità non può essere usata per il Dipendente");
	}

	
	@Override
	public String VisualizzaNumeroCartaFedelta() throws PersonaException {
		throw new PersonaException("Questa funzionalità non può essere usata per il Dipendente");
	}

	
	@Override
	public String VisualizzaCodiceFiscale() throws PersonaException {
		throw new PersonaException("Questa funzionalità non può essere usata per il Dipendente");
	}

	
	@Override
	public boolean eliminaNomeCartaFedelta() throws PersonaException {
		throw new PersonaException("Questa funzionalità non può essere usata per il Dipendente");
	}

	
	@Override
	public boolean eliminaPuntiAccumulati() throws PersonaException {
		throw new PersonaException("Questa funzionalità non può essere usata per il Dipendente");
	}

	
	@Override
	public boolean eliminaDataInscrizioneTessera() throws PersonaException {
		throw new PersonaException("Questa funzionalità non può essere usata per il Dipendente");
	}

	
	@Override
	public boolean eliminaNumeroCartaFedelta() throws PersonaException {
		throw new PersonaException("Questa funzionalità non può essere usata per il Dipendente");
	}

	
	@Override
	public boolean modificaNomeCartaFedelta(String nomeCartaFedelta) throws PersonaException {
		throw new PersonaException("Questa funzionalità non può essere usata per il Dipendente");
	}

	
	@Override
	public boolean modificaPuntiFedeltaAccumulati(String puntiFedelta,
			ConstantGlobal.OPERAZIONE_PUNTI_FEDELTA operazione) throws PersonaException {
		throw new PersonaException("Questa funzionalità non può essere usata per il Dipendente");
	}

	
	@Override
	public boolean modificaDataInscrizioneTessera(String dataInscrizioneTessera) throws PersonaException {
		throw new PersonaException("Questa funzionalità non può essere usata per il Dipendente");
	}

	
	@Override
	public boolean modificaNumeroCartaFedelta() throws PersonaException {
		throw new PersonaException("Questa funzionalità non può essere usata per il Dipendente");
	}
	

	@Override
	public boolean modificaCodiceFiscale(String codiceFiscale) throws PersonaException {
		throw new PersonaException("Questa funzionalità non può essere usata per il Dipendente");
	}

	
	public boolean vendiTv(Televisore tv, Cliente cliente, String DataVendita, String PrezzoVendita) {
		boolean result = false;
		this.numeroTvVendute = ++incrementNumeroTv;
		TvVendute.add(new Vendita());
		return result;
	}
	
	
	public boolean riparaTv(String dataRichiestaRiparazione, String dataPrevistaConsegna, String costoRiparazione,
			Cliente clienteRiparazione, Televisore tvRiparata, String informazioneRiparazione)
			throws PersonaException, ParseException, TelevisoreException, DipendenteException {
		boolean result = false;
		try {
			Riparazione ripara = new Riparazione(dataRichiestaRiparazione, dataPrevistaConsegna, costoRiparazione,
					clienteRiparazione, tvRiparata, informazioneRiparazione);
			if(controlloRiparazione(ripara)) {
				TvRiprarate.add(ripara);
				result = true;
			}
		} catch (PersonaException e) {
			System.out.println(e.getMessage());
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		} catch (TelevisoreException e) {
			System.out.println(e.getMessage());
		} catch (DipendenteException e) {
			System.out.println(e.getMessage());
		}
		return result;
	}
	
	protected boolean controlloRiparazione(Riparazione ripara) throws PersonaException {
		boolean result = true;
			Iterator<Riparazione> element = TvRiprarate.iterator();
			while (element.hasNext()) {
				if (element.next().equals(ripara))
					result = false;
			}
			if (!result) {
				throw new PersonaException("questa riparazione è già presente");
			}	
		return result;
	}

	
	
}
