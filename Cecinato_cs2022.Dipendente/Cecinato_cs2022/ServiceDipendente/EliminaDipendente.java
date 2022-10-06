package Cecinato_cs2022.ServiceDipendente;

import Cecinato_cs2022.ExceptionPersona.PersonaException;

public interface EliminaDipendente {
	
	public boolean eliminaNomeAzienda() throws PersonaException;

	public boolean eliminaEmailAziendale() throws PersonaException;

	public boolean eliminaNumeroTelefonoAziendale() throws PersonaException;

	public boolean eliminatipologiaContratto() throws PersonaException;
	
	public boolean eliminaRuolo() throws PersonaException;
}
