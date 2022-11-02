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

public abstract class AbstractPersona implements Persona {
	private static final long serialVersionUID = 1L;
	private String nome;
	private String cognome;
	private int eta;
	private ConstantGlobal.GENERE genere;
	private String dataNascita; // il formato sar� 01/02/2022
	private String citta;


	public AbstractPersona() {
		super();
	}

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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public ConstantGlobal.GENERE getGenere() {
		return this.genere;
	}

	public void setGenere(ConstantGlobal.GENERE genere) {
		this.genere = genere;
	}

	public String getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}
	

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

	public String VisualizzaNome() {
		return getNome();
	}

	public String VisualizzaCognome() {
		return getCognome();
	}

	public int VisualizzaEta() {
		return getEta();
	}

	public ConstantGlobal.GENERE VisualizzaGenere() {
		return getGenere();
	}

	public String VisualizzaDataNascita() {
		return getDataNascita();
	}

	public String VisualizzaCitta() {
		return getCitta();
	}

	public void visualizzaElencoGenerePersona() {
		int i = 0;
		System.out.println("L'elenco dei generi :");
		for (ConstantGlobal.GENERE item : ConstantGlobal.GENERE.values()) {
			System.out.println(String.valueOf(i).concat(") ").concat(String.valueOf(item)).toLowerCase());
			i += 1;
		}
	}

	public boolean addNome(String nome) throws PersonaException {
		boolean result = false;
			if (StringUtils.isNotBlank(nome) && StringUtils.isAlphaSpace(nome)) {
				if (StringUtils.isEmpty(getNome()) ) {
					nome = ControlliGlobal.upperCaseFirst(nome.trim());
					setNome(nome);
					result = true;
				} else {
					throw new PersonaException(
							"errore, non pu� essere aggiunto il nome della persona perch� � gia presente");
				}
			} else {
				throw new PersonaException("Errore nell'inserimento del nome");
			}
		return result;
	}

	public boolean addCognome(String cognome) throws PersonaException {
		boolean result = false;
			if (StringUtils.isNotBlank(cognome) && StringUtils.isAlphaSpace(cognome)) {
				if (StringUtils.isEmpty(getCognome())) {
					cognome = ControlliGlobal.upperCaseFirst(cognome.trim());
					setCognome(cognome);
					result = true;
				} else {
					throw new PersonaException(
							"errore, non pu� essere aggiunto il cognome della persona perch� � gia presente");
				}
			} else {
				throw new PersonaException("Errore nell'inserimento del cognome");
			}
		return result;
	}

	public boolean addEta(int eta) throws PersonaException {
		boolean result = false;
			if (getEta() == 0) {
				if (eta >= ConstantGlobal.ETA_MINIMA_CLIENTE && eta <= ConstantGlobal.ETA_MASSIMA_CLIENTE) {
					setEta(eta);
					result = true;
				} else {
					throw new PersonaException("Errore nell'inserimento dell'et�");
				}
			} else {
				throw new PersonaException("Errore non pu� essere aggiunta l'et� della persona perch� � gia presente");
			}
		return result;
	}

	public boolean addGenere(String genere) throws PersonaException {
		boolean result = false;
			if (StringUtils.isNotBlank(genere) && controlloGenere(genere.toUpperCase()) ) {
				if (getGenere()==null) {
					setGenere(ConstantGlobal.GENERE.valueOf(genere.toUpperCase()));
					result = true;
				} else {
					throw new PersonaException(
							"errore, non pu� essere aggiunta il genere della persona perch� � gia presente");
				}
			} else {
				throw new PersonaException("Errore nell'inserimento del genere della persona");
			}
		return result;
	}

	public boolean addDataNascita(String dataNascita) throws PersonaException {
		boolean result = false;
			if (StringUtils.isNotBlank(dataNascita) && dataNascita.trim().matches(ConstantGlobal.REGEX_CONTROLLO_DATA) ) {
				if (StringUtils.isEmpty(getDataNascita())) {
					setDataNascita(dataNascita.trim());
					result = true;
				} else {
					throw new PersonaException(
							"errore, non pu� essere aggiunta la data della persona perch� � gia presente");
				}
			} else {
				throw new PersonaException("Errore nell'inserimento della data");
			}
		return result;
	}

	public boolean addCitta(String citta) throws PersonaException {
		boolean result = false;
		
		if (StringUtils.isAlphaSpace(citta) && StringUtils.isNotBlank(citta) ) {
			if (StringUtils.isEmpty(getCitta())) {
				setCitta(ControlliGlobal.upperCaseFirst(citta.trim()));
				result = true;
			} else {
				throw new PersonaException(
						"errore, non pu� essere aggiunta la citta della persona perch� � gia presente");
			}
		} else {
			throw new PersonaException("Errore nell'inserimento del della citt�");
		}
		return result;
	}

	public boolean modificaNome(String nome) throws PersonaException {
		boolean result = false;
			if ( StringUtils.isAlphaSpace(nome) && StringUtils.isNotBlank(nome)) {
				if (StringUtils.isNotBlank(getNome())) {
					setNome(ControlliGlobal.upperCaseFirst(nome.trim()));
					result= true;
				} else {
					throw new PersonaException(
							"errore, non pu� essere modificato il nome della persona perch� � stato ancora inserito");
				}
			} else {
				throw new PersonaException("Errore nell'inserimento del nome");
			} 
		return result;

	}

	public boolean modificaCognome(String cognome) throws PersonaException {
		boolean result = false;
		if (StringUtils.isAlphaSpace(cognome) && StringUtils.isNotBlank(cognome)) {
			if (StringUtils.isNotBlank(getCognome())) {
				setCognome(ControlliGlobal.upperCaseFirst(cognome.trim()));
				result = true;
			} else {
				throw new PersonaException(
						"errore, non pu� essere modificato il cognome della persona perch�  non � stato ancora inserito");
			}
		} else {
			throw new PersonaException("Errore nell'inserimento del cognome");
		}
		return result;
	}

	public boolean modificaEta(int eta) throws PersonaException {
		boolean result = false;
		if (getEta() != 0) {
			if (eta >= ConstantGlobal.ETA_MINIMA_CLIENTE && eta <= ConstantGlobal.ETA_MASSIMA_CLIENTE) {
				setEta(eta);
				result = true;
			} else {
				throw new PersonaException("Errore nell'inserimento dell'et�");
			}
		} else {
			throw new PersonaException(
					"Errore non pu� essere modificata l'et� della persona perch� non � stato ancora inserita");
		}
		return result;
	}

	public boolean modificaGenere(String genere) throws PersonaException {
		boolean result = false;
		if (StringUtils.isNotBlank((String)genere) && controlloGenere(genere.trim())) {
			if ( getGenere() !=  null) {
				setGenere(ConstantGlobal.GENERE.valueOf(genere.trim()));
				result = true;
			} else {
				throw new PersonaException(
						"errore, non pu� essere modificato il genere della persona perch� non � stato ancora inserito");
			}
		} else {
			throw new PersonaException("Errore nell'inserimento del genere della persona");
		}
		return result;
	}

	public boolean modificaDataNascita(String dataNascita) throws PersonaException {
		boolean result = false;
		if (StringUtils.isNotBlank(dataNascita)  &&  dataNascita.trim().matches(ConstantGlobal.REGEX_CONTROLLO_DATA)) {
			if (StringUtils.isNotBlank(getDataNascita())) {
				setDataNascita(dataNascita.trim());
				result = true;
			} else {
				throw new PersonaException(
						"errore, non pu� essere modificata la data di nascita della persona perch� non � stata ancora inserita");
			}
		} else {
			throw new PersonaException("Errore nell'inserimento della data");
		}
		return result;
	}

	public boolean modificaCitta(String citta) throws PersonaException {
		boolean result = false;
		try {
			if (StringUtils.isAlphaSpace(citta) &&  StringUtils.isNotBlank(citta)) {
				if (getCitta() != null) {
					setCitta(ControlliGlobal.upperCaseFirst(citta.trim()));
					result = true;
				} else {
					throw new PersonaException(
							"errore, non pu� essere modificata la citt� della persona perch� non � stata ancora inserita");
				}
			} else {
				throw new PersonaException("Errore nell'inserimento del della citt�");
			}
		} catch(NullPointerException e){
			System.err.println("E' stato inserito un valore nullo");
		}
		return result;
	}

	public boolean eliminaNome() throws PersonaException {
		boolean result = false;
		if (StringUtils.isNotBlank(getNome())) {
			setNome(null);
			result = true;
		} else {
			throw new PersonaException(
					"errore, non pu� essere cancellato il nome della persona perch� � stato ancora inserito");
		}
		return result;
	}

	public boolean eliminaCognome() throws PersonaException {
		boolean result = false;
		if (StringUtils.isNotBlank(getCognome())) {
			setCognome(null);
			result = true;
		} else {
			throw new PersonaException(
					"errore, non pu� essere cancellato il cognome della persona perch�  non � stato ancora inserito");
		}
		return result;
	}

	public boolean eliminaEta() throws PersonaException {
		boolean result = false;
		if (getEta() != 0) {
			setEta(0);
			result = true;
		} else {
			throw new PersonaException(
					"Errore non pu� essere cancellata l'et� della persona perch� non � stato ancora inserita");
		}
		return result;
	}

	public boolean eliminaGenere() throws PersonaException {
		boolean result = false;
		if (getGenere()!= null) {
			setGenere(null);
			result = true;
		} else {
			throw new PersonaException(
					"errore, non pu� essere cancellato il genere della persona perch� non � stato ancora inserito");
		}
		return result;
	}

	public boolean eliminaDataNascita() throws PersonaException {
		boolean result = false;
		if (StringUtils.isNotBlank(getDataNascita())) {
			setDataNascita(null);
			result = true;
		} else {
			throw new PersonaException(
					"errore, non pu� essere cancellata la data di nascita della persona perch� non � stata ancora inserita");
		}
		return result;
	}

	public boolean eliminaCitta() throws PersonaException {
		boolean result = false;
		if (StringUtils.isNotBlank(getCitta())) {
			setCitta(null);
			result = true;
		} else {
			throw new PersonaException(
					"errore, non pu� essere cancellata la citt� della persona perch� non � stata ancora inserita");
		}

		return result;
	}

	public abstract boolean addNomeAzienda(String nomeAzienda)  throws DipendenteException, ClienteException;

	public abstract boolean addEmailAziendale()  throws DipendenteException, ClienteException;

	public abstract boolean addNumeroTelefonoAziendale(String numeroTelefonoAziendale)  throws DipendenteException, ClienteException;

	public abstract boolean addtipologiaContratto(String tipologiaContratto)  throws DipendenteException, ClienteException;

	public abstract boolean addRuolo(String ruolo)  throws DipendenteException, ClienteException;

	public abstract boolean modificaNomeAzienda(String nomeAzienda) throws DipendenteException, ClienteException;

	public abstract boolean modificaEmailAziendale() throws DipendenteException, ClienteException;

	public abstract boolean modificaNumeroTelefonoAziendale(String numeroTelefonoAziendale) throws DipendenteException, ClienteException;

	public abstract boolean modificatipologiaContratto(String tipologiaContratto) throws DipendenteException, ClienteException;

	public abstract boolean modificaCodiceIdentificativo(String codiceIdentificativo) throws DipendenteException, ClienteException;

	public abstract boolean modificaRuolo(String ruolo) throws DipendenteException, ClienteException;

	public abstract boolean eliminaNomeAzienda() throws DipendenteException, ClienteException;

	public abstract boolean eliminaEmailAziendale()  throws DipendenteException, ClienteException;

	public abstract boolean eliminaNumeroTelefonoAziendale()  throws DipendenteException, ClienteException;

	public abstract boolean eliminatipologiaContratto()  throws DipendenteException, ClienteException;

	public abstract boolean eliminaRuolo()  throws DipendenteException, ClienteException;

	public abstract String visualizzaCodiceIdentificativoDipendete() throws ClienteException;

	public abstract String visualizzaNomeAziendaDipendente() throws ClienteException;

	public abstract String visualizzaEmailAziendaleDipendente() throws ClienteException;

	public abstract String visualizzaNumeroTelefonoAziendaleDipendente() throws ClienteException;

	public abstract ConstantGlobal.TIPO_CONTRATTO visualizzatipologiaContrattoDipendente() throws ClienteException;

	public abstract String visualizzaRuoloDipendente() throws ClienteException;
	
	public abstract Set<Riparazione> visualizzaElencoTvRiparate() throws ClienteException;
	
	public abstract Set<Vendita> visualizzaElencoTvVendute() throws ClienteException;

	public abstract boolean addNomeCartaFedelta(String nomeCartaFedelta) throws ClienteException, DipendenteException;

	public abstract boolean addPuntiFedeltaAccumulati(String puntiFedelta) throws ClienteException, DipendenteException;

	public abstract boolean addDataInscrizioneTessera(String dataInscrizioneTessera) throws ClienteException, DipendenteException;

	public abstract boolean addNumeroCartaFedelta() throws ClienteException, DipendenteException;
	
	public abstract void VisualizzaElencoTipologiaContratto() throws ClienteException;
	
	public abstract void visualizzaElencoOperazioniPunti() throws DipendenteException;

	public abstract String VisualizzaNomeCartaFedelta() throws DipendenteException;

	public abstract String VisualizzaPuntiFedeltaAccumulati() throws DipendenteException;

	public abstract String VisualizzaDataInscrizioneTessera() throws DipendenteException;

	public abstract String VisualizzaNumeroCartaFedelta() throws DipendenteException;

	public abstract String VisualizzaCodiceFiscale() throws DipendenteException;

	public abstract boolean eliminaNomeCartaFedelta() throws ClienteException, DipendenteException ;

	public abstract boolean eliminaPuntiAccumulati() throws ClienteException, DipendenteException ;

	public abstract boolean eliminaDataInscrizioneTessera()  throws ClienteException, DipendenteException ;

	public abstract boolean eliminaNumeroCartaFedelta()throws ClienteException, DipendenteException ;

	public abstract boolean modificaNomeCartaFedelta(String nomeCartaFedelta) throws ClienteException, DipendenteException;

	public abstract boolean modificaPuntiFedeltaAccumulati(String puntiFedelta,
			ConstantGlobal.OPERAZIONE_PUNTI_FEDELTA operazione) throws ClienteException, DipendenteException;

	public abstract boolean modificaDataInscrizioneTessera(String dataInscrizioneTessera) throws ClienteException, DipendenteException;

	public abstract boolean modificaNumeroCartaFedelta() throws ClienteException, DipendenteException;

	public abstract boolean modificaCodiceFiscale(String codiceFiscale) throws ClienteException, DipendenteException;

	public abstract boolean riparaTv(String dataRichiestaRiparazione, String dataPrevistaConsegna, String costoRiparazione,
			Cliente clienteRiparazione, Televisore tvRiparata, String informazioneRiparazione)
			throws  ParseException, RiparazioneException, ClienteException;

	public abstract boolean vendiTv(Televisore tv, Cliente cliente, String PrezzoVendita) throws PersonaException, TelevisoreException  ;
	
}
