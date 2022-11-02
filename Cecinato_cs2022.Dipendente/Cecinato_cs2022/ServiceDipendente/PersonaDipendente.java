package Cecinato_cs2022.ServiceDipendente;

import java.text.ParseException;

import Cecinato_cs2022.Cliente.Cliente;
import Cecinato_cs2022.ClienteException.ClienteException;
import Cecinato_cs2022.DipendenteException.RiparazioneException;
import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;
import Cecinato_cs2022.ExceptionPersona.PersonaException;
import Cecinato_cs2022.TelevisoreService.Televisore;

public interface PersonaDipendente extends AcquisizioneDipendete, EliminaDipendente, ModificaDipendente, VisualizzaDipendete{
	
	public boolean vendiTv(Televisore tv, Cliente cliente, String PrezzoVendita)throws PersonaException, TelevisoreException ;
	
	public boolean riparaTv(String dataRichiestaRiparazione, String dataPrevistaConsegna, String costoRiparazione,
			Cliente clienteRiparazione, Televisore tvRiparata, String informazioneRiparazione)
			throws  ParseException, RiparazioneException, ClienteException;
}