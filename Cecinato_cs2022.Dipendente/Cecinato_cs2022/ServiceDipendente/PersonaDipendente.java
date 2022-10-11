package Cecinato_cs2022.ServiceDipendente;

import java.text.ParseException;

import Cecinato_cs2022.Cliente.Cliente;
import Cecinato_cs2022.DipendenteException.DipendenteException;
import Cecinato_cs2022.EcceptionTelevisore.TelevisoreException;
import Cecinato_cs2022.ExceptionPersona.PersonaException;
import Cecinato_cs2022.TelevisoreService.Televisore;

public interface PersonaDipendente extends AcquisizioneDipendete, EliminaDipendente, ModificaDipendente, VisualizzaDipendete{
	
	public boolean vendiTv(Televisore tv, Cliente cliente, String DataVendita, String PrezzoVendita);
	
	public boolean  riparaTv(String dataRichiestaRiparazione, String dataPrevistaConsegna, String costoRiparazione,
			Cliente clienteRiparazione, Televisore tvRiparata, String informazioneRiparazione) throws PersonaException, ParseException, TelevisoreException, DipendenteException ;
}