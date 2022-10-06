package Cecinato_cs2022.ServiceDipendente;


import Cecinato_cs2022.ExceptionPersona.PersonaException;

public interface ModificaDipendente {

	public boolean modificaNomeAzienda(String nomeAzienda) throws PersonaException;

	public boolean modificaEmailAziendale() throws PersonaException;

	public boolean modificaNumeroTelefonoAziendale(String numeroTelefonoAziendale) throws PersonaException;

	public boolean modificatipologiaContratto(String tipologiaContratto) throws PersonaException;
	
	public boolean modificaCodiceIdentificativo(String codiceIdentificativo) throws PersonaException;
	
	public boolean modificaRuolo( String ruolo) throws PersonaException;
}
