package Cecinato_cs2022.pojoDipendente;

import java.util.Iterator;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.ConstantGlobal.ConstantGlobal.TIPO_CONTRATTO;
import Cecinato_cs2022.ExceptionPersona.PersonaException;
import Cecinato_cs2022.Persona.AbstractPersona;

public class Dipendente extends AbstractPersona {

	private int numeroTvVendute;
	private String codiceIdentificativo;
	private String nomeAzienda;
	private String emailAzienda;
	private String numeroTelefonoAziendale; // ( Formato: +99 9999999999 )
	private ConstantGlobal.TIPO_CONTRATTO tipologiaContratto;
	private String ruolo;

	public Dipendente(String codiceIdentificativo) throws PersonaException {
		if (super.controlloIdentificativo(codiceIdentificativo)) {
			this.codiceIdentificativo = codiceIdentificativo;
			elencoCodiceIdentificativo.add(codiceIdentificativo);
		}
	}

	public int getNumeroTvVendute() {
		return numeroTvVendute;
	}

	public void setNumeroTvVendute(int numeroTvVendute) {
		this.numeroTvVendute = numeroTvVendute;
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

	private String calcoloEmailAzienda() {
		return getNome().concat(getCognome()).concat("@").concat(getNomeAzienda()).concat(".com");

	}


	private boolean eliminaIdentificativo() throws PersonaException {
		boolean result = true;
		Iterator<String> element = elencoCodiceIdentificativo.iterator();
		while (element.hasNext()) {
			if (element.next().equals(getCodiceIdentificativo())) {
				element.remove();
			}
		}
		return result;
	}

	@Override
	public boolean addNomeAzienda(String nomeAzienda) throws PersonaException {
		boolean result = false;
		if (!nomeAzienda.isEmpty()) {
			if (nomeAzienda.matches(ConstantGlobal.REGEX_CONTROLLO_STRINGA)) {
				if (getNomeAzienda() == null) {
					setNomeAzienda(nomeAzienda);
					result = true;
				} else {
					throw new PersonaException(
							"errore, non può essere aggiunto il nome dell'azienda del dipendente perchè  è stato già inserito");
				}
			} else {
				throw new PersonaException("Errore nell'inserimento del nome dell 'azienda dove lavora il dipendente");
			}
		} else {
			throw new NullPointerException("E' stato inserito un valore nullo");
		}
		return result;
	}

	@Override
	public boolean addNumeroTelefonoAziendale(String numeroTelefonoAziendale) throws PersonaException {
		boolean result = false;
		if (!numeroTelefonoAziendale.isEmpty()) {
			if (numeroTelefonoAziendale.matches(ConstantGlobal.REGEX_CONTROLLO_NUMERO_TELEFONO)) {
				if (getNumeroTelefonoAziendale() == null) {
					setNumeroTelefonoAziendale(numeroTelefonoAziendale);
					;
					result = true;
				} else {
					throw new PersonaException(
							"errore, non può essere aggiunto il numero di telefono del dipendente perchè è stato già inserito");
				}
			} else {
				throw new PersonaException("Errore nell'inserimento del numero di telefono del dipendente");
			}
		} else {
			throw new NullPointerException("E' stato inserito un valore nullo");
		}
		return result;
	}

	@Override
	public boolean addtipologiaContratto(String tipologiaContratto) throws PersonaException {
		boolean result = false;
		if (!tipologiaContratto.isEmpty()) {
			if (controlloTipoContratto(tipologiaContratto)) {
				if (getGenere() != null) {
					setTipologiaContratto(ConstantGlobal.TIPO_CONTRATTO.valueOf(tipologiaContratto));
					result = true;
				} else {
					throw new PersonaException(
							"errore, non può essere aggiunto il tipo di contratto del dipendente perchè  è stato già inserito");
				}
			} else {
				throw new PersonaException("Errore nell'inserimento del tipo di contratto del dipendente");
			}
		} else {
			throw new NullPointerException("E' stato inserito un valore nullo");
		}
		return result;
	}

	@Override
	public boolean addEmailAziendale() throws PersonaException {
		boolean result = false;
		if (getEmailAzienda() == null) {
			if (getNome() != null && getCognome() != null && getNomeAzienda() != null) {
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
		if (!ruolo.isEmpty()) {
			if (ruolo.matches(ConstantGlobal.REGEX_CONTROLLO_STRINGA)) {
				if (getRuolo() == null) {
					setRuolo(ruolo);
					result = true;
				} else {
					throw new PersonaException(
							"errore, non può essere aggiunto il ruolo del dipendente  perchè è stato già inserito");
				}
			} else {
				throw new PersonaException("Errore nell'inserimento del ruolo del dipendente");
			}
		} else {
			throw new NullPointerException("E' stato inserito un valore nullo");
		}
		return result;
	}

	@Override
	public boolean modificaNomeAzienda(String nomeAzienda) throws PersonaException {
		boolean result = false;
		if (!nomeAzienda.isEmpty()) {
			if (nomeAzienda.matches(ConstantGlobal.REGEX_CONTROLLO_STRINGA)) {
				if (getNomeAzienda() != null) {
					setNomeAzienda(nomeAzienda);
					result = true;
				} else {
					throw new PersonaException(
							"errore, non può essere modificato il nome della azienda dove lavora del dipendente perchè  non è stato ancora inserito");
				}
			} else {
				throw new PersonaException("Errore nell'inserimento del nome dell' azienda dove lavora il dipendente");
			}
		} else {
			throw new NullPointerException("E' stato inserito un valore nullo");
		}
		return result;
	}

	@Override
	public boolean modificaNumeroTelefonoAziendale(String numeroTelefonoAziendale) throws PersonaException {
		boolean result = false;
		if (!numeroTelefonoAziendale.isEmpty()) {
			if (numeroTelefonoAziendale.matches(ConstantGlobal.REGEX_CONTROLLO_NUMERO_TELEFONO)) {
				if (getNumeroTelefonoAziendale() != null) {
					setNumeroTelefonoAziendale(numeroTelefonoAziendale);
					;
					result = true;
				} else {
					throw new PersonaException(
							"errore, non può essere modificato il numero di telefono del dipendente perchè non è stato ancora inserito");
				}
			} else {
				throw new PersonaException("Errore nell'inserimento del numero di telefono del dipendente");
			}
		} else {
			throw new NullPointerException("E' stato inserito un valore nullo");
		}
		return result;
	}

	@Override
	public boolean modificatipologiaContratto(String tipologiaContratto) throws PersonaException {
		boolean result = false;
		if (!tipologiaContratto.isEmpty()) {
			if (controlloTipoContratto(tipologiaContratto)) {
				if (getTipologiaContratto() != null) {
					setTipologiaContratto(ConstantGlobal.TIPO_CONTRATTO.valueOf(tipologiaContratto));
					result = true;
				} else {
					throw new PersonaException(
							"errore, non può essere modificato il tipo di contratto del dipendente perchè non è stato ancora inserito");
				}
			} else {
				throw new PersonaException("Errore nell'inserimento il tipo di contratto del dipendente");
			}
		} else {
			throw new NullPointerException("E' stato inserito un valore nullo");
		}
		return result;
	}

	@Override
	public boolean modificaCodiceIdentificativo(String codiceIdentificativo) throws PersonaException {
		boolean result = false;
		if (controlloIdentificativo(codiceIdentificativo)) {
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
		if (getEmailAzienda() != null) {
			if (getNome() != null && getCognome() != null && getNomeAzienda() != null) {
				if (!calcoloEmailAzienda().equals(getEmailAzienda())) {
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
		if (!ruolo.isEmpty()) {
			if (ruolo.matches(ConstantGlobal.REGEX_CONTROLLO_STRINGA)) {
				if (getRuolo() != null) {
					setRuolo(ruolo);
					result = true;
				} else {
					throw new PersonaException(
							"errore, non può essere modificato il ruolo del dipendente  perchè  non è stato ancora inserito");
				}
			} else {
				throw new PersonaException("Errore nell'inserimento del ruolo del dipendente");
			}
		} else {
			throw new NullPointerException("E' stato inserito un valore nullo");
		}
		return result;
	}

	@Override
	public boolean eliminaNomeAzienda() throws PersonaException {
		boolean result = false;
		if (getNomeAzienda() != null) {
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
		if (getNumeroTelefonoAziendale() != null) {
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
		if (getRuolo() != null) {
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
		if (getEmailAzienda() != null) {
			setEmailAzienda(null);
			result = true;
		} else {
			throw new PersonaException(
					"errore, non può essere cancellata l'email del dipendente perchè non è stato ancora inserita");
		}

		return result;
	}

	@Override
	public String visualizzaCodiceIdentificativoDipendete() throws PersonaException {
		return getCodiceIdentificativo();
	}

	@Override
	public String visualizzaNomeAziendaDipendenteDipendente() throws PersonaException {
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

}
