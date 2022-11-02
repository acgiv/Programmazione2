package Cecinato_cs2022.ServiceDipendente;


import Cecinato_cs2022.ClienteException.ClienteException;
import Cecinato_cs2022.DipendenteException.DipendenteException;

public interface ModificaDipendente {

	public boolean modificaNomeAzienda(String nomeAzienda)  throws DipendenteException, ClienteException;

	public boolean modificaEmailAziendale() throws DipendenteException, ClienteException;

	public boolean modificaNumeroTelefonoAziendale(String numeroTelefonoAziendale) throws DipendenteException, ClienteException;

	public boolean modificatipologiaContratto(String tipologiaContratto) throws DipendenteException, ClienteException;
	
	public boolean modificaCodiceIdentificativo(String codiceIdentificativo) throws DipendenteException, ClienteException;
	
	public boolean modificaRuolo( String ruolo) throws DipendenteException, ClienteException;
}
