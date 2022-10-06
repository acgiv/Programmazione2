package Cecinato_cs2022.Persona;

import Cecinato_cs2022.ConstantGlobal.ConstantGlobal.TIPO_CONTRATTO;
import Cecinato_cs2022.ExceptionPersona.PersonaException;

public class Cliente extends AbstractPersona {

	private String codiceFiscale;
	private String nomeCartaFedelta;
	private String puntiAccumulati;
	private String dataInscrizioneTessera;

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

	public String getPuntiAccumulati() {
		return puntiAccumulati;
	}

	public void setPuntiAccumulati(String puntiAccumulati) {
		this.puntiAccumulati = puntiAccumulati;
	}

	public String getDataInscrizioneTessera() {
		return dataInscrizioneTessera;
	}

	public void setDataInscrizioneTessera(String dataInscrizioneTessera) {
		this.dataInscrizioneTessera = dataInscrizioneTessera;
	}

	@Override
	public boolean addNomeAzienda(String nomeAzienda) throws PersonaException {
		throw new PersonaException("Questo metodo non può essere usato per questa classe");
	}


	@Override
	public boolean addNumeroTelefonoAziendale(String numeroTelefonoAziendale) throws PersonaException {
		throw new PersonaException("Questo metodo non può essere usato per questa classe");
	}
	
	@Override
	public boolean addtipologiaContratto(String tipologiaContratto) throws PersonaException {
		throw new PersonaException("Questo metodo non può essere usato per questa classe");
	}

	@Override
	public boolean eliminaNomeAzienda() throws PersonaException {
		throw new PersonaException("Questo metodo non può essere usato per questa classe");
	}


	@Override
	public boolean eliminaNumeroTelefonoAziendale() throws PersonaException {
		throw new PersonaException("Questo metodo non può essere usato per questa classe");
	}

	@Override
	public boolean eliminatipologiaContratto() throws PersonaException {
		throw new PersonaException("Questo metodo non può essere usato per questa classe");
	}

	@Override
	public boolean modificaNomeAzienda(String nomeAzienda) throws PersonaException {
		throw new PersonaException("Questo metodo non può essere usato per questa classe");
	}


	@Override
	public boolean modificaNumeroTelefonoAziendale(String numeroTelefonoAziendale) throws PersonaException {
		throw new PersonaException("Questo metodo non può essere usato per questa classe");
	}

	@Override
	public boolean modificatipologiaContratto(String tipologiaContratto) throws PersonaException {
		throw new PersonaException("Questo metodo non può essere usato per questa classe");
	}

	@Override
	public boolean modificaCodiceIdentificativo(String codiceIdentificativo) throws PersonaException {
		throw new PersonaException("Questo metodo non può essere usato per questa classe");
	}

	@Override
	public boolean addRuolo(String ruolo) throws PersonaException {
		throw new PersonaException("Questo metodo non può essere usato per questa classe");
	}

	@Override
	public boolean addEmailAziendale() throws PersonaException {
		throw new PersonaException("Questo metodo non può essere usato per questa classe");
	}

	@Override
	public boolean modificaEmailAziendale() throws PersonaException {
		throw new PersonaException("Questo metodo non può essere usato per questa classe");
	}

	@Override
	public boolean eliminaEmailAziendale() throws PersonaException {
		throw new PersonaException("Questo metodo non può essere usato per questa classe");
	}

	@Override
	public boolean eliminaRuolo() throws PersonaException {
		throw new PersonaException("Questo metodo non può essere usato per questa classe");
	}

	@Override
	public boolean modificaRuolo(String ruolo) throws PersonaException {
		throw new PersonaException("Questo metodo non può essere usato per questa classe");
	}

	@Override
	public String visualizzaCodiceIdentificativoDipendete() throws PersonaException {
		throw new PersonaException("Questo metodo non può essere usato per questa classe");
	}

	@Override
	public String visualizzaNomeAziendaDipendenteDipendente() throws PersonaException {
		throw new PersonaException("Questo metodo non può essere usato per questa classe");
	}

	@Override
	public String visualizzaEmailAziendaleDipendente() throws PersonaException {
		throw new PersonaException("Questo metodo non può essere usato per questa classe");
	}

	@Override
	public String visualizzaNumeroTelefonoAziendaleDipendente() throws PersonaException {
		throw new PersonaException("Questo metodo non può essere usato per questa classe");
	}

	@Override
	public TIPO_CONTRATTO visualizzatipologiaContrattoDipendente() throws PersonaException {
		throw new PersonaException("Questo metodo non può essere usato per questa classe");
	}

	@Override
	public String visualizzaRuoloDipendente() throws PersonaException {
		throw new PersonaException("Questo metodo non può essere usato per questa classe");
	}







}
