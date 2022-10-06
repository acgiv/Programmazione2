package Cecinato_cs2022.ServicePersona;

import Cecinato_cs2022.ExceptionPersona.PersonaException;

public interface ModificaPersona {
	
    public boolean modificaNome( String nome)throws PersonaException;
	
	public boolean modificaCognome( String cognome)throws PersonaException;
	
	public boolean modificaEta( int eta) throws PersonaException;
	
	public boolean modificaGenere( String genere) throws PersonaException;
	
	public boolean modificaDataNascita( String dataNascita) throws PersonaException;
	
	public boolean modificaCitta(String citta) throws PersonaException;
	

}
