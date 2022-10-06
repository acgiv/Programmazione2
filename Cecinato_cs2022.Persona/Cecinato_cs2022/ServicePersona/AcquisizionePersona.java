package Cecinato_cs2022.ServicePersona;

import Cecinato_cs2022.ExceptionPersona.PersonaException;

public interface AcquisizionePersona {

    public boolean addNome( String nome)throws PersonaException;
	
	public boolean addCognome( String cognome)throws PersonaException;
	
	public boolean addEta( int eta) throws PersonaException;
	
	public boolean addGenere( String genere) throws PersonaException;
	
	public boolean addDataNascita( String dataNascita) throws PersonaException;
	
	public boolean addCitta(String citta) throws PersonaException;
	

}
