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

public class Riparazione implements Serializable, Comparable<Riparazione> {
	private static final long serialVersionUID = 1L;
	private static SimpleDateFormat sdf = new SimpleDateFormat(ConstantGlobal.FORMATO_DATA);
	private static int incrementIdRiparazione = 0;
	private String serialeDipendente;
	private int idRiparazione;
	private Date DataRichiestaRiparazione;
	private Date DataPrevistaConsegna;
	private String CostoRiparazione;
	private Cliente clienteRiparazione;
	private Televisore tvRiparata;
	private String informazioneRiparazione;

	public Riparazione(String serileDipendente, String dataRichiestaRiparazione, String dataPrevistaConsegna, String costoRiparazione,
			Cliente clienteRiparazione, Televisore tvRiparata, String informazioneRiparazione)
			throws ParseException, RiparazioneException {
		super();
		if (controlloData(dataRichiestaRiparazione) && controlloData(dataPrevistaConsegna)) {
			if (controlloOrdineDate(sdf.parse(dataRichiestaRiparazione), sdf.parse(dataPrevistaConsegna))) {
				this.DataRichiestaRiparazione = sdf.parse(dataRichiestaRiparazione);
				this.DataPrevistaConsegna = sdf.parse(dataPrevistaConsegna);
				this.idRiparazione = ++incrementIdRiparazione;
				this.serialeDipendente = serileDipendente;
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
		if (controlloDescrizione(informazioneRiparazione)) {
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

	public int getIdRiparazione() {
		return idRiparazione;
	}

	public void setIdRiparazione(int idRiparazione) {
		this.idRiparazione = idRiparazione;
	}

	public String getSerialeDipendente() {
		return serialeDipendente;
	}

	public void setSerialeDipendente(String serialeDipendente) {
		this.serialeDipendente = serialeDipendente;
	}

	private boolean controlloOrdineDate(Date dataRichista, Date DataConsegna) throws RiparazioneException {
		boolean result = false;
		if (dataRichista.before(DataConsegna)) {
			result = true;
		} else {
			throw new RiparazioneException("la data della richiesta inserita: "+ dataRichista + " è superiore alla data data di consegna: "+ DataConsegna);
		}
		return result;
	}

	private boolean controlloData(String data) throws RiparazioneException{
		boolean result = false;
			if (StringUtils.isNotBlank(data) && (data.trim()).matches(ConstantGlobal.REGEX_CONTROLLO_DATA)) {
				result = true;
			} else {
				throw new RiparazioneException("la data inserita: " + data + "non rispetta lo standard richiesto: dd/mm/aaaa oppure sono stati inseriti valori nulli");
			}
		return result;
	}

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

	private boolean controlloCliente(Cliente cliente) throws RiparazioneException {
		boolean result = false;
		if (cliente != null) {
			result = true;
		} else {
			throw new RiparazioneException("il cliente inserito è nullo");
		}
		return result;
	}

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
