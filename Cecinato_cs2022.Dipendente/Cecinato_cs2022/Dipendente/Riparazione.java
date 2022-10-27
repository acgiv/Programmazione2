package Cecinato_cs2022.Dipendente;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import Cecinato_cs2022.Cliente.Cliente;
import Cecinato_cs2022.ConstantGlobal.ConstantGlobal;
import Cecinato_cs2022.DipendenteException.DipendenteException;
import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;
import Cecinato_cs2022.ExceptionPersona.PersonaException;
import Cecinato_cs2022.TelevisoreService.Televisore;

public class Riparazione implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Date DataRichiestaRiparazione;
	private Date DataPrevistaConsegna;
	private String CostoRiparazione;
	private Cliente clienteRiparazione;
	private Televisore tvRiparata;
	private String informazioneRiparazione;
	SimpleDateFormat sdf = new SimpleDateFormat(ConstantGlobal.FORMATO_DATA);

	public Riparazione(String dataRichiestaRiparazione, String dataPrevistaConsegna, String costoRiparazione,
			Cliente clienteRiparazione, Televisore tvRiparata, String informazioneRiparazione) throws PersonaException, ParseException, TelevisoreException, DipendenteException {
		super();
			if (controlloData(dataRichiestaRiparazione) && controlloData(dataPrevistaConsegna)) {
				if (controlloOrdineDate(sdf.parse(dataRichiestaRiparazione), sdf.parse(dataPrevistaConsegna))) {
					this.DataRichiestaRiparazione = sdf.parse(dataRichiestaRiparazione);
					this.DataPrevistaConsegna = sdf.parse(dataPrevistaConsegna);
				}
			}
			if (controlloCosto(costoRiparazione)) {
				this.CostoRiparazione = costoRiparazione;
			}
			if (controlloCliente(clienteRiparazione)) {
				this.clienteRiparazione = clienteRiparazione;
			}
			if (controlloTv(tvRiparata)) {
				this.tvRiparata = tvRiparata;
			}
			if(controlloDescrizione(informazioneRiparazione)) {
				this.informazioneRiparazione = informazioneRiparazione;
			}
	}

	public Date getDataRichiestaRiparazione() {
		return DataRichiestaRiparazione;
	}

	public void setDataRichiestaRiparazione(Date dataRichiestaRiparazione) {
		DataRichiestaRiparazione = dataRichiestaRiparazione;
	}

	public Date getDataPrevistaConsegna() {
		return DataPrevistaConsegna;
	}

	public void setDataPrevistaConsegna(Date dataPrevistaConsegna) {
		DataPrevistaConsegna = dataPrevistaConsegna;
	}

	public String getCostoRiparazione() {
		return CostoRiparazione;
	}

	public void setCostoRiparazione(String costoRiparazione) {
		CostoRiparazione = costoRiparazione;
	}

	public Cliente getClienteRiparazione() {
		return clienteRiparazione;
	}

	public void setClienteRiparazione(Cliente clienteRiparazione) {
		this.clienteRiparazione = clienteRiparazione;
	}

	public Televisore getTvRiparata() {
		return tvRiparata;
	}

	public void setTvRiparata(Televisore tvRiparata) {
		this.tvRiparata = tvRiparata;
	}

	public String getInformazioneRiparazione() {
		return informazioneRiparazione;
	}

	public void setInformazioneRiparazione(String informazioneRiparazione) {
		this.informazioneRiparazione = informazioneRiparazione;
	}

	private boolean controlloOrdineDate(Date dataRichista, Date DataConsegna) throws PersonaException {
		boolean result = false;
			if (dataRichista.after(DataConsegna)) {
				result = true;
			} else {
				throw new PersonaException("la data della richiesta è superiore alla data data di consegna");
			}		
		return result;
	}

	private boolean controlloData(String data) {
		boolean result = false;
		try {
				if(StringUtils.isNotBlank(data) && (data.trim()).matches(ConstantGlobal.REGEX_CONTROLLO_DATA)) {
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

	private boolean controlloTv(Televisore tv) throws TelevisoreException {
		boolean result = false;
		if (tv != null) {
			if (tv.visualizzaTipologiaTv() != ConstantGlobal.TIPOLOGIA_TV.BASE) {
				result = true;
			} else {
				throw new TelevisoreException("la televisore di tipo base non può essere riparata");
			}
		} else {
			throw new TelevisoreException("la televisore inserita è nulla");
		}
		return result;
	}

	private boolean controlloCliente(Cliente cliente) throws PersonaException {
		boolean result = false;
		if (cliente != null) {
			result = true;
		} else {
			throw new PersonaException("il cliente inserito è nullo");
		}
		return result;
	}

	private boolean controlloCosto(String costo) throws TelevisoreException {
		boolean result = false;
			if ( StringUtils.isNotBlank(costo) && costo.trim().matches(ConstantGlobal.REGEX_CONTROLLO_NUMERI_FLOAT) && Double.valueOf(costo) > 0) {
				result = true;
			}
		return result;
	}
	
	private boolean controlloDescrizione(String informazioneRiparazione) throws DipendenteException {
		boolean result = false;
		if( StringUtils.isNotBlank(informazioneRiparazione) && informazioneRiparazione.trim().matches(ConstantGlobal.REGEX_CONTROLLO_STRINGA_NUMERI)) {
			result = true;
		}else {
			throw new DipendenteException("La discrizione della riparazione è vuota o contiene caratteri speciali");
		}
		return result;
	}

}
