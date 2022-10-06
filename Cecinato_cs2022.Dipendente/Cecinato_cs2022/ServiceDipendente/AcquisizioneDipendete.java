package Cecinato_cs2022.ServiceDipendente;


import Cecinato_cs2022.ExceptionPersona.PersonaException;

public interface AcquisizioneDipendete {
	
	public boolean addNomeAzienda(String nomeAzienda) throws PersonaException;
	public boolean addEmailAziendale() throws PersonaException;
	public boolean addNumeroTelefonoAziendale( String  numeroTelefonoAziendale) throws PersonaException;
	public boolean addtipologiaContratto(String tipologiaContratto) throws PersonaException;
	public boolean addRuolo( String ruolo) throws PersonaException;
}
