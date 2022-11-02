package Cecinato_cs2022.ServiceDipendente;


import Cecinato_cs2022.ClienteException.ClienteException;
import Cecinato_cs2022.DipendenteException.DipendenteException;

public interface AcquisizioneDipendete {
	
	public boolean addNomeAzienda(String nomeAzienda) throws DipendenteException, ClienteException;
	public boolean addEmailAziendale()  throws DipendenteException, ClienteException;
	public boolean addNumeroTelefonoAziendale( String  numeroTelefonoAziendale)  throws DipendenteException, ClienteException;
	public boolean addtipologiaContratto(String tipologiaContratto)  throws DipendenteException, ClienteException;
	public boolean addRuolo( String ruolo)  throws DipendenteException, ClienteException;
}
