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

public class Vendita implements Serializable, Comparable<Object> {
	private static final long serialVersionUID = 1L;
	private static final SimpleDateFormat sdf = new SimpleDateFormat(ConstantGlobal.FORMATO_DATA);
	private static int incrementNumeroFattrura = 0;
	private String idDipendente;
	private int idFattura;
	private String prezzoVedita;
	private Televisore tv;
	private Date dataVendita;
	private Cliente cliente;
	

	public Vendita(String idDipendente, String prezzoVedita, Televisore tv, String dataVendita, Cliente cliente)
			throws ParseException, TelevisoreException, PersonaException {
		super();
		this.idDipendente = idDipendente;
		if(controlloPrezzo(prezzoVedita) && controlloTv(tv) && controlloCliente(cliente) && controlloData(dataVendita) ) {
			this.prezzoVedita = prezzoVedita;
			this.tv = tv;
			this.dataVendita = sdf.parse(dataVendita);
			this.cliente = cliente;
			this.idFattura = ++incrementNumeroFattrura;
		}
	}

	public String getIdDipendente() {
		return idDipendente;
	}

	public void setIdDipendente(String idDipendente) {
		this.idDipendente = idDipendente;
	}

	public String getPrezzoVedita() {
		return prezzoVedita;
	}

	public void setPrezzoVedita(String prezzoVedita) {
		this.prezzoVedita = prezzoVedita;
	}

	public Televisore getTv() {
		return tv;
	}

	public void setTv(Televisore tv) {
		this.tv = tv;
	}

	public Date getDataVendita() {
		return dataVendita;
	}

	public void setDataVendita(Date dataVendita) {
		this.dataVendita = dataVendita;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
	public int getIdFattura() {
		return idFattura;
	}

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

	private boolean controlloCliente(Cliente cliente) throws PersonaException {
		boolean result = false;
		if (cliente != null) {
			result = true;
		} else {
			throw new PersonaException("il cliente inserito è nullo");
		}
		return result;
	}

	private boolean controlloTv(Televisore tv) throws TelevisoreException {
		boolean result = false;
		if (tv != null) {
			result = true;
		} else {
			throw new TelevisoreException("la televisore inserita è nulla");
		}
		return result;
	}
	
	private boolean controlloPrezzo(String prezzo) throws TelevisoreException {
		boolean result = false;
			if ( StringUtils.isNotBlank(prezzo) && prezzo.trim().matches(ConstantGlobal.REGEX_CONTROLLO_NUMERI_FLOAT) && Double.valueOf(prezzo) > 0) {
				result = true;
			}
		return result;
	}

	@Override
	public int compareTo(Object o) {
		return this.idFattura - ((Vendita)o).getIdFattura();
	}

}
