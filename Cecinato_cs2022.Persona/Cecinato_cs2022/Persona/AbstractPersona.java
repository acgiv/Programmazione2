package Cecinato_cs2022.Persona;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.ExceptionPersona.PersonaException;
import Cecinato_cs2022.ServicePersona.Persona;

public abstract class AbstractPersona implements Persona {

	private String nome;
	private String cognome;
	private int eta;
	private ConstantGlobal.GENERE genere;
	private String dataNascita; // il formato sarà 01/02/2022
	private String citta;
	protected final static Set<String> elencoCodiceIdentificativo = new TreeSet<String>();
	protected final static Set<String> elencoCodiceFiscale = new TreeSet<String>();

	public AbstractPersona() {

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

	protected final boolean controlloIdentificativo(String codiceIdentificativo) throws PersonaException {
		boolean result = true;
		if (codiceIdentificativo.matches(ConstantGlobal.REGEX_CONTROLLO_CODICE_IDENTIFICATIVO)) {
			Iterator<String> element = elencoCodiceIdentificativo.iterator();
			while (element.hasNext()) {
				if (element.next().equals(codiceIdentificativo))
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
	

	protected final boolean controlloCodiceFiscale(String codiceFiscale) throws PersonaException {
		boolean result = true;
		if (codiceFiscale.matches(ConstantGlobal.REGEX_CONTROLLO_CODICE_FISCALE)) {
			Iterator<String> element = elencoCodiceIdentificativo.iterator();
			while (element.hasNext()) {
				if (element.next().equals(codiceFiscale))
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

	protected final boolean controlloGenere(String genere) {
		boolean result = false;
		for (ConstantGlobal.GENERE item : ConstantGlobal.GENERE.values()) {
			if (String.valueOf(item).equals(genere)) {
				result = true;
				break;
			}
		}
		return result;
	}
	
	protected final boolean controlloTipoContratto(String tipoContratto) {
		boolean result = false;
		for (ConstantGlobal.TIPO_CONTRATTO item : ConstantGlobal.TIPO_CONTRATTO.values()) {
			if (String.valueOf(item).equals(tipoContratto)) {
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
		if (!nome.isEmpty()) {
			if (nome.matches(ConstantGlobal.REGEX_CONTROLLO_STRINGA)) {
				if (getNome() == null) {
					setNome(nome);
					result = true;
				} else {
					throw new PersonaException(
							"errore, non può essere aggiunto il nome della persona perchè è gia presente");
				}
			} else {
				throw new PersonaException("Errore nell'inserimento del nome");
			}
		} else {
			throw new NullPointerException("E' stato inserito un valore nullo");
		}
		return result;
	}

	public boolean addCognome(String cognome) throws PersonaException {
		boolean result = false;
		if (!nome.isEmpty()) {
			if (nome.matches(ConstantGlobal.REGEX_CONTROLLO_STRINGA)) {
				if (getCognome() == null) {
					setCognome(cognome);
					result = true;
				} else {
					throw new PersonaException(
							"errore, non può essere aggiunto il cognome della persona perchè è gia presente");
				}
			} else {
				throw new PersonaException("Errore nell'inserimento del cognome");
			}
		} else {
			throw new NullPointerException("E' stato inserito un valore nullo");
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
				throw new PersonaException("Errore nell'inserimento dell'età");
			}
		} else {
			throw new PersonaException("Errore non può essere aggiunta l'età della persona perchè è gia presente");
		}
		return result;
	}

	public boolean addGenere(String genere) throws PersonaException {
		boolean result = false;
		if (!genere.isEmpty()) {
			if (controlloGenere(genere)) {
				if (getGenere() == null) {
					setGenere(ConstantGlobal.GENERE.valueOf(genere));
					result = true;
				} else {
					throw new PersonaException(
							"errore, non può essere aggiunta il genere della persona perchè è gia presente");
				}
			} else {
				throw new PersonaException("Errore nell'inserimento del genere della persona");
			}
		} else {
			throw new NullPointerException("E' stato inserito un valore nullo");
		}
		return result;
	}

	public boolean addDataNascita(String dataNascita) throws PersonaException {
		boolean result = false;
		if (!dataNascita.isEmpty()) {
			if (dataNascita.matches(ConstantGlobal.REGEX_CONTROLLO_DATA)) {
				if (getDataNascita() == null) {
					setDataNascita(dataNascita);
					result = true;
				} else {
					throw new PersonaException(
							"errore, non può essere aggiunta la data della persona perchè è gia presente");
				}
			} else {
				throw new PersonaException("Errore nell'inserimento della data");
			}
		} else {
			throw new NullPointerException("E' stato inserito un valore nullo");
		}
		return result;
	}

	public boolean addCitta(String citta) throws PersonaException {
		boolean result = false;
		if (!citta.isEmpty()) {
			if (citta.matches(ConstantGlobal.REGEX_CONTROLLO_STRINGA)) {
				if (getCognome() == null) {
					setCitta(citta);
					result = true;
				} else {
					throw new PersonaException(
							"errore, non può essere aggiunta la citta della persona perchè è gia presente");
				}
			} else {
				throw new PersonaException("Errore nell'inserimento del della città");
			}
		} else {
			throw new NullPointerException("E' stato inserito un valore nullo");
		}
		return result;
	}

	public boolean modificaNome(String nome) throws PersonaException {
		boolean result = false;
		if (!nome.isEmpty()) {
			if (nome.matches(ConstantGlobal.REGEX_CONTROLLO_STRINGA)) {
				if (getNome() != null) {
					setNome(nome);
				} else {
					throw new PersonaException(
							"errore, non può essere modificato il nome della persona perchè è stato ancora inserito");
				}
			} else {
				throw new PersonaException("Errore nell'inserimento del nome");
			}
		} else {
			throw new NullPointerException("E' stato inserito un valore nullo");
		}
		return result;

	}

	public boolean modificaCognome(String cognome) throws PersonaException {
		boolean result = false;
		if (!nome.isEmpty()) {
			if (nome.matches(ConstantGlobal.REGEX_CONTROLLO_STRINGA)) {
				if (getCognome() != null) {
					setCognome(cognome);
					result = true;
				} else {
					throw new PersonaException(
							"errore, non può essere modificato il cognome della persona perchè  non è stato ancora inserito");
				}
			} else {
				throw new PersonaException("Errore nell'inserimento del cognome");
			}
		} else {
			throw new NullPointerException("E' stato inserito un valore nullo");
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
				throw new PersonaException("Errore nell'inserimento dell'età");
			}
		} else {
			throw new PersonaException(
					"Errore non può essere modificata l'età della persona perchè non è stato ancora inserita");
		}
		return result;
	}

	public boolean modificaGenere(String genere) throws PersonaException {
		boolean result = false;
		if (!genere.isEmpty()) {
			if (controlloGenere(genere)) {
				if (getGenere() != null) {
					setGenere(ConstantGlobal.GENERE.valueOf(genere));
					result = true;
				} else {
					throw new PersonaException(
							"errore, non può essere modificato il genere della persona perchè non è stato ancora inserito");
				}
			} else {
				throw new PersonaException("Errore nell'inserimento del genere della persona");
			}
		} else {
			throw new NullPointerException("E' stato inserito un valore nullo");
		}
		return result;
	}

	public boolean modificaDataNascita(String dataNascita) throws PersonaException {
		boolean result = false;
		if (!dataNascita.isEmpty()) {
			if (dataNascita.matches(ConstantGlobal.REGEX_CONTROLLO_DATA)) {
				if (getDataNascita() != null) {
					setDataNascita(dataNascita);
					result = true;
				} else {
					throw new PersonaException(
							"errore, non può essere modificata la data di nascita della persona perchè non è stata ancora inserita");
				}
			} else {
				throw new PersonaException("Errore nell'inserimento della data");
			}
		} else {
			throw new NullPointerException("E' stato inserito un valore nullo");
		}
		return result;
	}

	public boolean modificaCitta(String citta) throws PersonaException {
		boolean result = false;
		if (!citta.isEmpty()) {
			if (citta.matches(ConstantGlobal.REGEX_CONTROLLO_STRINGA)) {
				if (getCognome() != null) {
					setCitta(citta);
					result = true;
				} else {
					throw new PersonaException(
							"errore, non può essere modificata la città della persona perchè non è stata ancora inserita");
				}
			} else {
				throw new PersonaException("Errore nell'inserimento del della città");
			}
		} else {
			throw new NullPointerException("E' stato inserito un valore nullo");
		}
		return result;
	}

	public boolean eliminaNome() throws PersonaException {
		boolean result = false;
		if (getNome() != null) {
			setNome(null);
		} else {
			throw new PersonaException(
					"errore, non può essere cancellato il nome della persona perchè è stato ancora inserito");
		}
		return result;
	}

	public boolean eliminaCognome() throws PersonaException {
		boolean result = false;
		if (getCognome() != null) {
			setCognome(null);
			result = true;
		} else {
			throw new PersonaException(
					"errore, non può essere cancellato il cognome della persona perchè  non è stato ancora inserito");
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
					"Errore non può essere cancellata l'età della persona perchè non è stato ancora inserita");
		}
		return result;
	}

	public boolean eliminaGenere() throws PersonaException {
		boolean result = false;
		if (getGenere() != null) {
			setGenere(null);
			result = true;
		} else {
			throw new PersonaException(
					"errore, non può essere cancellato il genere della persona perchè non è stato ancora inserito");
		}
		return result;
	}

	public boolean eliminaDataNascita() throws PersonaException {
		boolean result = false;
		if (getDataNascita() != null) {
			setDataNascita(null);
			result = true;
		} else {
			throw new PersonaException(
					"errore, non può essere cancellata la data di nascita della persona perchè non è stata ancora inserita");
		}
		return result;
	}

	public boolean eliminaCitta() throws PersonaException {
		boolean result = false;
		if (getCognome() != null) {
			setCitta(null);
			result = true;
		} else {
			throw new PersonaException(
					"errore, non può essere cancellata la città della persona perchè non è stata ancora inserita");
		}

		return result;
	}
	
	public abstract boolean addNomeAzienda(String nomeAzienda) throws PersonaException;
	
	public abstract boolean addEmailAziendale() throws PersonaException;
	
	public abstract boolean addNumeroTelefonoAziendale( String  numeroTelefonoAziendale) throws PersonaException;

	public abstract boolean addtipologiaContratto( String tipologiaContratto) throws PersonaException;

	public abstract boolean addRuolo( String ruolo) throws PersonaException;
	
	public abstract boolean modificaNomeAzienda(String nomeAzienda) throws PersonaException;

	public abstract boolean modificaEmailAziendale() throws PersonaException;

	public abstract boolean modificaNumeroTelefonoAziendale(String numeroTelefonoAziendale) throws PersonaException;

	public abstract boolean modificatipologiaContratto(String tipologiaContratto) throws PersonaException;
	
	public abstract boolean modificaCodiceIdentificativo(String codiceIdentificativo) throws PersonaException;
	
	public abstract boolean modificaRuolo( String ruolo) throws PersonaException;
	
	public abstract boolean eliminaNomeAzienda() throws PersonaException;

	public abstract boolean eliminaEmailAziendale() throws PersonaException;

	public abstract boolean eliminaNumeroTelefonoAziendale() throws PersonaException;

	public abstract boolean eliminatipologiaContratto() throws PersonaException;
	
	public abstract boolean eliminaRuolo() throws PersonaException;
	
	public abstract String visualizzaCodiceIdentificativoDipendete() throws PersonaException;
	
	public abstract String visualizzaNomeAziendaDipendenteDipendente() throws PersonaException;

	public abstract String visualizzaEmailAziendaleDipendente() throws PersonaException;

	public abstract String visualizzaNumeroTelefonoAziendaleDipendente() throws PersonaException;

	public abstract ConstantGlobal.TIPO_CONTRATTO visualizzatipologiaContrattoDipendente() throws PersonaException;
	
	public abstract String visualizzaRuoloDipendente() throws PersonaException;
	
	
	
	
	
	
	
	
}
