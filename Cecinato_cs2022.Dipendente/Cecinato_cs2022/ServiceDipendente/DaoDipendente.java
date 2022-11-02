package Cecinato_cs2022.ServiceDipendente;

import java.util.Set;

import Cecinato_cs2022.ServicePersona.Persona;
import Cecinato_cs2022.TelevisoreService.Televisore;

public interface DaoDipendente {
	
	public void saveNewAllDipendente(Set<Persona> dipendente) ;
	
	public Set<Persona> readFileAllDipendente();
	
	public Set<Televisore> elencoTv();


}
