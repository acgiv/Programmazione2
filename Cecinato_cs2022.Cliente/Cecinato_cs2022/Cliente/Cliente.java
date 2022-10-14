package Cecinato_cs2022.Cliente;

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
import Cecinato_cs2022.DipendenteException.DipendenteException;
import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;
import Cecinato_cs2022.ExceptionPersona.PersonaException;
import Cecinato_cs2022.Persona.AbstractPersona;
import Cecinato_cs2022.TelevisoreService.Televisore;
import ControlliGlobal.ControlliGlobal;

public class Cliente extends AbstractPersona {

	private String codiceFiscale;
	private String nomeCartaFedelta;
	private String puntiFedelta;
	private String dataInscrizioneTessera;
	private String numeroCartaFedelta;
	private static BigInteger maxLimit = new BigInteger(ConstantGlobal.LUNGHEZZA_MASSIMA_NUMERO_CARTA_FEDELTA);
	private static BigInteger minLimit = new BigInteger(ConstantGlobal.LUNGHEZZA_MINIMA_NUMERO_CARTA_FEDELTA);
	protected static Set<String> elencoCodiceFiscale = new TreeSet<String>();
	static private Set<String> NumeroCarteCreate = new HashSet<String>();

	public Cliente(String CodiceFiscale) throws PersonaException {
		if (controlloCodiceFiscale(CodiceFiscale)) {
			this.codiceFiscale = CodiceFiscale;
			elencoCodiceFiscale.add(codiceFiscale);
		}

	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getNomeCartaFedelta() {
		return nomeCartaFedelta;
	}

	public void setNomeCartaFedelta(String nomeCartaFedelta) {
		this.nomeCartaFedelta = nomeCartaFedelta;
	}

	public String getPuntiFedelta() {
		return puntiFedelta;
	}

	public void setPuntiFedelta(String puntiFedelta) {
		this.puntiFedelta = puntiFedelta;
	}

	public String getDataInscrizioneTessera() {
		return dataInscrizioneTessera;
	}

	public void setDataInscrizioneTessera(String dataInscrizioneTessera) {
		this.dataInscrizioneTessera = dataInscrizioneTessera;
	}

	public String getNumeroCartaFedelta() {
		return numeroCartaFedelta;
	}

	public void setNumeroCartaFedelta(String numeroCartaFedelta) {
		this.numeroCartaFedelta = numeroCartaFedelta;
	}
	
	@Override
	public String toString() {
		String stringa = null;
		stringa = String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_CLIENTE, "_")).concat("\n");
		stringa += String.format("| %110s %10s %93s", ConstantGlobal.TITOLO_TABELLA_CLIENTE, getCodiceFiscale(), "|\n");
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_CLIENTE, "_"))
				.concat("\n");
		stringa += ConstantGlobal.TABELLA_CLIENTE;
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_CLIENTE, "_"))
				.concat("\n");
		stringa += String.format("| %18s %5s %10s %5s %9s %5s %6s %5s %9s %4s %11s %5s %9s %5s %20s %6s %17s %10s %13s %5s %12s %11s \n",getCodiceFiscale()," | ", super.VisualizzaNome(), " | ",
				super.VisualizzaCognome(), " | ", super.VisualizzaEta(), " | ", super.getGenere(), " | ", super.getDataNascita(), " | ", super.VisualizzaCitta(), " | ", getNomeCartaFedelta(), " | ",getDataInscrizioneTessera(),
				" | ",getNumeroCartaFedelta()," | ",getPuntiFedelta()," | ");
		stringa += String.join("", Collections.nCopies(ConstantGlobal.LUNGHEZZA_CONTORNO_TABELLA_CLIENTE, "_")).concat("\n");
		return stringa;
	}


	protected boolean controlloCodiceFiscale(String codiceFiscale) throws PersonaException {
		boolean result = true;
		if (StringUtils.isNotBlank(codiceFiscale) && codiceFiscale.matches(ConstantGlobal.REGEX_CONTROLLO_CODICE_FISCALE)) {
			Iterator<String> element = elencoCodiceFiscale.iterator();
			while (element.hasNext()) {
				if (StringUtils.equals(element.next(), codiceFiscale))
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

	final boolean controlloNumeroCartafedelta(String numeroCarta) {
		boolean result = true;
		if (StringUtils.isNotBlank(
				numeroCarta)) {
			Iterator<String> element = NumeroCarteCreate.iterator();
			while (element.hasNext()) {
				if (StringUtils.equals(element.next(), numeroCarta))
					result = false;
			}
			if (result) {
				NumeroCarteCreate.add(numeroCarta);
			}
		} else {
			NumeroCarteCreate.add(numeroCarta);
		}
		return result;
	}

	
	private String generaNumeroCartafedelta() {
		Random rn = new Random();
		boolean result = false;
		BigInteger bigInteger = maxLimit.subtract(minLimit);
		int len = maxLimit.bitLength();
		BigInteger res = null;
		do {
			res = new BigInteger(len, rn);
			if (res.compareTo(minLimit) < 0)
				res = res.add(minLimit);
			if (res.compareTo(bigInteger) >= 0)
				res = res.mod(bigInteger).add(minLimit);
			result = controlloNumeroCartafedelta(String.valueOf(res));
		} while (result == false);
		return String.valueOf(res);
	}

	private boolean eliminaCodiceFiscale() throws PersonaException {
		boolean result = true;
		Iterator<String> element = elencoCodiceFiscale.iterator();
		while (element.hasNext()) {
			if (StringUtils.equals(element.next(),getCodiceFiscale())) {
				element.remove();
			}
		}
		return result;
	}

	@Override
	public boolean addNomeAzienda(String nomeAzienda) throws PersonaException {
		throw new PersonaException("questa funzionalità non può essere usata per il Cliente");
	}

	@Override
	public boolean addNumeroTelefonoAziendale(String numeroTelefonoAziendale) throws PersonaException {
		throw new PersonaException("questa funzionalità non può essere usata per il Cliente");
	}

	@Override
	public boolean addtipologiaContratto(String tipologiaContratto) throws PersonaException {
		throw new PersonaException("questa funzionalità non può essere usata per il Cliente");
	}

	@Override
	public boolean eliminaNomeAzienda() throws PersonaException {
		throw new PersonaException("questa funzionalità non può essere usata per il Cliente");
	}

	@Override
	public boolean eliminaNumeroTelefonoAziendale() throws PersonaException {
		throw new PersonaException("questa funzionalità non può essere usata per il Cliente");
	}

	@Override
	public boolean eliminatipologiaContratto() throws PersonaException {
		throw new PersonaException("questa funzionalità non può essere usata per il Cliente");
	}

	@Override
	public boolean modificaNomeAzienda(String nomeAzienda) throws PersonaException {
		throw new PersonaException("questa funzionalità non può essere usata per il Cliente");
	}

	@Override
	public boolean modificaNumeroTelefonoAziendale(String numeroTelefonoAziendale) throws PersonaException {
		throw new PersonaException("questa funzionalità non può essere usata per il Cliente");
	}

	@Override
	public boolean modificatipologiaContratto(String tipologiaContratto) throws PersonaException {
		throw new PersonaException("questa funzionalità non può essere usata per il Cliente");
	}

	@Override
	public boolean modificaCodiceIdentificativo(String codiceIdentificativo) throws PersonaException {
		throw new PersonaException("questa funzionalità non può essere usata per il Cliente");
	}

	@Override
	public boolean addRuolo(String ruolo) throws PersonaException {
		throw new PersonaException("questa funzionalità non può essere usata per il Cliente");
	}

	@Override
	public boolean addEmailAziendale() throws PersonaException {
		throw new PersonaException("questa funzionalità non può essere usata per il Cliente");
	}

	@Override
	public boolean modificaEmailAziendale() throws PersonaException {
		throw new PersonaException("questa funzionalità non può essere usata per il Cliente");
	}

	@Override
	public boolean eliminaEmailAziendale() throws PersonaException {
		throw new PersonaException("questa funzionalità non può essere usata per il Cliente");
	}

	@Override
	public boolean eliminaRuolo() throws PersonaException {
		throw new PersonaException("questa funzionalità non può essere usata per il Cliente");
	}

	@Override
	public boolean modificaRuolo(String ruolo) throws PersonaException {
		throw new PersonaException("questa funzionalità non può essere usata per il Cliente");
	}

	@Override
	public String visualizzaCodiceIdentificativoDipendete() throws PersonaException {
		throw new PersonaException("questa funzionalità non può essere usata per il Cliente");
	}

	@Override
	public String visualizzaNomeAziendaDipendente() throws PersonaException {
		throw new PersonaException("questa funzionalità non può essere usata per il Cliente");
	}

	@Override
	public String visualizzaEmailAziendaleDipendente() throws PersonaException {
		throw new PersonaException("questa funzionalità non può essere usata per il Cliente");
	}

	@Override
	public String visualizzaNumeroTelefonoAziendaleDipendente() throws PersonaException {
		throw new PersonaException("questa funzionalità non può essere usata per il Cliente");
	}

	@Override
	public TIPO_CONTRATTO visualizzatipologiaContrattoDipendente() throws PersonaException {
		throw new PersonaException("questa funzionalità non può essere usata per il Cliente");
	}

	@Override
	public String visualizzaRuoloDipendente() throws PersonaException {
		throw new PersonaException("questa funzionalità non può essere usata per il Cliente");
	}

	@Override
	public boolean addNomeCartaFedelta(String nomeCartaFedelta) throws PersonaException {
		boolean result = false;
			if (StringUtils.isNotBlank(nomeCartaFedelta) && StringUtils.isAlphaSpace(nomeCartaFedelta)) {
				if (StringUtils.isEmpty(getNomeCartaFedelta())) {
					setNomeCartaFedelta(ControlliGlobal.upperCaseFirst(nomeCartaFedelta.trim()));
					result = true;
				} else {
					throw new PersonaException(
							"errore, non può essere aggiunto il nome della carta di fedeltà del cliente perchè  è stato già inserito");
				}
			} else {
				throw new PersonaException("Errore nell'inserimento del nome della carta di fedeltà del cliente ");
			}
		return result;
	}

	@Override
	public boolean addPuntiFedeltaAccumulati(String puntiFedelta) throws PersonaException {
		boolean result = false;
			if (StringUtils.isNotBlank(puntiFedelta) &&  puntiFedelta.matches(ConstantGlobal.REGEX_CONTROLLO_INTERO)) {
				if (StringUtils.isEmpty(getPuntiFedelta())) {
					if (ConstantGlobal.NUMERO_MASSIMO_PUNTI_AGGIUNTI >= Long.valueOf(puntiFedelta)) {
						setPuntiFedelta(puntiFedelta);
						result = true;
					} else {
						throw new PersonaException(
								"errore, non possono essere aggiunti  i punti fedeltà del cliente perchè i punti inseriti superano il valore massimo di: "
										+ ConstantGlobal.NUMERO_MASSIMO_PUNTI_AGGIUNTI);
					}
				} else {
					throw new PersonaException(
							"errore, non possono essere aggiunti  i punti fedeltà del cliente perchè sono stati già inseriti");
				}
			} else {
				throw new PersonaException("Errore nell'inserimento dei punti fedeltà cliente ");
			}
		return result;
	}

	@Override
	public boolean addDataInscrizioneTessera(String dataInscrizioneTessera) throws PersonaException {
		boolean result = false;
			if ( StringUtils.isNoneBlank(dataInscrizioneTessera)  && dataInscrizioneTessera.matches(ConstantGlobal.REGEX_CONTROLLO_DATA)) {
				if (StringUtils.isEmpty(getDataInscrizioneTessera() )) {
					setDataInscrizioneTessera(dataInscrizioneTessera);
					result = true;
				} else {
					throw new PersonaException(
							"errore, non può essere aggiunta la data di inscrizione della tessera del cliente perchè  è stata già inserita");
				}
			} else {
				throw new PersonaException(
						"Errore nell'inserimento della data di inscrizione della carta di fedeltà del cliente ");
			}
		return result;
	}

	@Override
	public boolean addNumeroCartaFedelta() throws PersonaException {
		boolean result = false;
		if (getNumeroCartaFedelta() == null) {
			setNumeroCartaFedelta(generaNumeroCartafedelta());
			result = true;
		} else {
			throw new PersonaException(
					"errore, non può essere aggiunto il numero della carta di fedeltà del cliente perchè  è stato già inserito");
		}
		return result;

	}

	@Override
	public String VisualizzaNomeCartaFedelta() throws PersonaException {
		return getNomeCartaFedelta();

	}

	@Override
	public String VisualizzaPuntiFedeltaAccumulati() throws PersonaException {
		return getPuntiFedelta();
	}

	@Override
	public String VisualizzaDataInscrizioneTessera() throws PersonaException {
		return getDataInscrizioneTessera();
	}

	@Override
	public String VisualizzaNumeroCartaFedelta() throws PersonaException {
		return getNumeroCartaFedelta();

	}

	@Override
	public String VisualizzaCodiceFiscale() throws PersonaException {
		return getCodiceFiscale();
	}

	@Override
	public boolean eliminaNomeCartaFedelta() throws PersonaException {
		boolean result = false;
		if (StringUtils.isNotBlank(getNomeCartaFedelta()) ) {
			setNomeCartaFedelta(null);
			result = true;
		} else {
			throw new PersonaException(
					"errore, non può essere cancellato il nome della carta fedeltà del cliente perchè non è stato ancora inserito");
		}

		return result;

	}

	@Override
	public boolean eliminaPuntiAccumulati() throws PersonaException {
		boolean result = false;
		if (StringUtils.isNotBlank(getPuntiFedelta())) {
			setPuntiFedelta(null);
			result = true;
		} else {
			throw new PersonaException(
					"errore, non possono essere cancellatii punti accumulati del cliente perchè non sono stati ancora inseriti");
		}

		return result;

	}

	@Override
	public boolean eliminaDataInscrizioneTessera() throws PersonaException {
		boolean result = false;
		if (StringUtils.isNotBlank(getDataInscrizioneTessera())) {
			setDataInscrizioneTessera(null);
			result = true;
		} else {
			throw new PersonaException(
					"errore, non può essere cancellata la data di inscrizione della tessera  del cliente perchè non è stata ancora inserita");
		}

		return result;

	}

	@Override
	public boolean eliminaNumeroCartaFedelta() throws PersonaException {
		boolean result = false;
		if (getNumeroCartaFedelta() != null) {
			Iterator<String> element = NumeroCarteCreate.iterator();
			while (element.hasNext()) {
				if (element.next().equals(getNumeroCartaFedelta())) {
					element.remove();
				}

			}
			setNumeroCartaFedelta(null);
			result = true;
		} else {
			throw new PersonaException(
					"errore, non può essere cancellato il numero della carta fedeltà del cliente perchè non è stato ancora inserito");
		}
		return result;

	}

	@Override
	public boolean modificaNomeCartaFedelta(String nomeCartaFedelta) throws PersonaException {
		boolean result = false;
		if (StringUtils.isNotBlank(getNomeCartaFedelta()) && StringUtils.isAlphaSpace(nomeCartaFedelta)) {
			setNomeCartaFedelta(ControlliGlobal.upperCaseFirst(nomeCartaFedelta.trim()));
			result = true;
		} else {
			throw new PersonaException(
					"errore, non può essere aggiunto il numero della carta di fedeltà del cliente perchè  è stato già inserito");
		}
		return result;
	}

	@Override
	public boolean modificaPuntiFedeltaAccumulati(String puntiFedelta,
			ConstantGlobal.OPERAZIONE_PUNTI_FEDELTA operazione) throws PersonaException {
		boolean result = false;
			if (StringUtils.isNotBlank(puntiFedelta) && puntiFedelta.trim().matches(ConstantGlobal.REGEX_CONTROLLO_INTERO)) {
				if (getPuntiFedelta() != null) {
					switch (operazione) {
					case AGGIUNGI:
						if (ConstantGlobal.NUMERO_MASSIMO_PUNTI_AGGIUNTI >= Long.valueOf(puntiFedelta.trim())) {
							Long somma = Long.valueOf(getPuntiFedelta()) + Long.valueOf(puntiFedelta.trim());
							setPuntiFedelta(String.valueOf(somma));
							result = true;
						} else {
							throw new PersonaException(
									"errore, non possono essere aggiunti  i punti fedeltà del cliente perchè i punti inseriti superano il valore massimo di: "
											+ ConstantGlobal.NUMERO_MASSIMO_PUNTI_AGGIUNTI);
						}
						break;
					case SOSTITUISCI:
						if (ConstantGlobal.NUMERO_MASSIMO_PUNTI_AGGIUNTI >= Long.valueOf(puntiFedelta.trim())) {
							setPuntiFedelta(puntiFedelta.trim());
							result = true;
						} else {
							throw new PersonaException(
									"errore, non possono essere aggiunti  i punti fedeltà del cliente perchè i punti inseriti superano il valore massimo di: "
											+ ConstantGlobal.NUMERO_MASSIMO_PUNTI_AGGIUNTI);
						}
						break;
					case SOTTRAI:
						if (Long.valueOf(getPuntiFedelta()) > Long.valueOf(puntiFedelta.trim())) {
							Long sottrai = Long.valueOf(getPuntiFedelta()) - Long.valueOf(puntiFedelta.trim());
							setPuntiFedelta(String.valueOf(sottrai));
							result = true;
						} else {
							throw new PersonaException(
									"errore, non possono essere sottratti  i punti fedeltà del cliente perchè i punti accumulati sono minori rispetto a quelli da sottrarre");
						
						}
						break;
					}
				} else {
					throw new PersonaException(
							"errore, non possono essere modificati  i punti fedeltà del cliente perchè non sono stati ancora inseriti");
				}
			} else {
				throw new PersonaException("Errore nell'inserimento dei punti fedeltà cliente ");
			}
		return result;
	}

	@Override
	public boolean modificaDataInscrizioneTessera(String dataInscrizioneTessera) throws PersonaException {
		boolean result = false;
			if (StringUtils.isNotBlank(dataInscrizioneTessera) && dataInscrizioneTessera.trim().matches(ConstantGlobal.REGEX_CONTROLLO_DATA)) {
				if (StringUtils.isNotBlank(getDataInscrizioneTessera())) {
					setDataInscrizioneTessera(dataInscrizioneTessera.trim());
					result = true;
				} else {
					throw new PersonaException(
							"errore, non può essere modificata la data di inscrizione della tessera del cliente perchè non è stata ancora inserita");
				}
			} else {
				throw new PersonaException(
						"Errore nell'inserimento della data di inscrizione della carta di fedeltà del cliente ");
			}
		return result;
	}

	@Override
	public boolean modificaNumeroCartaFedelta() throws PersonaException {
		boolean result = false;
		if (StringUtils.isNotBlank(getNumeroCartaFedelta())) {
			eliminaNumeroCartaFedelta();
			addNumeroCartaFedelta();
			result = true;
		} else {
			throw new PersonaException(
					"errore, non può essere modificato il numero della carta di fedeltà del cliente perchè  è non stato ancora inserito");
		}
		return result;
	}

	@Override
	public boolean modificaCodiceFiscale(String codiceFiscale) throws PersonaException {
		boolean result = false;
		if (controlloCodiceFiscale(codiceFiscale.trim())) {
			eliminaCodiceFiscale();
			setCodiceFiscale(codiceFiscale.trim());
			elencoCodiceFiscale.add(codiceFiscale.trim());
			result = true;
		}
		return result;
	}

	@Override
	public boolean riparaTv(String dataRichiestaRiparazione, String dataPrevistaConsegna, String costoRiparazione,
			Cliente clienteRiparazione, Televisore tvRiparata, String informazioneRiparazione)
			throws PersonaException, ParseException, TelevisoreException, DipendenteException {
		Boolean result = false;
		try {
			throw new ClienteException();
		} catch (ClienteException e) {
			System.err.println(e.ExceptionMetodo());
		}
		return result;

	}

	@Override
	public boolean vendiTv(Televisore tv, Cliente cliente, String DataVendita, String PrezzoVendita) {
		Boolean result = false;
		try {
			throw new ClienteException();
		} catch (ClienteException e) {
			System.err.println(e.ExceptionMetodo());
		}
		return result;
	}

}
