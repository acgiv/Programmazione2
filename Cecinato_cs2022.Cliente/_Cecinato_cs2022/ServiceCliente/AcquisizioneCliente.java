package _Cecinato_cs2022.ServiceCliente;

import Cecinato_cs2022.ExceptionPersona.PersonaException;

public interface AcquisizioneCliente {

	public boolean addNomeCartaFedelta(String nomeCartaFedelta) throws PersonaException;

	public boolean addPuntiFedeltaAccumulati(String puntiFedelta) throws PersonaException;

	public boolean addDataInscrizioneTessera(String dataInscrizioneTessera) throws PersonaException;

	public boolean  addNumeroCartaFedelta() throws PersonaException;
}
